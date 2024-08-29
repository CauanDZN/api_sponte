
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
 *         &lt;element name="GetMediaFinalResult" type="{http://api.sponteeducacional.net.br/}wsMediaFinal" minOccurs="0"/&gt;
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
    "getMediaFinalResult"
})
@XmlRootElement(name = "GetMediaFinalResponse")
public class GetMediaFinalResponse {

    @XmlElement(name = "GetMediaFinalResult")
    protected WsMediaFinal getMediaFinalResult;

    /**
     * Obtém o valor da propriedade getMediaFinalResult.
     * 
     * @return
     *     possible object is
     *     {@link WsMediaFinal }
     *     
     */
    public WsMediaFinal getGetMediaFinalResult() {
        return getMediaFinalResult;
    }

    /**
     * Define o valor da propriedade getMediaFinalResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WsMediaFinal }
     *     
     */
    public void setGetMediaFinalResult(WsMediaFinal value) {
        this.getMediaFinalResult = value;
    }

}
