package persistence;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	private static final SessionFactory sessionFactory;
	static {
		try {
			sessionFactory=new Configuration().configure().buildSessionFactory();
		}catch(Throwable ex) {
			System.err.println("Initial Session Factory fails");
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
