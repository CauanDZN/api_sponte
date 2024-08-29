
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
 *         &lt;element name="nContaPagarID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dDataPrimeiroVencimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nNumeroParcelas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nValorParcelas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nFormaCobrancaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nCategoriaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nContaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sComplemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nContaPagarID",
    "dDataPrimeiroVencimento",
    "nNumeroParcelas",
    "nValorParcelas",
    "nFormaCobrancaID",
    "nCategoriaID",
    "nContaID",
    "sObservacao",
    "sComplemento",
    "sDocumento"
})
@XmlRootElement(name = "UpdatePlanoPagar")
public class UpdatePlanoPagar {

    protected int nCodigoCliente;
    protected String sToken;
    protected int nContaPagarID;
    protected String dDataPrimeiroVencimento;
    protected String nNumeroParcelas;
    protected String nValorParcelas;
    protected String nFormaCobrancaID;
    protected String nCategoriaID;
    protected String nContaID;
    protected String sObservacao;
    protected String sComplemento;
    protected String sDocumento;

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
     * Obtém o valor da propriedade nContaPagarID.
     * 
     */
    public int getNContaPagarID() {
        return nContaPagarID;
    }

    /**
     * Define o valor da propriedade nContaPagarID.
     * 
     */
    public void setNContaPagarID(int value) {
        this.nContaPagarID = value;
    }

    /**
     * Obtém o valor da propriedade dDataPrimeiroVencimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDataPrimeiroVencimento() {
        return dDataPrimeiroVencimento;
    }

    /**
     * Define o valor da propriedade dDataPrimeiroVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDataPrimeiroVencimento(String value) {
        this.dDataPrimeiroVencimento = value;
    }

    /**
     * Obtém o valor da propriedade nNumeroParcelas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNNumeroParcelas() {
        return nNumeroParcelas;
    }

    /**
     * Define o valor da propriedade nNumeroParcelas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNNumeroParcelas(String value) {
        this.nNumeroParcelas = value;
    }

    /**
     * Obtém o valor da propriedade nValorParcelas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNValorParcelas() {
        return nValorParcelas;
    }

    /**
     * Define o valor da propriedade nValorParcelas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNValorParcelas(String value) {
        this.nValorParcelas = value;
    }

    /**
     * Obtém o valor da propriedade nFormaCobrancaID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNFormaCobrancaID() {
        return nFormaCobrancaID;
    }

    /**
     * Define o valor da propriedade nFormaCobrancaID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNFormaCobrancaID(String value) {
        this.nFormaCobrancaID = value;
    }

    /**
     * Obtém o valor da propriedade nCategoriaID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCategoriaID() {
        return nCategoriaID;
    }

    /**
     * Define o valor da propriedade nCategoriaID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCategoriaID(String value) {
        this.nCategoriaID = value;
    }

    /**
     * Obtém o valor da propriedade nContaID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNContaID() {
        return nContaID;
    }

    /**
     * Define o valor da propriedade nContaID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNContaID(String value) {
        this.nContaID = value;
    }

    /**
     * Obtém o valor da propriedade sObservacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSObservacao() {
        return sObservacao;
    }

    /**
     * Define o valor da propriedade sObservacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSObservacao(String value) {
        this.sObservacao = value;
    }

    /**
     * Obtém o valor da propriedade sComplemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSComplemento() {
        return sComplemento;
    }

    /**
     * Define o valor da propriedade sComplemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSComplemento(String value) {
        this.sComplemento = value;
    }

    /**
     * Obtém o valor da propriedade sDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDocumento() {
        return sDocumento;
    }

    /**
     * Define o valor da propriedade sDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDocumento(String value) {
        this.sDocumento = value;
    }

}
