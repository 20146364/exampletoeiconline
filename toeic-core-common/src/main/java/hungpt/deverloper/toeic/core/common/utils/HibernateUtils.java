package hungpt.deverloper.toeic.core.common.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            //return sessionfactory form hibernate.cfg.xml
            SessionFactory factory = new Configuration().configure().buildSessionFactory();
            return factory;
        } catch (Throwable e) {
            System.out.println("Initial session factory fail");
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    // hibernate.xml đâu anh
    //
}
