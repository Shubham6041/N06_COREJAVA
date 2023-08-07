package org.tnsif.interfaces;

public class InterfaceExecutor {

	public static void main(String[] args) {
		/*
		 *  Sony s = new Sony();
		 *  we cannot instantiate the interface
		 */
		
		SonyTV s1 = new SonyTV();
		s1.display();
		Sony.show();
		
		ISRO i = new ISRO();
		i.status();
		
		Human h = new Human();
		h.showDrink();
		
		

	}

}
