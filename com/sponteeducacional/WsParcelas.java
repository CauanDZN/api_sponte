
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsParcelas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsParcelas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContaReceberID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumeroParcela" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Vencimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroBoleto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsParcelas", propOrder = {
    "contaReceberID",
    "numeroParcela",
    "valor",
    "vencimento",
    "numeroBoleto"
})
public class WsParcelas {

    @XmlElement(name = "ContaReceberID")
    protected int contaReceberID;
    @XmlElement(name = "NumeroParcela")
    protected int numeroParcela;
    @XmlElement(name = "Valor")
    protected double valor;
    @XmlElement(name = "Vencimento")
    protected String vencimento;
    @XmlElement(name = "NumeroBoleto")
    protected int numeroBoleto;

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
     * Obtém o valor da propriedade numeroParcela.
     * 
     */
    public int getNumeroParcela() {
        return numeroParcela;
    }

    /**
     * Define o valor da propriedade numeroParcela.
     * 
     */
    public void setNumeroParcela(int value) {
        this.numeroParcela = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade vencimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVencimento() {
        return vencimento;
    }

    /**
     * Define o valor da propriedade vencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVencimento(String value) {
        this.vencimento = value;
    }

    /**
     * Obtém o valor da propriedade numeroBoleto.
     * 
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    /**
     * Define o valor da propriedade numeroBoleto.
     * 
     */
    public void setNumeroBoleto(int value) {
        this.numeroBoleto = value;
    }

}
