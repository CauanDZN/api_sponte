
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
 *         &lt;element name="GetContasResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsConta" minOccurs="0"/&gt;
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
    "getContasResult"
})
@XmlRootElement(name = "GetContasResponse")
public class GetContasResponse {

    @XmlElement(name = "GetContasResult")
    protected ArrayOfWsConta getContasResult;

    /**
     * Obtém o valor da propriedade getContasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsConta }
     *     
     */
    public ArrayOfWsConta getGetContasResult() {
        return getContasResult;
    }

    /**
     * Define o valor da propriedade getContasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsConta }
     *     
     */
    public void setGetContasResult(ArrayOfWsConta value) {
        this.getContasResult = value;
    }

}
