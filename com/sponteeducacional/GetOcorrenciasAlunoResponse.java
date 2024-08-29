
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
 *         &lt;element name="GetOcorrenciasAlunoResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsOcorrencias" minOccurs="0"/&gt;
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
    "getOcorrenciasAlunoResult"
})
@XmlRootElement(name = "GetOcorrenciasAlunoResponse")
public class GetOcorrenciasAlunoResponse {

    @XmlElement(name = "GetOcorrenciasAlunoResult")
    protected ArrayOfWsOcorrencias getOcorrenciasAlunoResult;

    /**
     * Obtém o valor da propriedade getOcorrenciasAlunoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsOcorrencias }
     *     
     */
    public ArrayOfWsOcorrencias getGetOcorrenciasAlunoResult() {
        return getOcorrenciasAlunoResult;
    }

    /**
     * Define o valor da propriedade getOcorrenciasAlunoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsOcorrencias }
     *     
     */
    public void setGetOcorrenciasAlunoResult(ArrayOfWsOcorrencias value) {
        this.getOcorrenciasAlunoResult = value;
    }

}
