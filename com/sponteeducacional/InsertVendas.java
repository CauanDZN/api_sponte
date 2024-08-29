
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
 *         &lt;element name="dDataVenda" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="nBolsaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sItens" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nCategoriaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nNumeroParcelas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nValorParcela" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dDataPrimeiroVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="nFormaCobrancaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nEntregue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nContratoID",
    "nContratoAulaLivreID",
    "dDataVenda",
    "nBolsaID",
    "sItens",
    "nCategoriaID",
    "nNumeroParcelas",
    "nValorParcela",
    "dDataPrimeiroVencimento",
    "nFormaCobrancaID",
    "nEntregue",
    "sNumeroDocumento",
    "sObservacao"
})
@XmlRootElement(name = "InsertVendas")
public class InsertVendas {

    protected int nCodigoCliente;
    protected String sToken;
    protected String nContratoID;
    protected String nContratoAulaLivreID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dDataVenda;
    protected String nBolsaID;
    protected String sItens;
    protected int nCategoriaID;
    protected int nNumeroParcelas;
    protected double nValorParcela;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dDataPrimeiroVencimento;
    protected int nFormaCobrancaID;
    protected int nEntregue;
    protected String sNumeroDocumento;
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
     * Obtém o valor da propriedade dDataVenda.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDDataVenda() {
        return dDataVenda;
    }

    /**
     * Define o valor da propriedade dDataVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDDataVenda(XMLGregorianCalendar value) {
        this.dDataVenda = value;
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
     * Obtém o valor da propriedade sItens.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSItens() {
        return sItens;
    }

    /**
     * Define o valor da propriedade sItens.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSItens(String value) {
        this.sItens = value;
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
     * Obtém o valor da propriedade nValorParcela.
     * 
     */
    public double getNValorParcela() {
        return nValorParcela;
    }

    /**
     * Define o valor da propriedade nValorParcela.
     * 
     */
    public void setNValorParcela(double value) {
        this.nValorParcela = value;
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
     * Obtém o valor da propriedade nEntregue.
     * 
     */
    public int getNEntregue() {
        return nEntregue;
    }

    /**
     * Define o valor da propriedade nEntregue.
     * 
     */
    public void setNEntregue(int value) {
        this.nEntregue = value;
    }

    /**
     * Obtém o valor da propriedade sNumeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNumeroDocumento() {
        return sNumeroDocumento;
    }

    /**
     * Define o valor da propriedade sNumeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNumeroDocumento(String value) {
        this.sNumeroDocumento = value;
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
