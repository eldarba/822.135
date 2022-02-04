package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class StatisticalAspect {

	private int totalBuy;

	public int getTotalBuy() {
		return totalBuy;
	}

	@Before("buy()")
	public void beforeBuyAdvice(JoinPoint jp) {
		// get the quantity argument from the join point
		int quantity = (int) jp.getArgs()[0];
		System.out.println(quantity);
		totalBuy += quantity;
	}

	@Pointcut("execution(* buy*(int))")
	public void buy() {
	}

}
