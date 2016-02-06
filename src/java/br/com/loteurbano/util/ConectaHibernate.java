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

        Pessoa pessoa = new Pessoa();
        PessoaDao pessoaDao = new PessoaDao();

        Pessoa pessoaIgual = pessoaDao.comDadosIguais(pessoa);

        System.out.println(pessoaIgual);

        if (pessoaIgual != null && !pessoaIgual.equals(pessoa)) {

            System.out.println(pessoaIgual);

        } else {

            System.out.println(pessoaIgual);
        }
    }

}
