
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
 *         &lt;element name="GetSituacoesAlunosResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsSituacoesAlunos" minOccurs="0"/&gt;
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
    "getSituacoesAlunosResult"
})
@XmlRootElement(name = "GetSituacoesAlunosResponse")
public class GetSituacoesAlunosResponse {

    @XmlElement(name = "GetSituacoesAlunosResult")
    protected ArrayOfWsSituacoesAlunos getSituacoesAlunosResult;

    /**
     * Obtém o valor da propriedade getSituacoesAlunosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsSituacoesAlunos }
     *     
     */
    public ArrayOfWsSituacoesAlunos getGetSituacoesAlunosResult() {
        return getSituacoesAlunosResult;
    }

    /**
     * Define o valor da propriedade getSituacoesAlunosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsSituacoesAlunos }
     *     
     */
    public void setGetSituacoesAlunosResult(ArrayOfWsSituacoesAlunos value) {
        this.getSituacoesAlunosResult = value;
    }

}
