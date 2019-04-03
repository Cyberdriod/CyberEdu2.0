package cyberdroid.jobportal.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import cyberdroid.jobportal.beans.Profile;
import cyberdroid.jobportal.beans.Login;
import cyberdroid.jobportal.dao.LoginDAO;
import cyberdroid.jobportal.util.HibernateUtil;

@Service
public class LoginImpl implements LoginDAO {

	public List<Login> validateUser(String username, String password) {
		List<Login> list = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println(username + " " + password);
		String hql = " FROM Login " + " WHERE email = ?  AND password = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, username);
		query.setParameter(1, password);

		list = query.list();
		System.out.println("Show the login value =" + list);
		transaction.commit();
		session.close();
		return list;
	}

	/*
	 * public Integer updatePassword(Integer userId, String newPassword) {
	 * SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session
	 * session = sessionFactory.openSession(); Transaction transaction =
	 * session.beginTransaction(); String hql = " UPDATE Login " +
	 * " SET usr_password = ? WHERE id = ?"; Query query = session.createQuery(hql);
	 * query.setParameter(0, newPassword); query.setParameter(1, userId); int row =
	 * query.executeUpdate(); transaction.commit(); session.close(); return row; }
	 * 
	 * public List<Login> getDetailsById(Integer userId) { List<Login> list = null;
	 * SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session
	 * session = sessionFactory.openSession(); Transaction transaction =
	 * session.beginTransaction(); String hql = " FROM Login WHERE id =:userId ";
	 * Query query = session.createQuery(hql); query.setParameter("userId", userId);
	 * list = query.list(); transaction.commit(); session.close(); return list; }
	 */
}
