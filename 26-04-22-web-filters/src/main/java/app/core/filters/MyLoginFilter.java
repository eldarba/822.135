package app.core.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;

import app.core.controllers.MyLoginController;

public class MyLoginFilter implements Filter {

	private MyLoginController loginController;

	public MyLoginFilter(MyLoginController loginController) {
		super();
		this.loginController = loginController;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("from login filter");

		if (this.loginController.isLoggedIn()) {
			chain.doFilter(request, response); // pass the request to the API
		} else {
			HttpServletResponse resp = (HttpServletResponse) response;
			// if not logged in - block the request
			resp.sendError(HttpStatus.UNAUTHORIZED.value(), "you are not logged in");
		}

	}

}
