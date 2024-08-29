
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsFrequenciaDisciplinas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsFrequenciaDisciplinas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Modulo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DisciplinaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeDisciplina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfessorID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeProfessor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroAulas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Alunos" type="{http://api.sponteeducacional.net.br/}ArrayOfWsFrequenciaAluno" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsFrequenciaDisciplinas", propOrder = {
    "modulo",
    "disciplinaID",
    "nomeDisciplina",
    "professorID",
    "nomeProfessor",
    "chTotal",
    "numeroAulas",
    "alunos"
})
public class WsFrequenciaDisciplinas {

    @XmlElement(name = "Modulo")
    protected int modulo;
    @XmlElement(name = "DisciplinaID")
    protected int disciplinaID;
    @XmlElement(name = "NomeDisciplina")
    protected String nomeDisciplina;
    @XmlElement(name = "ProfessorID")
    protected int professorID;
    @XmlElement(name = "NomeProfessor")
    protected String nomeProfessor;
    @XmlElement(name = "CHTotal")
    protected String chTotal;
    @XmlElement(name = "NumeroAulas")
    protected int numeroAulas;
    @XmlElement(name = "Alunos")
    protected ArrayOfWsFrequenciaAluno alunos;

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
     * Obtém o valor da propriedade chTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHTotal() {
        return chTotal;
    }

    /**
     * Define o valor da propriedade chTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHTotal(String value) {
        this.chTotal = value;
    }

    /**
     * Obtém o valor da propriedade numeroAulas.
     * 
     */
    public int getNumeroAulas() {
        return numeroAulas;
    }

    /**
     * Define o valor da propriedade numeroAulas.
     * 
     */
    public void setNumeroAulas(int value) {
        this.numeroAulas = value;
    }

    /**
     * Obtém o valor da propriedade alunos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsFrequenciaAluno }
     *     
     */
    public ArrayOfWsFrequenciaAluno getAlunos() {
        return alunos;
    }

    /**
     * Define o valor da propriedade alunos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsFrequenciaAluno }
     *     
     */
    public void setAlunos(ArrayOfWsFrequenciaAluno value) {
        this.alunos = value;
    }

}
