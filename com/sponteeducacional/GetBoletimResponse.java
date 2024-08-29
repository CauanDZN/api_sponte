
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
 *         &lt;element name="GetBoletimResult" type="{http://api.sponteeducacional.net.br/}wsBoletim" minOccurs="0"/&gt;
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
    "getBoletimResult"
})
@XmlRootElement(name = "GetBoletimResponse")
public class GetBoletimResponse {

    @XmlElement(name = "GetBoletimResult")
    protected WsBoletim getBoletimResult;

    /**
     * Obtém o valor da propriedade getBoletimResult.
     * 
     * @return
     *     possible object is
     *     {@link WsBoletim }
     *     
     */
    public WsBoletim getGetBoletimResult() {
        return getBoletimResult;
    }

    /**
     * Define o valor da propriedade getBoletimResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WsBoletim }
     *     
     */
    public void setGetBoletimResult(WsBoletim value) {
        this.getBoletimResult = value;
    }

}
