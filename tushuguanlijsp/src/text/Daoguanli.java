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
			System.out.println("���ݲ�ѯʧ�ܣ����ע��");
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
		System.out.println("�������ݱ�ʾ�����ݿ����ӳɹ���");
		try {
			Statement st = conn.createStatement();// д��sql insert��ǰ��
			String sql = "insert into guanliyuan values ( ";
			sql = sql + "'" + Aid + "',";
			sql = sql + "'" + Aname + "',";
			sql = sql + "'" + Atel + "',";
			sql = sql + "'" + password + "'��";
			
			
			System.out.println("ִ��SQL Insert���ɹ�");
			st.executeUpdate(sql);
			System.out.println("�������ݳɹ�");
			st.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage() + "ִ�в�������ʱ��");
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
			
	
			System.out.println("ִ���޸����ɹ�");
			st.executeUpdate(sql);
			System.out.println("�޸ĳɹ�");
			st.close();
			conn.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
	}
  }
}
}
