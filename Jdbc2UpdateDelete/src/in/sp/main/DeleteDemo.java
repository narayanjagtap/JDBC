package in.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
	public static void main(String[] args) throws Exception{
		
		String email = "narayan@example.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcSP_db", "root", "Sumit4403");
		
		PreparedStatement ps = con.prepareStatement("DELETE FROM register WHERE email = ?");
		
		ps.setString(1, email);
		
		int count = ps.executeUpdate();
		
		if (count > 0) {
			System.out.println("Data deleted succes	sfully for " + email);
		}else {
			System.out.println("Data cannot be deleted due to some error");
		}
		
		con.close();
	}
}
