
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
 *         &lt;element name="GetBolsasResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsBolsa" minOccurs="0"/&gt;
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
    "getBolsasResult"
})
@XmlRootElement(name = "GetBolsasResponse")
public class GetBolsasResponse {

    @XmlElement(name = "GetBolsasResult")
    protected ArrayOfWsBolsa getBolsasResult;

    /**
     * Obtém o valor da propriedade getBolsasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsBolsa }
     *     
     */
    public ArrayOfWsBolsa getGetBolsasResult() {
        return getBolsasResult;
    }

    /**
     * Define o valor da propriedade getBolsasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsBolsa }
     *     
     */
    public void setGetBolsasResult(ArrayOfWsBolsa value) {
        this.getBolsasResult = value;
    }

}
