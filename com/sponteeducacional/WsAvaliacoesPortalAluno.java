
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsAvaliacoesPortalAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsAvaliacoesPortalAluno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvaliacaoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DataInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AulaLivre" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TipoAvaliacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CursoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TurmaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeTurma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisciplinaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeDisciplina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAvaliacoesPortalAluno", propOrder = {
    "avaliacaoID",
    "dataInicial",
    "dataFinal",
    "aulaLivre",
    "tipoAvaliacao",
    "descricao",
    "cursoID",
    "nomeCurso",
    "turmaID",
    "nomeTurma",
    "disciplinaID",
    "nomeDisciplina"
})
public class WsAvaliacoesPortalAluno {

    @XmlElement(name = "AvaliacaoID")
    protected int avaliacaoID;
    @XmlElement(name = "DataInicial")
    protected String dataInicial;
    @XmlElement(name = "DataFinal")
    protected String dataFinal;
    @XmlElement(name = "AulaLivre")
    protected int aulaLivre;
    @XmlElement(name = "TipoAvaliacao")
    protected String tipoAvaliacao;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "CursoID")
    protected int cursoID;
    @XmlElement(name = "NomeCurso")
    protected String nomeCurso;
    @XmlElement(name = "TurmaID")
    protected int turmaID;
    @XmlElement(name = "NomeTurma")
    protected String nomeTurma;
    @XmlElement(name = "DisciplinaID")
    protected int disciplinaID;
    @XmlElement(name = "NomeDisciplina")
    protected String nomeDisciplina;

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
     * Obtém o valor da propriedade dataInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicial() {
        return dataInicial;
    }

    /**
     * Define o valor da propriedade dataInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicial(String value) {
        this.dataInicial = value;
    }

    /**
     * Obtém o valor da propriedade dataFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFinal() {
        return dataFinal;
    }

    /**
     * Define o valor da propriedade dataFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFinal(String value) {
        this.dataFinal = value;
    }

    /**
     * Obtém o valor da propriedade aulaLivre.
     * 
     */
    public int getAulaLivre() {
        return aulaLivre;
    }

    /**
     * Define o valor da propriedade aulaLivre.
     * 
     */
    public void setAulaLivre(int value) {
        this.aulaLivre = value;
    }

    /**
     * Obtém o valor da propriedade tipoAvaliacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAvaliacao() {
        return tipoAvaliacao;
    }

    /**
     * Define o valor da propriedade tipoAvaliacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAvaliacao(String value) {
        this.tipoAvaliacao = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
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

}
