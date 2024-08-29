
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
 *         &lt;element name="GetMatriculasResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsMatricula" minOccurs="0"/&gt;
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
    "getMatriculasResult"
})
@XmlRootElement(name = "GetMatriculasResponse")
public class GetMatriculasResponse {

    @XmlElement(name = "GetMatriculasResult")
    protected ArrayOfWsMatricula getMatriculasResult;

    /**
     * Obtém o valor da propriedade getMatriculasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsMatricula }
     *     
     */
    public ArrayOfWsMatricula getGetMatriculasResult() {
        return getMatriculasResult;
    }

    /**
     * Define o valor da propriedade getMatriculasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsMatricula }
     *     
     */
    public void setGetMatriculasResult(ArrayOfWsMatricula value) {
        this.getMatriculasResult = value;
    }

}
