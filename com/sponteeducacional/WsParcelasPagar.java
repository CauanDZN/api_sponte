
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsParcelasPagar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsParcelasPagar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContaPagarID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumeroParcela" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Vencimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsParcelasPagar", propOrder = {
    "contaPagarID",
    "numeroParcela",
    "valor",
    "vencimento"
})
public class WsParcelasPagar {

    @XmlElement(name = "ContaPagarID")
    protected int contaPagarID;
    @XmlElement(name = "NumeroParcela")
    protected int numeroParcela;
    @XmlElement(name = "Valor")
    protected double valor;
    @XmlElement(name = "Vencimento")
    protected String vencimento;

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

}
