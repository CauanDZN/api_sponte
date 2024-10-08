
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
 *         &lt;element name="GetComunicadoAPPResult" type="{http://api.sponteeducacional.net.br/}wsComunicadoAPP" minOccurs="0"/&gt;
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
    "getComunicadoAPPResult"
})
@XmlRootElement(name = "GetComunicadoAPPResponse")
public class GetComunicadoAPPResponse {

    @XmlElement(name = "GetComunicadoAPPResult")
    protected WsComunicadoAPP getComunicadoAPPResult;

    /**
     * Obtém o valor da propriedade getComunicadoAPPResult.
     * 
     * @return
     *     possible object is
     *     {@link WsComunicadoAPP }
     *     
     */
    public WsComunicadoAPP getGetComunicadoAPPResult() {
        return getComunicadoAPPResult;
    }

    /**
     * Define o valor da propriedade getComunicadoAPPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WsComunicadoAPP }
     *     
     */
    public void setGetComunicadoAPPResult(WsComunicadoAPP value) {
        this.getComunicadoAPPResult = value;
    }

}
