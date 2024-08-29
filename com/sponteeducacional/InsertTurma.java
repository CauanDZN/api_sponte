
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
 *         &lt;element name="sNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nCursoId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nAnoLetivo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sSigla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nModulo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dDataInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="nTipoTurma" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nTurno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "sNome",
    "nCursoId",
    "nAnoLetivo",
    "sSigla",
    "nModulo",
    "dDataInicio",
    "nTipoTurma",
    "nTurno"
})
@XmlRootElement(name = "InsertTurma")
public class InsertTurma {

    protected int nCodigoCliente;
    protected String sToken;
    protected String sNome;
    protected int nCursoId;
    protected int nAnoLetivo;
    protected String sSigla;
    protected int nModulo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dDataInicio;
    protected int nTipoTurma;
    protected int nTurno;

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
     * Obtém o valor da propriedade nCursoId.
     * 
     */
    public int getNCursoId() {
        return nCursoId;
    }

    /**
     * Define o valor da propriedade nCursoId.
     * 
     */
    public void setNCursoId(int value) {
        this.nCursoId = value;
    }

    /**
     * Obtém o valor da propriedade nAnoLetivo.
     * 
     */
    public int getNAnoLetivo() {
        return nAnoLetivo;
    }

    /**
     * Define o valor da propriedade nAnoLetivo.
     * 
     */
    public void setNAnoLetivo(int value) {
        this.nAnoLetivo = value;
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
     * Obtém o valor da propriedade nModulo.
     * 
     */
    public int getNModulo() {
        return nModulo;
    }

    /**
     * Define o valor da propriedade nModulo.
     * 
     */
    public void setNModulo(int value) {
        this.nModulo = value;
    }

    /**
     * Obtém o valor da propriedade dDataInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDDataInicio() {
        return dDataInicio;
    }

    /**
     * Define o valor da propriedade dDataInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDDataInicio(XMLGregorianCalendar value) {
        this.dDataInicio = value;
    }

    /**
     * Obtém o valor da propriedade nTipoTurma.
     * 
     */
    public int getNTipoTurma() {
        return nTipoTurma;
    }

    /**
     * Define o valor da propriedade nTipoTurma.
     * 
     */
    public void setNTipoTurma(int value) {
        this.nTipoTurma = value;
    }

    /**
     * Obtém o valor da propriedade nTurno.
     * 
     */
    public int getNTurno() {
        return nTurno;
    }

    /**
     * Define o valor da propriedade nTurno.
     * 
     */
    public void setNTurno(int value) {
        this.nTurno = value;
    }

}
