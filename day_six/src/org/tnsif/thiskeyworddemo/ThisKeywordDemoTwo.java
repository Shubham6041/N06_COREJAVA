package org.tnsif.thiskeyworddemo;

class Bank
{
	long accNo;
	Bank (long accNo)
	{
		this.accNo = accNo;
	}
	
	void display()
	{
		System.out.println(accNo);
	}
	
}
public class ThisKeywordDemoTwo {

	public static void main(String[] args) {
		Bank b = new Bank(25034568994L);
		b.display();
		

	}

}
