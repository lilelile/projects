package ams.dao;

import java.util.List;

import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ApproveDao extends HibernateDaoSupport{
	public List selectApproveByAid(Integer id){
		Transaction tx=getHibernateTemplate().getSessionFactory().openSession().beginTransaction();
		return getHibernateTemplate().find("from approve where activity.id = "+id);
		
	}

}
