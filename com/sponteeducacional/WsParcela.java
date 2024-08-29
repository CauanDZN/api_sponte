
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsParcela complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsParcela"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContaReceberID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumeroParcela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SituacaoParcela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SituacaoCNAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorParcela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroBoleto" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TipoRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormaCobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sacado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BolsaAssociada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vencimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaturaID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ContaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsParcela", propOrder = {
    "retornoOperacao",
    "contaReceberID",
    "numeroParcela",
    "situacaoParcela",
    "situacaoCNAB",
    "dataPagamento",
    "valorParcela",
    "numeroBoleto",
    "tipoRecebimento",
    "formaCobranca",
    "sacado",
    "bolsaAssociada",
    "vencimento",
    "categoria",
    "valorPago",
    "faturaID",
    "contaID"
})
public class WsParcela {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "ContaReceberID")
    protected int contaReceberID;
    @XmlElement(name = "NumeroParcela")
    protected String numeroParcela;
    @XmlElement(name = "SituacaoParcela")
    protected String situacaoParcela;
    @XmlElement(name = "SituacaoCNAB")
    protected String situacaoCNAB;
    @XmlElement(name = "DataPagamento")
    protected String dataPagamento;
    @XmlElement(name = "ValorParcela")
    protected String valorParcela;
    @XmlElement(name = "NumeroBoleto")
    protected long numeroBoleto;
    @XmlElement(name = "TipoRecebimento")
    protected String tipoRecebimento;
    @XmlElement(name = "FormaCobranca")
    protected String formaCobranca;
    @XmlElement(name = "Sacado")
    protected String sacado;
    @XmlElement(name = "BolsaAssociada")
    protected String bolsaAssociada;
    @XmlElement(name = "Vencimento")
    protected String vencimento;
    @XmlElement(name = "Categoria")
    protected String categoria;
    @XmlElement(name = "ValorPago")
    protected String valorPago;
    @XmlElement(name = "FaturaID")
    protected long faturaID;
    @XmlElement(name = "ContaID")
    protected int contaID;

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
     * Obtém o valor da propriedade contaReceberID.
     * 
     */
    public int getContaReceberID() {
        return contaReceberID;
    }

    /**
     * Define o valor da propriedade contaReceberID.
     * 
     */
    public void setContaReceberID(int value) {
        this.contaReceberID = value;
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
     * Obtém o valor da propriedade situacaoCNAB.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoCNAB() {
        return situacaoCNAB;
    }

    /**
     * Define o valor da propriedade situacaoCNAB.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoCNAB(String value) {
        this.situacaoCNAB = value;
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
     * Obtém o valor da propriedade numeroBoleto.
     * 
     */
    public long getNumeroBoleto() {
        return numeroBoleto;
    }

    /**
     * Define o valor da propriedade numeroBoleto.
     * 
     */
    public void setNumeroBoleto(long value) {
        this.numeroBoleto = value;
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
     * Obtém o valor da propriedade bolsaAssociada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBolsaAssociada() {
        return bolsaAssociada;
    }

    /**
     * Define o valor da propriedade bolsaAssociada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBolsaAssociada(String value) {
        this.bolsaAssociada = value;
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

    /**
     * Obtém o valor da propriedade faturaID.
     * 
     */
    public long getFaturaID() {
        return faturaID;
    }

    /**
     * Define o valor da propriedade faturaID.
     * 
     */
    public void setFaturaID(long value) {
        this.faturaID = value;
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

}
