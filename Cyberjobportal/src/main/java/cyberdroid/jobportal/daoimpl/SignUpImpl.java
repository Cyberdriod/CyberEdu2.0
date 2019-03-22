package cyberdroid.jobportal.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import cyberdroid.jobportal.beans.Education;
import cyberdroid.jobportal.beans.Experience;
import cyberdroid.jobportal.beans.Login;
import cyberdroid.jobportal.beans.Profile;
import cyberdroid.jobportal.beans.Project;
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
		Login login=new Login();
		login.setEmail(profile.getEmail());
		login.setPassword(profile.getPassword());
		login.setMobileno(profile.getPrimarymobileno());
		login.setProfile(profile);
		session.save(login);
		transaction.commit();
		session.close();
		
	}
	public void updateUser(Profile profile,int userid) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Object o = session.load(Profile.class,userid);
		Profile p = (Profile)o;
//		p.setUserAddress(profile.getUserAddress());
//		p.setCompName(profile.getCompName());
//		p.setCompWebName(profile.getCompWebName());
		transaction.commit();
		session.close();
	}
	@Override
	public boolean existUser(String userEmail, String mobile) {
		boolean check;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hqlQuery = " FROM Profile "
						+ " WHERE usr_email =:userEmail "
						+ " OR contact_one =:mobile";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("userEmail",userEmail);
		query.setParameter("mobile",mobile);
		check = query.isReadOnly();
		transaction.commit();
		session.close();
		return check;
	}
	@Override
	public List<Profile> getProfileById(Integer userId) {
		List<Profile> list = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hqlQuery="FROM Profile WHERE userid =:userId";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("userId", userId);
		list = query.list();
		transaction.commit();
		session.close();
		return list;
	}
	
	@Override
	public void saveeducation(Education edu) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(edu);
		transaction.commit();
		session.close();
	}
	@Override
	public void edudelete(int eduid) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Education edui=new Education();
		
		String hqlQuery = " delete from Education where eduid =:edu";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("edu",eduid);
		query.executeUpdate();
		transaction.commit();
		session.close();
		
	}
	
	@Override
	public void saveexperience(Experience exp) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(exp);
		transaction.commit();
		session.close();
	}
	@Override
	public void expdelete(int expid) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Education edui=new Education();
		
		String hqlQuery = " delete from Experience where expid =:exp";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("exp",expid);
		query.executeUpdate();
		transaction.commit();
		session.close();
		
	}
	@Override
	public void saveproject(Project pro) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(pro);
		transaction.commit();
		session.close();
		
	}
	
	@Override
	public void prodelete(int prodelete) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Project pro=new Project();
		
		String hqlQuery = " delete from Project where proid =:pro";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("pro",prodelete);
		query.executeUpdate();
		transaction.commit();
		session.close();
		
	}
	

}
