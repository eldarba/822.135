package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public FilterRegistrationBean<MyLoginFilter> loginFilter(MyLoginController loginController){
		FilterRegistrationBean<MyLoginFilter> filterRegistrationBean = new FilterRegistrationBean<>();
		// set the filter
		filterRegistrationBean.setFilter(new MyLoginFilter(loginController));
		// set the url
		filterRegistrationBean.addUrlPatterns("/api/admin/*");
		return filterRegistrationBean;
	}
	

}
