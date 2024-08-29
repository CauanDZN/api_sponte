
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
 *         &lt;element name="GetAtendimentosResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsAtendimentos" minOccurs="0"/&gt;
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
    "getAtendimentosResult"
})
@XmlRootElement(name = "GetAtendimentosResponse")
public class GetAtendimentosResponse {

    @XmlElement(name = "GetAtendimentosResult")
    protected ArrayOfWsAtendimentos getAtendimentosResult;

    /**
     * Obtém o valor da propriedade getAtendimentosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsAtendimentos }
     *     
     */
    public ArrayOfWsAtendimentos getGetAtendimentosResult() {
        return getAtendimentosResult;
    }

    /**
     * Define o valor da propriedade getAtendimentosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsAtendimentos }
     *     
     */
    public void setGetAtendimentosResult(ArrayOfWsAtendimentos value) {
        this.getAtendimentosResult = value;
    }

}
