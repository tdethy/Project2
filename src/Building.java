//Building class

public class Building {

	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupencyGroup;
	protected String subGroup;
	
	public Building() {
		
	}


	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupencyGroup,
			String subGroup) {
		super();//not sure this is needed
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupencyGroup = occupencyGroup;
		this.subGroup = subGroup;
	}

	public void draw() {//draw method ??
	
	}
	
	public void displayData() {//CHANGED TO VOID FROM STRING
		System.out.println("Project Name: "+projectName);
		System.out.println("Address: "+completeAddress);
		System.out.println("Square Feet: "+ totalSquareFeet);
		System.out.println("Occupency Group: "+occupencyGroup);
		System.out.println("Occupency Subgroup: "+subGroup);
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public String getOccupencyGroup() {
		return occupencyGroup;
	}

	public void setOccupencyGroup(String occupencyGroup) {
		this.occupencyGroup = occupencyGroup;
	}

	public String getSubGroup() {
		return subGroup;
	}

	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}
	
	
	
	
	
}
