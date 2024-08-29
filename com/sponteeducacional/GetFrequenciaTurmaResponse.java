
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
 *         &lt;element name="GetFrequenciaTurmaResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsFrequenciaTurma" minOccurs="0"/&gt;
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
    "getFrequenciaTurmaResult"
})
@XmlRootElement(name = "GetFrequenciaTurmaResponse")
public class GetFrequenciaTurmaResponse {

    @XmlElement(name = "GetFrequenciaTurmaResult")
    protected ArrayOfWsFrequenciaTurma getFrequenciaTurmaResult;

    /**
     * Obtém o valor da propriedade getFrequenciaTurmaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsFrequenciaTurma }
     *     
     */
    public ArrayOfWsFrequenciaTurma getGetFrequenciaTurmaResult() {
        return getFrequenciaTurmaResult;
    }

    /**
     * Define o valor da propriedade getFrequenciaTurmaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsFrequenciaTurma }
     *     
     */
    public void setGetFrequenciaTurmaResult(ArrayOfWsFrequenciaTurma value) {
        this.getFrequenciaTurmaResult = value;
    }

}
