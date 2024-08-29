
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsDiarioAulasLivres complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsDiarioAulasLivres"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Aluno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CursoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Curso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisciplinaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Disciplina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Modulo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AulasLivreDiario" type="{http://api.sponteeducacional.net.br/}ArrayOfWsAulasLivreDiario" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsDiarioAulasLivres", propOrder = {
    "retornoOperacao",
    "alunoID",
    "aluno",
    "numeroContrato",
    "cursoID",
    "curso",
    "disciplinaID",
    "disciplina",
    "modulo",
    "aulasLivreDiario"
})
public class WsDiarioAulasLivres {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "Aluno")
    protected String aluno;
    @XmlElement(name = "NumeroContrato")
    protected String numeroContrato;
    @XmlElement(name = "CursoID")
    protected int cursoID;
    @XmlElement(name = "Curso")
    protected String curso;
    @XmlElement(name = "DisciplinaID")
    protected int disciplinaID;
    @XmlElement(name = "Disciplina")
    protected String disciplina;
    @XmlElement(name = "Modulo")
    protected int modulo;
    @XmlElement(name = "AulasLivreDiario")
    protected ArrayOfWsAulasLivreDiario aulasLivreDiario;

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
     * Obtém o valor da propriedade alunoID.
     * 
     */
    public int getAlunoID() {
        return alunoID;
    }

    /**
     * Define o valor da propriedade alunoID.
     * 
     */
    public void setAlunoID(int value) {
        this.alunoID = value;
    }

    /**
     * Obtém o valor da propriedade aluno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAluno() {
        return aluno;
    }

    /**
     * Define o valor da propriedade aluno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAluno(String value) {
        this.aluno = value;
    }

    /**
     * Obtém o valor da propriedade numeroContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Define o valor da propriedade numeroContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroContrato(String value) {
        this.numeroContrato = value;
    }

    /**
     * Obtém o valor da propriedade cursoID.
     * 
     */
    public int getCursoID() {
        return cursoID;
    }

    /**
     * Define o valor da propriedade cursoID.
     * 
     */
    public void setCursoID(int value) {
        this.cursoID = value;
    }

    /**
     * Obtém o valor da propriedade curso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Define o valor da propriedade curso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurso(String value) {
        this.curso = value;
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
     * Obtém o valor da propriedade aulasLivreDiario.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsAulasLivreDiario }
     *     
     */
    public ArrayOfWsAulasLivreDiario getAulasLivreDiario() {
        return aulasLivreDiario;
    }

    /**
     * Define o valor da propriedade aulasLivreDiario.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsAulasLivreDiario }
     *     
     */
    public void setAulasLivreDiario(ArrayOfWsAulasLivreDiario value) {
        this.aulasLivreDiario = value;
    }

}
