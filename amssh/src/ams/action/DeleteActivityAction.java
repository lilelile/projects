package ams.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import ams.dao.impl.ActivityDaoImpl;

import com.opensymphony.xwork2.ActionSupport;



public class DeleteActivityAction  extends ActionSupport{
	public ActivityDaoImpl dao;
	public void setDao( ActivityDaoImpl dao) {
		this.dao = dao;
	}

	
	private Integer id;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id =id;
	}


	public String execute() throws Exception {	
		int i = 0;
		i= dao.delete(id);
		if(i!=0)
			return SUCCESS;
		else
			return INPUT;
	}
}



