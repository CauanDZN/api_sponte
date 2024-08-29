
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nCodigoCliente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nAulaLivreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nAlunoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nCursoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nAulaDemonstrativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nNumeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sDataAula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sHorarioInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sHorarioFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nDisciplinaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nSalaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sConteudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nSituacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nProfessorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nAulaTemTarefa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nAulaConcluida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nTarefa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nCodigoCliente",
    "sToken",
    "nAulaLivreID",
    "nAlunoID",
    "nCursoID",
    "nAulaDemonstrativa",
    "nNumeroContrato",
    "sDataAula",
    "sHorarioInicial",
    "sHorarioFinal",
    "nDisciplinaID",
    "nSalaID",
    "sConteudo",
    "sObservacao",
    "nSituacao",
    "nProfessorID",
    "nAulaTemTarefa",
    "nAulaConcluida",
    "nTarefa"
})
@XmlRootElement(name = "UpdateDiarioAulasLivres")
public class UpdateDiarioAulasLivres {

    protected int nCodigoCliente;
    protected String sToken;
    protected String nAulaLivreID;
    protected String nAlunoID;
    protected String nCursoID;
    protected String nAulaDemonstrativa;
    protected String nNumeroContrato;
    protected String sDataAula;
    protected String sHorarioInicial;
    protected String sHorarioFinal;
    protected String nDisciplinaID;
    protected String nSalaID;
    protected String sConteudo;
    protected String sObservacao;
    protected String nSituacao;
    protected String nProfessorID;
    protected String nAulaTemTarefa;
    protected String nAulaConcluida;
    protected String nTarefa;

    /**
     * Obtém o valor da propriedade nCodigoCliente.
     * 
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }

    /**
     * Define o valor da propriedade nCodigoCliente.
     * 
     */
    public void setNCodigoCliente(int value) {
        this.nCodigoCliente = value;
    }

    /**
     * Obtém o valor da propriedade sToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSToken() {
        return sToken;
    }

    /**
     * Define o valor da propriedade sToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSToken(String value) {
        this.sToken = value;
    }

    /**
     * Obtém o valor da propriedade nAulaLivreID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAulaLivreID() {
        return nAulaLivreID;
    }

    /**
     * Define o valor da propriedade nAulaLivreID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAulaLivreID(String value) {
        this.nAulaLivreID = value;
    }

    /**
     * Obtém o valor da propriedade nAlunoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAlunoID() {
        return nAlunoID;
    }

    /**
     * Define o valor da propriedade nAlunoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAlunoID(String value) {
        this.nAlunoID = value;
    }

    /**
     * Obtém o valor da propriedade nCursoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCursoID() {
        return nCursoID;
    }

    /**
     * Define o valor da propriedade nCursoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCursoID(String value) {
        this.nCursoID = value;
    }

    /**
     * Obtém o valor da propriedade nAulaDemonstrativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAulaDemonstrativa() {
        return nAulaDemonstrativa;
    }

    /**
     * Define o valor da propriedade nAulaDemonstrativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAulaDemonstrativa(String value) {
        this.nAulaDemonstrativa = value;
    }

    /**
     * Obtém o valor da propriedade nNumeroContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNNumeroContrato() {
        return nNumeroContrato;
    }

    /**
     * Define o valor da propriedade nNumeroContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNNumeroContrato(String value) {
        this.nNumeroContrato = value;
    }

    /**
     * Obtém o valor da propriedade sDataAula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDataAula() {
        return sDataAula;
    }

    /**
     * Define o valor da propriedade sDataAula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDataAula(String value) {
        this.sDataAula = value;
    }

    /**
     * Obtém o valor da propriedade sHorarioInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHorarioInicial() {
        return sHorarioInicial;
    }

    /**
     * Define o valor da propriedade sHorarioInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHorarioInicial(String value) {
        this.sHorarioInicial = value;
    }

    /**
     * Obtém o valor da propriedade sHorarioFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHorarioFinal() {
        return sHorarioFinal;
    }

    /**
     * Define o valor da propriedade sHorarioFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHorarioFinal(String value) {
        this.sHorarioFinal = value;
    }

    /**
     * Obtém o valor da propriedade nDisciplinaID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDisciplinaID() {
        return nDisciplinaID;
    }

    /**
     * Define o valor da propriedade nDisciplinaID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDisciplinaID(String value) {
        this.nDisciplinaID = value;
    }

    /**
     * Obtém o valor da propriedade nSalaID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSalaID() {
        return nSalaID;
    }

    /**
     * Define o valor da propriedade nSalaID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSalaID(String value) {
        this.nSalaID = value;
    }

    /**
     * Obtém o valor da propriedade sConteudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSConteudo() {
        return sConteudo;
    }

    /**
     * Define o valor da propriedade sConteudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSConteudo(String value) {
        this.sConteudo = value;
    }

    /**
     * Obtém o valor da propriedade sObservacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSObservacao() {
        return sObservacao;
    }

    /**
     * Define o valor da propriedade sObservacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSObservacao(String value) {
        this.sObservacao = value;
    }

    /**
     * Obtém o valor da propriedade nSituacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSituacao() {
        return nSituacao;
    }

    /**
     * Define o valor da propriedade nSituacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSituacao(String value) {
        this.nSituacao = value;
    }

    /**
     * Obtém o valor da propriedade nProfessorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNProfessorID() {
        return nProfessorID;
    }

    /**
     * Define o valor da propriedade nProfessorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNProfessorID(String value) {
        this.nProfessorID = value;
    }

    /**
     * Obtém o valor da propriedade nAulaTemTarefa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAulaTemTarefa() {
        return nAulaTemTarefa;
    }

    /**
     * Define o valor da propriedade nAulaTemTarefa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAulaTemTarefa(String value) {
        this.nAulaTemTarefa = value;
    }

    /**
     * Obtém o valor da propriedade nAulaConcluida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAulaConcluida() {
        return nAulaConcluida;
    }

    /**
     * Define o valor da propriedade nAulaConcluida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAulaConcluida(String value) {
        this.nAulaConcluida = value;
    }

    /**
     * Obtém o valor da propriedade nTarefa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTarefa() {
        return nTarefa;
    }

    /**
     * Define o valor da propriedade nTarefa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTarefa(String value) {
        this.nTarefa = value;
    }

}
