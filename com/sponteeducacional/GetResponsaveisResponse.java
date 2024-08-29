
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
 *         &lt;element name="GetResponsaveisResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsResponsavel" minOccurs="0"/&gt;
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
    "getResponsaveisResult"
})
@XmlRootElement(name = "GetResponsaveisResponse")
public class GetResponsaveisResponse {

    @XmlElement(name = "GetResponsaveisResult")
    protected ArrayOfWsResponsavel getResponsaveisResult;

    /**
     * Obtém o valor da propriedade getResponsaveisResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsResponsavel }
     *     
     */
    public ArrayOfWsResponsavel getGetResponsaveisResult() {
        return getResponsaveisResult;
    }

    /**
     * Define o valor da propriedade getResponsaveisResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsResponsavel }
     *     
     */
    public void setGetResponsaveisResult(ArrayOfWsResponsavel value) {
        this.getResponsaveisResult = value;
    }

}
