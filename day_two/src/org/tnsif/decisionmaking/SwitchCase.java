package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("enter the coice: ");
		int song_no = s.nextInt();
		
		switch(song_no)
		{
		case 1:
			System.out.println("Jai Shree Ram");
			break;
			
		case 2:
			System.out.println("Apna bana le");
			break;
			
		case 3:
			System.out.println("Tere hawale kr diya");
			break;
			
		case 4:
			System.out.println("Wah re shiva");
			break;
			
		default :
			System.out.println("enter the correct choice");
			break;
		
		}

	}

}
