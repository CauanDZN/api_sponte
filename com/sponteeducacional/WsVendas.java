
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsVendas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsVendas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaidaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ContratoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContratoAulaLivreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SituacaoEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parcelas" type="{http://api.sponteeducacional.net.br/}ArrayOfWsParcelas" minOccurs="0"/&gt;
 *         &lt;element name="Itens" type="{http://api.sponteeducacional.net.br/}ArrayOfWsItensVenda" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsVendas", propOrder = {
    "retornoOperacao",
    "saidaID",
    "contratoID",
    "contratoAulaLivreID",
    "dataVenda",
    "situacaoEntrega",
    "numeroDocumento",
    "observacao",
    "parcelas",
    "itens"
})
public class WsVendas {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "SaidaID")
    protected int saidaID;
    @XmlElement(name = "ContratoID")
    protected String contratoID;
    @XmlElement(name = "ContratoAulaLivreID")
    protected String contratoAulaLivreID;
    @XmlElement(name = "DataVenda")
    protected String dataVenda;
    @XmlElement(name = "SituacaoEntrega")
    protected String situacaoEntrega;
    @XmlElement(name = "NumeroDocumento")
    protected String numeroDocumento;
    @XmlElement(name = "Observacao")
    protected String observacao;
    @XmlElement(name = "Parcelas")
    protected ArrayOfWsParcelas parcelas;
    @XmlElement(name = "Itens")
    protected ArrayOfWsItensVenda itens;

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
     * Obtém o valor da propriedade saidaID.
     * 
     */
    public int getSaidaID() {
        return saidaID;
    }

    /**
     * Define o valor da propriedade saidaID.
     * 
     */
    public void setSaidaID(int value) {
        this.saidaID = value;
    }

    /**
     * Obtém o valor da propriedade contratoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContratoID() {
        return contratoID;
    }

    /**
     * Define o valor da propriedade contratoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContratoID(String value) {
        this.contratoID = value;
    }

    /**
     * Obtém o valor da propriedade contratoAulaLivreID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContratoAulaLivreID() {
        return contratoAulaLivreID;
    }

    /**
     * Define o valor da propriedade contratoAulaLivreID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContratoAulaLivreID(String value) {
        this.contratoAulaLivreID = value;
    }

    /**
     * Obtém o valor da propriedade dataVenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataVenda() {
        return dataVenda;
    }

    /**
     * Define o valor da propriedade dataVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataVenda(String value) {
        this.dataVenda = value;
    }

    /**
     * Obtém o valor da propriedade situacaoEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoEntrega() {
        return situacaoEntrega;
    }

    /**
     * Define o valor da propriedade situacaoEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoEntrega(String value) {
        this.situacaoEntrega = value;
    }

    /**
     * Obtém o valor da propriedade numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define o valor da propriedade numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obtém o valor da propriedade parcelas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsParcelas }
     *     
     */
    public ArrayOfWsParcelas getParcelas() {
        return parcelas;
    }

    /**
     * Define o valor da propriedade parcelas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsParcelas }
     *     
     */
    public void setParcelas(ArrayOfWsParcelas value) {
        this.parcelas = value;
    }

    /**
     * Obtém o valor da propriedade itens.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsItensVenda }
     *     
     */
    public ArrayOfWsItensVenda getItens() {
        return itens;
    }

    /**
     * Define o valor da propriedade itens.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsItensVenda }
     *     
     */
    public void setItens(ArrayOfWsItensVenda value) {
        this.itens = value;
    }

}
