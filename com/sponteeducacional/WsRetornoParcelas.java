
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsRetornoParcelas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsRetornoParcelas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContaReceberID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Parcelas" type="{http://api.sponteeducacional.net.br/}ArrayOfWsParcelas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsRetornoParcelas", propOrder = {
    "retornoOperacao",
    "contaReceberID",
    "parcelas"
})
public class WsRetornoParcelas {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "ContaReceberID")
    protected int contaReceberID;
    @XmlElement(name = "Parcelas")
    protected ArrayOfWsParcelas parcelas;

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
     * Obtém o valor da propriedade contaReceberID.
     * 
     */
    public int getContaReceberID() {
        return contaReceberID;
    }

    /**
     * Define o valor da propriedade contaReceberID.
     * 
     */
    public void setContaReceberID(int value) {
        this.contaReceberID = value;
    }

    /**
     * Obtém o valor da propriedade parcelas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsParcelas }
     *     
     */
    public ArrayOfWsParcelas getParcelas() {
        return parcelas;
    }

    /**
     * Define o valor da propriedade parcelas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsParcelas }
     *     
     */
    public void setParcelas(ArrayOfWsParcelas value) {
        this.parcelas = value;
    }

}
