
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsQuadroHorarios complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsQuadroHorarios"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuadroHorariosID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TurmaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Turma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfessorID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Professor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisciplinaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Disciplina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sala" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiaSemana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroAula" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HorarioInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Modulo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumeroAulaDividida" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DataAula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsQuadroHorarios", propOrder = {
    "retornoOperacao",
    "quadroHorariosID",
    "turmaID",
    "turma",
    "professorID",
    "professor",
    "disciplinaID",
    "disciplina",
    "sala",
    "diaSemana",
    "numeroAula",
    "horarioInicial",
    "horarioFinal",
    "modulo",
    "numeroAulaDividida",
    "dataAula"
})
public class WsQuadroHorarios {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "QuadroHorariosID")
    protected int quadroHorariosID;
    @XmlElement(name = "TurmaID")
    protected int turmaID;
    @XmlElement(name = "Turma")
    protected String turma;
    @XmlElement(name = "ProfessorID")
    protected int professorID;
    @XmlElement(name = "Professor")
    protected String professor;
    @XmlElement(name = "DisciplinaID")
    protected int disciplinaID;
    @XmlElement(name = "Disciplina")
    protected String disciplina;
    @XmlElement(name = "Sala")
    protected String sala;
    @XmlElement(name = "DiaSemana")
    protected String diaSemana;
    @XmlElement(name = "NumeroAula")
    protected int numeroAula;
    @XmlElement(name = "HorarioInicial")
    protected String horarioInicial;
    @XmlElement(name = "HorarioFinal")
    protected String horarioFinal;
    @XmlElement(name = "Modulo")
    protected int modulo;
    @XmlElement(name = "NumeroAulaDividida")
    protected int numeroAulaDividida;
    @XmlElement(name = "DataAula")
    protected String dataAula;

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
     * Obtém o valor da propriedade quadroHorariosID.
     * 
     */
    public int getQuadroHorariosID() {
        return quadroHorariosID;
    }

    /**
     * Define o valor da propriedade quadroHorariosID.
     * 
     */
    public void setQuadroHorariosID(int value) {
        this.quadroHorariosID = value;
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
     * Obtém o valor da propriedade professorID.
     * 
     */
    public int getProfessorID() {
        return professorID;
    }

    /**
     * Define o valor da propriedade professorID.
     * 
     */
    public void setProfessorID(int value) {
        this.professorID = value;
    }

    /**
     * Obtém o valor da propriedade professor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessor() {
        return professor;
    }

    /**
     * Define o valor da propriedade professor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessor(String value) {
        this.professor = value;
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
     * Obtém o valor da propriedade sala.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSala() {
        return sala;
    }

    /**
     * Define o valor da propriedade sala.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSala(String value) {
        this.sala = value;
    }

    /**
     * Obtém o valor da propriedade diaSemana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiaSemana() {
        return diaSemana;
    }

    /**
     * Define o valor da propriedade diaSemana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiaSemana(String value) {
        this.diaSemana = value;
    }

    /**
     * Obtém o valor da propriedade numeroAula.
     * 
     */
    public int getNumeroAula() {
        return numeroAula;
    }

    /**
     * Define o valor da propriedade numeroAula.
     * 
     */
    public void setNumeroAula(int value) {
        this.numeroAula = value;
    }

    /**
     * Obtém o valor da propriedade horarioInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorarioInicial() {
        return horarioInicial;
    }

    /**
     * Define o valor da propriedade horarioInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorarioInicial(String value) {
        this.horarioInicial = value;
    }

    /**
     * Obtém o valor da propriedade horarioFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorarioFinal() {
        return horarioFinal;
    }

    /**
     * Define o valor da propriedade horarioFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorarioFinal(String value) {
        this.horarioFinal = value;
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
     * Obtém o valor da propriedade numeroAulaDividida.
     * 
     */
    public int getNumeroAulaDividida() {
        return numeroAulaDividida;
    }

    /**
     * Define o valor da propriedade numeroAulaDividida.
     * 
     */
    public void setNumeroAulaDividida(int value) {
        this.numeroAulaDividida = value;
    }

    /**
     * Obtém o valor da propriedade dataAula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAula() {
        return dataAula;
    }

    /**
     * Define o valor da propriedade dataAula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAula(String value) {
        this.dataAula = value;
    }

}
