
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FormasCobrancas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FormasCobrancas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormaCobrancaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormasCobrancas", propOrder = {
    "formaCobrancaID",
    "descricao"
})
public class FormasCobrancas {

    @XmlElement(name = "FormaCobrancaID")
    protected int formaCobrancaID;
    @XmlElement(name = "Descricao")
    protected String descricao;

    /**
     * Obtém o valor da propriedade formaCobrancaID.
     * 
     */
    public int getFormaCobrancaID() {
        return formaCobrancaID;
    }

    /**
     * Define o valor da propriedade formaCobrancaID.
     * 
     */
    public void setFormaCobrancaID(int value) {
        this.formaCobrancaID = value;
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

}
