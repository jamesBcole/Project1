package Project1;

import java.sql.*;  // Using 'Connection', 'Statement' and 'ResultSet' classes in java.sql package

public class Database {
    
    public static void addVote(Voter v, String candidate) {
        try {

            //Database connection: Username = root, Password = adminadmin
            Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/votingrecords?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
            "root", "adminadmin");   
            
            String voteInfo = "insert into votes values (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(voteInfo);
            stmt.setString(1, v.getName());
            stmt.setInt(2, v.getPollID());
            stmt.setInt(3, v.getVoterID());
            stmt.setString(4, candidate);
            stmt.executeUpdate();
                      
        }
        catch (SQLException e) {
            if (!e.getSQLState().startsWith("23")) {
                System.out.println("There was an error connecting to the database.");
            }
        }
        
    }
}
