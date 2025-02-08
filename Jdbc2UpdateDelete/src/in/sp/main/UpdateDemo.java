package in.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	public static void main(String[] args) throws Exception
	{
		String city1 = "Jayphal";
		String email = "Dada@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcSP_db", "root", "Sumit4403");
		
		PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
		ps.setString(1, city1);
		ps.setString(2, email);
		
		int count = ps.executeUpdate();
		if (count>0) {
			System.out.println("Data Updation Successfully of " + email);
		}else {
			System.out.println("Updation Failed due to some error..");
		}
		
		con.close();
	}
}
