/*
 * Runtime polymorphism occurs when a method with the same name is called, but the method is overridden in a subclass.
 * The Java compiler cannot determine which method to call at compile time, so it defers the decision to runtime.
 * At runtime, the Java Virtual Machine (JVM) will call the overridden method that is appropriate for the object 
 * that is being used.
*/
package org.tnsif.runtimepolymorphism;

class CM{
	static void corruption(String str1, long amount1)
	{
		System.out.println(str1+" corrupted the amount of "+amount1+" Rs");
	}
}

class MLA extends CM{
	static void corruption(String str2, long amount2)
	{
		CM.corruption("Eknath Shinde", 520000000000L);
		System.out.println(str2+" corrupted the amount of "+amount2+" Rs");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		MLA.corruption("Ajit Pawar ",7000000000000L);
		

	}

}