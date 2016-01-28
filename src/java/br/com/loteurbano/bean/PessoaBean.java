/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loteurbano.bean;

import br.com.loteurbano.dao.PessoaDao;
import br.com.loteurbano.entity.Pessoa;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;



/**
 *
 * @author Sidnei
 */
@ManagedBean
@SessionScoped
public class PessoaBean implements java.io.Serializable{
    
    Pessoa pessoa;
    PessoaDao pessoaDao = new PessoaDao();
    
    
    public PessoaBean(){
        
        pessoa = new Pessoa();
    }
    
    
    public String startAdd(){
        pessoa = new Pessoa();
        return "cadastramento.xhtml";
    }
    
  public String cadastar() {
        try {
            pessoaDao.salvar(pessoa);
            FacesMessage faces = new FacesMessage("Cadastro efetuado com Successo!");
            FacesContext contexto = FacesContext.getCurrentInstance();
            contexto.addMessage(null, faces);
            return "index.xhtml";

        } catch (Exception e) {
            if (e.getMessage().trim().startsWith("Duplicate entry")) {
                FacesMessage faces = new FacesMessage("Cpf está repetido!");
            }
        }
        return "index.xhtml";
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
