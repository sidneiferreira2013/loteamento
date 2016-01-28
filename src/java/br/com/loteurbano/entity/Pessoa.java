/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loteurbano.entity;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.validator.constraints.br.CPF;

/**
 *
 * @author Sidnei
 */
@Entity
public class Pessoa implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    private String sexo;
    private String data_nascimento;
    private String rg;
    
    @CPF
    @Column(name = "cpf", unique = true)
    private String cpf;
    private String titulo_eleitor;
    private Integer zona_eleitoral;

    private String nome_conjugue;
    private String sexo_conjugue;
    private String data_nascimento_conjugue;
    private String rg_conjugue;
    
    @Column(unique = true)
    private String cpf_conjugue;
    private String titulo_eleitor_conjugue;
    private Integer zona_eleitoral_conjugue;

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    //situação de maradia atual
    private String sit_moradia;
    private String estado_civil;

    //tempo de moradia no municipio
    private Integer tempo_moradia;

    //pessoa deficiente na familia
    private String pessoa_deficiente;
    private Integer rendaFamiliar;
    
    private String tempo_construção;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitulo_eleitor() {
        return titulo_eleitor;
    }

    public void setTitulo_eleitor(String titulo_eleitor) {
        this.titulo_eleitor = titulo_eleitor;
    }

    public Integer getZona_eleitoral() {
        return zona_eleitoral;
    }

    public void setZona_eleitoral(Integer zona_eleitoral) {
        this.zona_eleitoral = zona_eleitoral;
    }

    public String getNome_conjugue() {
        return nome_conjugue;
    }

    public void setNome_conjugue(String nome_conjugue) {
        this.nome_conjugue = nome_conjugue;
    }

    public String getSexo_conjugue() {
        return sexo_conjugue;
    }

    public void setSexo_conjugue(String sexo_conjugue) {
        this.sexo_conjugue = sexo_conjugue;
    }

    public String getData_nascimento_conjugue() {
        return data_nascimento_conjugue;
    }

    public void setData_nascimento_conjugue(String data_nascimento_conjugue) {
        this.data_nascimento_conjugue = data_nascimento_conjugue;
    }

    public String getRg_conjugue() {
        return rg_conjugue;
    }

    public void setRg_conjugue(String rg_conjugue) {
        this.rg_conjugue = rg_conjugue;
    }

    public String getCpf_conjugue() {
        return cpf_conjugue;
    }

    public void setCpf_conjugue(String cpf_conjugue) {
        this.cpf_conjugue = cpf_conjugue;
    }

    public String getTitulo_eleitor_conjugue() {
        return titulo_eleitor_conjugue;
    }

    public void setTitulo_eleitor_conjugue(String titulo_eleitor_conjugue) {
        this.titulo_eleitor_conjugue = titulo_eleitor_conjugue;
    }

    public Integer getZona_eleitoral_conjugue() {
        return zona_eleitoral_conjugue;
    }

    public void setZona_eleitoral_conjugue(Integer zona_eleitoral_conjugue) {
        this.zona_eleitoral_conjugue = zona_eleitoral_conjugue;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSit_moradia() {
        return sit_moradia;
    }

    public void setSit_moradia(String sit_moradia) {
        this.sit_moradia = sit_moradia;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public Integer getTempo_moradia() {
        return tempo_moradia;
    }

    public void setTempo_moradia(Integer tempo_moradia) {
        this.tempo_moradia = tempo_moradia;
    }

    public String getPessoa_deficiente() {
        return pessoa_deficiente;
    }

    public void setPessoa_deficiente(String pessoa_deficiente) {
        this.pessoa_deficiente = pessoa_deficiente;
    }

    public Integer getRendaFamiliar() {
        return rendaFamiliar;
    }

    public void setRendaFamiliar(Integer rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }

    public String getTempo_construção() {
        return tempo_construção;
    }

    public void setTempo_construção(String tempo_construção) {
        this.tempo_construção = tempo_construção;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 59 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    
    
    
}
