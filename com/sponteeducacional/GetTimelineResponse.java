
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
 *         &lt;element name="GetTimelineResult" type="{http://api.sponteeducacional.net.br/}ArrayOfTimeline" minOccurs="0"/&gt;
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
    "getTimelineResult"
})
@XmlRootElement(name = "GetTimelineResponse")
public class GetTimelineResponse {

    @XmlElement(name = "GetTimelineResult")
    protected ArrayOfTimeline getTimelineResult;

    /**
     * Obtém o valor da propriedade getTimelineResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimeline }
     *     
     */
    public ArrayOfTimeline getGetTimelineResult() {
        return getTimelineResult;
    }

    /**
     * Define o valor da propriedade getTimelineResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimeline }
     *     
     */
    public void setGetTimelineResult(ArrayOfTimeline value) {
        this.getTimelineResult = value;
    }

}
