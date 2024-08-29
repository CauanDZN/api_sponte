
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsRetornoBoletos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsRetornoBoletos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailEnviado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnderecoEmailEnviado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DadosBoletos" type="{http://api.sponteeducacional.net.br/}ArrayOfWsBoletos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsRetornoBoletos", propOrder = {
    "retornoOperacao",
    "emailEnviado",
    "enderecoEmailEnviado",
    "dadosBoletos"
})
public class WsRetornoBoletos {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "EmailEnviado")
    protected String emailEnviado;
    @XmlElement(name = "EnderecoEmailEnviado")
    protected String enderecoEmailEnviado;
    @XmlElement(name = "DadosBoletos")
    protected ArrayOfWsBoletos dadosBoletos;

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
     * Obtém o valor da propriedade emailEnviado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailEnviado() {
        return emailEnviado;
    }

    /**
     * Define o valor da propriedade emailEnviado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailEnviado(String value) {
        this.emailEnviado = value;
    }

    /**
     * Obtém o valor da propriedade enderecoEmailEnviado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoEmailEnviado() {
        return enderecoEmailEnviado;
    }

    /**
     * Define o valor da propriedade enderecoEmailEnviado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoEmailEnviado(String value) {
        this.enderecoEmailEnviado = value;
    }

    /**
     * Obtém o valor da propriedade dadosBoletos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsBoletos }
     *     
     */
    public ArrayOfWsBoletos getDadosBoletos() {
        return dadosBoletos;
    }

    /**
     * Define o valor da propriedade dadosBoletos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsBoletos }
     *     
     */
    public void setDadosBoletos(ArrayOfWsBoletos value) {
        this.dadosBoletos = value;
    }

}
