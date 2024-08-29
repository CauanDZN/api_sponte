
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
 *         &lt;element name="GetCategoriasResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsCategorias" minOccurs="0"/&gt;
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
    "getCategoriasResult"
})
@XmlRootElement(name = "GetCategoriasResponse")
public class GetCategoriasResponse {

    @XmlElement(name = "GetCategoriasResult")
    protected ArrayOfWsCategorias getCategoriasResult;

    /**
     * Obtém o valor da propriedade getCategoriasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsCategorias }
     *     
     */
    public ArrayOfWsCategorias getGetCategoriasResult() {
        return getCategoriasResult;
    }

    /**
     * Define o valor da propriedade getCategoriasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsCategorias }
     *     
     */
    public void setGetCategoriasResult(ArrayOfWsCategorias value) {
        this.getCategoriasResult = value;
    }

}
