package Project1;


import java.time.LocalDate;



public class Voter extends Person implements Verifiable {
	public int pollID;
	public int voterID;
    String votedFor;

	
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

    public boolean check(CollationCenters poll) {
        if (this.pollID != poll.centerID) {
            System.out.println(name + " is not elligible to vote at " + poll.location +".");
            return false;
        }
        if (poll.voteLog.containsKey(voterID)) {
            System.out.println("This voter has already voted.");
            return false;
        }
        return true;

    }
    public void vote(PollingStation poll, Candidate candidate) {
        if(check(poll)) {
            votedFor  = candidate.toString();
            poll.addVote(this, votedFor);
            System.out.println("Vote successfully recorded.");
            //Database.addVote(this, votedFor)
        }


    }
}
