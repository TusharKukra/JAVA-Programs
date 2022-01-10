package jdbc;

import java.sql.*;

// Inserting using PreparedStatement

public class JDBCProgram2Insert {

	public static void main(String[] args) {
		
		try {
			
			/* Step 1: Load the driver */
	         Class.forName("com.mysql.jdbc.Driver");

	         /* Step 2 : Create a connection */
	         String url = "jdbc:mysql://localhost:3306/dbName";
	         String username = "root";
	         String password = "root";
	         Connection con = DriverManager.getConnection(url,username,password);

	         /* Step 3 : Create a Query : here we are creating the Insert Query */
	         String q = "insert into table1(tName, tCity) values (?,?)";
	         
	         // to fire the Insert Query (dynamic query), use PreparedStatement 
	         PreparedStatement ps = con.prepareStatement(q);
	         
	         // setting the values to query
	         ps.setString(1,"TK");  // this is the tName (setString, bcoz the tName is of String type)
	         ps.setString(2, "India");  // this is tCity
	         
	         // here we are not getting the output (like we get in the SELECT Statement) so use executeUpdate(), and in executeUpdate dont use query q bcoz it was already used in the prepareStatement
	         ps.executeUpdate();
	         
	         
	         // Print the message
	         System.out.println("Inserted...");
	         
	         con.close();
	         
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
