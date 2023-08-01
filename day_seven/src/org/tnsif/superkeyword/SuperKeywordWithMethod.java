package org.tnsif.superkeyword;

class MET
{
	String ownerName = "Chagan Bhujbal";

	 void displayName() {
		 System.out.println("Owner is: "+ownerName);
		
	}
	
}

class BKC extends MET
{
	String ownerName = "Shefali Bhujbal";
	
	/*/
	 * if parent class and child class method name are same and 
	 * if you want to access that method then use super.method_name();
	 */
	void displayName()
	{
		super.displayName();
		System.out.println("Owner is: "+ownerName);
	}
}

public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b = new BKC();
		b.displayName();

	}

}
