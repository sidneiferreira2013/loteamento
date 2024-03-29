/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loteurbano.bean;

import br.com.loteurbano.dao.PessoaDao;
import br.com.loteurbano.entity.Pessoa;
import br.com.loteurbano.util.HibernateUtil;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Session;

/**
 *
 * @author Sidnei
 */
@ManagedBean
@SessionScoped
public class PessoaBean implements java.io.Serializable {

    Pessoa pessoa;
    PessoaDao pessoaDao = new PessoaDao();
    private Session session;

    public PessoaBean() {
        pessoa = new Pessoa();
    }

    public String startAdd() {
        pessoa = new Pessoa();
        return "cadastramento.xhtml";
    }

    public String cadastar() throws Exception {

        session = HibernateUtil.getSessionFactory().openSession();

        String hql_1 = "from Pessoa c where c.cpf = :cpf";
        String hql_2 = "from Pessoa c where c.cpf_conjuge = :cpf_conjuge";

        List result = session.createQuery(hql_1).setParameter("cpf", pessoa.getCpf()).list();
        List result2 = session.createQuery(hql_2).setParameter("cpf_conjuge", pessoa.getCpf()).list();

        if ((result.size() > 0 || result2.size() > 0)) {
            session.close();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "CPF já cadastrado", ""));
            return "index.xhtml";
        } else {
            pessoaDao.salvar(pessoa);
            session.close();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Seu cadastro foi realizado com sucesso!", ""));
            return "index.xhtml";

        }
    }

    public void validarCptcha() {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void encontraCEP() {
        CepWebService cepWebService = new CepWebService(pessoa.getCep());

        if (cepWebService.getResultado() == 1) {

            pessoa.setLogradouro(cepWebService.getLogradouro());
            pessoa.setEstado(cepWebService.getEstado());
            pessoa.setCidade(cepWebService.getCidade());
            pessoa.setBairro(cepWebService.getBairro());
        } else {

            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "Cep não encontraro ou erro no servidor",
                            "Digite os dados manualmente"));
        }
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public PessoaDao getPessoaDao() {
        return pessoaDao;
    }

    public void setPessoaDao(PessoaDao pessoaDao) {
        this.pessoaDao = pessoaDao;
    }

}
