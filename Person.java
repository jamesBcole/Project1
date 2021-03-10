package Project1;


import java.time.LocalDate;

public class Person {
	//creating instance variables
	public String name;
    public LocalDate DOB;
    public int NID;
    
    // Constructor for person class
    public Person(String name,LocalDate DOB,int NID) {
    	this.name=name;
    	this.DOB=DOB;
    	this.NID=NID;
    	
    }
    //setter and getters
    public String getName() {
        return name;
    }
    
    public LocalDate getDOB() {
        return DOB;
    }
    public int getNID() {
        return NID;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setDOB(LocalDate DOB ) {
        this.DOB=DOB ;
    }
    public void setNID(int NID) {
        this.NID=NID;
    }
    @Override
    public String toString() {
    	return name;
    }
    

}
