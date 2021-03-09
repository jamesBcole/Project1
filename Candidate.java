package votingsystems;

import java.time.LocalDate;

public class Candidate extends Person {
	public int candidateID;
	public String party;
	
	public Candidate(String name,LocalDate DOB,int NID,int candidateID,String party) {
		//invoking the Person class constructor
		super(name,DOB,NID);
		this.candidateID=candidateID;
		this.party=party;
	}
	
	// accessor methods and mutator methods
    public int getCandidateID() {
        return candidateID;
    }
    public String getParty() {
        return party;
    }
    
    public void setCandidateID(int candidateID) {
        this.candidateID=candidateID;
    }
    public void setParty(String party) {
        this.party=party;
    }

}
