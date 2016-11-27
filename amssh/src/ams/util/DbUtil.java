package ams.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	private String driverName;
	private String url="jdbc:mysql://localhost:3306/ams";
	private String userName="root";
	private String pwd = "root";
	private Connection conn=null;
	
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public Connection getConnetction()
	{
		try{
			Class.forName(driverName);
			conn = DriverManager.getConnection(url,userName,pwd);
			return conn;
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public ResultSet selectAll() throws SQLException
	{
		String sql="select * from tbl_emp";
		Statement st = getConnetction().createStatement();
		return st.executeQuery(sql);
	}

}
