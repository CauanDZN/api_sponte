
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
 *         &lt;element name="UpdateParcelaResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsRetornoParcela" minOccurs="0"/&gt;
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
    "updateParcelaResult"
})
@XmlRootElement(name = "UpdateParcelaResponse")
public class UpdateParcelaResponse {

    @XmlElement(name = "UpdateParcelaResult")
    protected ArrayOfWsRetornoParcela updateParcelaResult;

    /**
     * Obtém o valor da propriedade updateParcelaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsRetornoParcela }
     *     
     */
    public ArrayOfWsRetornoParcela getUpdateParcelaResult() {
        return updateParcelaResult;
    }

    /**
     * Define o valor da propriedade updateParcelaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsRetornoParcela }
     *     
     */
    public void setUpdateParcelaResult(ArrayOfWsRetornoParcela value) {
        this.updateParcelaResult = value;
    }

}
