
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
 *         &lt;element name="GetFinanceiroMapleResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsFinanceiro" minOccurs="0"/&gt;
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
    "getFinanceiroMapleResult"
})
@XmlRootElement(name = "GetFinanceiroMapleResponse")
public class GetFinanceiroMapleResponse {

    @XmlElement(name = "GetFinanceiroMapleResult")
    protected ArrayOfWsFinanceiro getFinanceiroMapleResult;

    /**
     * Obtém o valor da propriedade getFinanceiroMapleResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsFinanceiro }
     *     
     */
    public ArrayOfWsFinanceiro getGetFinanceiroMapleResult() {
        return getFinanceiroMapleResult;
    }

    /**
     * Define o valor da propriedade getFinanceiroMapleResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsFinanceiro }
     *     
     */
    public void setGetFinanceiroMapleResult(ArrayOfWsFinanceiro value) {
        this.getFinanceiroMapleResult = value;
    }

}
