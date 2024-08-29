
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
 *         &lt;element name="GetParcelasResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsParcela" minOccurs="0"/&gt;
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
    "getParcelasResult"
})
@XmlRootElement(name = "GetParcelasResponse")
public class GetParcelasResponse {

    @XmlElement(name = "GetParcelasResult")
    protected ArrayOfWsParcela getParcelasResult;

    /**
     * Obtém o valor da propriedade getParcelasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsParcela }
     *     
     */
    public ArrayOfWsParcela getGetParcelasResult() {
        return getParcelasResult;
    }

    /**
     * Define o valor da propriedade getParcelasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsParcela }
     *     
     */
    public void setGetParcelasResult(ArrayOfWsParcela value) {
        this.getParcelasResult = value;
    }

}
