/*
 * The super keyword in Java is used to refer to the superclass of the current class. 
 * It can be used to:
 * a. Access the superclass's fields and methods.
 * b. Invoke the superclass's constructors.
 * c. Override the superclass's methods.
 */

package org.tnsif.superkeyword;

class Google
{
	String ceo;

	public Google(String ceo) {
		super();
		// this.ceo = ceo;
		System.out.println("Default Constructor: "+ceo);
	}
	
	
}

class Gmail extends Google
{
	String userId;

	public Gmail(String ceo, String userId) {
		super(ceo);
		// this.userId = userId;
		System.out.println("Parameterized Constructor: "+userId);
	}
	
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		Gmail g = new Gmail("Sundar Pichai", "xyz@gmail.com");
		
	}

}
