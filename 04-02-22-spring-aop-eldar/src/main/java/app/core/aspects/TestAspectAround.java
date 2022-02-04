package app.core.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspectAround {
	
	@Around("buyCars()")
	public int aroundBuyCars(ProceedingJoinPoint pjp) {
		// before
		System.out.println("\t@Around - before: " + pjp.getSignature().getName());
		try {
			// tell the join point method to proceed (run)
			int quantity = (int) pjp.proceed();
			// after
			System.out.println("\t@Around - after success: " + pjp.getSignature().getName());
			return quantity; // return the value to the actual caller
		} catch (Throwable e) {
			System.out.println("\t@Around - after faild: " + pjp.getSignature().getName());
			return -1;
		}
		
	}
	
	@Pointcut("execution(* buyCars(..))")
	public void buyCars() {}

	

}
