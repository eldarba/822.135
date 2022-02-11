package app.core;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Coupon;
import app.core.entities.Coupon.category;
import app.core.services.CouponService;

@SpringBootApplication
public class Application2 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application2.class, args);
		// get the service
		CouponService service = ctx.getBean(CouponService.class);
		
		// create
//		{
//			Coupon coupon = new Coupon(0, "fly", category.VACATION, LocalDate.now(), LocalDate.now().plusMonths(3), 5.60);
//			service.addCoupon(coupon);
//		}
		
		// read
//		{
//			Coupon coupon = service.getCouponById(1);
//			System.out.println(coupon);
//		}
		
		// update
//		{
//			Coupon coupon = new Coupon(1, "Nogev Busses", category.HOTELS, LocalDate.now(), LocalDate.now().plusMonths(4), 8.60);
//			service.updateCoupon(coupon);
//		}
		
		// delete
		{
			int id = 1;
			service.deleteCoupon(id);
		}
	}

}
