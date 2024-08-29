
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsAvaliacoesParciais complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsAvaliacoesParciais"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvaliacaoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeAvaliacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Peso" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Ordem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TurmaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeTurma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisciplinaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeDisciplina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomePeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormulaCalculoLivre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Grupo" type="{http://api.sponteeducacional.net.br/}wsGrupoAvaliacao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAvaliacoesParciais", propOrder = {
    "retornoOperacao",
    "avaliacaoID",
    "nomeAvaliacao",
    "peso",
    "ordem",
    "turmaID",
    "nomeTurma",
    "disciplinaID",
    "nomeDisciplina",
    "periodo",
    "nomePeriodo",
    "formulaCalculoLivre",
    "grupo"
})
public class WsAvaliacoesParciais {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "AvaliacaoID")
    protected int avaliacaoID;
    @XmlElement(name = "NomeAvaliacao")
    protected String nomeAvaliacao;
    @XmlElement(name = "Peso")
    protected double peso;
    @XmlElement(name = "Ordem")
    protected int ordem;
    @XmlElement(name = "TurmaID")
    protected int turmaID;
    @XmlElement(name = "NomeTurma")
    protected String nomeTurma;
    @XmlElement(name = "DisciplinaID")
    protected int disciplinaID;
    @XmlElement(name = "NomeDisciplina")
    protected String nomeDisciplina;
    @XmlElement(name = "Periodo")
    protected int periodo;
    @XmlElement(name = "NomePeriodo")
    protected String nomePeriodo;
    @XmlElement(name = "FormulaCalculoLivre")
    protected String formulaCalculoLivre;
    @XmlElement(name = "Grupo")
    protected WsGrupoAvaliacao grupo;

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
     * Obtém o valor da propriedade avaliacaoID.
     * 
     */
    public int getAvaliacaoID() {
        return avaliacaoID;
    }

    /**
     * Define o valor da propriedade avaliacaoID.
     * 
     */
    public void setAvaliacaoID(int value) {
        this.avaliacaoID = value;
    }

    /**
     * Obtém o valor da propriedade nomeAvaliacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAvaliacao() {
        return nomeAvaliacao;
    }

    /**
     * Define o valor da propriedade nomeAvaliacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAvaliacao(String value) {
        this.nomeAvaliacao = value;
    }

    /**
     * Obtém o valor da propriedade peso.
     * 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Define o valor da propriedade peso.
     * 
     */
    public void setPeso(double value) {
        this.peso = value;
    }

    /**
     * Obtém o valor da propriedade ordem.
     * 
     */
    public int getOrdem() {
        return ordem;
    }

    /**
     * Define o valor da propriedade ordem.
     * 
     */
    public void setOrdem(int value) {
        this.ordem = value;
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
     * Obtém o valor da propriedade nomePeriodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePeriodo() {
        return nomePeriodo;
    }

    /**
     * Define o valor da propriedade nomePeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePeriodo(String value) {
        this.nomePeriodo = value;
    }

    /**
     * Obtém o valor da propriedade formulaCalculoLivre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaCalculoLivre() {
        return formulaCalculoLivre;
    }

    /**
     * Define o valor da propriedade formulaCalculoLivre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaCalculoLivre(String value) {
        this.formulaCalculoLivre = value;
    }

    /**
     * Obtém o valor da propriedade grupo.
     * 
     * @return
     *     possible object is
     *     {@link WsGrupoAvaliacao }
     *     
     */
    public WsGrupoAvaliacao getGrupo() {
        return grupo;
    }

    /**
     * Define o valor da propriedade grupo.
     * 
     * @param value
     *     allowed object is
     *     {@link WsGrupoAvaliacao }
     *     
     */
    public void setGrupo(WsGrupoAvaliacao value) {
        this.grupo = value;
    }

}
