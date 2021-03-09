package votingsystems;

public class RegionalElectoralOffice extends CollationCenters{
	public int regionID; 
	
	public RegionalElectoralOffice(String location,int regionID) {
		//invoking the CollationCenters class constructor
	    super(location);
	    this.regionID=regionID;
	}
	
	// accessor methods and mutator methods
    public int getRegionID() {
        return regionID;
    }
    public void setRegionID(int regionID) {
        this.regionID=regionID;
    }

}
