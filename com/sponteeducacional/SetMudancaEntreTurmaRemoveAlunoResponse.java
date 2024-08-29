
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
 *         &lt;element name="SetMudancaEntreTurmaRemoveAlunoResult" type="{http://api.sponteeducacional.net.br/}wsMudancaEntreTurmaRemoverAluno" minOccurs="0"/&gt;
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
    "setMudancaEntreTurmaRemoveAlunoResult"
})
@XmlRootElement(name = "SetMudancaEntreTurmaRemoveAlunoResponse")
public class SetMudancaEntreTurmaRemoveAlunoResponse {

    @XmlElement(name = "SetMudancaEntreTurmaRemoveAlunoResult")
    protected WsMudancaEntreTurmaRemoverAluno setMudancaEntreTurmaRemoveAlunoResult;

    /**
     * Obtém o valor da propriedade setMudancaEntreTurmaRemoveAlunoResult.
     * 
     * @return
     *     possible object is
     *     {@link WsMudancaEntreTurmaRemoverAluno }
     *     
     */
    public WsMudancaEntreTurmaRemoverAluno getSetMudancaEntreTurmaRemoveAlunoResult() {
        return setMudancaEntreTurmaRemoveAlunoResult;
    }

    /**
     * Define o valor da propriedade setMudancaEntreTurmaRemoveAlunoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WsMudancaEntreTurmaRemoverAluno }
     *     
     */
    public void setSetMudancaEntreTurmaRemoveAlunoResult(WsMudancaEntreTurmaRemoverAluno value) {
        this.setMudancaEntreTurmaRemoveAlunoResult = value;
    }

}
