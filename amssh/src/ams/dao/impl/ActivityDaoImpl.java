package ams.dao.impl;


import java.sql.Connection;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ams.po.activity;
import ams.po.approve;
import ams.util.DbUtil;


public class ActivityDaoImpl extends HibernateDaoSupport  {
	private DbUtil db;
	

	
	public void setDb(DbUtil db) {
		this.db = db;
	}


	public int add(String tile,String outlay,String description, String sdate,String edate,String create_date,Integer status,Integer eid) {
		// TODO Auto-generated method stub
		try{
			Connection con = db.getConnetction();			
			Statement st = con.createStatement();
			
			status=0;
			
			Date date=new Date();
			create_date = DateFormat.getDateInstance().format(date);  
			 
			String sql = "insert into tbl_activity(tile,outlay,description,sdate,edate,create_date,status,eid)"
                         + "values('"+tile+"','"+outlay+"','"+ description+"','"+sdate+"','"+edate+"','"+create_date+"','"+status+"','"+eid+"')";
			return st.executeUpdate(sql);
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
	}

	
	public int delete(int id) {
		// TODO Auto-generated method stub
		try{
			Connection con = db.getConnetction();			
			Statement st = con.createStatement();
			String sql="delete from tbl_activity where id='"+ id +"'";
			return st.executeUpdate(sql);
		}catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
	}


	public int update(Integer id,String tile,String outlay, String sdate,String edate) {
		// TODO Auto-generated method stub
		try{
			Connection con = db.getConnetction();			
			Statement st = con.createStatement();
			String sql="update tbl_activity set"+ " tile=" + "'" + tile + "'"+","+ "outlay=" + "'" + outlay + "'"
			+","+ "sdate=" + "'" + sdate + "'"+","+ "edate=" + "'" + edate + "'"+ " where id='" + id + "'";
			return st.executeUpdate(sql);
		}catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
	}

	
	public List showAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public activity find(Integer id){
		return (activity)getHibernateTemplate().get(activity.class, id);
		
	}
	
	
		
	

}
