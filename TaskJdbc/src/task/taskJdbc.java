package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class taskJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//Step 1 : Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 2 : create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","Jayesh@2003");
			
			// step 3 : create statement
			Statement st = con.createStatement();
			
			// step 4 : execute Query
			ResultSet rs = st.executeQuery("select * from employess");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
			}
			
			// step 5 : close connection
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println();
		}
	}

}
