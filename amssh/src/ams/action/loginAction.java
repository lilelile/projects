package ams.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import ams.po.emp;
import ams.util.commons;

import com.opensymphony.xwork2.ActionSupport;

import ams.dao.UserDao;

public class loginAction extends ActionSupport {

	private String uname;
	private String pwd;
	private UserDao dao;
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}


	

	public String getUname() {
		return uname;
	}




	public void setUname(String uname) {
		this.uname = uname;
	}




	public String getPwd() {
		return pwd;
	}




	public void setPwd(String pwd) {
		this.pwd = pwd;
	}




	public UserDao getDao() {
		return dao;
	}




	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
//		UserDao dao = new UserDao();
		List rs = dao.selectByUserName(uname);
		if(rs!=null)
		{
			    emp user =(emp)rs.get(0);
				String pwd = user.getPwd();
				if(pwd.equals(pwd))
				{
					HttpSession session = ServletActionContext.getRequest().getSession();
					session.setAttribute("uid",user.getId());
					session.setAttribute("uname", uname);
					session.setAttribute("type",new commons().converseType(user.getType()));
					return SUCCESS;
				}
				else{
					addFieldError("pwd","密码不正确");
					return INPUT;
				}
			
		}
		else{
			addActionError("数据库连接不成功");
			return INPUT;
		}
	}
	
	
}
