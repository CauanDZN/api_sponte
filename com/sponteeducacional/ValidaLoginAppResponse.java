
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
 *         &lt;element name="ValidaLoginAppResult" type="{http://api.sponteeducacional.net.br/}wsLoginApp" minOccurs="0"/&gt;
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
    "validaLoginAppResult"
})
@XmlRootElement(name = "ValidaLoginAppResponse")
public class ValidaLoginAppResponse {

    @XmlElement(name = "ValidaLoginAppResult")
    protected WsLoginApp validaLoginAppResult;

    /**
     * Obtém o valor da propriedade validaLoginAppResult.
     * 
     * @return
     *     possible object is
     *     {@link WsLoginApp }
     *     
     */
    public WsLoginApp getValidaLoginAppResult() {
        return validaLoginAppResult;
    }

    /**
     * Define o valor da propriedade validaLoginAppResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WsLoginApp }
     *     
     */
    public void setValidaLoginAppResult(WsLoginApp value) {
        this.validaLoginAppResult = value;
    }

}
