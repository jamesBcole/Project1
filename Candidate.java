package Project1;


import java.time.LocalDate;
import java.util.ArrayList;

public class Candidate extends Person {
	private int candidateID;
	private String party;
    public static ArrayList<String> candidateList = new ArrayList<String>();
	
	public Candidate(String name,LocalDate DOB,int NID,int candidateID,String party) {
		//invoking the Person class constructor
		super(name,DOB,NID);
		this.candidateID=candidateID;
		this.party=party;
        candidateList.add(this.toString());
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

