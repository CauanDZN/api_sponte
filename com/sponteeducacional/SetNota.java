
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
 *         &lt;element name="nAlunoId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nNota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nModulo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nPeriodo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "nAlunoId",
    "nNota",
    "nModulo",
    "nPeriodo"
})
@XmlRootElement(name = "SetNota")
public class SetNota {

    protected int nCodigoCliente;
    protected String sToken;
    protected int nTurmaID;
    protected int nDisciplinaID;
    protected int nAlunoId;
    protected String nNota;
    protected int nModulo;
    protected int nPeriodo;

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
     * Obtém o valor da propriedade nAlunoId.
     * 
     */
    public int getNAlunoId() {
        return nAlunoId;
    }

    /**
     * Define o valor da propriedade nAlunoId.
     * 
     */
    public void setNAlunoId(int value) {
        this.nAlunoId = value;
    }

    /**
     * Obtém o valor da propriedade nNota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNNota() {
        return nNota;
    }

    /**
     * Define o valor da propriedade nNota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNNota(String value) {
        this.nNota = value;
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
     * Obtém o valor da propriedade nPeriodo.
     * 
     */
    public int getNPeriodo() {
        return nPeriodo;
    }

    /**
     * Define o valor da propriedade nPeriodo.
     * 
     */
    public void setNPeriodo(int value) {
        this.nPeriodo = value;
    }

}
