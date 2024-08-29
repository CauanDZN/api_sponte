
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
 *         &lt;element name="GetComunicadosAPPResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsComunicadoAPP" minOccurs="0"/&gt;
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
    "getComunicadosAPPResult"
})
@XmlRootElement(name = "GetComunicadosAPPResponse")
public class GetComunicadosAPPResponse {

    @XmlElement(name = "GetComunicadosAPPResult")
    protected ArrayOfWsComunicadoAPP getComunicadosAPPResult;

    /**
     * Obtém o valor da propriedade getComunicadosAPPResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsComunicadoAPP }
     *     
     */
    public ArrayOfWsComunicadoAPP getGetComunicadosAPPResult() {
        return getComunicadosAPPResult;
    }

    /**
     * Define o valor da propriedade getComunicadosAPPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsComunicadoAPP }
     *     
     */
    public void setGetComunicadosAPPResult(ArrayOfWsComunicadoAPP value) {
        this.getComunicadosAPPResult = value;
    }

}
