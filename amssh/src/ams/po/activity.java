package ams.po;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class activity implements Serializable{
	private Integer id;
	private String tile;
	private String outlay;
	private String description;
	private String sdate;
	private String edate;
	private String create_date;
	private Integer status;
	private String statusName;
	private emp employee;
	private Set<approve> approves;
	public Set<approve> getApproves() {
		return approves;
	}
	public void setApproves(Set<approve> approves) {
		this.approves = approves;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate=sdate;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
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
		this.status = status;
	}
	public emp getEmployee() {
		return employee;
	}
	public void setEmployee(emp employee) {
		this.employee = employee;
	}
	public String getStatusName() {
		if(status==0){
		    statusName= "新创建";
		}else if(status==1){
			statusName="财务出纳审核通过";
		}else if(status==2){
			statusName="财务经理审核通过";
		}else if(status==3){
			statusName="未通过";
		}else if(status==4){
			statusName="已取消";
		}else if(status==5){
			statusName="再次提交";
		}
		return statusName;
	}

	
}
