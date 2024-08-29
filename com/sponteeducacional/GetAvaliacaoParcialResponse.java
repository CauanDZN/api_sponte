
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
 *         &lt;element name="GetAvaliacaoParcialResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsAvaliacoesParciais" minOccurs="0"/&gt;
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
    "getAvaliacaoParcialResult"
})
@XmlRootElement(name = "GetAvaliacaoParcialResponse")
public class GetAvaliacaoParcialResponse {

    @XmlElement(name = "GetAvaliacaoParcialResult")
    protected ArrayOfWsAvaliacoesParciais getAvaliacaoParcialResult;

    /**
     * Obtém o valor da propriedade getAvaliacaoParcialResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsAvaliacoesParciais }
     *     
     */
    public ArrayOfWsAvaliacoesParciais getGetAvaliacaoParcialResult() {
        return getAvaliacaoParcialResult;
    }

    /**
     * Define o valor da propriedade getAvaliacaoParcialResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsAvaliacoesParciais }
     *     
     */
    public void setGetAvaliacaoParcialResult(ArrayOfWsAvaliacoesParciais value) {
        this.getAvaliacaoParcialResult = value;
    }

}
