package org.tnsif.finalkeyword;

public class FinalVariable {
	/*
	 * final variable must be initialize during execution
	 * final int X;
	 */
	
	final float SALARY = 74000f;
	
	void print()
	{
		/*SALARY = 67000f; 
		 * we can't change the value of final variable  
		 */
		System.out.println("Salary is: "+SALARY);
	}
}
