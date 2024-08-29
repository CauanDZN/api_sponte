
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
 *         &lt;element name="GetHorariosAulasResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsHorariosAula" minOccurs="0"/&gt;
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
    "getHorariosAulasResult"
})
@XmlRootElement(name = "GetHorariosAulasResponse")
public class GetHorariosAulasResponse {

    @XmlElement(name = "GetHorariosAulasResult")
    protected ArrayOfWsHorariosAula getHorariosAulasResult;

    /**
     * Obtém o valor da propriedade getHorariosAulasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsHorariosAula }
     *     
     */
    public ArrayOfWsHorariosAula getGetHorariosAulasResult() {
        return getHorariosAulasResult;
    }

    /**
     * Define o valor da propriedade getHorariosAulasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsHorariosAula }
     *     
     */
    public void setGetHorariosAulasResult(ArrayOfWsHorariosAula value) {
        this.getHorariosAulasResult = value;
    }

}
