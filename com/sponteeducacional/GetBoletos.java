
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="nContaReceberID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nNumeroParcela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nCNABID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lSobrescrever" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "nContaReceberID",
    "nNumeroParcela",
    "ncnabid",
    "lSobrescrever"
})
@XmlRootElement(name = "GetBoletos")
public class GetBoletos {

    protected int nCodigoCliente;
    protected String sToken;
    protected int nContaReceberID;
    protected String nNumeroParcela;
    @XmlElement(name = "nCNABID")
    protected int ncnabid;
    protected boolean lSobrescrever;

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
     * Obtém o valor da propriedade nContaReceberID.
     * 
     */
    public int getNContaReceberID() {
        return nContaReceberID;
    }

    /**
     * Define o valor da propriedade nContaReceberID.
     * 
     */
    public void setNContaReceberID(int value) {
        this.nContaReceberID = value;
    }

    /**
     * Obtém o valor da propriedade nNumeroParcela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNNumeroParcela() {
        return nNumeroParcela;
    }

    /**
     * Define o valor da propriedade nNumeroParcela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNNumeroParcela(String value) {
        this.nNumeroParcela = value;
    }

    /**
     * Obtém o valor da propriedade ncnabid.
     * 
     */
    public int getNCNABID() {
        return ncnabid;
    }

    /**
     * Define o valor da propriedade ncnabid.
     * 
     */
    public void setNCNABID(int value) {
        this.ncnabid = value;
    }

    /**
     * Obtém o valor da propriedade lSobrescrever.
     * 
     */
    public boolean isLSobrescrever() {
        return lSobrescrever;
    }

    /**
     * Define o valor da propriedade lSobrescrever.
     * 
     */
    public void setLSobrescrever(boolean value) {
        this.lSobrescrever = value;
    }

}
