
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsGestaoComercial complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsGestaoComercial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DadosGestaoComercial" type="{http://api.sponteeducacional.net.br/}ArrayOfIndicesGestaoComercial" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsGestaoComercial", propOrder = {
    "retornoOperacao",
    "dadosGestaoComercial"
})
public class WsGestaoComercial {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "DadosGestaoComercial")
    protected ArrayOfIndicesGestaoComercial dadosGestaoComercial;

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
     * Obtém o valor da propriedade dadosGestaoComercial.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndicesGestaoComercial }
     *     
     */
    public ArrayOfIndicesGestaoComercial getDadosGestaoComercial() {
        return dadosGestaoComercial;
    }

    /**
     * Define o valor da propriedade dadosGestaoComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndicesGestaoComercial }
     *     
     */
    public void setDadosGestaoComercial(ArrayOfIndicesGestaoComercial value) {
        this.dadosGestaoComercial = value;
    }

}
