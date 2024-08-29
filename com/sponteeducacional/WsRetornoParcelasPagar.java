
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsRetornoParcelasPagar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsRetornoParcelasPagar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContaPagarID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Parcelas" type="{http://api.sponteeducacional.net.br/}ArrayOfWsParcelasPagar" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsRetornoParcelasPagar", propOrder = {
    "retornoOperacao",
    "contaPagarID",
    "parcelas"
})
public class WsRetornoParcelasPagar {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "ContaPagarID")
    protected int contaPagarID;
    @XmlElement(name = "Parcelas")
    protected ArrayOfWsParcelasPagar parcelas;

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
     * Obtém o valor da propriedade contaPagarID.
     * 
     */
    public int getContaPagarID() {
        return contaPagarID;
    }

    /**
     * Define o valor da propriedade contaPagarID.
     * 
     */
    public void setContaPagarID(int value) {
        this.contaPagarID = value;
    }

    /**
     * Obtém o valor da propriedade parcelas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsParcelasPagar }
     *     
     */
    public ArrayOfWsParcelasPagar getParcelas() {
        return parcelas;
    }

    /**
     * Define o valor da propriedade parcelas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsParcelasPagar }
     *     
     */
    public void setParcelas(ArrayOfWsParcelasPagar value) {
        this.parcelas = value;
    }

}
