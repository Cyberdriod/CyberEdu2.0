package cyberdroid.jobportal.daoimpl;

import java.sql.PreparedStatement;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import cyberdroid.jobportal.beans.Admpostedjob;
import cyberdroid.jobportal.beans.admlistedjob;
import cyberdroid.jobportal.dao.SaveUpDAO;
import cyberdroid.jobportal.util.HibernateUtil;


@Repository
public class SaveUpImpl implements SaveUpDAO {

	@Override
	public void save(admlistedjob al) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(al);
		transaction.commit();
		session.close();
		
	}

	@Override
	public void save(Admpostedjob ap) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(ap);
		transaction.commit();
		session.close();
		
		
		
		
	}
	
	@Override
	public void jobid(String id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		admlistedjob al=new admlistedjob();
		System.out.println("this is the id ="+id);
		String hqlQuery ="insert into admlistedjob (id,jtitle,cname,skill,experience,vaccancies) select id,jtitle,cname,skill,experience,vaccancies from Listedjob WHERE id=:al ";
		
//		insert into cyberedudb.admlistedjob(id,jtitle,cname,skill,experience,vaccancies) select id,jtitle,cname,skill,experience,vaccancies from cyberedudb.listedjob WHERE id=:al
			Query query=session.createQuery(hqlQuery);
	
		query.setParameter("al",id);
		
		
		query.executeUpdate(); 
		transaction.commit();
		session.close();
		
		
		
		
	}

}
