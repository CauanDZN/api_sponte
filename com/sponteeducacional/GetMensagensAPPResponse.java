
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
 *         &lt;element name="GetMensagensAPPResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsMensagensAPP" minOccurs="0"/&gt;
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
    "getMensagensAPPResult"
})
@XmlRootElement(name = "GetMensagensAPPResponse")
public class GetMensagensAPPResponse {

    @XmlElement(name = "GetMensagensAPPResult")
    protected ArrayOfWsMensagensAPP getMensagensAPPResult;

    /**
     * Obtém o valor da propriedade getMensagensAPPResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsMensagensAPP }
     *     
     */
    public ArrayOfWsMensagensAPP getGetMensagensAPPResult() {
        return getMensagensAPPResult;
    }

    /**
     * Define o valor da propriedade getMensagensAPPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsMensagensAPP }
     *     
     */
    public void setGetMensagensAPPResult(ArrayOfWsMensagensAPP value) {
        this.getMensagensAPPResult = value;
    }

}
