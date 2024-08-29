
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CobrancasBancarias complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CobrancasBancarias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CNABID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Carteira" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Conta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CobrancasBancarias", propOrder = {
    "cnabid",
    "nome",
    "carteira",
    "agencia",
    "conta"
})
public class CobrancasBancarias {

    @XmlElement(name = "CNABID")
    protected int cnabid;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "Carteira")
    protected String carteira;
    @XmlElement(name = "Agencia")
    protected String agencia;
    @XmlElement(name = "Conta")
    protected String conta;

    /**
     * Obtém o valor da propriedade cnabid.
     * 
     */
    public int getCNABID() {
        return cnabid;
    }

    /**
     * Define o valor da propriedade cnabid.
     * 
     */
    public void setCNABID(int value) {
        this.cnabid = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade carteira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarteira() {
        return carteira;
    }

    /**
     * Define o valor da propriedade carteira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarteira(String value) {
        this.carteira = value;
    }

    /**
     * Obtém o valor da propriedade agencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define o valor da propriedade agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencia(String value) {
        this.agencia = value;
    }

    /**
     * Obtém o valor da propriedade conta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConta() {
        return conta;
    }

    /**
     * Define o valor da propriedade conta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConta(String value) {
        this.conta = value;
    }

}
