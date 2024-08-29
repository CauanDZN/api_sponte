
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsContratoPDF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsContratoPDF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetornoBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsContratoPDF", propOrder = {
    "retornoOperacao",
    "retornoBase64"
})
public class WsContratoPDF {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "RetornoBase64")
    protected String retornoBase64;

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
     * Obtém o valor da propriedade retornoBase64.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetornoBase64() {
        return retornoBase64;
    }

    /**
     * Define o valor da propriedade retornoBase64.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetornoBase64(String value) {
        this.retornoBase64 = value;
    }

}
