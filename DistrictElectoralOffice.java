package Project1;

public class DistrictElectoralOffice extends CollationCenters {
	
	public DistrictElectoralOffice(String location,int centerID){
	    //invoking the CollationCenters class constructor
	    super(location, centerID);
        this.location = location;
	    this.centerID=centerID;
        
	}
	    
    // accessor methods and mutator methods
    public int getDistrictID() {
        return centerID;
    }
    public void setDistrictID(int districtID) {
        this.centerID=districtID;
    }

    public void printResults() {
        System.out.println("The "+ this + " office collected results from these polling stations: "+ receivesFrom);
        System.out.println("The results are as follows: ");
        System.out.println(results);
       
    }
}
