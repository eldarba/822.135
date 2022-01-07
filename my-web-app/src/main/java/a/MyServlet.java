package a;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	private Model model = new Model(); 
	
	public MyServlet() {
		System.out.println("MyServlet - CTOR");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("from service");
		System.out.println(model.helloWorld()); // to the server console
		PrintWriter out = resp.getWriter();
		out.println(model.helloWorld()); // to the client browser
		
	}

}
