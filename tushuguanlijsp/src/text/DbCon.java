package text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbCon {
	
		private String driverName = "com.mysql.jdbc.Driver" ;
		private  String name= "root";   //��¼���û���
		private  String pwd="root";   //��¼mysql����
		private  String dbName = "tushu";  //���ݿ���
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

	 public Connection getConnetction()// ��ȡ���������ӣ�
		{
			try {
				Class.forName(getdriverName ());
				conn = DriverManager.getConnection(geturl(), getname(),
						getPwd());
				if (conn != null)
					System.out.println("sucess���ݿ����ӳɹ�");
				else
					System.out.println("failed���ݿ�����ʧ��");
				return conn;
			} catch (Exception e) {
				e.getMessage();
				return null;
			}
		}
}

