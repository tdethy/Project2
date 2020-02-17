
public class Residential extends Building {

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	
	
//Open constructor
	public Residential() {
		// TODO Auto-generated constructor stub
	}
//Preferred constructor
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupencyGroup,
			String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupencyGroup, subGroup);
		// TODO Auto-generated constructor stub
	}

	
	
//Getters/Setters
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	
	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}


	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}

	
}
