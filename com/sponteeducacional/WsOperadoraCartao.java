
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsOperadoraCartao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsOperadoraCartao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperadoraCartaoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeOperadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperadorasPlanos" type="{http://api.sponteeducacional.net.br/}ArrayOfWsOperadoraCartaoPlanos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsOperadoraCartao", propOrder = {
    "retornoOperacao",
    "operadoraCartaoID",
    "nomeOperadora",
    "operadorasPlanos"
})
public class WsOperadoraCartao {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "OperadoraCartaoID")
    protected int operadoraCartaoID;
    @XmlElement(name = "NomeOperadora")
    protected String nomeOperadora;
    @XmlElement(name = "OperadorasPlanos")
    protected ArrayOfWsOperadoraCartaoPlanos operadorasPlanos;

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
     * Obtém o valor da propriedade operadoraCartaoID.
     * 
     */
    public int getOperadoraCartaoID() {
        return operadoraCartaoID;
    }

    /**
     * Define o valor da propriedade operadoraCartaoID.
     * 
     */
    public void setOperadoraCartaoID(int value) {
        this.operadoraCartaoID = value;
    }

    /**
     * Obtém o valor da propriedade nomeOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeOperadora() {
        return nomeOperadora;
    }

    /**
     * Define o valor da propriedade nomeOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeOperadora(String value) {
        this.nomeOperadora = value;
    }

    /**
     * Obtém o valor da propriedade operadorasPlanos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsOperadoraCartaoPlanos }
     *     
     */
    public ArrayOfWsOperadoraCartaoPlanos getOperadorasPlanos() {
        return operadorasPlanos;
    }

    /**
     * Define o valor da propriedade operadorasPlanos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsOperadoraCartaoPlanos }
     *     
     */
    public void setOperadorasPlanos(ArrayOfWsOperadoraCartaoPlanos value) {
        this.operadorasPlanos = value;
    }

}
