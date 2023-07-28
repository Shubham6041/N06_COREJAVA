package org.tnsif.multilevelinheritance;

public class TeamLead extends Manager {
	
	private String leadName;
	private String projectName;
	

	public String getLeadName() {
		return leadName;
	}

	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	

	public TeamLead(String deptName, String name, int empId, String leadName, String projectName) {
		super(deptName, name, empId);
		this.leadName = leadName;
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", projectName=" + projectName + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	
	
}
