package org.tnsif.arraylist;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Executor {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List list1 = new ArrayList();
		list1.add(10);
		list1.add("Welcome");
		list1.add(false);
		list1.add(new Date());
		System.out.println(list1);
		
		
	}

}
