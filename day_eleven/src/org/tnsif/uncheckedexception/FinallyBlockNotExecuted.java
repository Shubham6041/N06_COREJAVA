package org.tnsif.uncheckedexception;

public class FinallyBlockNotExecuted {

	
		static void show(int arr[])
		{
			try {
				System.out.println(arr[3]);
			}
			catch(Exception e)
			{
				System.out.println("Exception Handled: "+e);
				System.exit(0);
			}
			finally
			{
				System.out.println("Finally block is always executed ");
			}
			System.out.println("Any statement out of thwe block is always executed ");
		}
		
		public static void main(String[] args) {
			int arr[] = {4, 5, 6};
			show(arr);
		


	}

}
