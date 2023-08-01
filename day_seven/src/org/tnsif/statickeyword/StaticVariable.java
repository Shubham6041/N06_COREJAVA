package org.tnsif.statickeyword;

class Employee
{
	private int empId;
	private String name ;
	static String compName = "Microsoft";
	
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static String getCompName() {
		return compName;
	}


	public static void setCompName(String compName) {
		Employee.compName = compName;
	}


	public void display()
	{
	//ystem.out.println(" Emp Id :"+this.getEmpID()+" "+" Emp name : "+this.name+" "
	//	+ ""+ "company name : "+Employee.compName();
		
	}
	
	
	
}

public class StaticVariable {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(1);
		e.setName("Shubham");
		e.display();
		

	}

}
