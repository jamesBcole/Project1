package votingsystems;

import java.time.LocalDate;

public class Voter extends Person {
	public int pollID;
	public int voterID;
	
	
	public Voter(String name,LocalDate DOB,int NID,int pollID,int voterID) {
		//invoking the Person class constructor
		super(name,DOB,NID);
		this.pollID=pollID;
		this.voterID=voterID;
	}
	 // accessor methods and mutator methods
    public int getPollID() {
        return pollID;
    }
    public int getVoterID() {
        return voterID;
    }
    
    public void setPollID(int pollID) {
        this.pollID=pollID;
    }
    public void setVoterID(int voterID) {
        this.voterID=voterID;
    }
    
    public void vote(int candidateID) {
    	
    }

}
