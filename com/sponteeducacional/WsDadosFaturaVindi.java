
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsDadosFaturaVindi complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsDadosFaturaVindi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaturaID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FaturaVindiID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataCobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDTransacaoGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BandeiraCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PortadorCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidadeCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parcelamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDTransacaoVindi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NroTentativas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsDadosFaturaVindi", propOrder = {
    "retornoOperacao",
    "faturaID",
    "faturaVindiID",
    "dataCobranca",
    "cliente",
    "valorTotal",
    "status",
    "mensagem",
    "idTransacaoGateway",
    "numeroCartao",
    "bandeiraCartao",
    "portadorCartao",
    "validadeCartao",
    "parcelamento",
    "idTransacaoVindi",
    "nroTentativas"
})
public class WsDadosFaturaVindi {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "FaturaID")
    protected long faturaID;
    @XmlElement(name = "FaturaVindiID")
    protected String faturaVindiID;
    @XmlElement(name = "DataCobranca")
    protected String dataCobranca;
    @XmlElement(name = "Cliente")
    protected String cliente;
    @XmlElement(name = "ValorTotal")
    protected String valorTotal;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Mensagem")
    protected String mensagem;
    @XmlElement(name = "IDTransacaoGateway")
    protected String idTransacaoGateway;
    @XmlElement(name = "NumeroCartao")
    protected String numeroCartao;
    @XmlElement(name = "BandeiraCartao")
    protected String bandeiraCartao;
    @XmlElement(name = "PortadorCartao")
    protected String portadorCartao;
    @XmlElement(name = "ValidadeCartao")
    protected String validadeCartao;
    @XmlElement(name = "Parcelamento")
    protected String parcelamento;
    @XmlElement(name = "IDTransacaoVindi")
    protected String idTransacaoVindi;
    @XmlElement(name = "NroTentativas")
    protected String nroTentativas;

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
     * Obtém o valor da propriedade faturaVindiID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaturaVindiID() {
        return faturaVindiID;
    }

    /**
     * Define o valor da propriedade faturaVindiID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaturaVindiID(String value) {
        this.faturaVindiID = value;
    }

    /**
     * Obtém o valor da propriedade dataCobranca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCobranca() {
        return dataCobranca;
    }

    /**
     * Define o valor da propriedade dataCobranca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCobranca(String value) {
        this.dataCobranca = value;
    }

    /**
     * Obtém o valor da propriedade cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define o valor da propriedade cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtém o valor da propriedade valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorTotal() {
        return valorTotal;
    }

    /**
     * Define o valor da propriedade valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorTotal(String value) {
        this.valorTotal = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade mensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Define o valor da propriedade mensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

    /**
     * Obtém o valor da propriedade idTransacaoGateway.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTransacaoGateway() {
        return idTransacaoGateway;
    }

    /**
     * Define o valor da propriedade idTransacaoGateway.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTransacaoGateway(String value) {
        this.idTransacaoGateway = value;
    }

    /**
     * Obtém o valor da propriedade numeroCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * Define o valor da propriedade numeroCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCartao(String value) {
        this.numeroCartao = value;
    }

    /**
     * Obtém o valor da propriedade bandeiraCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    /**
     * Define o valor da propriedade bandeiraCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandeiraCartao(String value) {
        this.bandeiraCartao = value;
    }

    /**
     * Obtém o valor da propriedade portadorCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortadorCartao() {
        return portadorCartao;
    }

    /**
     * Define o valor da propriedade portadorCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortadorCartao(String value) {
        this.portadorCartao = value;
    }

    /**
     * Obtém o valor da propriedade validadeCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidadeCartao() {
        return validadeCartao;
    }

    /**
     * Define o valor da propriedade validadeCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidadeCartao(String value) {
        this.validadeCartao = value;
    }

    /**
     * Obtém o valor da propriedade parcelamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelamento() {
        return parcelamento;
    }

    /**
     * Define o valor da propriedade parcelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelamento(String value) {
        this.parcelamento = value;
    }

    /**
     * Obtém o valor da propriedade idTransacaoVindi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTransacaoVindi() {
        return idTransacaoVindi;
    }

    /**
     * Define o valor da propriedade idTransacaoVindi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTransacaoVindi(String value) {
        this.idTransacaoVindi = value;
    }

    /**
     * Obtém o valor da propriedade nroTentativas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroTentativas() {
        return nroTentativas;
    }

    /**
     * Define o valor da propriedade nroTentativas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroTentativas(String value) {
        this.nroTentativas = value;
    }

}
