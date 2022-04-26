package app.core;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

public class MyLoginFilter implements Filter {
	
	private MyLoginController loginController;
	

	public MyLoginFilter(MyLoginController loginController) {
		super();
		this.loginController = loginController;
	}




	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		if(this.loginController.isLoggedIn()) {
			chain.doFilter(request, response); // pass the request to the API
		}else {
			// if not logged in - block the request
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "not logged in");
		}
		
	}

}
