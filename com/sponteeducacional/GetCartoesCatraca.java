
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
 *         &lt;element name="nAlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nResponsavelID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nVisitanteID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nFuncionarioID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "nAlunoID",
    "nResponsavelID",
    "nVisitanteID",
    "nFuncionarioID"
})
@XmlRootElement(name = "GetCartoesCatraca")
public class GetCartoesCatraca {

    protected int nCodigoCliente;
    protected String sToken;
    protected int nAlunoID;
    protected int nResponsavelID;
    protected int nVisitanteID;
    protected int nFuncionarioID;

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
     * Obtém o valor da propriedade nVisitanteID.
     * 
     */
    public int getNVisitanteID() {
        return nVisitanteID;
    }

    /**
     * Define o valor da propriedade nVisitanteID.
     * 
     */
    public void setNVisitanteID(int value) {
        this.nVisitanteID = value;
    }

    /**
     * Obtém o valor da propriedade nFuncionarioID.
     * 
     */
    public int getNFuncionarioID() {
        return nFuncionarioID;
    }

    /**
     * Define o valor da propriedade nFuncionarioID.
     * 
     */
    public void setNFuncionarioID(int value) {
        this.nFuncionarioID = value;
    }

}
