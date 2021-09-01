package com.apps;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvisor implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, java.lang.reflect.Method arg1, Object[] arg2, Object arg3)
			throws Throwable {
		System.out.println("some stuff after method call" + arg1.getName());

	}

}
