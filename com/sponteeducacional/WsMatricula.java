
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsMatricula complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsMatricula"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContratoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ContratoAulaLivreID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SituacaoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Aluno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CursoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TurmaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeTurma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoContratoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataTermino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Contratante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeMatrizCurricular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinanceiroLancado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataEncerramento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Disciplinas" type="{http://api.sponteeducacional.net.br/}ArrayOfWsDisciplinas" minOccurs="0"/&gt;
 *         &lt;element name="DisciplinasComTurma" type="{http://api.sponteeducacional.net.br/}ArrayOfWsDisciplinasComTurma" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsMatricula", propOrder = {
    "retornoOperacao",
    "contratoID",
    "contratoAulaLivreID",
    "situacaoID",
    "situacao",
    "aluno",
    "alunoID",
    "cursoID",
    "turmaID",
    "nomeTurma",
    "nomeCurso",
    "tipoContratoID",
    "dataInicio",
    "dataTermino",
    "dataMatricula",
    "tipo",
    "contratante",
    "nomeMatrizCurricular",
    "financeiroLancado",
    "numeroContrato",
    "dataEncerramento",
    "disciplinas",
    "disciplinasComTurma"
})
public class WsMatricula {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "ContratoID")
    protected int contratoID;
    @XmlElement(name = "ContratoAulaLivreID")
    protected int contratoAulaLivreID;
    @XmlElement(name = "SituacaoID")
    protected int situacaoID;
    @XmlElement(name = "Situacao")
    protected String situacao;
    @XmlElement(name = "Aluno")
    protected String aluno;
    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "CursoID")
    protected String cursoID;
    @XmlElement(name = "TurmaID")
    protected int turmaID;
    @XmlElement(name = "NomeTurma")
    protected String nomeTurma;
    @XmlElement(name = "NomeCurso")
    protected String nomeCurso;
    @XmlElement(name = "TipoContratoID")
    protected int tipoContratoID;
    @XmlElement(name = "DataInicio")
    protected String dataInicio;
    @XmlElement(name = "DataTermino")
    protected String dataTermino;
    @XmlElement(name = "DataMatricula")
    protected String dataMatricula;
    @XmlElement(name = "Tipo")
    protected int tipo;
    @XmlElement(name = "Contratante")
    protected String contratante;
    @XmlElement(name = "NomeMatrizCurricular")
    protected String nomeMatrizCurricular;
    @XmlElement(name = "FinanceiroLancado")
    protected String financeiroLancado;
    @XmlElement(name = "NumeroContrato")
    protected String numeroContrato;
    @XmlElement(name = "DataEncerramento")
    protected String dataEncerramento;
    @XmlElement(name = "Disciplinas")
    protected ArrayOfWsDisciplinas disciplinas;
    @XmlElement(name = "DisciplinasComTurma")
    protected ArrayOfWsDisciplinasComTurma disciplinasComTurma;

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
     * Obtém o valor da propriedade contratoID.
     * 
     */
    public int getContratoID() {
        return contratoID;
    }

    /**
     * Define o valor da propriedade contratoID.
     * 
     */
    public void setContratoID(int value) {
        this.contratoID = value;
    }

    /**
     * Obtém o valor da propriedade contratoAulaLivreID.
     * 
     */
    public int getContratoAulaLivreID() {
        return contratoAulaLivreID;
    }

    /**
     * Define o valor da propriedade contratoAulaLivreID.
     * 
     */
    public void setContratoAulaLivreID(int value) {
        this.contratoAulaLivreID = value;
    }

    /**
     * Obtém o valor da propriedade situacaoID.
     * 
     */
    public int getSituacaoID() {
        return situacaoID;
    }

    /**
     * Define o valor da propriedade situacaoID.
     * 
     */
    public void setSituacaoID(int value) {
        this.situacaoID = value;
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
     * Obtém o valor da propriedade cursoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCursoID() {
        return cursoID;
    }

    /**
     * Define o valor da propriedade cursoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCursoID(String value) {
        this.cursoID = value;
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
     * Obtém o valor da propriedade tipoContratoID.
     * 
     */
    public int getTipoContratoID() {
        return tipoContratoID;
    }

    /**
     * Define o valor da propriedade tipoContratoID.
     * 
     */
    public void setTipoContratoID(int value) {
        this.tipoContratoID = value;
    }

    /**
     * Obtém o valor da propriedade dataInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * Define o valor da propriedade dataInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicio(String value) {
        this.dataInicio = value;
    }

    /**
     * Obtém o valor da propriedade dataTermino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataTermino() {
        return dataTermino;
    }

    /**
     * Define o valor da propriedade dataTermino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataTermino(String value) {
        this.dataTermino = value;
    }

    /**
     * Obtém o valor da propriedade dataMatricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMatricula() {
        return dataMatricula;
    }

    /**
     * Define o valor da propriedade dataMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMatricula(String value) {
        this.dataMatricula = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     */
    public void setTipo(int value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade contratante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContratante() {
        return contratante;
    }

    /**
     * Define o valor da propriedade contratante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContratante(String value) {
        this.contratante = value;
    }

    /**
     * Obtém o valor da propriedade nomeMatrizCurricular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMatrizCurricular() {
        return nomeMatrizCurricular;
    }

    /**
     * Define o valor da propriedade nomeMatrizCurricular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMatrizCurricular(String value) {
        this.nomeMatrizCurricular = value;
    }

    /**
     * Obtém o valor da propriedade financeiroLancado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceiroLancado() {
        return financeiroLancado;
    }

    /**
     * Define o valor da propriedade financeiroLancado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceiroLancado(String value) {
        this.financeiroLancado = value;
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
     * Obtém o valor da propriedade dataEncerramento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEncerramento() {
        return dataEncerramento;
    }

    /**
     * Define o valor da propriedade dataEncerramento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEncerramento(String value) {
        this.dataEncerramento = value;
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
     * Obtém o valor da propriedade disciplinasComTurma.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsDisciplinasComTurma }
     *     
     */
    public ArrayOfWsDisciplinasComTurma getDisciplinasComTurma() {
        return disciplinasComTurma;
    }

    /**
     * Define o valor da propriedade disciplinasComTurma.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsDisciplinasComTurma }
     *     
     */
    public void setDisciplinasComTurma(ArrayOfWsDisciplinasComTurma value) {
        this.disciplinasComTurma = value;
    }

}
