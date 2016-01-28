
package br.com.loteurbano.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory(){
    
    
        try {
           Configuration cfg = new Configuration();
           cfg.configure("hibernate.cfg.xml");
           return cfg.buildSessionFactory();
        } catch (Throwable ex) {
           
            System.out.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
