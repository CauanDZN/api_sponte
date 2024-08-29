
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
 *         &lt;element name="sTokenApp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nCodCliSponte" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nAlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nResponsavelID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "sTokenApp",
    "nCodCliSponte",
    "nAlunoID",
    "nResponsavelID"
})
@XmlRootElement(name = "AccessValidationApp")
public class AccessValidationApp {

    protected String sTokenApp;
    protected int nCodCliSponte;
    protected int nAlunoID;
    protected int nResponsavelID;

    /**
     * Obtém o valor da propriedade sTokenApp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTokenApp() {
        return sTokenApp;
    }

    /**
     * Define o valor da propriedade sTokenApp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTokenApp(String value) {
        this.sTokenApp = value;
    }

    /**
     * Obtém o valor da propriedade nCodCliSponte.
     * 
     */
    public int getNCodCliSponte() {
        return nCodCliSponte;
    }

    /**
     * Define o valor da propriedade nCodCliSponte.
     * 
     */
    public void setNCodCliSponte(int value) {
        this.nCodCliSponte = value;
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

}
