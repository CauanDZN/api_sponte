
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
 *         &lt;element name="GetSalasResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsSalas" minOccurs="0"/&gt;
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
    "getSalasResult"
})
@XmlRootElement(name = "GetSalasResponse")
public class GetSalasResponse {

    @XmlElement(name = "GetSalasResult")
    protected ArrayOfWsSalas getSalasResult;

    /**
     * Obtém o valor da propriedade getSalasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsSalas }
     *     
     */
    public ArrayOfWsSalas getGetSalasResult() {
        return getSalasResult;
    }

    /**
     * Define o valor da propriedade getSalasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsSalas }
     *     
     */
    public void setGetSalasResult(ArrayOfWsSalas value) {
        this.getSalasResult = value;
    }

}
