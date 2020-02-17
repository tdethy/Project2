
public class Mall extends Business {

	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	
	//open constructor
	public Mall() {
		// TODO Auto-generated constructor stub
	}
	//preferred constructor
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupencyGroup,
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
		System.out.println("Number of Rentable Units: "+numRentedUnits);
		System.out.println("Median Unit Size: "+medianUnitSize);
		System.out.println("Number of Parking Spaces: "+numParkingSpaces);
	}
	
	
	
	
	
	
	//Getters/Setters
	
	
	public int getNumRentedUnits() {
		return numRentedUnits;
	}
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}
	
	
	public double getMedianUnitSize() {
		return medianUnitSize;
	}
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}
	
	
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}

	
	
}
