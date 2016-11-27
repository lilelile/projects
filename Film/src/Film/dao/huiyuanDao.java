package Film.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Film.util.HibernateSessionFactory;


public class huiyuanDao extends HibernateDaoSupport{
	public List selectByUserName(String name)
	{
		List list = null;

		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();//开启事物
		try{
		    Query query = session.createQuery("from huiyuan where name='"+name+"'");
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
		return getHibernateTemplate().find("from huiyuan where huiyuan.id = "+id);
		
	}

}
