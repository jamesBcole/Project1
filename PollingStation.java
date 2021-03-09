package votingsystems;

public class PollingStation extends CollationCenters {
	public int pollID;
	
	public PollingStation(String location,int pollID){
	    //invoking the CollationCenters class constructor
	    super(location);
	    this.pollID=pollID;
	    
	}
	
	// accessor methods and mutator methods
    public int getPollID() {
        return pollID;
    }
    public void setPollID(int pollID) {
        this.pollID=pollID;
    }

}


