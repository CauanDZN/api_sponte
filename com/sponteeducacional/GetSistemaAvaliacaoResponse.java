
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetSistemaAvaliacaoResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsSistemaAvaliacao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getSistemaAvaliacaoResult"
})
@XmlRootElement(name = "GetSistemaAvaliacaoResponse")
public class GetSistemaAvaliacaoResponse {

    @XmlElement(name = "GetSistemaAvaliacaoResult")
    protected ArrayOfWsSistemaAvaliacao getSistemaAvaliacaoResult;

    /**
     * Obtém o valor da propriedade getSistemaAvaliacaoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsSistemaAvaliacao }
     *     
     */
    public ArrayOfWsSistemaAvaliacao getGetSistemaAvaliacaoResult() {
        return getSistemaAvaliacaoResult;
    }

    /**
     * Define o valor da propriedade getSistemaAvaliacaoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsSistemaAvaliacao }
     *     
     */
    public void setGetSistemaAvaliacaoResult(ArrayOfWsSistemaAvaliacao value) {
        this.getSistemaAvaliacaoResult = value;
    }

}
