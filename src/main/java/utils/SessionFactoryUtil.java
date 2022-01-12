package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil{

    private static final SessionFactory sessionFactory;
    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();

    }

    public static SessionFactory getSession(){
        return sessionFactory;
    }
}
