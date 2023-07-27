package com.tns.multilevelinheritance;
//child1 or parent2(B)
public class TeamLeader extends Manager{
	
	//private data members
	private String leadName;
	private String projectName;
	
	//getters- setters
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


		//parameterised constructor
	public TeamLeader(String deptName, String name, int empID, String leadName, String projectName) {
		super(deptName, name, empID);
		
		this.leadName=leadName;
		this.projectName=projectName;
	}


	@Override
	public String toString() {
		return "TeamLeader [leadName=" + leadName + ", projectName=" + projectName + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
