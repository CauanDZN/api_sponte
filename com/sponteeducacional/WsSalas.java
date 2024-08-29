
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsSalas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsSalas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Sigla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vagas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TiposSalasID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TiposSalas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ativo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AulaLivre" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PermiteLocacao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValorHoraLocacao" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="LocacaoAmbientesHorarios" type="{http://api.sponteeducacional.net.br/}wsLocacaoAmbientesHorarios" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsSalas", propOrder = {
    "retornoOperacao",
    "salaID",
    "sigla",
    "descricao",
    "vagas",
    "tiposSalasID",
    "tiposSalas",
    "ativo",
    "aulaLivre",
    "permiteLocacao",
    "valorHoraLocacao",
    "locacaoAmbientesHorarios"
})
public class WsSalas {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "SalaID")
    protected int salaID;
    @XmlElement(name = "Sigla")
    protected String sigla;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "Vagas")
    protected int vagas;
    @XmlElement(name = "TiposSalasID")
    protected int tiposSalasID;
    @XmlElement(name = "TiposSalas")
    protected String tiposSalas;
    @XmlElement(name = "Ativo")
    protected int ativo;
    @XmlElement(name = "AulaLivre")
    protected int aulaLivre;
    @XmlElement(name = "PermiteLocacao")
    protected int permiteLocacao;
    @XmlElement(name = "ValorHoraLocacao")
    protected double valorHoraLocacao;
    @XmlElement(name = "LocacaoAmbientesHorarios")
    protected WsLocacaoAmbientesHorarios locacaoAmbientesHorarios;

    /**
     * Obtém o valor da propriedade retornoOperacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetornoOperacao() {
        return retornoOperacao;
    }

    /**
     * Define o valor da propriedade retornoOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetornoOperacao(String value) {
        this.retornoOperacao = value;
    }

    /**
     * Obtém o valor da propriedade salaID.
     * 
     */
    public int getSalaID() {
        return salaID;
    }

    /**
     * Define o valor da propriedade salaID.
     * 
     */
    public void setSalaID(int value) {
        this.salaID = value;
    }

    /**
     * Obtém o valor da propriedade sigla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Define o valor da propriedade sigla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigla(String value) {
        this.sigla = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade vagas.
     * 
     */
    public int getVagas() {
        return vagas;
    }

    /**
     * Define o valor da propriedade vagas.
     * 
     */
    public void setVagas(int value) {
        this.vagas = value;
    }

    /**
     * Obtém o valor da propriedade tiposSalasID.
     * 
     */
    public int getTiposSalasID() {
        return tiposSalasID;
    }

    /**
     * Define o valor da propriedade tiposSalasID.
     * 
     */
    public void setTiposSalasID(int value) {
        this.tiposSalasID = value;
    }

    /**
     * Obtém o valor da propriedade tiposSalas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiposSalas() {
        return tiposSalas;
    }

    /**
     * Define o valor da propriedade tiposSalas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiposSalas(String value) {
        this.tiposSalas = value;
    }

    /**
     * Obtém o valor da propriedade ativo.
     * 
     */
    public int getAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     */
    public void setAtivo(int value) {
        this.ativo = value;
    }

    /**
     * Obtém o valor da propriedade aulaLivre.
     * 
     */
    public int getAulaLivre() {
        return aulaLivre;
    }

    /**
     * Define o valor da propriedade aulaLivre.
     * 
     */
    public void setAulaLivre(int value) {
        this.aulaLivre = value;
    }

    /**
     * Obtém o valor da propriedade permiteLocacao.
     * 
     */
    public int getPermiteLocacao() {
        return permiteLocacao;
    }

    /**
     * Define o valor da propriedade permiteLocacao.
     * 
     */
    public void setPermiteLocacao(int value) {
        this.permiteLocacao = value;
    }

    /**
     * Obtém o valor da propriedade valorHoraLocacao.
     * 
     */
    public double getValorHoraLocacao() {
        return valorHoraLocacao;
    }

    /**
     * Define o valor da propriedade valorHoraLocacao.
     * 
     */
    public void setValorHoraLocacao(double value) {
        this.valorHoraLocacao = value;
    }

    /**
     * Obtém o valor da propriedade locacaoAmbientesHorarios.
     * 
     * @return
     *     possible object is
     *     {@link WsLocacaoAmbientesHorarios }
     *     
     */
    public WsLocacaoAmbientesHorarios getLocacaoAmbientesHorarios() {
        return locacaoAmbientesHorarios;
    }

    /**
     * Define o valor da propriedade locacaoAmbientesHorarios.
     * 
     * @param value
     *     allowed object is
     *     {@link WsLocacaoAmbientesHorarios }
     *     
     */
    public void setLocacaoAmbientesHorarios(WsLocacaoAmbientesHorarios value) {
        this.locacaoAmbientesHorarios = value;
    }

}
