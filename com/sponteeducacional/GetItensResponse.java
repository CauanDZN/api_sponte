
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
 *         &lt;element name="GetItensResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsItens" minOccurs="0"/&gt;
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
    "getItensResult"
})
@XmlRootElement(name = "GetItensResponse")
public class GetItensResponse {

    @XmlElement(name = "GetItensResult")
    protected ArrayOfWsItens getItensResult;

    /**
     * Obtém o valor da propriedade getItensResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsItens }
     *     
     */
    public ArrayOfWsItens getGetItensResult() {
        return getItensResult;
    }

    /**
     * Define o valor da propriedade getItensResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsItens }
     *     
     */
    public void setGetItensResult(ArrayOfWsItens value) {
        this.getItensResult = value;
    }

}
