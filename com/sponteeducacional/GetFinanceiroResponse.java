
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
 *         &lt;element name="GetFinanceiroResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsFinanceiro" minOccurs="0"/&gt;
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
    "getFinanceiroResult"
})
@XmlRootElement(name = "GetFinanceiroResponse")
public class GetFinanceiroResponse {

    @XmlElement(name = "GetFinanceiroResult")
    protected ArrayOfWsFinanceiro getFinanceiroResult;

    /**
     * Obtém o valor da propriedade getFinanceiroResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsFinanceiro }
     *     
     */
    public ArrayOfWsFinanceiro getGetFinanceiroResult() {
        return getFinanceiroResult;
    }

    /**
     * Define o valor da propriedade getFinanceiroResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsFinanceiro }
     *     
     */
    public void setGetFinanceiroResult(ArrayOfWsFinanceiro value) {
        this.getFinanceiroResult = value;
    }

}
