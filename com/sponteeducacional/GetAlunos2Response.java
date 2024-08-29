
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
 *         &lt;element name="GetAlunos2Result" type="{http://api.sponteeducacional.net.br/}ArrayOfWsAluno" minOccurs="0"/&gt;
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
    "getAlunos2Result"
})
@XmlRootElement(name = "GetAlunos2Response")
public class GetAlunos2Response {

    @XmlElement(name = "GetAlunos2Result")
    protected ArrayOfWsAluno getAlunos2Result;

    /**
     * Obtém o valor da propriedade getAlunos2Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsAluno }
     *     
     */
    public ArrayOfWsAluno getGetAlunos2Result() {
        return getAlunos2Result;
    }

    /**
     * Define o valor da propriedade getAlunos2Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsAluno }
     *     
     */
    public void setGetAlunos2Result(ArrayOfWsAluno value) {
        this.getAlunos2Result = value;
    }

}
