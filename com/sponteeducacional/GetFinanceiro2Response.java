
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
 *         &lt;element name="GetFinanceiro2Result" type="{http://api.sponteeducacional.net.br/}ArrayOfWsFinanceiro" minOccurs="0"/&gt;
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
    "getFinanceiro2Result"
})
@XmlRootElement(name = "GetFinanceiro2Response")
public class GetFinanceiro2Response {

    @XmlElement(name = "GetFinanceiro2Result")
    protected ArrayOfWsFinanceiro getFinanceiro2Result;

    /**
     * Obtém o valor da propriedade getFinanceiro2Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsFinanceiro }
     *     
     */
    public ArrayOfWsFinanceiro getGetFinanceiro2Result() {
        return getFinanceiro2Result;
    }

    /**
     * Define o valor da propriedade getFinanceiro2Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsFinanceiro }
     *     
     */
    public void setGetFinanceiro2Result(ArrayOfWsFinanceiro value) {
        this.getFinanceiro2Result = value;
    }

}
