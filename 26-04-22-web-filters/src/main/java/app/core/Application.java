package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import app.core.controllers.MyLoginController;
import app.core.filters.MyGeneralWebFilter;
import app.core.filters.MyLoginFilter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	@Order(1)
	public FilterRegistrationBean<MyLoginFilter> loginFilter(MyLoginController loginController) {
		FilterRegistrationBean<MyLoginFilter> filterRegistrationBean = new FilterRegistrationBean<>();
		// set the filter
		filterRegistrationBean.setFilter(new MyLoginFilter(loginController));
		// set the url
		filterRegistrationBean.addUrlPatterns("/api/admin/*");
		return filterRegistrationBean;
	}

	@Bean
	@Order(2)
	public FilterRegistrationBean<MyGeneralWebFilter> generalFilter() {
		FilterRegistrationBean<MyGeneralWebFilter> filterRegistrationBean = new FilterRegistrationBean<>();
		// set the filter
		filterRegistrationBean.setFilter(new MyGeneralWebFilter());
		// set the url
//		filterRegistrationBean.addUrlPatterns("/api/admin/*");
		return filterRegistrationBean;
	}

}
