
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsBolsa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsBolsa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BolsaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoDesconto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descontos" type="{http://api.sponteeducacional.net.br/}ArrayOfWsDescontos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsBolsa", propOrder = {
    "retornoOperacao",
    "bolsaID",
    "descricao",
    "tipoDesconto",
    "descontos"
})
public class WsBolsa {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "BolsaID")
    protected int bolsaID;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "TipoDesconto")
    protected String tipoDesconto;
    @XmlElement(name = "Descontos")
    protected ArrayOfWsDescontos descontos;

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
     * Obtém o valor da propriedade bolsaID.
     * 
     */
    public int getBolsaID() {
        return bolsaID;
    }

    /**
     * Define o valor da propriedade bolsaID.
     * 
     */
    public void setBolsaID(int value) {
        this.bolsaID = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade tipoDesconto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDesconto() {
        return tipoDesconto;
    }

    /**
     * Define o valor da propriedade tipoDesconto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDesconto(String value) {
        this.tipoDesconto = value;
    }

    /**
     * Obtém o valor da propriedade descontos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsDescontos }
     *     
     */
    public ArrayOfWsDescontos getDescontos() {
        return descontos;
    }

    /**
     * Define o valor da propriedade descontos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsDescontos }
     *     
     */
    public void setDescontos(ArrayOfWsDescontos value) {
        this.descontos = value;
    }

}
