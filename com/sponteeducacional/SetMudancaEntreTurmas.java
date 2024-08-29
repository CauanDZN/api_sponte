
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TurmaOrigemID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TurmaDestinoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Observacoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nSituacaoAlunoTurmaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "alunoID",
    "turmaOrigemID",
    "turmaDestinoID",
    "observacoes",
    "nSituacaoAlunoTurmaID"
})
@XmlRootElement(name = "SetMudancaEntreTurmas")
public class SetMudancaEntreTurmas {

    protected int nCodigoCliente;
    protected String sToken;
    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "TurmaOrigemID")
    protected int turmaOrigemID;
    @XmlElement(name = "TurmaDestinoID")
    protected int turmaDestinoID;
    @XmlElement(name = "Observacoes")
    protected String observacoes;
    protected int nSituacaoAlunoTurmaID;

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
     * Obtém o valor da propriedade turmaOrigemID.
     * 
     */
    public int getTurmaOrigemID() {
        return turmaOrigemID;
    }

    /**
     * Define o valor da propriedade turmaOrigemID.
     * 
     */
    public void setTurmaOrigemID(int value) {
        this.turmaOrigemID = value;
    }

    /**
     * Obtém o valor da propriedade turmaDestinoID.
     * 
     */
    public int getTurmaDestinoID() {
        return turmaDestinoID;
    }

    /**
     * Define o valor da propriedade turmaDestinoID.
     * 
     */
    public void setTurmaDestinoID(int value) {
        this.turmaDestinoID = value;
    }

    /**
     * Obtém o valor da propriedade observacoes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * Define o valor da propriedade observacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacoes(String value) {
        this.observacoes = value;
    }

    /**
     * Obtém o valor da propriedade nSituacaoAlunoTurmaID.
     * 
     */
    public int getNSituacaoAlunoTurmaID() {
        return nSituacaoAlunoTurmaID;
    }

    /**
     * Define o valor da propriedade nSituacaoAlunoTurmaID.
     * 
     */
    public void setNSituacaoAlunoTurmaID(int value) {
        this.nSituacaoAlunoTurmaID = value;
    }

}
