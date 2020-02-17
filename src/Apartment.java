
public class Apartment extends Residential {

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	
	//Open Constructor
	public Apartment() {
		// TODO Auto-generated constructor stub
	}
	//Preferred Constructor
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupencyGroup,
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
		System.out.println("Number of Rentable Units: "+numRentableUnits);
		System.out.println("Average Unit Size: "+avgUnitSize);
		System.out.println("Parking availability: "+parkingAvailable);
	}
	
	
	//Getters/Setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	
	public double getAvgUnitSize() {
		return avgUnitSize;
	}
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	
}
