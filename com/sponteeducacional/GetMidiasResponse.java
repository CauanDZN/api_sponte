
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
 *         &lt;element name="GetMidiasResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsMidias" minOccurs="0"/&gt;
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
    "getMidiasResult"
})
@XmlRootElement(name = "GetMidiasResponse")
public class GetMidiasResponse {

    @XmlElement(name = "GetMidiasResult")
    protected ArrayOfWsMidias getMidiasResult;

    /**
     * Obtém o valor da propriedade getMidiasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsMidias }
     *     
     */
    public ArrayOfWsMidias getGetMidiasResult() {
        return getMidiasResult;
    }

    /**
     * Define o valor da propriedade getMidiasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsMidias }
     *     
     */
    public void setGetMidiasResult(ArrayOfWsMidias value) {
        this.getMidiasResult = value;
    }

}
