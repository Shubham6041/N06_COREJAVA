package org.tnsif.superkeyword;

class Building{
	int floors = 18;
	String name = "Matoshree";
}

class Flat extends Building{
	String name = "Shubham Tile";
	
	void print()
	{
		/*
		 * if parent class and child class variable name are same
		 * and if you want to access parent class variable inside child class use super.var_name
		 */
		System.out.println(super.name);
		System.out.println(name);
	}
}

public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f = new Flat();
		f.print();

	}

}
