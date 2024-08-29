
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
 *         &lt;element name="GetMatrizCurricularResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsMatrizCurricular" minOccurs="0"/&gt;
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
    "getMatrizCurricularResult"
})
@XmlRootElement(name = "GetMatrizCurricularResponse")
public class GetMatrizCurricularResponse {

    @XmlElement(name = "GetMatrizCurricularResult")
    protected ArrayOfWsMatrizCurricular getMatrizCurricularResult;

    /**
     * Obtém o valor da propriedade getMatrizCurricularResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsMatrizCurricular }
     *     
     */
    public ArrayOfWsMatrizCurricular getGetMatrizCurricularResult() {
        return getMatrizCurricularResult;
    }

    /**
     * Define o valor da propriedade getMatrizCurricularResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsMatrizCurricular }
     *     
     */
    public void setGetMatrizCurricularResult(ArrayOfWsMatrizCurricular value) {
        this.getMatrizCurricularResult = value;
    }

}
