package app.core.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;

import app.core.util.JwtUtil;
import app.core.util.JwtUtil.Client;
import app.core.util.JwtUtil.Client.ClientType;

public class LoginFilterAdmin implements Filter {

	// we need JwtUtil to check token validity
	private JwtUtil jwtUtil;

	public LoginFilterAdmin(JwtUtil jwtUtil) {
		super();
		this.jwtUtil = jwtUtil;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		String token = req.getHeader("token");
		try {
			Client client = this.jwtUtil.extractClient(token);
			if (!(client.getType() == ClientType.ADMIN)) {
				resp.sendError(HttpStatus.UNAUTHORIZED.value(), "you are not admin");
				return;
			}
		} catch (Exception e) {
			// throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, e.getMessage());
			resp.sendError(HttpStatus.UNAUTHORIZED.value(), e.getMessage());
			return;
		}

		// pass the request on
		chain.doFilter(request, response);

	}

}
