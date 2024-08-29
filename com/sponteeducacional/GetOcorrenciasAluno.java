
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
 *         &lt;element name="dDataInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dDataFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "dDataInicial",
    "dDataFinal"
})
@XmlRootElement(name = "GetOcorrenciasAluno")
public class GetOcorrenciasAluno {

    protected int nCodigoCliente;
    protected String sToken;
    protected int nAlunoID;
    protected String dDataInicial;
    protected String dDataFinal;

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
     * Obtém o valor da propriedade dDataInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDataInicial() {
        return dDataInicial;
    }

    /**
     * Define o valor da propriedade dDataInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDataInicial(String value) {
        this.dDataInicial = value;
    }

    /**
     * Obtém o valor da propriedade dDataFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDataFinal() {
        return dDataFinal;
    }

    /**
     * Define o valor da propriedade dDataFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDataFinal(String value) {
        this.dDataFinal = value;
    }

}
