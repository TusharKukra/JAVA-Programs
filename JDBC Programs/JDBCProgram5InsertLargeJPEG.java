package jdbc;

import java.io.*;
import java.sql.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

//Inserting Large Images using longblob: firstly create a table in SQL which is having a pic column: create table images(id int primary key auto_increment, pic longblog); 

public class JDBCProgram5InsertLargeImage {
	public static void main(String[] args) {
		
		try {
			
			// calling the connectionProvider5 class object
			
			Connection c = ConnectionProvider5.getConnection();
			
			String q = "insert into images(pic) values (?)";
			
			PreparedStatement pstm = c.prepareStatement(q);
			
			// here we want to choose Pic file using the Dialog box (not with the help of FileStream)
			// so use JFileChooser (which is a component of Java Swing which provides us the Dialog box to choose images)
			JFileChooser j = new JFileChooser();
			
			j.showOpenDialog(null);
			
			// store the selected file into File
			File file = j.getSelectedFile();	
			
			FileInputStream fis = new FileInputStream(file);
			
			pstm.setBinaryStream(1, fis, fis.available());
			
			// setting query
			pstm.executeUpdate();
			
			//Print Message
			JOptionPane.showMessageDialog(null, "success");
			// System.out.println("Done...");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
