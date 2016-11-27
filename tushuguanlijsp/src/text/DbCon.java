package text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbCon {
	
		private String driverName = "com.mysql.jdbc.Driver" ;
		private  String name= "root";   //登录的用户名
		private  String pwd="root";   //登录mysql密码
		private  String dbName = "tushu";  //数据库名
		private String url = "jdbc:mysql://localhost:3306/"+dbName+"?user="+name+"&password="+pwd;
	    Connection conn = null ;
	
	    public String getdriverName() {
			return driverName;
		}

		public void setdriverName(String driverName) {
			this.driverName = driverName;
		}

		public String geturl() {
			return url;
		}

		public void seturl(String url) {
			this.url = url;
		}

		public String getname(){
			return name;
		}

		public void setname(String name) {
			this.name = name;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

	 public Connection getConnetction()// 获取数据区连接；
		{
			try {
				Class.forName(getdriverName ());
				conn = DriverManager.getConnection(geturl(), getname(),
						getPwd());
				if (conn != null)
					System.out.println("sucess数据库连接成功");
				else
					System.out.println("failed数据库连接失败");
				return conn;
			} catch (Exception e) {
				e.getMessage();
				return null;
			}
		}
}

