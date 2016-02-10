/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loteurbano.entity;

import java.math.BigDecimal;
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
    private String dt_nasc;
    private String rg;

    @CPF
    private String cpf;
    private Double t_eleitor;
    private Integer z_eleitoral;

    private String n_conjuge;
    private String sexo_conjuge;
    private String dtNasc_conjugue;
    private String rg_conjuge;

    private String cpf_conjuge;
    private Double t_eleitor_conjuge;
    private Integer z_eleitoral_conjuge;

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
    private Integer tempoMoradia;

    //pessoa deficiente na familia
    private String pessoa_deficiente;
    private BigDecimal rendaFamiliar;

    private String tempo_construção;

    private String aceitotermo;

    private String telefoneFixo;
    private String telefoneCelular;
    private String telefoneRecado;
    private String telefoneRecadoCelular;

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

    public String getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(String dt_nasc) {
        this.dt_nasc = dt_nasc;
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

    public Double getT_eleitor() {
        return t_eleitor;
    }

    public void setT_eleitor(Double t_eleitor) {
        this.t_eleitor = t_eleitor;
    }

    public Integer getZ_eleitoral() {
        return z_eleitoral;
    }

    public void setZ_eleitoral(Integer z_eleitoral) {
        this.z_eleitoral = z_eleitoral;
    }

    public String getN_conjuge() {
        return n_conjuge;
    }

    public void setN_conjuge(String n_conjuge) {
        this.n_conjuge = n_conjuge;
    }

    public String getSexo_conjuge() {
        return sexo_conjuge;
    }

    public void setSexo_conjuge(String sexo_conjuge) {
        this.sexo_conjuge = sexo_conjuge;
    }

    public String getDtNasc_conjugue() {
        return dtNasc_conjugue;
    }

    public void setDtNasc_conjugue(String dtNasc_conjugue) {
        this.dtNasc_conjugue = dtNasc_conjugue;
    }

    public String getRg_conjuge() {
        return rg_conjuge;
    }

    public void setRg_conjuge(String rg_conjuge) {
        this.rg_conjuge = rg_conjuge;
    }

    public String getCpf_conjuge() {
        return cpf_conjuge;
    }

    public void setCpf_conjuge(String cpf_conjuge) {
        this.cpf_conjuge = cpf_conjuge;
    }

    public Double getT_eleitor_conjuge() {
        return t_eleitor_conjuge;
    }

    public void setT_eleitor_conjuge(Double t_eleitor_conjuge) {
        this.t_eleitor_conjuge = t_eleitor_conjuge;
    }

    public Integer getZ_eleitoral_conjuge() {
        return z_eleitoral_conjuge;
    }

    public void setZ_eleitoral_conjuge(Integer z_eleitoral_conjuge) {
        this.z_eleitoral_conjuge = z_eleitoral_conjuge;
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

    public Integer getTempoMoradia() {
        return tempoMoradia;
    }

    public void setTempoMoradia(Integer tempoMoradia) {
        this.tempoMoradia = tempoMoradia;
    }

    public String getPessoa_deficiente() {
        return pessoa_deficiente;
    }

    public void setPessoa_deficiente(String pessoa_deficiente) {
        this.pessoa_deficiente = pessoa_deficiente;
    }

    public BigDecimal getRendaFamiliar() {
        return rendaFamiliar;
    }

    public void setRendaFamiliar(BigDecimal rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }

    public String getTempo_construção() {
        return tempo_construção;
    }

    public void setTempo_construção(String tempo_construção) {
        this.tempo_construção = tempo_construção;
    }

    public String getAceitotermo() {
        return aceitotermo;
    }

    public void setAceitotermo(String aceitotermo) {
        this.aceitotermo = aceitotermo;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneRecado() {
        return telefoneRecado;
    }

    public void setTelefoneRecado(String telefoneRecado) {
        this.telefoneRecado = telefoneRecado;
    }

    public String getTelefoneRecadoCelular() {
        return telefoneRecadoCelular;
    }

    public void setTelefoneRecadoCelular(String telefoneRecadoCelular) {
        this.telefoneRecadoCelular = telefoneRecadoCelular;
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
