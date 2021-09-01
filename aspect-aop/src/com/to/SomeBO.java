package com.to;

public class SomeBO {
	public void Validate() {
		System.out.println("some validation object form BO");

	}

	public void Validate(int age) throws Exception {
		if (age < 18) {
			throw new ArithmeticException("Not A Valid Age");
		} else {
			System.out.println("vote confirmed");
		}
	}
}
