package com.apps;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvisor implements ThrowsAdvice {

	public void afterThrowing(Exception ex) {

		System.out.println("Additional Concerns if exception occurs");
	}

}
