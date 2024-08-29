
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
 *         &lt;element name="InsertPlanoResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsRetornoParcelas" minOccurs="0"/&gt;
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
    "insertPlanoResult"
})
@XmlRootElement(name = "InsertPlanoResponse")
public class InsertPlanoResponse {

    @XmlElement(name = "InsertPlanoResult")
    protected ArrayOfWsRetornoParcelas insertPlanoResult;

    /**
     * Obtém o valor da propriedade insertPlanoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsRetornoParcelas }
     *     
     */
    public ArrayOfWsRetornoParcelas getInsertPlanoResult() {
        return insertPlanoResult;
    }

    /**
     * Define o valor da propriedade insertPlanoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsRetornoParcelas }
     *     
     */
    public void setInsertPlanoResult(ArrayOfWsRetornoParcelas value) {
        this.insertPlanoResult = value;
    }

}
