
package br.com.loteurbano.util;

import org.hibernate.Session;

/**
 *
 * @author sidnei
 */
public class ConectaHibernate {
    public static void main(String[] args) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            System.out.println("Conectou!!");
        } finally{
            sessao.close();
        }
    }
    
}
