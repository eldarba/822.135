package app.core.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import app.core.auth.JwtUtilUserImpl;
import app.core.auth.User;

@Component
@Order(1)
public class AuthFilter implements Filter {
	@Autowired
	private JwtUtilUserImpl jwt;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("=== filter 1");
		// casting to http type of request / response
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		// CORS
		resp.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
		resp.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, "*");
		resp.setHeader(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "*");
		resp.setIntHeader(HttpHeaders.ACCESS_CONTROL_MAX_AGE, 5);
		// request info
		String requestPath = req.getRequestURI();
		String httpMethod = req.getMethod();
		System.out.println(httpMethod + ":" + requestPath);
		// handle CORS preflight request
		if (httpMethod.equalsIgnoreCase(HttpMethod.OPTIONS.toString())) {
			System.out.println("CORS preflight request");
			chain.doFilter(request, response);
			return;
		}

		switch (requestPath) {
		case "/api/app": // restricted path
			try {
				// get authentication
				String auth = req.getHeader(HttpHeaders.AUTHORIZATION);
				// check authentication schema
				if (!auth.startsWith("Bearer ")) {
					throw new Exception("wrong authentication schema");
				}
				// get token
				auth = auth.replace("Bearer ", "");
				System.out.println(auth);
				// extract user from token
				User user = jwt.extractUser(auth);
				System.out.println(user);
				// check role
				if (!(user.getRole() == User.Role.ADMIN)) {
					throw new Exception("wrong authentication role");
				}
				// if all is good allow the client request
				chain.doFilter(request, response);
			} catch (Exception e) {
				// handle unauthorized error
				e.printStackTrace();
				resp.setHeader(HttpHeaders.WWW_AUTHENTICATE, "Bearer realm=\"access to admin api area\"");
				resp.sendError(HttpStatus.UNAUTHORIZED.value(), "you are not authorized. " + e.getMessage());
			}
			break;
		default: // non restricted paths
			chain.doFilter(request, response);

		}

	}

}
