
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
 *         &lt;element name="GetCodigoTurmaResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsCodigoTurma" minOccurs="0"/&gt;
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
    "getCodigoTurmaResult"
})
@XmlRootElement(name = "GetCodigoTurmaResponse")
public class GetCodigoTurmaResponse {

    @XmlElement(name = "GetCodigoTurmaResult")
    protected ArrayOfWsCodigoTurma getCodigoTurmaResult;

    /**
     * Obtém o valor da propriedade getCodigoTurmaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsCodigoTurma }
     *     
     */
    public ArrayOfWsCodigoTurma getGetCodigoTurmaResult() {
        return getCodigoTurmaResult;
    }

    /**
     * Define o valor da propriedade getCodigoTurmaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsCodigoTurma }
     *     
     */
    public void setGetCodigoTurmaResult(ArrayOfWsCodigoTurma value) {
        this.getCodigoTurmaResult = value;
    }

}
