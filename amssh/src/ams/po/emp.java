package ams.po;

import java.util.Set;

public class emp {
	private Integer id;
	private String uname;
	private String name;
	private String pwd;
	private Double salary;
	private Integer type;
	private String typeName;
	private Set<activity> activities;
	private Set<approve> approves;
	public Set<activity> getActivities() {
		return activities;
	}
	public void setActivities(Set<activity> activities) {
		this.activities = activities;
	}
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
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getTypeName() {
		if(type==0){
			typeName="普通员工 ";
		}else if(type==1){
			typeName= "财务出纳";
		}else if(type==2){
			typeName= "财务经理";
		}else
		{
			typeName= "null";
		}
		return typeName;
	}
	
	

}
