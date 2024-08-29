
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
 *         &lt;element name="GetBoletosResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsRetornoBoletos" minOccurs="0"/&gt;
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
    "getBoletosResult"
})
@XmlRootElement(name = "GetBoletosResponse")
public class GetBoletosResponse {

    @XmlElement(name = "GetBoletosResult")
    protected ArrayOfWsRetornoBoletos getBoletosResult;

    /**
     * Obtém o valor da propriedade getBoletosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsRetornoBoletos }
     *     
     */
    public ArrayOfWsRetornoBoletos getGetBoletosResult() {
        return getBoletosResult;
    }

    /**
     * Define o valor da propriedade getBoletosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsRetornoBoletos }
     *     
     */
    public void setGetBoletosResult(ArrayOfWsRetornoBoletos value) {
        this.getBoletosResult = value;
    }

}
