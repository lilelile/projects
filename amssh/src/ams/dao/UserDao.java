package ams.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ams.po.emp;
import ams.util.HibernateSessionFactory;

public class UserDao extends HibernateDaoSupport{
	public List selectByUserName(String name)
	{
//		Configuration cfg= new Configuration().configure();
//		SessionFactory sf = cfg.buildSessionFactory();
		List list = null;

		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();//开启事物
		try{
		    Query query = session.createQuery("from emp where uname='"+name+"'");
		    list = query.list();
		    tx.commit();
		}catch(Exception e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
		}
		return list;
	}
	public List selectActivityByUserId(Integer id){
		Transaction tx=getHibernateTemplate().getSessionFactory().openSession().beginTransaction();
		return getHibernateTemplate().find("from activity where employee.id = "+id);
		
	}

}
