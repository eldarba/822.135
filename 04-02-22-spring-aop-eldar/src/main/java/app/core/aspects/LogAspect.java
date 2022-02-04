package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class LogAspect {

	@Before("execution(* buy*(..))")
	public void beforeBuyAdvice(JoinPoint jp) {
		System.out.println("\t>>> before method: " + jp.getSignature().getName());
	}

	@After("execution(* buy*(..))")
	public void afterBuyAdvice(JoinPoint jp) {
		System.out.println("\t>>> after method: " + jp.getSignature().getName());
	}

	@Before("anyMethodInBrokersPackage()")
	public void beforeBrokers(JoinPoint jp) {
		System.out.println("\t************************ method in brokers package: " + jp.getSignature().getName());
	}

	@Pointcut("execution(* app.core.brokers.*.*(..))")
	public void anyMethodInBrokersPackage() {
	}

}
