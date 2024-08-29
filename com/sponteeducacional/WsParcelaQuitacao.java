
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsParcelaQuitacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsParcelaQuitacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecebimentoAPIID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ContaReceberID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ContaPagarID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumeroParcelas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FormaPagamento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OperadoraID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QuantidadeVezesParcelamento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsParcelaQuitacao", propOrder = {
    "recebimentoAPIID",
    "contaReceberID",
    "contaPagarID",
    "numeroParcelas",
    "valorPago",
    "dataPagamento",
    "contaID",
    "formaPagamento",
    "operadoraID",
    "quantidadeVezesParcelamento"
})
public class WsParcelaQuitacao {

    @XmlElement(name = "RecebimentoAPIID")
    protected int recebimentoAPIID;
    @XmlElement(name = "ContaReceberID")
    protected int contaReceberID;
    @XmlElement(name = "ContaPagarID")
    protected int contaPagarID;
    @XmlElement(name = "NumeroParcelas")
    protected String numeroParcelas;
    @XmlElement(name = "ValorPago")
    protected String valorPago;
    @XmlElement(name = "DataPagamento")
    protected String dataPagamento;
    @XmlElement(name = "ContaID")
    protected int contaID;
    @XmlElement(name = "FormaPagamento")
    protected int formaPagamento;
    @XmlElement(name = "OperadoraID")
    protected int operadoraID;
    @XmlElement(name = "QuantidadeVezesParcelamento")
    protected int quantidadeVezesParcelamento;

    /**
     * Obtém o valor da propriedade recebimentoAPIID.
     * 
     */
    public int getRecebimentoAPIID() {
        return recebimentoAPIID;
    }

    /**
     * Define o valor da propriedade recebimentoAPIID.
     * 
     */
    public void setRecebimentoAPIID(int value) {
        this.recebimentoAPIID = value;
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
     * Obtém o valor da propriedade numeroParcelas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroParcelas() {
        return numeroParcelas;
    }

    /**
     * Define o valor da propriedade numeroParcelas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroParcelas(String value) {
        this.numeroParcelas = value;
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
     * Obtém o valor da propriedade formaPagamento.
     * 
     */
    public int getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * Define o valor da propriedade formaPagamento.
     * 
     */
    public void setFormaPagamento(int value) {
        this.formaPagamento = value;
    }

    /**
     * Obtém o valor da propriedade operadoraID.
     * 
     */
    public int getOperadoraID() {
        return operadoraID;
    }

    /**
     * Define o valor da propriedade operadoraID.
     * 
     */
    public void setOperadoraID(int value) {
        this.operadoraID = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeVezesParcelamento.
     * 
     */
    public int getQuantidadeVezesParcelamento() {
        return quantidadeVezesParcelamento;
    }

    /**
     * Define o valor da propriedade quantidadeVezesParcelamento.
     * 
     */
    public void setQuantidadeVezesParcelamento(int value) {
        this.quantidadeVezesParcelamento = value;
    }

}
