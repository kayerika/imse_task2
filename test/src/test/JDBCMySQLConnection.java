package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCMySQLConnection {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://a1263502.mysql.univie.ac.at/a1263502";

	// Database credentials
	static final String USER = "a1263502";
	static final String PASS = "kay2devi";
	 

	public static Connection connection() {
		//System.out.println("Connecting to database...");
		Connection conn = null;
		try {
			// STEP 2: Register JDBC driver
			
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected");
			
			
		} catch (Exception se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} // end try
		System.out.println("Goodbye!");
		return conn;
	}// end main

}
