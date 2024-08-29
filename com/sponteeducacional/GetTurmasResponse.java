
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
 *         &lt;element name="GetTurmasResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsTurma" minOccurs="0"/&gt;
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
    "getTurmasResult"
})
@XmlRootElement(name = "GetTurmasResponse")
public class GetTurmasResponse {

    @XmlElement(name = "GetTurmasResult")
    protected ArrayOfWsTurma getTurmasResult;

    /**
     * Obtém o valor da propriedade getTurmasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsTurma }
     *     
     */
    public ArrayOfWsTurma getGetTurmasResult() {
        return getTurmasResult;
    }

    /**
     * Define o valor da propriedade getTurmasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsTurma }
     *     
     */
    public void setGetTurmasResult(ArrayOfWsTurma value) {
        this.getTurmasResult = value;
    }

}
