
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
 *         &lt;element name="sToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nCodCliOrigem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nCodCliDestino" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nAlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "sToken",
    "nCodCliOrigem",
    "nCodCliDestino",
    "nAlunoID"
})
@XmlRootElement(name = "ImportaAluno")
public class ImportaAluno {

    protected String sToken;
    protected int nCodCliOrigem;
    protected int nCodCliDestino;
    protected int nAlunoID;

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
     * Obtém o valor da propriedade nCodCliOrigem.
     * 
     */
    public int getNCodCliOrigem() {
        return nCodCliOrigem;
    }

    /**
     * Define o valor da propriedade nCodCliOrigem.
     * 
     */
    public void setNCodCliOrigem(int value) {
        this.nCodCliOrigem = value;
    }

    /**
     * Obtém o valor da propriedade nCodCliDestino.
     * 
     */
    public int getNCodCliDestino() {
        return nCodCliDestino;
    }

    /**
     * Define o valor da propriedade nCodCliDestino.
     * 
     */
    public void setNCodCliDestino(int value) {
        this.nCodCliDestino = value;
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

}
