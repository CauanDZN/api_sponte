
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
 *         &lt;element name="GetClientesResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsCliente" minOccurs="0"/&gt;
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
    "getClientesResult"
})
@XmlRootElement(name = "GetClientesResponse")
public class GetClientesResponse {

    @XmlElement(name = "GetClientesResult")
    protected ArrayOfWsCliente getClientesResult;

    /**
     * Obtém o valor da propriedade getClientesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsCliente }
     *     
     */
    public ArrayOfWsCliente getGetClientesResult() {
        return getClientesResult;
    }

    /**
     * Define o valor da propriedade getClientesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsCliente }
     *     
     */
    public void setGetClientesResult(ArrayOfWsCliente value) {
        this.getClientesResult = value;
    }

}
