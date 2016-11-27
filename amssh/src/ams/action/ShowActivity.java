package ams.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import ams.dao.UserDao;


import ams.po.emp;

import com.opensymphony.xwork2.ActionSupport;


public class ShowActivity extends ActionSupport{
	private UserDao dao;
	
	public void setDao(UserDao dao) {
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
