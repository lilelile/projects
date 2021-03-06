package dao;

import hsf.HibernateSessionFactory;

import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import PO.kdyPO;

public class kdyDao {
	private Transaction transaction;
	private Session session;
	private Query query;
	public kdyDao(){
	}
	public boolean saveinfo(kdyPO info){
		try{
			session=HibernateSessionFactory.getSession();
			transaction=session.beginTransaction();
			session.save(info);
			transaction.commit();
			session.close();
			return true;
		}catch (Exception e){
			message("saveInfo.error:"+e);
			e.printStackTrace();
			return false;
		}
	}
	public List findInfo(String type,Object value){
		session=HibernateSessionFactory.getSession();
		try{
			transaction=session.beginTransaction();
			String queryString="from kdyPO as model where model."+type+"=?";
			query=session.createQuery(queryString);
			query.setParameter(0,value);
			List list=query.list();
			transaction.commit();
			session.close();
			return list;
		}catch(Exception  e){
			message("findInfo.error:"+e);
			e.printStackTrace();
			return null;
		}
	}
	public List findAllInfo(){
		session=HibernateSessionFactory.getSession();
		try{
			transaction=session.beginTransaction();
			String queryString="from kdyPO";
			query=session.createQuery(queryString);
			List list=(List) query.list();
			transaction.commit();
			session.close();
			return list;
		}catch(Exception e){
			message("findInfo.error:"+e);
			e.printStackTrace();
			return null;
		}
	}
	public boolean deleteInfo(String id){
		try{
			session=HibernateSessionFactory.getSession();
			transaction=session.beginTransaction();
			kdyPO info=new kdyPO();
			info=(kdyPO)session.get(kdyPO.class, id);
			session.delete(info);
			transaction.commit();
			session.close();
			return true;
		}catch(Exception e){
			message("deleteInfo.error:"+e);
			e.printStackTrace();
			return false;
	}
	}
	public boolean updateInfo(kdyPO info){
		try{
			session=HibernateSessionFactory.getSession();
			transaction=session.beginTransaction();
			session.update(info);
			transaction.commit();
			session.close();
			return true;
		}catch(Exception e){
			message("updateInfo.error:"+e);
			e.printStackTrace();
			return false;	
       }
	}
	public void message(String mess){
		int type=JOptionPane.YES_NO_OPTION;
		String title="��ʾ��Ϣ";
		JOptionPane.showMessageDialog(null,mess,title,type);
	}
}
