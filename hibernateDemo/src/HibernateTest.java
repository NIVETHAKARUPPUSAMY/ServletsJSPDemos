import org.hibernate.Session;

import com.samples.domain.Product;
import com.samples.utils.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Product product = new Product("Mouse"); 
		
		session.save(product);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
}