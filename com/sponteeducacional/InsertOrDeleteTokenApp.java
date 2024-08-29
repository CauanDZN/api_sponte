
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nCodigoCliente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nAlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nResponsavelID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sSistemaOperacional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sTokenMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nAcao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nCodigoCliente",
    "nAlunoID",
    "nResponsavelID",
    "sSistemaOperacional",
    "sTokenMobile",
    "sToken",
    "nAcao"
})
@XmlRootElement(name = "InsertOrDeleteTokenApp")
public class InsertOrDeleteTokenApp {

    protected int nCodigoCliente;
    protected int nAlunoID;
    protected int nResponsavelID;
    protected String sSistemaOperacional;
    protected String sTokenMobile;
    protected String sToken;
    protected int nAcao;

    /**
     * Obtém o valor da propriedade nCodigoCliente.
     * 
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }

    /**
     * Define o valor da propriedade nCodigoCliente.
     * 
     */
    public void setNCodigoCliente(int value) {
        this.nCodigoCliente = value;
    }

    /**
     * Obtém o valor da propriedade nAlunoID.
     * 
     */
    public int getNAlunoID() {
        return nAlunoID;
    }

    /**
     * Define o valor da propriedade nAlunoID.
     * 
     */
    public void setNAlunoID(int value) {
        this.nAlunoID = value;
    }

    /**
     * Obtém o valor da propriedade nResponsavelID.
     * 
     */
    public int getNResponsavelID() {
        return nResponsavelID;
    }

    /**
     * Define o valor da propriedade nResponsavelID.
     * 
     */
    public void setNResponsavelID(int value) {
        this.nResponsavelID = value;
    }

    /**
     * Obtém o valor da propriedade sSistemaOperacional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSistemaOperacional() {
        return sSistemaOperacional;
    }

    /**
     * Define o valor da propriedade sSistemaOperacional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSistemaOperacional(String value) {
        this.sSistemaOperacional = value;
    }

    /**
     * Obtém o valor da propriedade sTokenMobile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTokenMobile() {
        return sTokenMobile;
    }

    /**
     * Define o valor da propriedade sTokenMobile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTokenMobile(String value) {
        this.sTokenMobile = value;
    }

    /**
     * Obtém o valor da propriedade sToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSToken() {
        return sToken;
    }

    /**
     * Define o valor da propriedade sToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSToken(String value) {
        this.sToken = value;
    }

    /**
     * Obtém o valor da propriedade nAcao.
     * 
     */
    public int getNAcao() {
        return nAcao;
    }

    /**
     * Define o valor da propriedade nAcao.
     * 
     */
    public void setNAcao(int value) {
        this.nAcao = value;
    }

}
