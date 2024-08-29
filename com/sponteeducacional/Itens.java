
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Itens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Itens"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaldoAtual" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itens", propOrder = {
    "itemID",
    "descricao",
    "saldoAtual"
})
public class Itens {

    @XmlElement(name = "ItemID")
    protected int itemID;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "SaldoAtual")
    protected int saldoAtual;

    /**
     * Obtém o valor da propriedade itemID.
     * 
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * Define o valor da propriedade itemID.
     * 
     */
    public void setItemID(int value) {
        this.itemID = value;
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
     * Obtém o valor da propriedade saldoAtual.
     * 
     */
    public int getSaldoAtual() {
        return saldoAtual;
    }

    /**
     * Define o valor da propriedade saldoAtual.
     * 
     */
    public void setSaldoAtual(int value) {
        this.saldoAtual = value;
    }

}
