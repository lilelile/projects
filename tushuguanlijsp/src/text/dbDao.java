package text;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

public class dbDao extends DbCon {
			Connection conn=getConnetction();
			public ResultSet selelctText(HttpServletRequest request){
				try {
					Connection con=getConnetction();
					Statement st=con.createStatement();
					String sql = "select * from sinformation";
					
					return st.executeQuery(sql);
				} catch (Exception e) {
					System.out.println("数据查询失败，请关注：");
					System.out.println(e.getMessage());
				}
				return null;
			}
			
			public boolean select(String name,String pwd) throws SQLException{
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
		
}