
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsLayouts complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsLayouts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CobrancasBancarias" type="{http://api.sponteeducacional.net.br/}ArrayOfCobrancasBancarias" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsLayouts", propOrder = {
    "retornoOperacao",
    "cobrancasBancarias"
})
public class WsLayouts {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "CobrancasBancarias")
    protected ArrayOfCobrancasBancarias cobrancasBancarias;

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
     * Obtém o valor da propriedade cobrancasBancarias.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCobrancasBancarias }
     *     
     */
    public ArrayOfCobrancasBancarias getCobrancasBancarias() {
        return cobrancasBancarias;
    }

    /**
     * Define o valor da propriedade cobrancasBancarias.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCobrancasBancarias }
     *     
     */
    public void setCobrancasBancarias(ArrayOfCobrancasBancarias value) {
        this.cobrancasBancarias = value;
    }

}
