/*
 * The this keyword in Java is used to refer to the current object in a method or constructor. 
 * It can be used to:
 * a. Refer to the current object's instance variables.
 * b. Invoke the current object's methods.
 * c. Return the current object from a method.
 * d. Pass the current object as an argument to a method.
 * e. Invoke the current object's constructor.
 */

package org.tnsif.thiskeyworddemo;

class Account
{
	long accNo;
	
	void setData(long accNo)
	{
		this.accNo = accNo;
	}
	
	void display()
	{
		System.out.println(accNo);
	}
}

public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account a = new Account();
		a.setData(25034562896L);
		a.display();

	}

}
