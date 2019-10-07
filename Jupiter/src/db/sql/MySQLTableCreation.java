package db.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLTableCreation {
	public static void main(String[] args) {
	try {
		//Step 1 Connect to MySQL.
		System.out.println("Connecting to " + MySQLDBUtil.URL);
		Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
		Connection conn = DriverManager.getConnection(MySQLDBUtil.URL);
		
		if(conn == null) {
			return;
		}
		
		conn.close();
		System.out.println("Import done successfully");
		
	}catch(Exception e) {
		e.printStackTrace();
	}

	}
}
