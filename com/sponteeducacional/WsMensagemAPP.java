
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsMensagemAPP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsMensagemAPP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MensagemID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MensagemInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Funcionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigemDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ResponsavelID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TipoInclusao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MensagemResposta" type="{http://api.sponteeducacional.net.br/}ArrayOfWsMensagemResposta" minOccurs="0"/&gt;
 *         &lt;element name="Foto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsMensagemAPP", propOrder = {
    "retornoOperacao",
    "mensagemID",
    "mensagemInicial",
    "funcionario",
    "origemDestino",
    "alunoID",
    "responsavelID",
    "tipoInclusao",
    "mensagemResposta",
    "foto"
})
public class WsMensagemAPP {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "MensagemID")
    protected int mensagemID;
    @XmlElement(name = "MensagemInicial")
    protected String mensagemInicial;
    @XmlElement(name = "Funcionario")
    protected String funcionario;
    @XmlElement(name = "OrigemDestino")
    protected String origemDestino;
    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "ResponsavelID")
    protected int responsavelID;
    @XmlElement(name = "TipoInclusao")
    protected int tipoInclusao;
    @XmlElement(name = "MensagemResposta")
    protected ArrayOfWsMensagemResposta mensagemResposta;
    @XmlElement(name = "Foto")
    protected String foto;

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
     * Obtém o valor da propriedade alunoID.
     * 
     */
    public int getAlunoID() {
        return alunoID;
    }

    /**
     * Define o valor da propriedade alunoID.
     * 
     */
    public void setAlunoID(int value) {
        this.alunoID = value;
    }

    /**
     * Obtém o valor da propriedade responsavelID.
     * 
     */
    public int getResponsavelID() {
        return responsavelID;
    }

    /**
     * Define o valor da propriedade responsavelID.
     * 
     */
    public void setResponsavelID(int value) {
        this.responsavelID = value;
    }

    /**
     * Obtém o valor da propriedade tipoInclusao.
     * 
     */
    public int getTipoInclusao() {
        return tipoInclusao;
    }

    /**
     * Define o valor da propriedade tipoInclusao.
     * 
     */
    public void setTipoInclusao(int value) {
        this.tipoInclusao = value;
    }

    /**
     * Obtém o valor da propriedade mensagemResposta.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsMensagemResposta }
     *     
     */
    public ArrayOfWsMensagemResposta getMensagemResposta() {
        return mensagemResposta;
    }

    /**
     * Define o valor da propriedade mensagemResposta.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsMensagemResposta }
     *     
     */
    public void setMensagemResposta(ArrayOfWsMensagemResposta value) {
        this.mensagemResposta = value;
    }

    /**
     * Obtém o valor da propriedade foto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Define o valor da propriedade foto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoto(String value) {
        this.foto = value;
    }

}
