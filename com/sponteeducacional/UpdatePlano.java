
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
 *         &lt;element name="nContaReceberID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nContratoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nContratoAulaLivreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nTipoPlano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nBolsaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dDataPrimeiroVencimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nNumeroParcelas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nValorParcelas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nFormaCobrancaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nCategoriaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nContaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nContratoID",
    "nContratoAulaLivreID",
    "nTipoPlano",
    "nBolsaID",
    "dDataPrimeiroVencimento",
    "nNumeroParcelas",
    "nValorParcelas",
    "nFormaCobrancaID",
    "nCategoriaID",
    "sObservacao",
    "nContaID"
})
@XmlRootElement(name = "UpdatePlano")
public class UpdatePlano {

    protected int nCodigoCliente;
    protected String sToken;
    protected int nContaReceberID;
    protected String nContratoID;
    protected String nContratoAulaLivreID;
    protected String nTipoPlano;
    protected String nBolsaID;
    protected String dDataPrimeiroVencimento;
    protected String nNumeroParcelas;
    protected String nValorParcelas;
    protected String nFormaCobrancaID;
    protected String nCategoriaID;
    protected String sObservacao;
    protected String nContaID;

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
     * Obtém o valor da propriedade nContratoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNContratoID() {
        return nContratoID;
    }

    /**
     * Define o valor da propriedade nContratoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNContratoID(String value) {
        this.nContratoID = value;
    }

    /**
     * Obtém o valor da propriedade nContratoAulaLivreID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNContratoAulaLivreID() {
        return nContratoAulaLivreID;
    }

    /**
     * Define o valor da propriedade nContratoAulaLivreID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNContratoAulaLivreID(String value) {
        this.nContratoAulaLivreID = value;
    }

    /**
     * Obtém o valor da propriedade nTipoPlano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTipoPlano() {
        return nTipoPlano;
    }

    /**
     * Define o valor da propriedade nTipoPlano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTipoPlano(String value) {
        this.nTipoPlano = value;
    }

    /**
     * Obtém o valor da propriedade nBolsaID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBolsaID() {
        return nBolsaID;
    }

    /**
     * Define o valor da propriedade nBolsaID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBolsaID(String value) {
        this.nBolsaID = value;
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

}
