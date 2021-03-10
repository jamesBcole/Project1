package Project1;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public abstract class CollationCenters implements Verifiable {
	//creating instance variables
	public String location;
    HashMap<Integer, String> voteLog = new HashMap<Integer, String>();
    HashMap<String, Integer> results = new HashMap<String, Integer>();
    CollationCenters reportsTo;
	ArrayList<CollationCenters> receivesFrom = new ArrayList<CollationCenters>();
    public int centerID;
	
    public CollationCenters(String location, int centerID) {
        this.centerID = centerID;
    }

    public HashMap<Integer, String> collectVotes() {
        for (CollationCenters c: receivesFrom) {
            voteLog.putAll(c.voteLog);
        }
        return voteLog;
    }
    
    public HashMap<String, Integer> count() {
        if (this instanceof PollingStation == false) {
            voteLog.clear();
            collectVotes();
        }
        for (String i:Candidate.candidateList){
        int count = Collections.frequency(voteLog.values(), i);
        results.put(i, count);
        }
        return results;
    };

    public abstract void printResults();

    
    //set reporting structure
    public void setReporting(CollationCenters receiver) {
        if (check(receiver)) {
        this.reportsTo = receiver;
        receiver.receivesFrom.add(this);
        }
    }
    
    public boolean check(CollationCenters receiver) {
        if (this.reportsTo == null) {
            return true;
        }
        else {
            System.out.println(this + " is already reporting results to " + this.reportsTo);
            return false;
        }
    }
    @Override
    public String toString() {
		return location;
    	
    }
   
}



