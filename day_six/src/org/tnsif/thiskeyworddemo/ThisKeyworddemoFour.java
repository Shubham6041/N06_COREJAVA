package org.tnsif.thiskeyworddemo;

class Director{
	String name;
	
	void print()
	{
		this.name = "Sunit Datt";
		display(name);
	}
	
	void display(String name)
	{
		System.out.println(name);
	}
}
public class ThisKeyworddemoFour {

	public static void main(String[] args) {
		Director d = new Director();
		d.print();
		
		

	}

}
