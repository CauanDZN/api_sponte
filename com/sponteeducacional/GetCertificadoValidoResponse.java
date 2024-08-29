
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
 *         &lt;element name="GetCertificadoValidoResult" type="{http://api.sponteeducacional.net.br/}WSCertificado" minOccurs="0"/&gt;
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
    "getCertificadoValidoResult"
})
@XmlRootElement(name = "GetCertificadoValidoResponse")
public class GetCertificadoValidoResponse {

    @XmlElement(name = "GetCertificadoValidoResult")
    protected WSCertificado getCertificadoValidoResult;

    /**
     * Obtém o valor da propriedade getCertificadoValidoResult.
     * 
     * @return
     *     possible object is
     *     {@link WSCertificado }
     *     
     */
    public WSCertificado getGetCertificadoValidoResult() {
        return getCertificadoValidoResult;
    }

    /**
     * Define o valor da propriedade getCertificadoValidoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCertificado }
     *     
     */
    public void setGetCertificadoValidoResult(WSCertificado value) {
        this.getCertificadoValidoResult = value;
    }

}
