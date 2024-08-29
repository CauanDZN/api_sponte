
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
 *         &lt;element name="nTurmaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSigla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nOrdem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nModalidadeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sDataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sDataTermino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nSituacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nMinimoAlunos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nMaximoAlunos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nTurnoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nHorarioID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nTurmaID",
    "sNome",
    "sSigla",
    "nOrdem",
    "nModalidadeID",
    "sDataInicio",
    "sDataTermino",
    "nSituacao",
    "nMinimoAlunos",
    "nMaximoAlunos",
    "nTurnoID",
    "nHorarioID"
})
@XmlRootElement(name = "UpdateTurmas")
public class UpdateTurmas {

    protected int nCodigoCliente;
    protected String sToken;
    protected int nTurmaID;
    protected String sNome;
    protected String sSigla;
    protected String nOrdem;
    protected String nModalidadeID;
    protected String sDataInicio;
    protected String sDataTermino;
    protected String nSituacao;
    protected String nMinimoAlunos;
    protected String nMaximoAlunos;
    protected String nTurnoID;
    protected String nHorarioID;

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
     * Obtém o valor da propriedade nTurmaID.
     * 
     */
    public int getNTurmaID() {
        return nTurmaID;
    }

    /**
     * Define o valor da propriedade nTurmaID.
     * 
     */
    public void setNTurmaID(int value) {
        this.nTurmaID = value;
    }

    /**
     * Obtém o valor da propriedade sNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNome() {
        return sNome;
    }

    /**
     * Define o valor da propriedade sNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNome(String value) {
        this.sNome = value;
    }

    /**
     * Obtém o valor da propriedade sSigla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSigla() {
        return sSigla;
    }

    /**
     * Define o valor da propriedade sSigla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSigla(String value) {
        this.sSigla = value;
    }

    /**
     * Obtém o valor da propriedade nOrdem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOrdem() {
        return nOrdem;
    }

    /**
     * Define o valor da propriedade nOrdem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOrdem(String value) {
        this.nOrdem = value;
    }

    /**
     * Obtém o valor da propriedade nModalidadeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNModalidadeID() {
        return nModalidadeID;
    }

    /**
     * Define o valor da propriedade nModalidadeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNModalidadeID(String value) {
        this.nModalidadeID = value;
    }

    /**
     * Obtém o valor da propriedade sDataInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDataInicio() {
        return sDataInicio;
    }

    /**
     * Define o valor da propriedade sDataInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDataInicio(String value) {
        this.sDataInicio = value;
    }

    /**
     * Obtém o valor da propriedade sDataTermino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDataTermino() {
        return sDataTermino;
    }

    /**
     * Define o valor da propriedade sDataTermino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDataTermino(String value) {
        this.sDataTermino = value;
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
     * Obtém o valor da propriedade nMinimoAlunos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMinimoAlunos() {
        return nMinimoAlunos;
    }

    /**
     * Define o valor da propriedade nMinimoAlunos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMinimoAlunos(String value) {
        this.nMinimoAlunos = value;
    }

    /**
     * Obtém o valor da propriedade nMaximoAlunos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMaximoAlunos() {
        return nMaximoAlunos;
    }

    /**
     * Define o valor da propriedade nMaximoAlunos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMaximoAlunos(String value) {
        this.nMaximoAlunos = value;
    }

    /**
     * Obtém o valor da propriedade nTurnoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTurnoID() {
        return nTurnoID;
    }

    /**
     * Define o valor da propriedade nTurnoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTurnoID(String value) {
        this.nTurnoID = value;
    }

    /**
     * Obtém o valor da propriedade nHorarioID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNHorarioID() {
        return nHorarioID;
    }

    /**
     * Define o valor da propriedade nHorarioID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNHorarioID(String value) {
        this.nHorarioID = value;
    }

}
