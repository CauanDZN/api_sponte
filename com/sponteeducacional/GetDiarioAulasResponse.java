
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
 *         &lt;element name="GetDiarioAulasResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsDiarioAulas" minOccurs="0"/&gt;
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
    "getDiarioAulasResult"
})
@XmlRootElement(name = "GetDiarioAulasResponse")
public class GetDiarioAulasResponse {

    @XmlElement(name = "GetDiarioAulasResult")
    protected ArrayOfWsDiarioAulas getDiarioAulasResult;

    /**
     * Obtém o valor da propriedade getDiarioAulasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsDiarioAulas }
     *     
     */
    public ArrayOfWsDiarioAulas getGetDiarioAulasResult() {
        return getDiarioAulasResult;
    }

    /**
     * Define o valor da propriedade getDiarioAulasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsDiarioAulas }
     *     
     */
    public void setGetDiarioAulasResult(ArrayOfWsDiarioAulas value) {
        this.getDiarioAulasResult = value;
    }

}
