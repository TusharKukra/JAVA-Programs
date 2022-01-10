package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider5 {

	private static Connection con;  // by-default value of static variable is : null
	
	public static Connection getConnection() {
		
		try {
			
			if(con==null) {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbName","root","root");
				
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return con;
	}
}
