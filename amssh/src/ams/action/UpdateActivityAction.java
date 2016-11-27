package ams.action;



import ams.dao.impl.ActivityDaoImpl;

import com.opensymphony.xwork2.ActionSupport;



public class UpdateActivityAction extends ActionSupport{
	public ActivityDaoImpl dao;
	public void setDao( ActivityDaoImpl dao) {
		this.dao = dao;
	}

	private Integer id;
	private String tile;
	private String outlay;
	private String sdate;
	private String edate;

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		int i=0;
		i=dao.update(id,tile,outlay,sdate,edate);
		if(i!=0)
			return SUCCESS;
		else
			return INPUT;
	}

}
