
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsConceito complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsConceito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConceitoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeConceito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorEquivalente" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsConceito", propOrder = {
    "conceitoID",
    "nomeConceito",
    "descricao",
    "valorEquivalente"
})
public class WsConceito {

    @XmlElement(name = "ConceitoID")
    protected int conceitoID;
    @XmlElement(name = "NomeConceito")
    protected String nomeConceito;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "ValorEquivalente")
    protected double valorEquivalente;

    /**
     * Obtém o valor da propriedade conceitoID.
     * 
     */
    public int getConceitoID() {
        return conceitoID;
    }

    /**
     * Define o valor da propriedade conceitoID.
     * 
     */
    public void setConceitoID(int value) {
        this.conceitoID = value;
    }

    /**
     * Obtém o valor da propriedade nomeConceito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeConceito() {
        return nomeConceito;
    }

    /**
     * Define o valor da propriedade nomeConceito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeConceito(String value) {
        this.nomeConceito = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade valorEquivalente.
     * 
     */
    public double getValorEquivalente() {
        return valorEquivalente;
    }

    /**
     * Define o valor da propriedade valorEquivalente.
     * 
     */
    public void setValorEquivalente(double value) {
        this.valorEquivalente = value;
    }

}
