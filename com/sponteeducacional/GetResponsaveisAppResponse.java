
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
 *         &lt;element name="GetResponsaveisAppResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsResponsavel" minOccurs="0"/&gt;
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
    "getResponsaveisAppResult"
})
@XmlRootElement(name = "GetResponsaveisAppResponse")
public class GetResponsaveisAppResponse {

    @XmlElement(name = "GetResponsaveisAppResult")
    protected ArrayOfWsResponsavel getResponsaveisAppResult;

    /**
     * Obtém o valor da propriedade getResponsaveisAppResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsResponsavel }
     *     
     */
    public ArrayOfWsResponsavel getGetResponsaveisAppResult() {
        return getResponsaveisAppResult;
    }

    /**
     * Define o valor da propriedade getResponsaveisAppResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsResponsavel }
     *     
     */
    public void setGetResponsaveisAppResult(ArrayOfWsResponsavel value) {
        this.getResponsaveisAppResult = value;
    }

}
