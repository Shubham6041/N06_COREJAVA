package org.tnsif.singledimensionalarray;

public class ArrayOfObjects {

	public static void main(String[] args) {
		Employee arr[] = new Employee[3];
		arr[0] = new Employee(11, "Shubham", 850000.00);
		arr[1] = new Employee(12, "Pratik", 75000.45);
		arr[2] = new Employee(13, "Ajay", 65000.50);
		
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
	}

}
