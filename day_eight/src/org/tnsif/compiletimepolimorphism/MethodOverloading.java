/*
 * There are two main types of polymorphism in Java:
 * 1. Compile-time polymorphism (or static polymorphism) is achieved through method overloading.
 * 2. Runtime polymorphism (or dynamic polymorphism) is achieved through method overriding.
 * 
 * Compile-time polymorphism occurs when a method with the same name but different signatures is called. 
 * The compiler can determine which method to call at compile time, based on the arguments that are passed 
 * to the method.
 */

package org.tnsif.compiletimepolimorphism;

class Bollywood{
	
	static String showCouple(String str1, String str2)
	{
		return str1+" loves "+ str2;
		

	}
	
	static String showCouple(String str1, String str2, String str3)
	{
		return str1+" loves "+str2+" as well as "+str3 ;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println(Bollywood.showCouple("Salman", "Aishwarya"));
		System.out.println(Bollywood.showCouple("Salman", "Aishwarya", "Katrina"));
	}

}
