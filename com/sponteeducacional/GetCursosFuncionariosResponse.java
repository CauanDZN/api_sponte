
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
 *         &lt;element name="GetCursosFuncionariosResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsCurso" minOccurs="0"/&gt;
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
    "getCursosFuncionariosResult"
})
@XmlRootElement(name = "GetCursosFuncionariosResponse")
public class GetCursosFuncionariosResponse {

    @XmlElement(name = "GetCursosFuncionariosResult")
    protected ArrayOfWsCurso getCursosFuncionariosResult;

    /**
     * Obtém o valor da propriedade getCursosFuncionariosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsCurso }
     *     
     */
    public ArrayOfWsCurso getGetCursosFuncionariosResult() {
        return getCursosFuncionariosResult;
    }

    /**
     * Define o valor da propriedade getCursosFuncionariosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsCurso }
     *     
     */
    public void setGetCursosFuncionariosResult(ArrayOfWsCurso value) {
        this.getCursosFuncionariosResult = value;
    }

}
