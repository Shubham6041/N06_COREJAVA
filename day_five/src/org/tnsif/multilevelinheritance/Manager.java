package org.tnsif.multilevelinheritance;

public class Manager {
	
	private String deptName;
	private String name;
	private int empId;
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", name=" + name + ", empId=" + empId + "]";
	}
	public Manager(String deptName, String name, int empId) {
		super();
		this.deptName = deptName;
		this.name = name;
		this.empId = empId;
	}
	
	
	
	
}
