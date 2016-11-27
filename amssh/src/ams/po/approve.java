package ams.po;

import java.util.Date;

public class approve {
	private Integer id;
	private Integer passed;
	private String reason;
	private Date app_date;
	private emp employee;
	private activity activity;
	private String passedName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPassed() {
		return passed;
	}
	public void setPassed(Integer passed) {
		this.passed = passed;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getApp_date() {
		return app_date;
	}
	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}
	public emp getEmployee() {
		return employee;
	}
	public void setEmployee(emp employee) {
		this.employee = employee;
	}
	public activity getActivity() {
		return activity;
	}
	public void setActivity(activity activity) {
		this.activity = activity;
	}
	public String getPassedName() {
		if(passed==0){
		    passedName= "未通过";
		}else if(passed==1){
			passedName="通过";
		}
		return passedName;
	}
	

}
