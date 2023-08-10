package org.tnsif.uncheckedexception;

public class CatchBlockDemo {

	static void show(int arr[])
	{
		try {
			System.out.println(10/0);
			System.out.println(arr[3]);
		}
		
		catch( ArithmeticException | NullPointerException e)
		//catch( ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			System.out.println(e);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Handled : "+e);
		}

	}
	
	public static void main(String[] args) {
		int arr[] = {4, 5, 6};
		show(arr);
	}
}
