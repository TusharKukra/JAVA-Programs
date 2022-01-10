package jdbc;

import java.sql.*;

public class JDBCProgram7Select {

	public static void main(String[] args) {
		
		try {
			
			Connection c = ConnectionProvider5.getConnection();
			
			// Create Query
			String q = "select * from table1";
			
			// now here we are using a query for showing output (select query), so use statement.
			Statement s = c.createStatement();
			
			// to fire the query (ResultSet contains data in Table like Structure (in rows/columns)
			ResultSet rs = s.executeQuery(q);
			
			// to print each row data from the ResultSet we use while loop 
			while(rs.next()) {
				
				int id = rs.getInt(1);   // here 1,2,3 are the column numbers, we can also give column names here...
				String name = rs.getString(2);
				String city = rs.getString(3);
				
				System.out.println(name+", "+id+", "+city);
			}
			
			
			// close the connection
			c.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
