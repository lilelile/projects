package ams.action;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import ams.dao.ApproveDao;
import ams.dao.impl.ActivityDaoImpl;
import ams.po.activity;
import ams.po.approve;

import com.opensymphony.xwork2.ActionSupport;

public class ShowActivityDetailAction extends ActionSupport{
	
	public ActivityDaoImpl dao;
	private ApproveDao adao;
	
	public void setDao( ActivityDaoImpl dao) {
		this.dao = dao;
	}


	public void setAdao(ApproveDao adao) {
		this.adao = adao;
	}


	private Integer id;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		activity a=dao.find(id);
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("activity",a);
		
		List list=adao.selectApproveByAid(id);
		session.setAttribute("approvelist",list);
		
		
		int status=a.getStatus();
		if(status==1||status==2||status==4)
			return "success_readonly";
		else 
			return "success_canModify";
		
	}

}
