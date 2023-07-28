package org.tnsif.singleinheritance;

public class Student extends Citizen {

	private int rollno;
	private String collegeName;
	 
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student(String city , int pincode, String area, long adharNo, int rollno, String collegeName) {
		super(city , pincode , area , adharNo);
		this.rollno = rollno;
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
