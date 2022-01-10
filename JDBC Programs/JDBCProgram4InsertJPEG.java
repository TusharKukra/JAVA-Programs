package jdbc;

import java.sql.*;
import java.io.*;

// We can store image in Blob, but it can only store upto 65kb

//Inserting Large Images using lob: firstly create a table in SQL which is having a pic column: create table images(id int primary key auto_increment, pic blog); 


public class JDBCProgram4InsertJPEG {
	
	public static void main(String[] args) {
		try {
			
			/* Step 1: Load the driver */
	        Class.forName("com.mysql.jdbc.Driver");

	        /* Step 2 : Create a connection */
	        String url = "jdbc:mysql://localhost:3306/dbName";
	        String username = "root";
	        String password = "root";
	        Connection con = DriverManager.getConnection(url,username,password);
	        
			/* Step 3 : Create a query */
	        String q = "insert into tableImage(pic) values (?)";
	        
	        // insert using PreparedStatement
	        PreparedStatement pst = con.prepareStatement(q);
	        
	        // here we are saving Image to the database: so use BinaryStream
	        FileInputStream fs = new FileInputStream("pic.jpg");
	        
	        // fs.available : it will gives us the approx memory left (in bytes)
	        pst.setBinaryStream(1, fs, fs.available());
	        
	        pst.executeUpdate();
	        
	        // Print message
	        System.out.println("Inserted Image...");
	        
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
