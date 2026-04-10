package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			// Step 1 : Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 2 : Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","Jayesh@2003");
			
			// Step 3 : Create SQl statement
			Statement st = con.createStatement();
			
			// Step 4 : Execute SQL statement
			ResultSet rs = st.executeQuery("select * from person");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " "+rs.getString(2) + " "+rs.getInt(3));
			}
			
			// Step 5 : Close connection
			con.close();
			
		}catch (Exception e) {
			System.out.println();
		}
	}

}
