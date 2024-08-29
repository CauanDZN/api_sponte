
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
 *         &lt;element name="GetFormasCobrancasResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsFormasCobrancas" minOccurs="0"/&gt;
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
    "getFormasCobrancasResult"
})
@XmlRootElement(name = "GetFormasCobrancasResponse")
public class GetFormasCobrancasResponse {

    @XmlElement(name = "GetFormasCobrancasResult")
    protected ArrayOfWsFormasCobrancas getFormasCobrancasResult;

    /**
     * Obtém o valor da propriedade getFormasCobrancasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsFormasCobrancas }
     *     
     */
    public ArrayOfWsFormasCobrancas getGetFormasCobrancasResult() {
        return getFormasCobrancasResult;
    }

    /**
     * Define o valor da propriedade getFormasCobrancasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsFormasCobrancas }
     *     
     */
    public void setGetFormasCobrancasResult(ArrayOfWsFormasCobrancas value) {
        this.getFormasCobrancasResult = value;
    }

}
