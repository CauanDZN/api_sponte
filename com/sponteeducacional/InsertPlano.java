
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="nContratoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nContratoAulaLivreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nAlunoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nTipoPlano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nBolsaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dDataPrimeiroVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="nNumeroParcelas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nValorParcelas" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nFormaCobrancaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nCategoriaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nClienteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nContratoID",
    "nContratoAulaLivreID",
    "nAlunoID",
    "nTipoPlano",
    "nBolsaID",
    "dDataPrimeiroVencimento",
    "nNumeroParcelas",
    "nValorParcelas",
    "nFormaCobrancaID",
    "nCategoriaID",
    "sObservacao",
    "nClienteID",
    "nContaID"
})
@XmlRootElement(name = "InsertPlano")
public class InsertPlano {

    protected int nCodigoCliente;
    protected String sToken;
    protected String nContratoID;
    protected String nContratoAulaLivreID;
    protected String nAlunoID;
    protected String nTipoPlano;
    protected String nBolsaID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dDataPrimeiroVencimento;
    protected int nNumeroParcelas;
    protected double nValorParcelas;
    protected int nFormaCobrancaID;
    protected int nCategoriaID;
    protected String sObservacao;
    protected String nClienteID;
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
     * Obtém o valor da propriedade nAlunoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAlunoID() {
        return nAlunoID;
    }

    /**
     * Define o valor da propriedade nAlunoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAlunoID(String value) {
        this.nAlunoID = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDDataPrimeiroVencimento() {
        return dDataPrimeiroVencimento;
    }

    /**
     * Define o valor da propriedade dDataPrimeiroVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDDataPrimeiroVencimento(XMLGregorianCalendar value) {
        this.dDataPrimeiroVencimento = value;
    }

    /**
     * Obtém o valor da propriedade nNumeroParcelas.
     * 
     */
    public int getNNumeroParcelas() {
        return nNumeroParcelas;
    }

    /**
     * Define o valor da propriedade nNumeroParcelas.
     * 
     */
    public void setNNumeroParcelas(int value) {
        this.nNumeroParcelas = value;
    }

    /**
     * Obtém o valor da propriedade nValorParcelas.
     * 
     */
    public double getNValorParcelas() {
        return nValorParcelas;
    }

    /**
     * Define o valor da propriedade nValorParcelas.
     * 
     */
    public void setNValorParcelas(double value) {
        this.nValorParcelas = value;
    }

    /**
     * Obtém o valor da propriedade nFormaCobrancaID.
     * 
     */
    public int getNFormaCobrancaID() {
        return nFormaCobrancaID;
    }

    /**
     * Define o valor da propriedade nFormaCobrancaID.
     * 
     */
    public void setNFormaCobrancaID(int value) {
        this.nFormaCobrancaID = value;
    }

    /**
     * Obtém o valor da propriedade nCategoriaID.
     * 
     */
    public int getNCategoriaID() {
        return nCategoriaID;
    }

    /**
     * Define o valor da propriedade nCategoriaID.
     * 
     */
    public void setNCategoriaID(int value) {
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
     * Obtém o valor da propriedade nClienteID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNClienteID() {
        return nClienteID;
    }

    /**
     * Define o valor da propriedade nClienteID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNClienteID(String value) {
        this.nClienteID = value;
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
