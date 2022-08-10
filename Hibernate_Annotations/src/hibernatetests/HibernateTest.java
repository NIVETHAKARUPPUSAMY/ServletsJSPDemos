package hibernatetests;

import org.hibernate.Session;

import com.samples.domain.Message;
import com.samples.utils.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Message message6 = new Message("Message 6"); 
		Message message7 = new Message("Message 7");
		Message message8 = new Message("Message 8");
		Message message9 = new Message("Message 9");
		Message message10 = new Message("Message 10");
		
		session.save(message6);
		session.save(message7);
		session.save(message8);
		session.save(message9);
		session.save(message10);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
}