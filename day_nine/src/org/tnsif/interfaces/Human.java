package org.tnsif.interfaces;

public class Human implements ColdDrinks, AlcoholDrinks{

	@Override
	public void showDrink() {
		System.out.println(coldDrinkName+" "+alcoholType+" "+brand);
	}
	
}
