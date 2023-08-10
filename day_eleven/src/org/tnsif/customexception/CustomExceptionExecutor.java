package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter user id: ");
		String userId = s.nextLine();
		System.out.println("Enter password: ");
		String password = s.nextLine();
		
		try {
			if(userId.equals("shubham@tile.in")&&(password.equals("Pass@123")))
			{
				System.out.println("Credentials are matched!!");
			}
			else
			{
				throw new LoginCredentials("Invalid Credentials");
			}
		}
		catch(LoginCredentials e)
		{
			System.out.println(e);
			
		}
	}

}
