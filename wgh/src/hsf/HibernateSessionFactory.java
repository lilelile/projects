package hsf;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateSessionFactory{
	private static SessionFactory sessionFactory;
	public void HibernateSesssionFactory(){
	}
	public static SessionFactory config(){
		try{
			Configuration configuration=new Configuration();
			Configuration configure=configuration.configure("hibernate.cfg.xml");
			return configure.buildSessionFactory();
		}catch(Exception e){
			e.getMessage();
			return null;
		}
	}
	public static Session getSession(){
		sessionFactory=config();
		return sessionFactory.openSession();
	}
	public static void message(String mess){
		int type=JOptionPane.YES_NO_OPTION;
		String title="提示信息";
		JOptionPane.showMessageDialog(null,mess,title,type);
	}
}