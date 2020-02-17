
public class SingleFamilyHome extends Residential {

	private boolean garage;
	
	//Open Constructor
	public SingleFamilyHome() {
		// TODO Auto-generated constructor stub
	}
	
	//Preferred Constructor
public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupencyGroup,
			String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupencyGroup, subGroup);
		// TODO Auto-generated constructor stub
	}


public void draw() {//draw method ??
}

public void displayData() {//CHANGED TO VOID FROM STRING
	System.out.println("Project Name: "+projectName);
	System.out.println("Address: "+completeAddress);
	System.out.println("Square Feet: "+ totalSquareFeet);
	System.out.println("Occupency Group: "+occupencyGroup);
	System.out.println("Occupency Subgroup: "+subGroup);
	System.out.println("Number of Bedrooms: "+numBedrooms);
	System.out.println("Number of Bathrooms: "+numBathrooms);
	System.out.println("Laundry Room: "+laundryRoom);
	System.out.println("Garage: "+garage);
}


	//Setters/Getters
	public boolean isGarage() {
		return garage;
	}
	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	
	
}
