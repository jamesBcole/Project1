package Project1;
import java.util.HashMap;
import java.util.Collections;


public class NationalElectoralHeadquarters extends CollationCenters {
	
	public NationalElectoralHeadquarters(String location, int centerID) {
		//invoking the CollationCenters class constructor
        super(location, centerID);
        this.location = location;
        this.centerID = centerID;
	}
	
	public HashMap<String, Integer> count() {
        voteLog.clear();
        collectVotes();
        for (String i:Candidate.candidateList){
        int count = Collections.frequency(voteLog.values(), i);
        results.put(i, count);
        }
        return results;
    }
    public void printResults() {
        System.out.println("The headquarters collected results from these district offices: " + receivesFrom);
        System.out.println("The results are as follows: ");
        System.out.println(results);
    }

}
