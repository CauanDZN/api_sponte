
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
 *         &lt;element name="GetAlunosAlteradosResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsRetornoAlunosAlterados" minOccurs="0"/&gt;
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
    "getAlunosAlteradosResult"
})
@XmlRootElement(name = "GetAlunosAlteradosResponse")
public class GetAlunosAlteradosResponse {

    @XmlElement(name = "GetAlunosAlteradosResult")
    protected ArrayOfWsRetornoAlunosAlterados getAlunosAlteradosResult;

    /**
     * Obtém o valor da propriedade getAlunosAlteradosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsRetornoAlunosAlterados }
     *     
     */
    public ArrayOfWsRetornoAlunosAlterados getGetAlunosAlteradosResult() {
        return getAlunosAlteradosResult;
    }

    /**
     * Define o valor da propriedade getAlunosAlteradosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsRetornoAlunosAlterados }
     *     
     */
    public void setGetAlunosAlteradosResult(ArrayOfWsRetornoAlunosAlterados value) {
        this.getAlunosAlteradosResult = value;
    }

}
