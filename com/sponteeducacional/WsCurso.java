
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsCurso complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsCurso"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CursoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Sigla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroModulos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TipoCursoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Modular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Disciplinas" type="{http://api.sponteeducacional.net.br/}ArrayOfWsDisciplinas" minOccurs="0"/&gt;
 *         &lt;element name="Coordenadores" type="{http://api.sponteeducacional.net.br/}ArrayOfWsCoordenadores" minOccurs="0"/&gt;
 *         &lt;element name="Diretores" type="{http://api.sponteeducacional.net.br/}ArrayOfWsDiretores" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsCurso", propOrder = {
    "retornoOperacao",
    "nome",
    "cursoID",
    "sigla",
    "situacao",
    "serie",
    "tipoCurso",
    "numeroModulos",
    "tipoCursoID",
    "modular",
    "disciplinas",
    "coordenadores",
    "diretores"
})
public class WsCurso {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "CursoID")
    protected int cursoID;
    @XmlElement(name = "Sigla")
    protected String sigla;
    @XmlElement(name = "Situacao")
    protected String situacao;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "TipoCurso")
    protected String tipoCurso;
    @XmlElement(name = "NumeroModulos")
    protected int numeroModulos;
    @XmlElement(name = "TipoCursoID")
    protected int tipoCursoID;
    @XmlElement(name = "Modular")
    protected String modular;
    @XmlElement(name = "Disciplinas")
    protected ArrayOfWsDisciplinas disciplinas;
    @XmlElement(name = "Coordenadores")
    protected ArrayOfWsCoordenadores coordenadores;
    @XmlElement(name = "Diretores")
    protected ArrayOfWsDiretores diretores;

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
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
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
     * Obtém o valor da propriedade sigla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Define o valor da propriedade sigla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigla(String value) {
        this.sigla = value;
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
     * Obtém o valor da propriedade serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define o valor da propriedade serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtém o valor da propriedade tipoCurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCurso() {
        return tipoCurso;
    }

    /**
     * Define o valor da propriedade tipoCurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCurso(String value) {
        this.tipoCurso = value;
    }

    /**
     * Obtém o valor da propriedade numeroModulos.
     * 
     */
    public int getNumeroModulos() {
        return numeroModulos;
    }

    /**
     * Define o valor da propriedade numeroModulos.
     * 
     */
    public void setNumeroModulos(int value) {
        this.numeroModulos = value;
    }

    /**
     * Obtém o valor da propriedade tipoCursoID.
     * 
     */
    public int getTipoCursoID() {
        return tipoCursoID;
    }

    /**
     * Define o valor da propriedade tipoCursoID.
     * 
     */
    public void setTipoCursoID(int value) {
        this.tipoCursoID = value;
    }

    /**
     * Obtém o valor da propriedade modular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModular() {
        return modular;
    }

    /**
     * Define o valor da propriedade modular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModular(String value) {
        this.modular = value;
    }

    /**
     * Obtém o valor da propriedade disciplinas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsDisciplinas }
     *     
     */
    public ArrayOfWsDisciplinas getDisciplinas() {
        return disciplinas;
    }

    /**
     * Define o valor da propriedade disciplinas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsDisciplinas }
     *     
     */
    public void setDisciplinas(ArrayOfWsDisciplinas value) {
        this.disciplinas = value;
    }

    /**
     * Obtém o valor da propriedade coordenadores.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsCoordenadores }
     *     
     */
    public ArrayOfWsCoordenadores getCoordenadores() {
        return coordenadores;
    }

    /**
     * Define o valor da propriedade coordenadores.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsCoordenadores }
     *     
     */
    public void setCoordenadores(ArrayOfWsCoordenadores value) {
        this.coordenadores = value;
    }

    /**
     * Obtém o valor da propriedade diretores.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsDiretores }
     *     
     */
    public ArrayOfWsDiretores getDiretores() {
        return diretores;
    }

    /**
     * Define o valor da propriedade diretores.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsDiretores }
     *     
     */
    public void setDiretores(ArrayOfWsDiretores value) {
        this.diretores = value;
    }

}
