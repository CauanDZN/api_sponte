
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsMovimentacoesAlunos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsMovimentacoesAlunos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Movimentacoes" type="{http://api.sponteeducacional.net.br/}ArrayOfWsMovimentacaoAluno" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsMovimentacoesAlunos", propOrder = {
    "retornoOperacao",
    "movimentacoes"
})
public class WsMovimentacoesAlunos {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "Movimentacoes")
    protected ArrayOfWsMovimentacaoAluno movimentacoes;

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
     * Obtém o valor da propriedade movimentacoes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsMovimentacaoAluno }
     *     
     */
    public ArrayOfWsMovimentacaoAluno getMovimentacoes() {
        return movimentacoes;
    }

    /**
     * Define o valor da propriedade movimentacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsMovimentacaoAluno }
     *     
     */
    public void setMovimentacoes(ArrayOfWsMovimentacaoAluno value) {
        this.movimentacoes = value;
    }

}
