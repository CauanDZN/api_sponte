
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
 *         &lt;element name="GetMatrizCurricular2Result" type="{http://api.sponteeducacional.net.br/}ArrayOfWsMatrizCurricular2" minOccurs="0"/&gt;
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
    "getMatrizCurricular2Result"
})
@XmlRootElement(name = "GetMatrizCurricular2Response")
public class GetMatrizCurricular2Response {

    @XmlElement(name = "GetMatrizCurricular2Result")
    protected ArrayOfWsMatrizCurricular2 getMatrizCurricular2Result;

    /**
     * Obtém o valor da propriedade getMatrizCurricular2Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsMatrizCurricular2 }
     *     
     */
    public ArrayOfWsMatrizCurricular2 getGetMatrizCurricular2Result() {
        return getMatrizCurricular2Result;
    }

    /**
     * Define o valor da propriedade getMatrizCurricular2Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsMatrizCurricular2 }
     *     
     */
    public void setGetMatrizCurricular2Result(ArrayOfWsMatrizCurricular2 value) {
        this.getMatrizCurricular2Result = value;
    }

}
