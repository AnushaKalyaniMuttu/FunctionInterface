package com.biconsumer;

import java.util.function.Function;

public class FunctionInterface {

	static Function<String,String> toUpper=(name)->name.toUpperCase();
	static Function<String,String> addSomething=(name)->name.toUpperCase().concat(" Kalyani");
	public static void main(String[] args) {
		System.out.println("Result is:"+toUpper.andThen(addSomething).apply("Anusha"));
		System.out.println("Result is:"+toUpper.compose(addSomething).apply("Anusha"));
		
	}
}
