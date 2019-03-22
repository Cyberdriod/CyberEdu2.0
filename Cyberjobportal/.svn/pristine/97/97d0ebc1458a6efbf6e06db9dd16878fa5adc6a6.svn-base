package cyberdroid.jobportal.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import cyberdroid.jobportal.beans.Login;
import cyberdroid.jobportal.beans.Profile;
import cyberdroid.jobportal.beans.Studeducational;
import cyberdroid.jobportal.beans.Studexperience;
import cyberdroid.jobportal.dao.SignUpDAO;
import cyberdroid.jobportal.util.HibernateUtil;

@Repository
public class SignUpImpl implements SignUpDAO {

	@Override
	public void save(Profile profile) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(profile);
		transaction.commit();
		session.close();
	}
		@Override
		public void edudelete(int eduid)
		{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Studeducational edui=new Studeducational();
		
		String hqlQuery="delete from Education where eduid :=eduid";
		Query query=session.createQuery(hqlQuery);
		query.setParameter("eduid",eduid);
		
		session.save(eduid);
		transaction.commit();
		session.close();
		}
		@Override
		public void saveexperience(Studexperience exp)
		{
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(exp);
			transaction.commit();
			session.close();	
		}
		
	

}
