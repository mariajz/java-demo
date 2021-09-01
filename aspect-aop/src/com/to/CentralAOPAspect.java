package com.to;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CentralAOPAspect {

	@Pointcut("execution(* SomeBO.Valid*(..))")
	public void v() {
		System.out.println("pointcut");
	}

	@Before("v()")
	public void beforeMethod(JoinPoint jp) {
		System.out.println("before method" + jp.getSignature());
	}

	@After("v()")
	public void afterMethod(JoinPoint jp) {
		System.out.println("after method " + jp.getSignature());
	}

	@Around("v()")
	public Object myadvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("additional concern before calling actual method");
		Object obj = pjp.proceed();
		System.out.println("additional concern aftter calling actual method");
		return obj;
	}

	@AfterThrowing(pointcut = "execution(* SomeBO.*(..))", throwing = "error")

	public void myadvice(JoinPoint jp, Throwable error) {
		System.out.println("additional concern");
		System.out.println("Method Signature" + jp.getSignature());
		System.out.println("Exception is " + error);
		System.out.println("End of after throwing advice...");
	}

}
