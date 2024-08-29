
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
 *         &lt;element name="GetDisciplinaDetalhadoResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsDisciplinaDetalhada" minOccurs="0"/&gt;
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
    "getDisciplinaDetalhadoResult"
})
@XmlRootElement(name = "GetDisciplinaDetalhadoResponse")
public class GetDisciplinaDetalhadoResponse {

    @XmlElement(name = "GetDisciplinaDetalhadoResult")
    protected ArrayOfWsDisciplinaDetalhada getDisciplinaDetalhadoResult;

    /**
     * Obtém o valor da propriedade getDisciplinaDetalhadoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsDisciplinaDetalhada }
     *     
     */
    public ArrayOfWsDisciplinaDetalhada getGetDisciplinaDetalhadoResult() {
        return getDisciplinaDetalhadoResult;
    }

    /**
     * Define o valor da propriedade getDisciplinaDetalhadoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsDisciplinaDetalhada }
     *     
     */
    public void setGetDisciplinaDetalhadoResult(ArrayOfWsDisciplinaDetalhada value) {
        this.getDisciplinaDetalhadoResult = value;
    }

}
