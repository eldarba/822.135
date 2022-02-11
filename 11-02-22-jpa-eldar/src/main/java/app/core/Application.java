package app.core;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Coupon;
import app.core.entities.Coupon.category;
import app.core.repositories.CouponRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		// get the repo
		CouponRepository repo = ctx.getBean(CouponRepository.class);
//		System.out.println(repo.getClass());
		// create entity
//		Coupon coupon = new Coupon(0, "jerusalem tours", category.VACATION, LocalDate.now(), LocalDate.now().plusMonths(3), 5.60);
//		// save the entity and get the updated entity (id)
//		coupon = repo.save(coupon);
//		
//		System.out.println(coupon);
	}

}
