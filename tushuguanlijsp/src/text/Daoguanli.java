package text;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

public class Daoguanli extends DbCon {
	Connection conn=getConnetction();
	public ResultSet selelctText(HttpServletRequest request){
		try {
			Connection con=getConnetction();
			Statement st=con.createStatement();
			String sql = "select * from guanliyuan";
			
			return st.executeQuery(sql);
		} catch (Exception e) {
			System.out.println("数据查询失败，请关注：");
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public boolean selectlogin(String name,String pwd) throws SQLException{
		String sql = "select * from denglu where name='" + name
			      + "' and pwd = '" + pwd + "'";
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.next() ){
			return true;
			
		}else{
			return false;
		}
	
	
	
}
public void insert_Select( String Aid, String Aname,String Atel, String password)throws Exception,IOException {
	if (getConnetction() != null) {
		System.out.println("插入数据表示，数据库连接成功。");
		try {
			Statement st = conn.createStatement();// 写在sql insert的前面
			String sql = "insert into guanliyuan values ( ";
			sql = sql + "'" + Aid + "',";
			sql = sql + "'" + Aname + "',";
			sql = sql + "'" + Atel + "',";
			sql = sql + "'" + password + "'）";
			
			
			System.out.println("执行SQL Insert语句成功");
			st.executeUpdate(sql);
			System.out.println("插入数据成功");
			st.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage() + "执行插入语句的时候。");
		}
	}

  }
public void update(String Aid, String Aname,String Atel, String password)throws Exception,IOException {
	if (getConnetction() != null){
		try {
			Statement st = conn.createStatement();
			String sql = "update guanliyuan set ";
			
			
			sql = sql + "'" + Aid + "',";
			sql = sql + "'" + Aname + "',";
			sql = sql + "'" + Atel + "',";
			sql = sql + "'" + password + "',";
			
	
			System.out.println("执行修改语句成功");
			st.executeUpdate(sql);
			System.out.println("修改成功");
			st.close();
			conn.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
	}
  }
}
}
