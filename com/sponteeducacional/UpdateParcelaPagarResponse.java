
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
 *         &lt;element name="UpdateParcelaPagarResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsRetornoParcelaPagar" minOccurs="0"/&gt;
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
    "updateParcelaPagarResult"
})
@XmlRootElement(name = "UpdateParcelaPagarResponse")
public class UpdateParcelaPagarResponse {

    @XmlElement(name = "UpdateParcelaPagarResult")
    protected ArrayOfWsRetornoParcelaPagar updateParcelaPagarResult;

    /**
     * Obtém o valor da propriedade updateParcelaPagarResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsRetornoParcelaPagar }
     *     
     */
    public ArrayOfWsRetornoParcelaPagar getUpdateParcelaPagarResult() {
        return updateParcelaPagarResult;
    }

    /**
     * Define o valor da propriedade updateParcelaPagarResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsRetornoParcelaPagar }
     *     
     */
    public void setUpdateParcelaPagarResult(ArrayOfWsRetornoParcelaPagar value) {
        this.updateParcelaPagarResult = value;
    }

}
