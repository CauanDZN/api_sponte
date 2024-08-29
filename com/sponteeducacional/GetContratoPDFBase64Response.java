
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
 *         &lt;element name="GetContratoPDFBase64Result" type="{http://api.sponteeducacional.net.br/}ArrayOfWsContratoPDF" minOccurs="0"/&gt;
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
    "getContratoPDFBase64Result"
})
@XmlRootElement(name = "GetContratoPDFBase64Response")
public class GetContratoPDFBase64Response {

    @XmlElement(name = "GetContratoPDFBase64Result")
    protected ArrayOfWsContratoPDF getContratoPDFBase64Result;

    /**
     * Obtém o valor da propriedade getContratoPDFBase64Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsContratoPDF }
     *     
     */
    public ArrayOfWsContratoPDF getGetContratoPDFBase64Result() {
        return getContratoPDFBase64Result;
    }

    /**
     * Define o valor da propriedade getContratoPDFBase64Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsContratoPDF }
     *     
     */
    public void setGetContratoPDFBase64Result(ArrayOfWsContratoPDF value) {
        this.getContratoPDFBase64Result = value;
    }

}
