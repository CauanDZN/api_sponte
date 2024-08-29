
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
 *         &lt;element name="GetConfiguracaoAppResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsAppPortalNotas" minOccurs="0"/&gt;
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
    "getConfiguracaoAppResult"
})
@XmlRootElement(name = "GetConfiguracaoAppResponse")
public class GetConfiguracaoAppResponse {

    @XmlElement(name = "GetConfiguracaoAppResult")
    protected ArrayOfWsAppPortalNotas getConfiguracaoAppResult;

    /**
     * Obtém o valor da propriedade getConfiguracaoAppResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsAppPortalNotas }
     *     
     */
    public ArrayOfWsAppPortalNotas getGetConfiguracaoAppResult() {
        return getConfiguracaoAppResult;
    }

    /**
     * Define o valor da propriedade getConfiguracaoAppResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsAppPortalNotas }
     *     
     */
    public void setGetConfiguracaoAppResult(ArrayOfWsAppPortalNotas value) {
        this.getConfiguracaoAppResult = value;
    }

}
