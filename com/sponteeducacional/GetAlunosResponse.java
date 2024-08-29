
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
 *         &lt;element name="GetAlunosResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsAluno" minOccurs="0"/&gt;
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
    "getAlunosResult"
})
@XmlRootElement(name = "GetAlunosResponse")
public class GetAlunosResponse {

    @XmlElement(name = "GetAlunosResult")
    protected ArrayOfWsAluno getAlunosResult;

    /**
     * Obtém o valor da propriedade getAlunosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsAluno }
     *     
     */
    public ArrayOfWsAluno getGetAlunosResult() {
        return getAlunosResult;
    }

    /**
     * Define o valor da propriedade getAlunosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsAluno }
     *     
     */
    public void setGetAlunosResult(ArrayOfWsAluno value) {
        this.getAlunosResult = value;
    }

}
