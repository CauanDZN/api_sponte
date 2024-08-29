
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
 *         &lt;element name="nDisciplinaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dDataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dDataTermino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nModulo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sSemana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nDisciplinaID",
    "dDataInicio",
    "dDataTermino",
    "nModulo",
    "sSemana"
})
@XmlRootElement(name = "GetDiarioAulas")
public class GetDiarioAulas {

    protected int nCodigoCliente;
    protected String sToken;
    protected int nTurmaID;
    protected int nDisciplinaID;
    protected String dDataInicio;
    protected String dDataTermino;
    protected int nModulo;
    protected String sSemana;

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
     * Obtém o valor da propriedade nDisciplinaID.
     * 
     */
    public int getNDisciplinaID() {
        return nDisciplinaID;
    }

    /**
     * Define o valor da propriedade nDisciplinaID.
     * 
     */
    public void setNDisciplinaID(int value) {
        this.nDisciplinaID = value;
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
     * Obtém o valor da propriedade sSemana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSemana() {
        return sSemana;
    }

    /**
     * Define o valor da propriedade sSemana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSemana(String value) {
        this.sSemana = value;
    }

}
