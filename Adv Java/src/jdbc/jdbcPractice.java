package jdbc;
import java.sql.*;

class JdbcConnection {
	Connection con;
	PreparedStatement ps;
	public void establishConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/profound", "root", "");
			System.out.println("Connection Established...");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

public class jdbcPractice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcConnection jd = new JdbcConnection();
		jd.establishConnection();
	}

}
