package org.tnsif.finalkeyword;

public class Hp extends Laptop {

		final String PROCESSOR = "Intel 7";
		/*void display()
		{
			// we can't override any final method
		}
		*/
		
		// we can overload final method 
		void display(String PROCESSOR)
		{
			System.out.println(PROCESSOR);
		}
	

}
