
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
 *         &lt;element name="GetSituacoesAlunosTurmaResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsSituacoesAlunosTurma" minOccurs="0"/&gt;
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
    "getSituacoesAlunosTurmaResult"
})
@XmlRootElement(name = "GetSituacoesAlunosTurmaResponse")
public class GetSituacoesAlunosTurmaResponse {

    @XmlElement(name = "GetSituacoesAlunosTurmaResult")
    protected ArrayOfWsSituacoesAlunosTurma getSituacoesAlunosTurmaResult;

    /**
     * Obtém o valor da propriedade getSituacoesAlunosTurmaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsSituacoesAlunosTurma }
     *     
     */
    public ArrayOfWsSituacoesAlunosTurma getGetSituacoesAlunosTurmaResult() {
        return getSituacoesAlunosTurmaResult;
    }

    /**
     * Define o valor da propriedade getSituacoesAlunosTurmaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsSituacoesAlunosTurma }
     *     
     */
    public void setGetSituacoesAlunosTurmaResult(ArrayOfWsSituacoesAlunosTurma value) {
        this.getSituacoesAlunosTurmaResult = value;
    }

}
