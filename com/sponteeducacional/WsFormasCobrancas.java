
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsFormasCobrancas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsFormasCobrancas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormasCobrancas" type="{http://api.sponteeducacional.net.br/}ArrayOfFormasCobrancas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsFormasCobrancas", propOrder = {
    "retornoOperacao",
    "formasCobrancas"
})
public class WsFormasCobrancas {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "FormasCobrancas")
    protected ArrayOfFormasCobrancas formasCobrancas;

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
     * Obtém o valor da propriedade formasCobrancas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormasCobrancas }
     *     
     */
    public ArrayOfFormasCobrancas getFormasCobrancas() {
        return formasCobrancas;
    }

    /**
     * Define o valor da propriedade formasCobrancas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormasCobrancas }
     *     
     */
    public void setFormasCobrancas(ArrayOfFormasCobrancas value) {
        this.formasCobrancas = value;
    }

}
