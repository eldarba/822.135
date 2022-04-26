package app.core.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@Component
//@Order(2)
public class MyGeneralWebFilter implements Filter {

	private int hitCounter;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("from general filter: " + ++this.hitCounter);
		chain.doFilter(request, response); // pass the request to the API

	}

}
