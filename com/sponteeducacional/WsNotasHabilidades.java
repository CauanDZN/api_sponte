
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsNotasHabilidades complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsNotasHabilidades"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CursoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AnoLetivo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TurmaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeAluno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListaCompetencias" type="{http://api.sponteeducacional.net.br/}ArrayOfCompetenciasAPI" minOccurs="0"/&gt;
 *         &lt;element name="NomeCompetencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComentarioPeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsNotasHabilidades", propOrder = {
    "retornoOperacao",
    "cursoID",
    "anoLetivo",
    "periodo",
    "turmaID",
    "alunoID",
    "nomeAluno",
    "listaCompetencias",
    "nomeCompetencia",
    "comentarioPeriodo"
})
public class WsNotasHabilidades {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "CursoID")
    protected int cursoID;
    @XmlElement(name = "AnoLetivo")
    protected int anoLetivo;
    @XmlElement(name = "Periodo")
    protected int periodo;
    @XmlElement(name = "TurmaID")
    protected int turmaID;
    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "NomeAluno")
    protected String nomeAluno;
    @XmlElement(name = "ListaCompetencias")
    protected ArrayOfCompetenciasAPI listaCompetencias;
    @XmlElement(name = "NomeCompetencia")
    protected String nomeCompetencia;
    @XmlElement(name = "ComentarioPeriodo")
    protected String comentarioPeriodo;

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
     * Obtém o valor da propriedade anoLetivo.
     * 
     */
    public int getAnoLetivo() {
        return anoLetivo;
    }

    /**
     * Define o valor da propriedade anoLetivo.
     * 
     */
    public void setAnoLetivo(int value) {
        this.anoLetivo = value;
    }

    /**
     * Obtém o valor da propriedade periodo.
     * 
     */
    public int getPeriodo() {
        return periodo;
    }

    /**
     * Define o valor da propriedade periodo.
     * 
     */
    public void setPeriodo(int value) {
        this.periodo = value;
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
     * Obtém o valor da propriedade nomeAluno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * Define o valor da propriedade nomeAluno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAluno(String value) {
        this.nomeAluno = value;
    }

    /**
     * Obtém o valor da propriedade listaCompetencias.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompetenciasAPI }
     *     
     */
    public ArrayOfCompetenciasAPI getListaCompetencias() {
        return listaCompetencias;
    }

    /**
     * Define o valor da propriedade listaCompetencias.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompetenciasAPI }
     *     
     */
    public void setListaCompetencias(ArrayOfCompetenciasAPI value) {
        this.listaCompetencias = value;
    }

    /**
     * Obtém o valor da propriedade nomeCompetencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCompetencia() {
        return nomeCompetencia;
    }

    /**
     * Define o valor da propriedade nomeCompetencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCompetencia(String value) {
        this.nomeCompetencia = value;
    }

    /**
     * Obtém o valor da propriedade comentarioPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarioPeriodo() {
        return comentarioPeriodo;
    }

    /**
     * Define o valor da propriedade comentarioPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarioPeriodo(String value) {
        this.comentarioPeriodo = value;
    }

}
