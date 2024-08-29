
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
 *         &lt;element name="UpdateImageAppResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsFotoApp" minOccurs="0"/&gt;
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
    "updateImageAppResult"
})
@XmlRootElement(name = "UpdateImageAppResponse")
public class UpdateImageAppResponse {

    @XmlElement(name = "UpdateImageAppResult")
    protected ArrayOfWsFotoApp updateImageAppResult;

    /**
     * Obtém o valor da propriedade updateImageAppResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsFotoApp }
     *     
     */
    public ArrayOfWsFotoApp getUpdateImageAppResult() {
        return updateImageAppResult;
    }

    /**
     * Define o valor da propriedade updateImageAppResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsFotoApp }
     *     
     */
    public void setUpdateImageAppResult(ArrayOfWsFotoApp value) {
        this.updateImageAppResult = value;
    }

}
