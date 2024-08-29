
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
 *         &lt;element name="sToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nSalaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSigla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sDescricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nAtivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sParametrosBusca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "sToken",
    "nSalaID",
    "sSigla",
    "sDescricao",
    "nAtivo",
    "sParametrosBusca"
})
@XmlRootElement(name = "GetSalas")
public class GetSalas {

    protected int nCodigoCliente;
    protected String sToken;
    protected String nSalaID;
    protected String sSigla;
    protected String sDescricao;
    protected String nAtivo;
    protected String sParametrosBusca;

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
     * Obtém o valor da propriedade nSalaID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSalaID() {
        return nSalaID;
    }

    /**
     * Define o valor da propriedade nSalaID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSalaID(String value) {
        this.nSalaID = value;
    }

    /**
     * Obtém o valor da propriedade sSigla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSigla() {
        return sSigla;
    }

    /**
     * Define o valor da propriedade sSigla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSigla(String value) {
        this.sSigla = value;
    }

    /**
     * Obtém o valor da propriedade sDescricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDescricao() {
        return sDescricao;
    }

    /**
     * Define o valor da propriedade sDescricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDescricao(String value) {
        this.sDescricao = value;
    }

    /**
     * Obtém o valor da propriedade nAtivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAtivo() {
        return nAtivo;
    }

    /**
     * Define o valor da propriedade nAtivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAtivo(String value) {
        this.nAtivo = value;
    }

    /**
     * Obtém o valor da propriedade sParametrosBusca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSParametrosBusca() {
        return sParametrosBusca;
    }

    /**
     * Define o valor da propriedade sParametrosBusca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSParametrosBusca(String value) {
        this.sParametrosBusca = value;
    }

}
