package sudha5;

import java.sql.*;

public class ContactDao {
	private String dbUrl = "jdbc:mysql://localhost:3306/contactdb";
	private String dbUname = "root";
	private String dbPass = "Sudha@1234";
	private String dbDriver = "com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	public String insert(ContactMember member) {
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data Entered to Database Succefully";
		String sql = "insert into contactdb.contacts values(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, member.getCname());
			ps.setString(2, member.getCmob());
			ps.setString(3, member.getCmail());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered to database";
		}
		
		return result;
	}
}
