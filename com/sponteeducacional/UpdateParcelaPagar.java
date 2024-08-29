
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
 *         &lt;element name="nNumeroParcela" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dDataVencimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nFormaCobrancaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nContaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nCategoriaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nNumeroParcela",
    "dDataVencimento",
    "nValor",
    "nFormaCobrancaID",
    "nContaID",
    "nCategoriaID",
    "sObservacao"
})
@XmlRootElement(name = "UpdateParcelaPagar")
public class UpdateParcelaPagar {

    protected int nCodigoCliente;
    protected String sToken;
    protected int nContaPagarID;
    protected int nNumeroParcela;
    protected String dDataVencimento;
    protected String nValor;
    protected String nFormaCobrancaID;
    protected String nContaID;
    protected String nCategoriaID;
    protected String sObservacao;

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
     * Obtém o valor da propriedade nNumeroParcela.
     * 
     */
    public int getNNumeroParcela() {
        return nNumeroParcela;
    }

    /**
     * Define o valor da propriedade nNumeroParcela.
     * 
     */
    public void setNNumeroParcela(int value) {
        this.nNumeroParcela = value;
    }

    /**
     * Obtém o valor da propriedade dDataVencimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDataVencimento() {
        return dDataVencimento;
    }

    /**
     * Define o valor da propriedade dDataVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDataVencimento(String value) {
        this.dDataVencimento = value;
    }

    /**
     * Obtém o valor da propriedade nValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNValor() {
        return nValor;
    }

    /**
     * Define o valor da propriedade nValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNValor(String value) {
        this.nValor = value;
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

}
