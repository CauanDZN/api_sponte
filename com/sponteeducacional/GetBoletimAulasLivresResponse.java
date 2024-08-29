
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
 *         &lt;element name="GetBoletimAulasLivresResult" type="{http://api.sponteeducacional.net.br/}wsBoletimAulasLivres" minOccurs="0"/&gt;
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
    "getBoletimAulasLivresResult"
})
@XmlRootElement(name = "GetBoletimAulasLivresResponse")
public class GetBoletimAulasLivresResponse {

    @XmlElement(name = "GetBoletimAulasLivresResult")
    protected WsBoletimAulasLivres getBoletimAulasLivresResult;

    /**
     * Obtém o valor da propriedade getBoletimAulasLivresResult.
     * 
     * @return
     *     possible object is
     *     {@link WsBoletimAulasLivres }
     *     
     */
    public WsBoletimAulasLivres getGetBoletimAulasLivresResult() {
        return getBoletimAulasLivresResult;
    }

    /**
     * Define o valor da propriedade getBoletimAulasLivresResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WsBoletimAulasLivres }
     *     
     */
    public void setGetBoletimAulasLivresResult(WsBoletimAulasLivres value) {
        this.getBoletimAulasLivresResult = value;
    }

}
