package org.tnsif.checkedexception;

import java.io.FileInputStream;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try 
		{
			FileInputStream f = new FileInputStream("C:/Users/shubham/OneDrive/Desktop/TNS/SQL-1.pdf");
			System.out.println("File Exists!!!");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled "+e);
		}
	}

}
