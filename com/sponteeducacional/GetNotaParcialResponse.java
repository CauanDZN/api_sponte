
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
 *         &lt;element name="GetNotaParcialResult" type="{http://api.sponteeducacional.net.br/}wsNotasParciais" minOccurs="0"/&gt;
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
    "getNotaParcialResult"
})
@XmlRootElement(name = "GetNotaParcialResponse")
public class GetNotaParcialResponse {

    @XmlElement(name = "GetNotaParcialResult")
    protected WsNotasParciais getNotaParcialResult;

    /**
     * Obtém o valor da propriedade getNotaParcialResult.
     * 
     * @return
     *     possible object is
     *     {@link WsNotasParciais }
     *     
     */
    public WsNotasParciais getGetNotaParcialResult() {
        return getNotaParcialResult;
    }

    /**
     * Define o valor da propriedade getNotaParcialResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WsNotasParciais }
     *     
     */
    public void setGetNotaParcialResult(WsNotasParciais value) {
        this.getNotaParcialResult = value;
    }

}
