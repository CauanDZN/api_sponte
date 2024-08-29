
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
 *         &lt;element name="nContratoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nContratoAulaLivreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nSituacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nCursoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nTipoContratoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dDataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nContratante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dDataTermino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dDataMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nModulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sDisciplinasMatricular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sDisciplinasRemover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nContratoID",
    "nContratoAulaLivreID",
    "nSituacao",
    "nCursoID",
    "nTipoContratoID",
    "dDataInicio",
    "nContratante",
    "dDataTermino",
    "dDataMatricula",
    "nModulo",
    "sDisciplinasMatricular",
    "sDisciplinasRemover",
    "sObservacao"
})
@XmlRootElement(name = "UpdateMatricula")
public class UpdateMatricula {

    protected int nCodigoCliente;
    protected String sToken;
    protected String nContratoID;
    protected String nContratoAulaLivreID;
    protected String nSituacao;
    protected String nCursoID;
    protected String nTipoContratoID;
    protected String dDataInicio;
    protected String nContratante;
    protected String dDataTermino;
    protected String dDataMatricula;
    protected String nModulo;
    protected String sDisciplinasMatricular;
    protected String sDisciplinasRemover;
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
     * Obtém o valor da propriedade nContratoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNContratoID() {
        return nContratoID;
    }

    /**
     * Define o valor da propriedade nContratoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNContratoID(String value) {
        this.nContratoID = value;
    }

    /**
     * Obtém o valor da propriedade nContratoAulaLivreID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNContratoAulaLivreID() {
        return nContratoAulaLivreID;
    }

    /**
     * Define o valor da propriedade nContratoAulaLivreID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNContratoAulaLivreID(String value) {
        this.nContratoAulaLivreID = value;
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
     * Obtém o valor da propriedade nTipoContratoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTipoContratoID() {
        return nTipoContratoID;
    }

    /**
     * Define o valor da propriedade nTipoContratoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTipoContratoID(String value) {
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
     *     {@link String }
     *     
     */
    public String getDDataMatricula() {
        return dDataMatricula;
    }

    /**
     * Define o valor da propriedade dDataMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDataMatricula(String value) {
        this.dDataMatricula = value;
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
     * Obtém o valor da propriedade sDisciplinasMatricular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDisciplinasMatricular() {
        return sDisciplinasMatricular;
    }

    /**
     * Define o valor da propriedade sDisciplinasMatricular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDisciplinasMatricular(String value) {
        this.sDisciplinasMatricular = value;
    }

    /**
     * Obtém o valor da propriedade sDisciplinasRemover.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDisciplinasRemover() {
        return sDisciplinasRemover;
    }

    /**
     * Define o valor da propriedade sDisciplinasRemover.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDisciplinasRemover(String value) {
        this.sDisciplinasRemover = value;
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
