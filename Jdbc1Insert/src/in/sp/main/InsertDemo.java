package in.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
	public static void main(String[] args) throws Exception	//Exception is handle for Driver class
	{
		String name1 = "Narayana";
		String email1 = "naru@gmail.com";
		String pass1= "Sumit123";
		String gender1 = "male";
		String city1 = "Latur";
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcSP_db", "root", "Sumit4403");
		
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
		
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, pass1);
		ps.setString(4, gender1);
		ps.setString(5, city1);
		
		int i = ps.executeUpdate();
		
		if (i>0) {
			System.out.println("Data added Successfully...");
		}
		else {
			System.out.println("Data Don't added due to some error...");
		}
	}
}
