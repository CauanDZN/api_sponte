
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
 *         &lt;element name="GetCartoesCatracaResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsCartoesCatraca" minOccurs="0"/&gt;
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
    "getCartoesCatracaResult"
})
@XmlRootElement(name = "GetCartoesCatracaResponse")
public class GetCartoesCatracaResponse {

    @XmlElement(name = "GetCartoesCatracaResult")
    protected ArrayOfWsCartoesCatraca getCartoesCatracaResult;

    /**
     * Obtém o valor da propriedade getCartoesCatracaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsCartoesCatraca }
     *     
     */
    public ArrayOfWsCartoesCatraca getGetCartoesCatracaResult() {
        return getCartoesCatracaResult;
    }

    /**
     * Define o valor da propriedade getCartoesCatracaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsCartoesCatraca }
     *     
     */
    public void setGetCartoesCatracaResult(ArrayOfWsCartoesCatraca value) {
        this.getCartoesCatracaResult = value;
    }

}
