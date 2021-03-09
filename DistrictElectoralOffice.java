package votingsystems;

public class DistrictElectoralOffice extends CollationCenters {
	public int districtID;
	
	public DistrictElectoralOffice(String location,int districtID){
	    //invoking the CollationCenters class constructor
	    super(location);
	    this.districtID=districtID;
	}
	    
	 // accessor methods and mutator methods
	    public int getDistrictID() {
	        return districtID;
	    }
	    public void setDistrictID(int districtID) {
	        this.districtID=districtID;
	    }

}
