
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsAulasLivresAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsAulasLivresAluno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AulaLivreID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DataAula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CursoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisciplinaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeDisciplina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfessorID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeProfessor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sala" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAulasLivresAluno", propOrder = {
    "aulaLivreID",
    "dataAula",
    "horarioInicial",
    "horarioFinal",
    "cursoID",
    "nomeCurso",
    "disciplinaID",
    "nomeDisciplina",
    "professorID",
    "nomeProfessor",
    "sala"
})
public class WsAulasLivresAluno {

    @XmlElement(name = "AulaLivreID")
    protected int aulaLivreID;
    @XmlElement(name = "DataAula")
    protected String dataAula;
    @XmlElement(name = "HorarioInicial")
    protected String horarioInicial;
    @XmlElement(name = "HorarioFinal")
    protected String horarioFinal;
    @XmlElement(name = "CursoID")
    protected int cursoID;
    @XmlElement(name = "NomeCurso")
    protected String nomeCurso;
    @XmlElement(name = "DisciplinaID")
    protected int disciplinaID;
    @XmlElement(name = "NomeDisciplina")
    protected String nomeDisciplina;
    @XmlElement(name = "ProfessorID")
    protected int professorID;
    @XmlElement(name = "NomeProfessor")
    protected String nomeProfessor;
    @XmlElement(name = "Sala")
    protected String sala;

    /**
     * Obtém o valor da propriedade aulaLivreID.
     * 
     */
    public int getAulaLivreID() {
        return aulaLivreID;
    }

    /**
     * Define o valor da propriedade aulaLivreID.
     * 
     */
    public void setAulaLivreID(int value) {
        this.aulaLivreID = value;
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
     * Obtém o valor da propriedade nomeCurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCurso() {
        return nomeCurso;
    }

    /**
     * Define o valor da propriedade nomeCurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCurso(String value) {
        this.nomeCurso = value;
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
     * Obtém o valor da propriedade nomeDisciplina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * Define o valor da propriedade nomeDisciplina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeDisciplina(String value) {
        this.nomeDisciplina = value;
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
     * Obtém o valor da propriedade nomeProfessor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    /**
     * Define o valor da propriedade nomeProfessor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProfessor(String value) {
        this.nomeProfessor = value;
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

}
