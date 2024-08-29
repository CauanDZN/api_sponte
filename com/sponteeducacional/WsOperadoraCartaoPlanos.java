
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsOperadoraCartaoPlanos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsOperadoraCartaoPlanos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperadoraPlanoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeOperadoraPlano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bandeira" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantidadeVezesParcelamento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsOperadoraCartaoPlanos", propOrder = {
    "operadoraPlanoID",
    "nomeOperadoraPlano",
    "tipoCartao",
    "bandeira",
    "quantidadeVezesParcelamento"
})
public class WsOperadoraCartaoPlanos {

    @XmlElement(name = "OperadoraPlanoID")
    protected int operadoraPlanoID;
    @XmlElement(name = "NomeOperadoraPlano")
    protected String nomeOperadoraPlano;
    @XmlElement(name = "TipoCartao")
    protected String tipoCartao;
    @XmlElement(name = "Bandeira")
    protected String bandeira;
    @XmlElement(name = "QuantidadeVezesParcelamento")
    protected int quantidadeVezesParcelamento;

    /**
     * Obtém o valor da propriedade operadoraPlanoID.
     * 
     */
    public int getOperadoraPlanoID() {
        return operadoraPlanoID;
    }

    /**
     * Define o valor da propriedade operadoraPlanoID.
     * 
     */
    public void setOperadoraPlanoID(int value) {
        this.operadoraPlanoID = value;
    }

    /**
     * Obtém o valor da propriedade nomeOperadoraPlano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeOperadoraPlano() {
        return nomeOperadoraPlano;
    }

    /**
     * Define o valor da propriedade nomeOperadoraPlano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeOperadoraPlano(String value) {
        this.nomeOperadoraPlano = value;
    }

    /**
     * Obtém o valor da propriedade tipoCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCartao() {
        return tipoCartao;
    }

    /**
     * Define o valor da propriedade tipoCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCartao(String value) {
        this.tipoCartao = value;
    }

    /**
     * Obtém o valor da propriedade bandeira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandeira() {
        return bandeira;
    }

    /**
     * Define o valor da propriedade bandeira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandeira(String value) {
        this.bandeira = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeVezesParcelamento.
     * 
     */
    public int getQuantidadeVezesParcelamento() {
        return quantidadeVezesParcelamento;
    }

    /**
     * Define o valor da propriedade quantidadeVezesParcelamento.
     * 
     */
    public void setQuantidadeVezesParcelamento(int value) {
        this.quantidadeVezesParcelamento = value;
    }

}
