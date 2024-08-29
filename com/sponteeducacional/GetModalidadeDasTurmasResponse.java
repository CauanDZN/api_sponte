
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
 *         &lt;element name="GetModalidadeDasTurmasResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsModalidadeTurma" minOccurs="0"/&gt;
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
    "getModalidadeDasTurmasResult"
})
@XmlRootElement(name = "GetModalidadeDasTurmasResponse")
public class GetModalidadeDasTurmasResponse {

    @XmlElement(name = "GetModalidadeDasTurmasResult")
    protected ArrayOfWsModalidadeTurma getModalidadeDasTurmasResult;

    /**
     * Obtém o valor da propriedade getModalidadeDasTurmasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsModalidadeTurma }
     *     
     */
    public ArrayOfWsModalidadeTurma getGetModalidadeDasTurmasResult() {
        return getModalidadeDasTurmasResult;
    }

    /**
     * Define o valor da propriedade getModalidadeDasTurmasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsModalidadeTurma }
     *     
     */
    public void setGetModalidadeDasTurmasResult(ArrayOfWsModalidadeTurma value) {
        this.getModalidadeDasTurmasResult = value;
    }

}
