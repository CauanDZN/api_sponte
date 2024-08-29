
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
 *         &lt;element name="sContaReceberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sContaPagarID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sNumeroParcela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nContaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dDataPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nValorPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nFormaPagamentoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sOperadoraID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sBandeiraCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sQuantidadeVezesParcelamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sNumeroCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lQuitarTodasPendentesPlano" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "sContaReceberID",
    "sContaPagarID",
    "sNumeroParcela",
    "nContaID",
    "dDataPagamento",
    "nValorPago",
    "nFormaPagamentoID",
    "sOperadoraID",
    "sBandeiraCartao",
    "sQuantidadeVezesParcelamento",
    "sNumeroCartao",
    "lQuitarTodasPendentesPlano"
})
@XmlRootElement(name = "QuitarParcelas")
public class QuitarParcelas {

    protected int nCodigoCliente;
    protected String sToken;
    protected String sContaReceberID;
    protected String sContaPagarID;
    protected String sNumeroParcela;
    protected int nContaID;
    protected String dDataPagamento;
    protected String nValorPago;
    protected int nFormaPagamentoID;
    protected String sOperadoraID;
    protected String sBandeiraCartao;
    protected String sQuantidadeVezesParcelamento;
    protected String sNumeroCartao;
    protected boolean lQuitarTodasPendentesPlano;

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
     * Obtém o valor da propriedade sContaReceberID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSContaReceberID() {
        return sContaReceberID;
    }

    /**
     * Define o valor da propriedade sContaReceberID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSContaReceberID(String value) {
        this.sContaReceberID = value;
    }

    /**
     * Obtém o valor da propriedade sContaPagarID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSContaPagarID() {
        return sContaPagarID;
    }

    /**
     * Define o valor da propriedade sContaPagarID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSContaPagarID(String value) {
        this.sContaPagarID = value;
    }

    /**
     * Obtém o valor da propriedade sNumeroParcela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNumeroParcela() {
        return sNumeroParcela;
    }

    /**
     * Define o valor da propriedade sNumeroParcela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNumeroParcela(String value) {
        this.sNumeroParcela = value;
    }

    /**
     * Obtém o valor da propriedade nContaID.
     * 
     */
    public int getNContaID() {
        return nContaID;
    }

    /**
     * Define o valor da propriedade nContaID.
     * 
     */
    public void setNContaID(int value) {
        this.nContaID = value;
    }

    /**
     * Obtém o valor da propriedade dDataPagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDataPagamento() {
        return dDataPagamento;
    }

    /**
     * Define o valor da propriedade dDataPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDataPagamento(String value) {
        this.dDataPagamento = value;
    }

    /**
     * Obtém o valor da propriedade nValorPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNValorPago() {
        return nValorPago;
    }

    /**
     * Define o valor da propriedade nValorPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNValorPago(String value) {
        this.nValorPago = value;
    }

    /**
     * Obtém o valor da propriedade nFormaPagamentoID.
     * 
     */
    public int getNFormaPagamentoID() {
        return nFormaPagamentoID;
    }

    /**
     * Define o valor da propriedade nFormaPagamentoID.
     * 
     */
    public void setNFormaPagamentoID(int value) {
        this.nFormaPagamentoID = value;
    }

    /**
     * Obtém o valor da propriedade sOperadoraID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOperadoraID() {
        return sOperadoraID;
    }

    /**
     * Define o valor da propriedade sOperadoraID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOperadoraID(String value) {
        this.sOperadoraID = value;
    }

    /**
     * Obtém o valor da propriedade sBandeiraCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBandeiraCartao() {
        return sBandeiraCartao;
    }

    /**
     * Define o valor da propriedade sBandeiraCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBandeiraCartao(String value) {
        this.sBandeiraCartao = value;
    }

    /**
     * Obtém o valor da propriedade sQuantidadeVezesParcelamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSQuantidadeVezesParcelamento() {
        return sQuantidadeVezesParcelamento;
    }

    /**
     * Define o valor da propriedade sQuantidadeVezesParcelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSQuantidadeVezesParcelamento(String value) {
        this.sQuantidadeVezesParcelamento = value;
    }

    /**
     * Obtém o valor da propriedade sNumeroCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNumeroCartao() {
        return sNumeroCartao;
    }

    /**
     * Define o valor da propriedade sNumeroCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNumeroCartao(String value) {
        this.sNumeroCartao = value;
    }

    /**
     * Obtém o valor da propriedade lQuitarTodasPendentesPlano.
     * 
     */
    public boolean isLQuitarTodasPendentesPlano() {
        return lQuitarTodasPendentesPlano;
    }

    /**
     * Define o valor da propriedade lQuitarTodasPendentesPlano.
     * 
     */
    public void setLQuitarTodasPendentesPlano(boolean value) {
        this.lQuitarTodasPendentesPlano = value;
    }

}
