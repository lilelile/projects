package ams.action;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;



















import ams.dao.impl.ActivityDaoImpl;

import com.opensymphony.xwork2.ActionSupport;



public class AddActivityAction extends ActionSupport{
	public ActivityDaoImpl dao;
	public void setDao( ActivityDaoImpl dao) {
		this.dao = dao;
	}

	private String tile;
	private String outlay;
	private String description;
	private String sdate;
	private String edate;
	private String create_date;
	private Integer status;
	private Integer eid;
	
	
	public String getTile() {
		return tile;
	}

	public void setTile(String tile) {
		this.tile = tile;
	}

	public String getOutlay() {
		return outlay;
	}

	public void setOutlay(String outlay) {
		this.outlay = outlay;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate){
		
	   this.sdate=sdate;
		
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate=edate;
		
	}

	public String getCreate_date() {
		
		return create_date;
	}

	public void setCreate_date(String create_date) {
		
		
		this.create_date = create_date;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = this.status;
	}


	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	@Override
	public String execute() throws Exception {
		int i=0;
		HttpSession session=ServletActionContext.getRequest().getSession();	
		eid=(Integer) session.getAttribute("uid");
		i=dao.add(tile,outlay,description,sdate,edate,create_date,status,eid);
		if(i!=0)
			return SUCCESS;
		else
			return INPUT;
	}

}
