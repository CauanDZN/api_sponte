
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
 *         &lt;element name="sLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSenha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nTipoUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sTokenApp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "sLogin",
    "sSenha",
    "sEmpresa",
    "nTipoUsuario",
    "sTokenApp"
})
@XmlRootElement(name = "ValidaLoginApp")
public class ValidaLoginApp {

    protected String sLogin;
    protected String sSenha;
    protected String sEmpresa;
    protected int nTipoUsuario;
    protected String sTokenApp;

    /**
     * Obtém o valor da propriedade sLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLogin() {
        return sLogin;
    }

    /**
     * Define o valor da propriedade sLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLogin(String value) {
        this.sLogin = value;
    }

    /**
     * Obtém o valor da propriedade sSenha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSenha() {
        return sSenha;
    }

    /**
     * Define o valor da propriedade sSenha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSenha(String value) {
        this.sSenha = value;
    }

    /**
     * Obtém o valor da propriedade sEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEmpresa() {
        return sEmpresa;
    }

    /**
     * Define o valor da propriedade sEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEmpresa(String value) {
        this.sEmpresa = value;
    }

    /**
     * Obtém o valor da propriedade nTipoUsuario.
     * 
     */
    public int getNTipoUsuario() {
        return nTipoUsuario;
    }

    /**
     * Define o valor da propriedade nTipoUsuario.
     * 
     */
    public void setNTipoUsuario(int value) {
        this.nTipoUsuario = value;
    }

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

}
