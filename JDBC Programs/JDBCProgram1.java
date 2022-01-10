package jdbc;

import java.sql.*;

public class JDBCProgram1 {

 public static void main(String args[]) {
     // use Try catch always in jdbc to handle the exception 
     try{
         /* Step 1: Load the driver */
         Class.forName("com.mysql.jdbc.Driver");

         /* Step 2 : Create a connection */
         String url = "jdbc:mysql://localhost:3306/dbName";
         String username = "root";
         String password = "root";
         Connection con = DriverManager.getConnection(url,username,password);

         // check if connection is closed or not
         if(con.isClosed()){
             System.out.println("Connection is Closed");
         } else{
             System.out.println("Connection is Created");
         }

         
         /* Step 3 : Create a Query */
         String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
         
         // to fire this simple query use Statement
         Statement st = con.createStatement();
         
         // to execute the query (here we are using Create statement, so it is not giving us output, so dont use executeQuery, use executeUpdate.
         st.executeUpdate(q);
         
         // if the above statement executed then table will be created (otherwise it will show exception/error)
         System.out.println("Table created in Database....");
         
         con.close();
         

     }catch(Exception e){
         e.printStackTrace();
     }

 }
}
