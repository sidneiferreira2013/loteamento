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
    @Column(name = "cpf", unique = true)
    private String cpf;
    private Integer t_eleitor;
    private Integer z_eleitoral;

    private String n_conjugue;
    private String s_conjugue;
    private String dt_nasc_conjugue;
    private String rg_conjugue;

    private String cpf_conjugue;
    private Integer t_eleitor_conjugue;
    private Integer z_eleitoral_conjugue;

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
    private Integer mesesMoradia;
    private Integer anosMoradia;

    //pessoa deficiente na familia
    private String pessoa_deficiente;
    private BigDecimal rendaFamiliar;

    private String tempo_construção;

    private String aceitotermo;

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

    public Integer getT_eleitor() {
        return t_eleitor;
    }

    public void setT_eleitor(Integer t_eleitor) {
        this.t_eleitor = t_eleitor;
    }

    public Integer getZ_eleitoral() {
        return z_eleitoral;
    }

    public void setZ_eleitoral(Integer z_eleitoral) {
        this.z_eleitoral = z_eleitoral;
    }

    public String getN_conjugue() {
        return n_conjugue;
    }

    public void setN_conjugue(String n_conjugue) {
        this.n_conjugue = n_conjugue;
    }

    public String getS_conjugue() {
        return s_conjugue;
    }

    public void setS_conjugue(String s_conjugue) {
        this.s_conjugue = s_conjugue;
    }

    public String getDt_nasc_conjugue() {
        return dt_nasc_conjugue;
    }

    public void setDt_nasc_conjugue(String dt_nasc_conjugue) {
        this.dt_nasc_conjugue = dt_nasc_conjugue;
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

    public Integer getT_eleitor_conjugue() {
        return t_eleitor_conjugue;
    }

    public void setT_eleitor_conjugue(Integer t_eleitor_conjugue) {
        this.t_eleitor_conjugue = t_eleitor_conjugue;
    }

    public Integer getZ_eleitoral_conjugue() {
        return z_eleitoral_conjugue;
    }

    public void setZ_eleitoral_conjugue(Integer z_eleitoral_conjugue) {
        this.z_eleitoral_conjugue = z_eleitoral_conjugue;
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

    public Integer getMesesMoradia() {
        return mesesMoradia;
    }

    public void setMesesMoradia(Integer mesesMoradia) {
        this.mesesMoradia = mesesMoradia;
    }

    public Integer getAnosMoradia() {
        return anosMoradia;
    }

    public void setAnosMoradia(Integer anosMoradia) {
        this.anosMoradia = anosMoradia;
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
