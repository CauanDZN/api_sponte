
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsAtualizaSenhaAlunoResponsavel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsAtualizaSenhaAlunoResponsavel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ResponsavelID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SenhaSponteNet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAtualizaSenhaAlunoResponsavel", propOrder = {
    "retornoOperacao",
    "alunoID",
    "responsavelID",
    "senhaSponteNet"
})
public class WsAtualizaSenhaAlunoResponsavel {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "ResponsavelID")
    protected int responsavelID;
    @XmlElement(name = "SenhaSponteNet")
    protected String senhaSponteNet;

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
     * Obtém o valor da propriedade responsavelID.
     * 
     */
    public int getResponsavelID() {
        return responsavelID;
    }

    /**
     * Define o valor da propriedade responsavelID.
     * 
     */
    public void setResponsavelID(int value) {
        this.responsavelID = value;
    }

    /**
     * Obtém o valor da propriedade senhaSponteNet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaSponteNet() {
        return senhaSponteNet;
    }

    /**
     * Define o valor da propriedade senhaSponteNet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaSponteNet(String value) {
        this.senhaSponteNet = value;
    }

}
