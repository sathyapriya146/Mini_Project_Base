package com.Demo;

public class Reusable_Methods {

	public static void firstname(String name) {        //private cannot be invoke
		System.out.println("Name: "+ name.toUpperCase());		//static invoke compile time
	}
	public static void age(int age) {        //private cannot be invoke
		System.out.println("Age: "+ age);
	}
}
