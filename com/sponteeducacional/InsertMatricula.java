
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="nSituacao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nAlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nCursoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nTurmaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nTipoContratoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dDataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dDataTermino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dDataMatricula" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="nTipo" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="sDisciplinas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nModulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nContratante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nNumeroHoras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nSituacao",
    "nAlunoID",
    "nCursoID",
    "nTurmaID",
    "nTipoContratoID",
    "dDataInicio",
    "dDataTermino",
    "dDataMatricula",
    "nTipo",
    "sDisciplinas",
    "nModulo",
    "nContratante",
    "nNumeroHoras",
    "sObservacao"
})
@XmlRootElement(name = "InsertMatricula")
public class InsertMatricula {

    protected int nCodigoCliente;
    protected String sToken;
    protected int nSituacao;
    protected int nAlunoID;
    protected int nCursoID;
    protected String nTurmaID;
    protected int nTipoContratoID;
    protected String dDataInicio;
    protected String dDataTermino;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dDataMatricula;
    @XmlSchemaType(name = "unsignedByte")
    protected short nTipo;
    protected String sDisciplinas;
    protected String nModulo;
    protected String nContratante;
    protected String nNumeroHoras;
    protected String sObservacao;

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
     * Obtém o valor da propriedade nSituacao.
     * 
     */
    public int getNSituacao() {
        return nSituacao;
    }

    /**
     * Define o valor da propriedade nSituacao.
     * 
     */
    public void setNSituacao(int value) {
        this.nSituacao = value;
    }

    /**
     * Obtém o valor da propriedade nAlunoID.
     * 
     */
    public int getNAlunoID() {
        return nAlunoID;
    }

    /**
     * Define o valor da propriedade nAlunoID.
     * 
     */
    public void setNAlunoID(int value) {
        this.nAlunoID = value;
    }

    /**
     * Obtém o valor da propriedade nCursoID.
     * 
     */
    public int getNCursoID() {
        return nCursoID;
    }

    /**
     * Define o valor da propriedade nCursoID.
     * 
     */
    public void setNCursoID(int value) {
        this.nCursoID = value;
    }

    /**
     * Obtém o valor da propriedade nTurmaID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTurmaID() {
        return nTurmaID;
    }

    /**
     * Define o valor da propriedade nTurmaID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTurmaID(String value) {
        this.nTurmaID = value;
    }

    /**
     * Obtém o valor da propriedade nTipoContratoID.
     * 
     */
    public int getNTipoContratoID() {
        return nTipoContratoID;
    }

    /**
     * Define o valor da propriedade nTipoContratoID.
     * 
     */
    public void setNTipoContratoID(int value) {
        this.nTipoContratoID = value;
    }

    /**
     * Obtém o valor da propriedade dDataInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDataInicio() {
        return dDataInicio;
    }

    /**
     * Define o valor da propriedade dDataInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDataInicio(String value) {
        this.dDataInicio = value;
    }

    /**
     * Obtém o valor da propriedade dDataTermino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDataTermino() {
        return dDataTermino;
    }

    /**
     * Define o valor da propriedade dDataTermino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDataTermino(String value) {
        this.dDataTermino = value;
    }

    /**
     * Obtém o valor da propriedade dDataMatricula.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDDataMatricula() {
        return dDataMatricula;
    }

    /**
     * Define o valor da propriedade dDataMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDDataMatricula(XMLGregorianCalendar value) {
        this.dDataMatricula = value;
    }

    /**
     * Obtém o valor da propriedade nTipo.
     * 
     */
    public short getNTipo() {
        return nTipo;
    }

    /**
     * Define o valor da propriedade nTipo.
     * 
     */
    public void setNTipo(short value) {
        this.nTipo = value;
    }

    /**
     * Obtém o valor da propriedade sDisciplinas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDisciplinas() {
        return sDisciplinas;
    }

    /**
     * Define o valor da propriedade sDisciplinas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDisciplinas(String value) {
        this.sDisciplinas = value;
    }

    /**
     * Obtém o valor da propriedade nModulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNModulo() {
        return nModulo;
    }

    /**
     * Define o valor da propriedade nModulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNModulo(String value) {
        this.nModulo = value;
    }

    /**
     * Obtém o valor da propriedade nContratante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNContratante() {
        return nContratante;
    }

    /**
     * Define o valor da propriedade nContratante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNContratante(String value) {
        this.nContratante = value;
    }

    /**
     * Obtém o valor da propriedade nNumeroHoras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNNumeroHoras() {
        return nNumeroHoras;
    }

    /**
     * Define o valor da propriedade nNumeroHoras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNNumeroHoras(String value) {
        this.nNumeroHoras = value;
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

}
