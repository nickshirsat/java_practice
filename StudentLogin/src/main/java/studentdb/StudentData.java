package studentdb;

import java.sql.*;
//import java.util.Scanner;

public class StudentData {
	

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		Connection con = null;
		
		try {
            Class.forName("com.mysql.jdbc.Driver");  
			con = DriverManager.getConnection("jdbc:mysql://localhost/profound", "root", "");
			System.out.println("connection established");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static int save(Student s) {
		int status=0;
		try {
			Connection con = getConnection();
			String sql = "Insert into students(id,name, email, phone, city, password) values (?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			ps.setString(3, s.getEmail());
			ps.setLong(4, s.getPhone());
			ps.setString(5, s.getCity());
			ps.setString(6, s.getPassword());
			
			status = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
