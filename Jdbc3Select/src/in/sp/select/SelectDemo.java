package in.sp.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class SelectDemo {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcSP_db", "root", "Sumit4403");
		
		PreparedStatement ps = con.prepareStatement("select * from register");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			String name1 = rs.getString("name");
			String email1 = rs.getString("email");
			String password1 = rs.getString("password");
			String gender1 = rs.getString("gender");
			String city1 = rs.getString("city");
			
			System.out.println(name1);
			System.out.println(email1);
			System.out.println(password1);
			System.out.println(gender1);
			System.out.println(city1);
			System.out.println("-------------------------------------------------------");
		}
		
		// Close resources
        rs.close();
        ps.close();
        con.close();
	}
}
