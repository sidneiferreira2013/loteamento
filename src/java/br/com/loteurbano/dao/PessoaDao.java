/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loteurbano.dao;

import br.com.loteurbano.entity.Pessoa;
import br.com.loteurbano.util.HibernateUtil;
import javax.persistence.PersistenceException;
import org.hibernate.Session;

/**
 *
 * @author Sidnei
 */
public class PessoaDao {

    private Session session;

    public void salvar(Pessoa ps) throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();
            session.save(ps);
            session.getTransaction().commit();

        } catch (PersistenceException e) {
            Throwable t = e;
            boolean cont = true;
            while (t != null) {
                if (t.getMessage().startsWith("Duplicate entry")) {
                    cont = false;
                    throw new Exception("Duplicate entry");
                }
                t = t.getCause();
            }
            if (cont) {
                throw new Exception(e.getMessage());
            }
        } finally {
            session.close();

        }
    }

    public void update(Pessoa ps) {
        session = HibernateUtil.getSessionFactory().openSession();

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.saveOrUpdate(ps);
            session.getTransaction().commit();
        } finally {
            session.close();

        }
    }

   

    public void excluir(Pessoa ps) {
        session = HibernateUtil.getSessionFactory().openSession();

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(ps);
            session.getTransaction().commit();

        } finally {
            session.close();

        }
    }

}
