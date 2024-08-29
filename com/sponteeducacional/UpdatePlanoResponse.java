
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
 *         &lt;element name="UpdatePlanoResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsRetornoParcelas" minOccurs="0"/&gt;
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
    "updatePlanoResult"
})
@XmlRootElement(name = "UpdatePlanoResponse")
public class UpdatePlanoResponse {

    @XmlElement(name = "UpdatePlanoResult")
    protected ArrayOfWsRetornoParcelas updatePlanoResult;

    /**
     * Obtém o valor da propriedade updatePlanoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsRetornoParcelas }
     *     
     */
    public ArrayOfWsRetornoParcelas getUpdatePlanoResult() {
        return updatePlanoResult;
    }

    /**
     * Define o valor da propriedade updatePlanoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsRetornoParcelas }
     *     
     */
    public void setUpdatePlanoResult(ArrayOfWsRetornoParcelas value) {
        this.updatePlanoResult = value;
    }

}
