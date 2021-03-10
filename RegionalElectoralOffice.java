package Project1;


public class RegionalElectoralOffice extends CollationCenters{
	
	
	public RegionalElectoralOffice(String location, int centerID) {
		//invoking the CollationCenters class constructor
	    super(location, centerID);
        this.location = location;
        this.centerID = centerID;
	    
	}
	
	// accessor methods and mutator methods
    public int getRegionID() {
        return centerID;
    }
    public void setRegionID(int regionID) {
        this.centerID=regionID;
    }


    public void printResults() {
       
        System.out.println("The "+ this.toString() + " office collected results from these district offices: "+ receivesFrom);
        System.out.println("The results are as follows: ");
        System.out.println(results);
       
    }

}
