package org.tnsif.uncheckedexception;

public class ThrowAndThrowsKeyword { 
	// static void isEligible(int age, int weight)throws Exception
	static void isEligible(int age, int weight)
	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible for blood donation ");
		}
		else
	
			throw new ArithmeticException("Criteria is not satisfied");
			// System.out.println("Criteria is not Satisfied");
	
	}

	// public static void main(String[] args) throws Exception {
	public static void main(String[] args) {

		isEligible(22, 44);
	}

}
