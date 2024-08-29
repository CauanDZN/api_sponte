
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsParcelaPagar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsParcelaPagar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContaPagarID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumeroParcela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sacado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SituacaoParcela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vencimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorParcela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TipoRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormaCobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsParcelaPagar", propOrder = {
    "retornoOperacao",
    "contaPagarID",
    "numeroParcela",
    "sacado",
    "situacaoParcela",
    "vencimento",
    "valorParcela",
    "categoria",
    "contaID",
    "tipoRecebimento",
    "formaCobranca",
    "dataPagamento",
    "valorPago"
})
public class WsParcelaPagar {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "ContaPagarID")
    protected int contaPagarID;
    @XmlElement(name = "NumeroParcela")
    protected String numeroParcela;
    @XmlElement(name = "Sacado")
    protected String sacado;
    @XmlElement(name = "SituacaoParcela")
    protected String situacaoParcela;
    @XmlElement(name = "Vencimento")
    protected String vencimento;
    @XmlElement(name = "ValorParcela")
    protected String valorParcela;
    @XmlElement(name = "Categoria")
    protected String categoria;
    @XmlElement(name = "ContaID")
    protected int contaID;
    @XmlElement(name = "TipoRecebimento")
    protected String tipoRecebimento;
    @XmlElement(name = "FormaCobranca")
    protected String formaCobranca;
    @XmlElement(name = "DataPagamento")
    protected String dataPagamento;
    @XmlElement(name = "ValorPago")
    protected String valorPago;

    /**
     * Obtém o valor da propriedade retornoOperacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetornoOperacao() {
        return retornoOperacao;
    }

    /**
     * Define o valor da propriedade retornoOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetornoOperacao(String value) {
        this.retornoOperacao = value;
    }

    /**
     * Obtém o valor da propriedade contaPagarID.
     * 
     */
    public int getContaPagarID() {
        return contaPagarID;
    }

    /**
     * Define o valor da propriedade contaPagarID.
     * 
     */
    public void setContaPagarID(int value) {
        this.contaPagarID = value;
    }

    /**
     * Obtém o valor da propriedade numeroParcela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroParcela() {
        return numeroParcela;
    }

    /**
     * Define o valor da propriedade numeroParcela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroParcela(String value) {
        this.numeroParcela = value;
    }

    /**
     * Obtém o valor da propriedade sacado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSacado() {
        return sacado;
    }

    /**
     * Define o valor da propriedade sacado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSacado(String value) {
        this.sacado = value;
    }

    /**
     * Obtém o valor da propriedade situacaoParcela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoParcela() {
        return situacaoParcela;
    }

    /**
     * Define o valor da propriedade situacaoParcela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoParcela(String value) {
        this.situacaoParcela = value;
    }

    /**
     * Obtém o valor da propriedade vencimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVencimento() {
        return vencimento;
    }

    /**
     * Define o valor da propriedade vencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVencimento(String value) {
        this.vencimento = value;
    }

    /**
     * Obtém o valor da propriedade valorParcela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorParcela() {
        return valorParcela;
    }

    /**
     * Define o valor da propriedade valorParcela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorParcela(String value) {
        this.valorParcela = value;
    }

    /**
     * Obtém o valor da propriedade categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define o valor da propriedade categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtém o valor da propriedade contaID.
     * 
     */
    public int getContaID() {
        return contaID;
    }

    /**
     * Define o valor da propriedade contaID.
     * 
     */
    public void setContaID(int value) {
        this.contaID = value;
    }

    /**
     * Obtém o valor da propriedade tipoRecebimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRecebimento() {
        return tipoRecebimento;
    }

    /**
     * Define o valor da propriedade tipoRecebimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRecebimento(String value) {
        this.tipoRecebimento = value;
    }

    /**
     * Obtém o valor da propriedade formaCobranca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaCobranca() {
        return formaCobranca;
    }

    /**
     * Define o valor da propriedade formaCobranca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaCobranca(String value) {
        this.formaCobranca = value;
    }

    /**
     * Obtém o valor da propriedade dataPagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPagamento() {
        return dataPagamento;
    }

    /**
     * Define o valor da propriedade dataPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPagamento(String value) {
        this.dataPagamento = value;
    }

    /**
     * Obtém o valor da propriedade valorPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorPago() {
        return valorPago;
    }

    /**
     * Define o valor da propriedade valorPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorPago(String value) {
        this.valorPago = value;
    }

}
