package jdbc;

import java.sql.*;
import java.io.*;

/**
 * Suppose we have a table : table1 , we have to update tName , tCity using its Id 
 * 
 */

public class JDBCProgram6Update {
	
	public static void main(String[] args) {
		
		try {
			
			Connection con = ConnectionProvider5.getConnection();
			
			// Creating Query
			String q = "update table1 set tName = ?, tCity = ? where tId = ?";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter new Name: ");
			String name = br.readLine();
			
			System.out.println("Enter new City: ");
			String city = br.readLine();
			
			
			System.out.println("Enter the Student ID: ");
			int id = Integer.parseInt(br.readLine());
			
			PreparedStatement p = con.prepareStatement(q);
			
			// now set the values of all 3 question marks
			p.setString(1,name);
			p.setString(2, city);
			p.setInt(3, id);
			
			// execute
			p.executeUpdate();
			
			// Print message
			System.out.println("Updated...");
			
			// Close the connection
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
