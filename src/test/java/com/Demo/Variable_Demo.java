package com.Demo;

public class Variable_Demo {

     int age;
	
	private void Method1() {
		int age = 20;
		System.out.println(age);

	}
	private void Method2() {
		 age = 10;
		System.out.println(age);

	}
	
	private int Method3() {
		age =12;
		return age;

	}
	public static void main(String[] args) {
		Variable_Demo m = new Variable_Demo();
		m.Method1();
		m.Method2();
		System.out.println(m.Method3());
		//m.Method3();
	}
}
