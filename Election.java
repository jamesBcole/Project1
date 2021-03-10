package Project1;
import java.time.LocalDate;


public class Election {
    public static void main(String args[]) {
        //Create Collation Centers
        //(Location,PollID)
       
        NationalElectoralHeadquarters hq = new NationalElectoralHeadquarters("headquarters", 9999);

        RegionalElectoralOffice greaterAccra = new RegionalElectoralOffice("Greater Accra",1234);
        greaterAccra.setReporting(hq);
        RegionalElectoralOffice volta = new RegionalElectoralOffice("Volta", 4213);
        volta.setReporting(hq);

        DistrictElectoralOffice temaWest = new DistrictElectoralOffice("Tema West", 6600);
        temaWest.setReporting(greaterAccra);
        DistrictElectoralOffice adenta = new DistrictElectoralOffice("Adenta", 7700);
        adenta.setReporting(greaterAccra);
        DistrictElectoralOffice hoehoe = new DistrictElectoralOffice("Hoehoe", 8800);
        hoehoe.setReporting(volta);
        
        PollingStation tw1 = new PollingStation("TW1", 1111);
        tw1.setReporting(temaWest);
        PollingStation aden1 = new PollingStation("ADEN1", 2222);
        aden1.setReporting(adenta);
        PollingStation aden2 = new PollingStation("ADEN2", 3333);
        aden2.setReporting(adenta);
        PollingStation hoe1 = new PollingStation("HOE1", 4444);
        hoe1.setReporting(hoehoe);
        hoe1.setReporting(adenta);
        
        
        //Create People
    
        Candidate mahama = new Candidate("Mahama", LocalDate.of(1958,11,29),2368,0001,"NDC");
        Candidate akufoAddo = new Candidate("Akufo-Addo", LocalDate.of(1944,03,29),4739,0002, "NPP");


        Voter john = new Voter("John Mensah",LocalDate.of(1999,11,23),2444,1111,5678);
        john.vote(tw1,mahama);
        Voter ama = new Voter("Ama Boakye", LocalDate.of(1997,04,12),3555,4444,3526);
        //demonstrating incorrect entry
        ama.vote(aden1, mahama);
        ama.vote(hoe1, mahama);

        Voter mike = new Voter("Mike Brown", LocalDate.of(1996,01,14),4666,3333,2526);
        mike.vote(aden2, akufoAddo);
        Voter abena = new Voter("Abena Koranteng", LocalDate.of(1998,06,21),5777,2222,3124);
        abena.vote(aden1, akufoAddo);
        Voter james = new Voter("James Arkoh", LocalDate.of(1997,05,13),6888,3333,2672);
        james.vote(aden2, akufoAddo);
        Voter kofi = new Voter("Kofi Owusu", LocalDate.of(1998,03,27), 1333, 1111, 9384);
        kofi.vote(tw1,akufoAddo);
        Voter samuel = new Voter("Samuel Tetteh", LocalDate.of(1999,12,04), 7999, 2222, 9458);
        samuel.vote(aden1, akufoAddo);
        
        Voter kojo = new Voter("Kojo Adjei", LocalDate.of(2000,02,05), 8000, 2222, 1454);
        kojo.vote(aden1, mahama);
        Voter araba = new Voter("Araba Frimpong", LocalDate.of(1997,07,11), 9111, 4444, 8253);
        araba.vote(hoe1, mahama);
        Voter mary = new Voter("Mary Arthur", LocalDate.of(1998,04,19), 0222, 1111,2395);
        mary.vote(tw1, mahama);
        
        //Count at polling stations
        aden1.count();
        aden2.count();
        hoe1.count();
        tw1.count();

        //Count at district offices
        temaWest.count();
        adenta.count();
        hoehoe.count();

        //Count at regional offices
        greaterAccra.count();
        volta.count();

        //Count at headquarters
        hq.count();
        
        //Print Select Results
        temaWest.printResults();
        greaterAccra.printResults();
        hq.printResults();
        
        





    }
    
}
