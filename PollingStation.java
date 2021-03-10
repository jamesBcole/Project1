package Project1;


public class PollingStation extends CollationCenters {
	public int pollID;
    
	
	public PollingStation(String location, int centerID){
	    //invoking the CollationCenters class constructor
	    super(location, centerID);
	    this.centerID=centerID;
        this.location=location;
	    
	}
	
	// accessor methods and mutator methods
    public int getPollID() {
        return pollID;
    }
    public void setPollID(int pollID) {
        this.pollID=pollID;
    }

    public void addVote(Voter voter, String candidate) {
        voteLog.put(voter.getVoterID(), candidate);
    }

    public void printResults(){
        System.out.println("The results from the " + this + " polling station are as follows: ");
        System.out.println(results);
        
       
    }
}




