
public class Business extends Building {

	
	protected int numRentableUnits;
	
//Open constructor
	public Business() {
		
	}

//Preferred Constructor
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupencyGroup,
			String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupencyGroup, subGroup);
		// TODO Auto-generated constructor stub
	}

//Getters/Setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

}
