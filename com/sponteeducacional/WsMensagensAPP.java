
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsMensagensAPP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsMensagensAPP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MensagemID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MensagemInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataUltimaResposta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Funcionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigemDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UltimaMensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsMensagensAPP", propOrder = {
    "retornoOperacao",
    "mensagemID",
    "mensagemInicial",
    "dataUltimaResposta",
    "funcionario",
    "origemDestino",
    "ultimaMensagem"
})
public class WsMensagensAPP {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "MensagemID")
    protected int mensagemID;
    @XmlElement(name = "MensagemInicial")
    protected String mensagemInicial;
    @XmlElement(name = "DataUltimaResposta")
    protected String dataUltimaResposta;
    @XmlElement(name = "Funcionario")
    protected String funcionario;
    @XmlElement(name = "OrigemDestino")
    protected String origemDestino;
    @XmlElement(name = "UltimaMensagem")
    protected String ultimaMensagem;

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
     * Obtém o valor da propriedade mensagemID.
     * 
     */
    public int getMensagemID() {
        return mensagemID;
    }

    /**
     * Define o valor da propriedade mensagemID.
     * 
     */
    public void setMensagemID(int value) {
        this.mensagemID = value;
    }

    /**
     * Obtém o valor da propriedade mensagemInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagemInicial() {
        return mensagemInicial;
    }

    /**
     * Define o valor da propriedade mensagemInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagemInicial(String value) {
        this.mensagemInicial = value;
    }

    /**
     * Obtém o valor da propriedade dataUltimaResposta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltimaResposta() {
        return dataUltimaResposta;
    }

    /**
     * Define o valor da propriedade dataUltimaResposta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltimaResposta(String value) {
        this.dataUltimaResposta = value;
    }

    /**
     * Obtém o valor da propriedade funcionario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncionario() {
        return funcionario;
    }

    /**
     * Define o valor da propriedade funcionario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncionario(String value) {
        this.funcionario = value;
    }

    /**
     * Obtém o valor da propriedade origemDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigemDestino() {
        return origemDestino;
    }

    /**
     * Define o valor da propriedade origemDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigemDestino(String value) {
        this.origemDestino = value;
    }

    /**
     * Obtém o valor da propriedade ultimaMensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimaMensagem() {
        return ultimaMensagem;
    }

    /**
     * Define o valor da propriedade ultimaMensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimaMensagem(String value) {
        this.ultimaMensagem = value;
    }

}
