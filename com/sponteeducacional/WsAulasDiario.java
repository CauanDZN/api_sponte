
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsAulasDiario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsAulasDiario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiarioClasseID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumeroAula" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DataAula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Semana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfessorID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Professor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Conteudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAulasDiario", propOrder = {
    "diarioClasseID",
    "numeroAula",
    "dataAula",
    "horarioInicial",
    "horarioFinal",
    "semana",
    "professorID",
    "professor",
    "conteudo",
    "situacao"
})
public class WsAulasDiario {

    @XmlElement(name = "DiarioClasseID")
    protected int diarioClasseID;
    @XmlElement(name = "NumeroAula")
    protected int numeroAula;
    @XmlElement(name = "DataAula")
    protected String dataAula;
    @XmlElement(name = "HorarioInicial")
    protected String horarioInicial;
    @XmlElement(name = "HorarioFinal")
    protected String horarioFinal;
    @XmlElement(name = "Semana")
    protected String semana;
    @XmlElement(name = "ProfessorID")
    protected int professorID;
    @XmlElement(name = "Professor")
    protected String professor;
    @XmlElement(name = "Conteudo")
    protected String conteudo;
    @XmlElement(name = "Situacao")
    protected String situacao;

    /**
     * Obtém o valor da propriedade diarioClasseID.
     * 
     */
    public int getDiarioClasseID() {
        return diarioClasseID;
    }

    /**
     * Define o valor da propriedade diarioClasseID.
     * 
     */
    public void setDiarioClasseID(int value) {
        this.diarioClasseID = value;
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
     * Obtém o valor da propriedade semana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemana() {
        return semana;
    }

    /**
     * Define o valor da propriedade semana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemana(String value) {
        this.semana = value;
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
     * Obtém o valor da propriedade conteudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * Define o valor da propriedade conteudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConteudo(String value) {
        this.conteudo = value;
    }

    /**
     * Obtém o valor da propriedade situacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * Define o valor da propriedade situacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacao(String value) {
        this.situacao = value;
    }

}
