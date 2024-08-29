
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
 *         &lt;element name="GetNotasHabilidadesResult" type="{http://api.sponteeducacional.net.br/}wsNotasHabilidades" minOccurs="0"/&gt;
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
    "getNotasHabilidadesResult"
})
@XmlRootElement(name = "GetNotasHabilidadesResponse")
public class GetNotasHabilidadesResponse {

    @XmlElement(name = "GetNotasHabilidadesResult")
    protected WsNotasHabilidades getNotasHabilidadesResult;

    /**
     * Obtém o valor da propriedade getNotasHabilidadesResult.
     * 
     * @return
     *     possible object is
     *     {@link WsNotasHabilidades }
     *     
     */
    public WsNotasHabilidades getGetNotasHabilidadesResult() {
        return getNotasHabilidadesResult;
    }

    /**
     * Define o valor da propriedade getNotasHabilidadesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WsNotasHabilidades }
     *     
     */
    public void setGetNotasHabilidadesResult(WsNotasHabilidades value) {
        this.getNotasHabilidadesResult = value;
    }

}
