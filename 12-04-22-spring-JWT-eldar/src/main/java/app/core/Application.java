package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import app.core.filters.LoginFilterAdmin;
import app.core.util.JwtUtil;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public FilterRegistrationBean<LoginFilterAdmin> filterRegistrationBean(JwtUtil jwtUtil) {
		FilterRegistrationBean<LoginFilterAdmin> regBean = new FilterRegistrationBean<>();
		LoginFilterAdmin loginFilter = new LoginFilterAdmin(jwtUtil);
		regBean.setFilter(loginFilter);
		regBean.addUrlPatterns("/api/admin/*");
		return regBean;
	}

}

//		JwtUtil jwtUtil = ctx.getBean(JwtUtil.class);
//
//		// generate token
//		Client client = new Client("admin@mail", ClientType.ADMIN, 101);
//		String token = jwtUtil.generateToken(client);
//		System.out.println(token);
//
//		// extract data
//		Client clientFromToken = jwtUtil.extractClient(token);
//		System.out.println(clientFromToken);
//
//		System.out.println("issued at: " + jwtUtil.getTokenIssuedAt(token));
//		System.out.println("expiration: " + jwtUtil.getTokenExp(token));