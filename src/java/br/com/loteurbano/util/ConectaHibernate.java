package br.com.loteurbano.util;

import br.com.loteurbano.entity.Pessoa;
import br.com.loteurbano.dao.PessoaDao;
import org.hibernate.Session;
import br.com.loteurbano.dao.PessoaDao;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

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
