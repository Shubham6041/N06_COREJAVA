package org.tnsif.codingchallenge;
/*
 * The festive season is about to begin. Mary is planning to purchase several items through an online shopping 
 * platform. She has added all the items to the shopping cart. Now she wants to verify if she has added all the 
 * items that she had planned to purchase. Help Mary to view the contents of the cart.
 */

import java.util.ArrayList;
import java.util.Collections;

class Products{
	ArrayList<String>productList = new ArrayList<String>();

	public ArrayList<String> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<String> productList) {
		this.productList = productList;
	}
	
	public void addProductToList(String products)
	{
		productList.add(products);
	}
	
	public void sortProductList()
	{
		Collections.sort(productList);
	}
	
}
public class ArrayListProblem {

	public static void main(String[] args) {
		Products p = new Products();
		
		int option = 0;
		do
		{
			System.out.println("1. Add");
			System.out.println("2. Sort");
			System.out.println("3. Exit");
		
			switch(option)
			{
			case 1:
				p.addProductToList("Bag");
				
				break;
				
			case 2:
				p.sortProductList();
				break;
				
			case 3:
				System.out.println("Thank you for using the application");
				break;
				
			default:
				System.out.println("Enter the correct choice");
			}

		}while(option!=0);
	}
}
