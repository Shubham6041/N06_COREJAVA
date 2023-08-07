package org.tnsif.interfaces;

public interface Sony {
	int noOfChannels = 5;
	
	//by default all the methods inside the interface are abstract methods
	void display();
	
	static void show()
	{
		System.out.println("hello");
	}
}
