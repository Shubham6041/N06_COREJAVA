package org.tnsif.thiskeyworddemo;

class Team
{
	int size;
	Team()
	{
		this(7);
		System.out.println("default Constructor: "+size);
	}
	public Team(int size) {
		System.out.println("parameterized constructor : "+size);
	}
	
	
}
public class ThisKeywordDemoThree {


	public static void main(String[] args) {
		Team t = new Team();
		

	}

}
