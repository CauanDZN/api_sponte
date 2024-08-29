
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
 *         &lt;element name="GetCursosResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsCurso" minOccurs="0"/&gt;
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
    "getCursosResult"
})
@XmlRootElement(name = "GetCursosResponse")
public class GetCursosResponse {

    @XmlElement(name = "GetCursosResult")
    protected ArrayOfWsCurso getCursosResult;

    /**
     * Obtém o valor da propriedade getCursosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsCurso }
     *     
     */
    public ArrayOfWsCurso getGetCursosResult() {
        return getCursosResult;
    }

    /**
     * Define o valor da propriedade getCursosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsCurso }
     *     
     */
    public void setGetCursosResult(ArrayOfWsCurso value) {
        this.getCursosResult = value;
    }

}
