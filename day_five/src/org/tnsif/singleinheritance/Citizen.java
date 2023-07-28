package org.tnsif.singleinheritance;

public class Citizen {
	
	private String City;
	private int pincode;
	private String area;
	private long adharNo;
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	@Override
	public String toString() {
		return "Citizen [City=" + City + ", pincode=" + pincode + ", area=" 
				+ area + ", adharNo=" + adharNo + "]";
	}
	public Citizen() {
		System.out.println("Citigen-Parent Class");
	}
	
	public Citizen(String city, int pincode, String area, long adharNo) {
		super();
		City = city;
		this.pincode = pincode;
		this.area = area;
		this.adharNo = adharNo;
	}
	
	
	
	
}
