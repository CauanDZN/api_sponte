
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsSituacoesAlunosTurma complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsSituacoesAlunosTurma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SituacoesAlunosTurma" type="{http://api.sponteeducacional.net.br/}ArrayOfSituacoesAlunosTurma" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsSituacoesAlunosTurma", propOrder = {
    "retornoOperacao",
    "situacoesAlunosTurma"
})
public class WsSituacoesAlunosTurma {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "SituacoesAlunosTurma")
    protected ArrayOfSituacoesAlunosTurma situacoesAlunosTurma;

    /**
     * Obtém o valor da propriedade retornoOperacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetornoOperacao() {
        return retornoOperacao;
    }

    /**
     * Define o valor da propriedade retornoOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetornoOperacao(String value) {
        this.retornoOperacao = value;
    }

    /**
     * Obtém o valor da propriedade situacoesAlunosTurma.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSituacoesAlunosTurma }
     *     
     */
    public ArrayOfSituacoesAlunosTurma getSituacoesAlunosTurma() {
        return situacoesAlunosTurma;
    }

    /**
     * Define o valor da propriedade situacoesAlunosTurma.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSituacoesAlunosTurma }
     *     
     */
    public void setSituacoesAlunosTurma(ArrayOfSituacoesAlunosTurma value) {
        this.situacoesAlunosTurma = value;
    }

}
