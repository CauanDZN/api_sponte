
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsTurma complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsTurma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TurmaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Sigla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModuloAtual" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CursoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Curso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnoLetivo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataTermino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxAlunos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VagasOcupadas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MatrizCurricular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Horario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfessorRegente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfessorRegenteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsTurma", propOrder = {
    "retornoOperacao",
    "nome",
    "turmaID",
    "sigla",
    "situacao",
    "turno",
    "moduloAtual",
    "cursoID",
    "curso",
    "anoLetivo",
    "dataInicio",
    "dataTermino",
    "maxAlunos",
    "vagasOcupadas",
    "matrizCurricular",
    "observacao",
    "horario",
    "professorRegente",
    "professorRegenteID"
})
@XmlSeeAlso({
    WsCodigoTurma.class
})
public class WsTurma {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "TurmaID")
    protected int turmaID;
    @XmlElement(name = "Sigla")
    protected String sigla;
    @XmlElement(name = "Situacao")
    protected String situacao;
    @XmlElement(name = "Turno")
    protected String turno;
    @XmlElement(name = "ModuloAtual")
    protected int moduloAtual;
    @XmlElement(name = "CursoID")
    protected int cursoID;
    @XmlElement(name = "Curso")
    protected String curso;
    @XmlElement(name = "AnoLetivo")
    protected int anoLetivo;
    @XmlElement(name = "DataInicio")
    protected String dataInicio;
    @XmlElement(name = "DataTermino")
    protected String dataTermino;
    @XmlElement(name = "MaxAlunos")
    protected int maxAlunos;
    @XmlElement(name = "VagasOcupadas")
    protected int vagasOcupadas;
    @XmlElement(name = "MatrizCurricular")
    protected String matrizCurricular;
    @XmlElement(name = "Observacao")
    protected String observacao;
    @XmlElement(name = "Horario")
    protected String horario;
    @XmlElement(name = "ProfessorRegente")
    protected String professorRegente;
    @XmlElement(name = "ProfessorRegenteID")
    protected String professorRegenteID;

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
     * Obtém o valor da propriedade turno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurno() {
        return turno;
    }

    /**
     * Define o valor da propriedade turno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurno(String value) {
        this.turno = value;
    }

    /**
     * Obtém o valor da propriedade moduloAtual.
     * 
     */
    public int getModuloAtual() {
        return moduloAtual;
    }

    /**
     * Define o valor da propriedade moduloAtual.
     * 
     */
    public void setModuloAtual(int value) {
        this.moduloAtual = value;
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
     * Obtém o valor da propriedade curso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Define o valor da propriedade curso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurso(String value) {
        this.curso = value;
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
     * Obtém o valor da propriedade maxAlunos.
     * 
     */
    public int getMaxAlunos() {
        return maxAlunos;
    }

    /**
     * Define o valor da propriedade maxAlunos.
     * 
     */
    public void setMaxAlunos(int value) {
        this.maxAlunos = value;
    }

    /**
     * Obtém o valor da propriedade vagasOcupadas.
     * 
     */
    public int getVagasOcupadas() {
        return vagasOcupadas;
    }

    /**
     * Define o valor da propriedade vagasOcupadas.
     * 
     */
    public void setVagasOcupadas(int value) {
        this.vagasOcupadas = value;
    }

    /**
     * Obtém o valor da propriedade matrizCurricular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrizCurricular() {
        return matrizCurricular;
    }

    /**
     * Define o valor da propriedade matrizCurricular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrizCurricular(String value) {
        this.matrizCurricular = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obtém o valor da propriedade horario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorario() {
        return horario;
    }

    /**
     * Define o valor da propriedade horario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorario(String value) {
        this.horario = value;
    }

    /**
     * Obtém o valor da propriedade professorRegente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessorRegente() {
        return professorRegente;
    }

    /**
     * Define o valor da propriedade professorRegente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessorRegente(String value) {
        this.professorRegente = value;
    }

    /**
     * Obtém o valor da propriedade professorRegenteID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessorRegenteID() {
        return professorRegenteID;
    }

    /**
     * Define o valor da propriedade professorRegenteID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessorRegenteID(String value) {
        this.professorRegenteID = value;
    }

}
