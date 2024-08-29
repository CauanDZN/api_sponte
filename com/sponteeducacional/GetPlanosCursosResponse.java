
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
 *         &lt;element name="GetPlanosCursosResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsPlanoCurso" minOccurs="0"/&gt;
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
    "getPlanosCursosResult"
})
@XmlRootElement(name = "GetPlanosCursosResponse")
public class GetPlanosCursosResponse {

    @XmlElement(name = "GetPlanosCursosResult")
    protected ArrayOfWsPlanoCurso getPlanosCursosResult;

    /**
     * Obtém o valor da propriedade getPlanosCursosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsPlanoCurso }
     *     
     */
    public ArrayOfWsPlanoCurso getGetPlanosCursosResult() {
        return getPlanosCursosResult;
    }

    /**
     * Define o valor da propriedade getPlanosCursosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsPlanoCurso }
     *     
     */
    public void setGetPlanosCursosResult(ArrayOfWsPlanoCurso value) {
        this.getPlanosCursosResult = value;
    }

}
