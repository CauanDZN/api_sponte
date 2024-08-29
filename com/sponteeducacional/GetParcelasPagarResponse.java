
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
 *         &lt;element name="GetParcelasPagarResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsParcelaPagar" minOccurs="0"/&gt;
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
    "getParcelasPagarResult"
})
@XmlRootElement(name = "GetParcelasPagarResponse")
public class GetParcelasPagarResponse {

    @XmlElement(name = "GetParcelasPagarResult")
    protected ArrayOfWsParcelaPagar getParcelasPagarResult;

    /**
     * Obtém o valor da propriedade getParcelasPagarResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsParcelaPagar }
     *     
     */
    public ArrayOfWsParcelaPagar getGetParcelasPagarResult() {
        return getParcelasPagarResult;
    }

    /**
     * Define o valor da propriedade getParcelasPagarResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsParcelaPagar }
     *     
     */
    public void setGetParcelasPagarResult(ArrayOfWsParcelaPagar value) {
        this.getParcelasPagarResult = value;
    }

}
