
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsNotaParcial complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsNotaParcial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotaParcialID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AvaliacaoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeAvaliacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Peso" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Ordem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="GrupoAvaliacaoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeGrupoAvaliacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsNotaParcial", propOrder = {
    "notaParcialID",
    "avaliacaoID",
    "nomeAvaliacao",
    "peso",
    "ordem",
    "grupoAvaliacaoID",
    "nomeGrupoAvaliacao",
    "nota"
})
public class WsNotaParcial {

    @XmlElement(name = "NotaParcialID")
    protected int notaParcialID;
    @XmlElement(name = "AvaliacaoID")
    protected int avaliacaoID;
    @XmlElement(name = "NomeAvaliacao")
    protected String nomeAvaliacao;
    @XmlElement(name = "Peso")
    protected double peso;
    @XmlElement(name = "Ordem")
    protected int ordem;
    @XmlElement(name = "GrupoAvaliacaoID")
    protected int grupoAvaliacaoID;
    @XmlElement(name = "NomeGrupoAvaliacao")
    protected String nomeGrupoAvaliacao;
    @XmlElement(name = "Nota")
    protected String nota;

    /**
     * Obtém o valor da propriedade notaParcialID.
     * 
     */
    public int getNotaParcialID() {
        return notaParcialID;
    }

    /**
     * Define o valor da propriedade notaParcialID.
     * 
     */
    public void setNotaParcialID(int value) {
        this.notaParcialID = value;
    }

    /**
     * Obtém o valor da propriedade avaliacaoID.
     * 
     */
    public int getAvaliacaoID() {
        return avaliacaoID;
    }

    /**
     * Define o valor da propriedade avaliacaoID.
     * 
     */
    public void setAvaliacaoID(int value) {
        this.avaliacaoID = value;
    }

    /**
     * Obtém o valor da propriedade nomeAvaliacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAvaliacao() {
        return nomeAvaliacao;
    }

    /**
     * Define o valor da propriedade nomeAvaliacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAvaliacao(String value) {
        this.nomeAvaliacao = value;
    }

    /**
     * Obtém o valor da propriedade peso.
     * 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Define o valor da propriedade peso.
     * 
     */
    public void setPeso(double value) {
        this.peso = value;
    }

    /**
     * Obtém o valor da propriedade ordem.
     * 
     */
    public int getOrdem() {
        return ordem;
    }

    /**
     * Define o valor da propriedade ordem.
     * 
     */
    public void setOrdem(int value) {
        this.ordem = value;
    }

    /**
     * Obtém o valor da propriedade grupoAvaliacaoID.
     * 
     */
    public int getGrupoAvaliacaoID() {
        return grupoAvaliacaoID;
    }

    /**
     * Define o valor da propriedade grupoAvaliacaoID.
     * 
     */
    public void setGrupoAvaliacaoID(int value) {
        this.grupoAvaliacaoID = value;
    }

    /**
     * Obtém o valor da propriedade nomeGrupoAvaliacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeGrupoAvaliacao() {
        return nomeGrupoAvaliacao;
    }

    /**
     * Define o valor da propriedade nomeGrupoAvaliacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeGrupoAvaliacao(String value) {
        this.nomeGrupoAvaliacao = value;
    }

    /**
     * Obtém o valor da propriedade nota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota() {
        return nota;
    }

    /**
     * Define o valor da propriedade nota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota(String value) {
        this.nota = value;
    }

}
