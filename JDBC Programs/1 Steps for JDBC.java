Step 1: Load the driver

Class.forName("com.mysql.jdbc.Driver")


Step 2: Create a Connection (using DriverManager static method getConnection)

Connection con = DriverManager.getConnection("urlOfDatabase", "usernameOfUser", "password");

eg: Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbName","root","root");


Step 3: Create Query, Statement (to fire a simple/parameterized query), PreparedStatement (for incomplete Query), CallableStatement (for a query which is calling a function from database)

eg: String q = "Select * from students";  // this is a simple query, so to fire it use Statement
    Statement st = con.createStatement();
    ResultSet set = st.executeQuery(q);  // to fire query (for SELECT query: use executeQuery), (if we are not getting any data output like Update, insert, delete then use: executeUpdate(q);)
 

Step 4: Process the data (using Java's Set method)

// inside a while loop, check for rows (so we use set.next() for checking whether we have any rows or not)
while(set.next()){

	int id = set.getInt("studentID");  // to get the data of studentID column name which is an integer
	
	String name = set.getString("studentName");  // to get the data of name column which is an string datatype (using column name)

	// to print
	System.out.println(id);
	System.out.println(name);

}	



Step 5: Close the connection

con.close();
