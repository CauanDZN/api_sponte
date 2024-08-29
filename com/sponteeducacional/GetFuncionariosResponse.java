
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
 *         &lt;element name="GetFuncionariosResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsFuncionario" minOccurs="0"/&gt;
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
    "getFuncionariosResult"
})
@XmlRootElement(name = "GetFuncionariosResponse")
public class GetFuncionariosResponse {

    @XmlElement(name = "GetFuncionariosResult")
    protected ArrayOfWsFuncionario getFuncionariosResult;

    /**
     * Obtém o valor da propriedade getFuncionariosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsFuncionario }
     *     
     */
    public ArrayOfWsFuncionario getGetFuncionariosResult() {
        return getFuncionariosResult;
    }

    /**
     * Define o valor da propriedade getFuncionariosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsFuncionario }
     *     
     */
    public void setGetFuncionariosResult(ArrayOfWsFuncionario value) {
        this.getFuncionariosResult = value;
    }

}
