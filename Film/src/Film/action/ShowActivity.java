package Film.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;



import Film.dao.huiyuanDao;

import com.opensymphony.xwork2.ActionSupport;

public class ShowActivity extends ActionSupport{
private huiyuanDao dao;
	
	public void setDao(huiyuanDao dao) {
		this.dao = dao;
	}
	private Integer uid;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String execute() throws Exception{
		List list=dao.selectActivityByUserId(uid);
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("activitylist",list);
		System.out.println(list);
		return SUCCESS;
		
		
	}

}
