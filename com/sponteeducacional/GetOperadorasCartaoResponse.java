
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
 *         &lt;element name="GetOperadorasCartaoResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsOperadoraCartao" minOccurs="0"/&gt;
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
    "getOperadorasCartaoResult"
})
@XmlRootElement(name = "GetOperadorasCartaoResponse")
public class GetOperadorasCartaoResponse {

    @XmlElement(name = "GetOperadorasCartaoResult")
    protected ArrayOfWsOperadoraCartao getOperadorasCartaoResult;

    /**
     * Obtém o valor da propriedade getOperadorasCartaoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsOperadoraCartao }
     *     
     */
    public ArrayOfWsOperadoraCartao getGetOperadorasCartaoResult() {
        return getOperadorasCartaoResult;
    }

    /**
     * Define o valor da propriedade getOperadorasCartaoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsOperadoraCartao }
     *     
     */
    public void setGetOperadorasCartaoResult(ArrayOfWsOperadoraCartao value) {
        this.getOperadorasCartaoResult = value;
    }

}
