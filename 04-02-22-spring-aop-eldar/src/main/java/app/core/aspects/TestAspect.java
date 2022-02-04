package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class TestAspect {
	
	@AfterReturning(pointcut = "buyCars()", returning = "quantity")
	public void afterBuySucces(JoinPoint jp, int quantity) {
		System.out.println("\t>>> Buy Car Success: " + quantity + " cars");
	}
	
	@AfterThrowing(pointcut = "buyCars()", throwing = "e")
	public void afterBuyFail(JoinPoint jp, Throwable e) {
		System.out.println("\t>>> " + jp.getSignature().getName() + ": failed. meesage: " + e.getMessage());
	}
	
	@Pointcut("execution(* buyCars(..))")
	public void buyCars() {}

	

}
