
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsFrequenciaTurma complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsFrequenciaTurma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TurmaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeTurma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Disciplinas" type="{http://api.sponteeducacional.net.br/}ArrayOfWsFrequenciaDisciplinas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsFrequenciaTurma", propOrder = {
    "retornoOperacao",
    "turmaID",
    "nomeTurma",
    "disciplinas"
})
public class WsFrequenciaTurma {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "TurmaID")
    protected int turmaID;
    @XmlElement(name = "NomeTurma")
    protected String nomeTurma;
    @XmlElement(name = "Disciplinas")
    protected ArrayOfWsFrequenciaDisciplinas disciplinas;

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
     * Obtém o valor da propriedade turmaID.
     * 
     */
    public int getTurmaID() {
        return turmaID;
    }

    /**
     * Define o valor da propriedade turmaID.
     * 
     */
    public void setTurmaID(int value) {
        this.turmaID = value;
    }

    /**
     * Obtém o valor da propriedade nomeTurma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTurma() {
        return nomeTurma;
    }

    /**
     * Define o valor da propriedade nomeTurma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTurma(String value) {
        this.nomeTurma = value;
    }

    /**
     * Obtém o valor da propriedade disciplinas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsFrequenciaDisciplinas }
     *     
     */
    public ArrayOfWsFrequenciaDisciplinas getDisciplinas() {
        return disciplinas;
    }

    /**
     * Define o valor da propriedade disciplinas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsFrequenciaDisciplinas }
     *     
     */
    public void setDisciplinas(ArrayOfWsFrequenciaDisciplinas value) {
        this.disciplinas = value;
    }

}
