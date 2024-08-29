
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsDiarioAulas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsDiarioAulas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TurmaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Turma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisciplinaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Disciplina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Modulo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AulasDiario" type="{http://api.sponteeducacional.net.br/}ArrayOfWsAulasDiario" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsDiarioAulas", propOrder = {
    "retornoOperacao",
    "turmaID",
    "turma",
    "disciplinaID",
    "disciplina",
    "modulo",
    "aulasDiario"
})
public class WsDiarioAulas {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "TurmaID")
    protected int turmaID;
    @XmlElement(name = "Turma")
    protected String turma;
    @XmlElement(name = "DisciplinaID")
    protected int disciplinaID;
    @XmlElement(name = "Disciplina")
    protected String disciplina;
    @XmlElement(name = "Modulo")
    protected int modulo;
    @XmlElement(name = "AulasDiario")
    protected ArrayOfWsAulasDiario aulasDiario;

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
     * Obtém o valor da propriedade turma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurma() {
        return turma;
    }

    /**
     * Define o valor da propriedade turma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurma(String value) {
        this.turma = value;
    }

    /**
     * Obtém o valor da propriedade disciplinaID.
     * 
     */
    public int getDisciplinaID() {
        return disciplinaID;
    }

    /**
     * Define o valor da propriedade disciplinaID.
     * 
     */
    public void setDisciplinaID(int value) {
        this.disciplinaID = value;
    }

    /**
     * Obtém o valor da propriedade disciplina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * Define o valor da propriedade disciplina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplina(String value) {
        this.disciplina = value;
    }

    /**
     * Obtém o valor da propriedade modulo.
     * 
     */
    public int getModulo() {
        return modulo;
    }

    /**
     * Define o valor da propriedade modulo.
     * 
     */
    public void setModulo(int value) {
        this.modulo = value;
    }

    /**
     * Obtém o valor da propriedade aulasDiario.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsAulasDiario }
     *     
     */
    public ArrayOfWsAulasDiario getAulasDiario() {
        return aulasDiario;
    }

    /**
     * Define o valor da propriedade aulasDiario.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsAulasDiario }
     *     
     */
    public void setAulasDiario(ArrayOfWsAulasDiario value) {
        this.aulasDiario = value;
    }

}
