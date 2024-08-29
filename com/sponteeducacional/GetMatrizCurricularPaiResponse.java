
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
 *         &lt;element name="GetMatrizCurricularPaiResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsMatrizCurricular" minOccurs="0"/&gt;
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
    "getMatrizCurricularPaiResult"
})
@XmlRootElement(name = "GetMatrizCurricularPaiResponse")
public class GetMatrizCurricularPaiResponse {

    @XmlElement(name = "GetMatrizCurricularPaiResult")
    protected ArrayOfWsMatrizCurricular getMatrizCurricularPaiResult;

    /**
     * Obtém o valor da propriedade getMatrizCurricularPaiResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsMatrizCurricular }
     *     
     */
    public ArrayOfWsMatrizCurricular getGetMatrizCurricularPaiResult() {
        return getMatrizCurricularPaiResult;
    }

    /**
     * Define o valor da propriedade getMatrizCurricularPaiResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsMatrizCurricular }
     *     
     */
    public void setGetMatrizCurricularPaiResult(ArrayOfWsMatrizCurricular value) {
        this.getMatrizCurricularPaiResult = value;
    }

}
