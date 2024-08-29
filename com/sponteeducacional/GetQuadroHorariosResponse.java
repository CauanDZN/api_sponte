
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
 *         &lt;element name="GetQuadroHorariosResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsQuadroHorarios" minOccurs="0"/&gt;
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
    "getQuadroHorariosResult"
})
@XmlRootElement(name = "GetQuadroHorariosResponse")
public class GetQuadroHorariosResponse {

    @XmlElement(name = "GetQuadroHorariosResult")
    protected ArrayOfWsQuadroHorarios getQuadroHorariosResult;

    /**
     * Obtém o valor da propriedade getQuadroHorariosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsQuadroHorarios }
     *     
     */
    public ArrayOfWsQuadroHorarios getGetQuadroHorariosResult() {
        return getQuadroHorariosResult;
    }

    /**
     * Define o valor da propriedade getQuadroHorariosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsQuadroHorarios }
     *     
     */
    public void setGetQuadroHorariosResult(ArrayOfWsQuadroHorarios value) {
        this.getQuadroHorariosResult = value;
    }

}
