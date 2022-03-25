package app.core.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.core.exceptions.PostSystemException;
import app.core.services.LoginService;

@Component
// an aspect is a cross cutting concern
@Aspect
public class SecurityAspect {
	
	@Autowired
	private LoginService loginService;
	
	// advice is a code that runs when we call a join point - intercepted API method
	@Around("execution(* app.core.services.AppService.*(..))")
	public Object checkLogin(ProceedingJoinPoint jp) throws Throwable {
		
		if(loginService.isLoggedIn()) {
			Object res = jp.proceed();
			return res;
		}else {
			throw new PostSystemException("calling " + jp.getSignature().getName() + " failed - not logged in");
		}
	}

}
