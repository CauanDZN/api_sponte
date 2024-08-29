
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
 *         &lt;element name="AccessValidationAppResult" type="{http://api.sponteeducacional.net.br/}wsAccessValidationApp" minOccurs="0"/&gt;
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
    "accessValidationAppResult"
})
@XmlRootElement(name = "AccessValidationAppResponse")
public class AccessValidationAppResponse {

    @XmlElement(name = "AccessValidationAppResult")
    protected WsAccessValidationApp accessValidationAppResult;

    /**
     * Obtém o valor da propriedade accessValidationAppResult.
     * 
     * @return
     *     possible object is
     *     {@link WsAccessValidationApp }
     *     
     */
    public WsAccessValidationApp getAccessValidationAppResult() {
        return accessValidationAppResult;
    }

    /**
     * Define o valor da propriedade accessValidationAppResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WsAccessValidationApp }
     *     
     */
    public void setAccessValidationAppResult(WsAccessValidationApp value) {
        this.accessValidationAppResult = value;
    }

}
