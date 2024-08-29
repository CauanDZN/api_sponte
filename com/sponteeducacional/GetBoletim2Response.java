
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
 *         &lt;element name="GetBoletim2Result" type="{http://api.sponteeducacional.net.br/}wsBoletim2" minOccurs="0"/&gt;
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
    "getBoletim2Result"
})
@XmlRootElement(name = "GetBoletim2Response")
public class GetBoletim2Response {

    @XmlElement(name = "GetBoletim2Result")
    protected WsBoletim2 getBoletim2Result;

    /**
     * Obtém o valor da propriedade getBoletim2Result.
     * 
     * @return
     *     possible object is
     *     {@link WsBoletim2 }
     *     
     */
    public WsBoletim2 getGetBoletim2Result() {
        return getBoletim2Result;
    }

    /**
     * Define o valor da propriedade getBoletim2Result.
     * 
     * @param value
     *     allowed object is
     *     {@link WsBoletim2 }
     *     
     */
    public void setGetBoletim2Result(WsBoletim2 value) {
        this.getBoletim2Result = value;
    }

}
