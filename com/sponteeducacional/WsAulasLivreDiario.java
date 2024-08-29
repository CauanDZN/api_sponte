
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsAulasLivreDiario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsAulasLivreDiario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AulaLivreID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataAula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfessorID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Professor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Sala" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AulaTemTarefa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DadosdaAula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoDeAula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Conteudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAulasLivreDiario", propOrder = {
    "aulaLivreID",
    "numeroContrato",
    "dataAula",
    "horarioInicial",
    "horarioFinal",
    "professorID",
    "professor",
    "salaID",
    "sala",
    "situacao",
    "aulaTemTarefa",
    "dadosdaAula",
    "tipoDeAula",
    "conteudo",
    "observacoes"
})
public class WsAulasLivreDiario {

    @XmlElement(name = "AulaLivreID")
    protected int aulaLivreID;
    @XmlElement(name = "NumeroContrato")
    protected String numeroContrato;
    @XmlElement(name = "DataAula")
    protected String dataAula;
    @XmlElement(name = "HorarioInicial")
    protected String horarioInicial;
    @XmlElement(name = "HorarioFinal")
    protected String horarioFinal;
    @XmlElement(name = "ProfessorID")
    protected int professorID;
    @XmlElement(name = "Professor")
    protected String professor;
    @XmlElement(name = "SalaID")
    protected int salaID;
    @XmlElement(name = "Sala")
    protected String sala;
    @XmlElement(name = "Situacao")
    protected String situacao;
    @XmlElement(name = "AulaTemTarefa")
    protected String aulaTemTarefa;
    @XmlElement(name = "DadosdaAula")
    protected String dadosdaAula;
    @XmlElement(name = "TipoDeAula")
    protected String tipoDeAula;
    @XmlElement(name = "Conteudo")
    protected String conteudo;
    @XmlElement(name = "Observacoes")
    protected String observacoes;

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
     * Obtém o valor da propriedade salaID.
     * 
     */
    public int getSalaID() {
        return salaID;
    }

    /**
     * Define o valor da propriedade salaID.
     * 
     */
    public void setSalaID(int value) {
        this.salaID = value;
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

    /**
     * Obtém o valor da propriedade aulaTemTarefa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAulaTemTarefa() {
        return aulaTemTarefa;
    }

    /**
     * Define o valor da propriedade aulaTemTarefa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAulaTemTarefa(String value) {
        this.aulaTemTarefa = value;
    }

    /**
     * Obtém o valor da propriedade dadosdaAula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDadosdaAula() {
        return dadosdaAula;
    }

    /**
     * Define o valor da propriedade dadosdaAula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDadosdaAula(String value) {
        this.dadosdaAula = value;
    }

    /**
     * Obtém o valor da propriedade tipoDeAula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeAula() {
        return tipoDeAula;
    }

    /**
     * Define o valor da propriedade tipoDeAula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeAula(String value) {
        this.tipoDeAula = value;
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
     * Obtém o valor da propriedade observacoes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * Define o valor da propriedade observacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacoes(String value) {
        this.observacoes = value;
    }

}
