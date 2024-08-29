
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsMensagemResposta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsMensagemResposta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MensagemRespostaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Resposta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataResposta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Lido" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="OrigemDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ResponsavelID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FuncionarioID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "wsMensagemResposta", propOrder = {
    "mensagemRespostaID",
    "resposta",
    "dataResposta",
    "lido",
    "origemDestino",
    "alunoID",
    "responsavelID",
    "funcionarioID",
    "foto"
})
@XmlSeeAlso({
    WsRetNovaRespostaMensagem.class
})
public class WsMensagemResposta {

    @XmlElement(name = "MensagemRespostaID")
    protected int mensagemRespostaID;
    @XmlElement(name = "Resposta")
    protected String resposta;
    @XmlElement(name = "DataResposta")
    protected String dataResposta;
    @XmlElement(name = "Lido")
    @XmlSchemaType(name = "unsignedByte")
    protected short lido;
    @XmlElement(name = "OrigemDestino")
    protected String origemDestino;
    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "ResponsavelID")
    protected int responsavelID;
    @XmlElement(name = "FuncionarioID")
    protected int funcionarioID;
    @XmlElement(name = "Foto")
    protected String foto;

    /**
     * Obtém o valor da propriedade mensagemRespostaID.
     * 
     */
    public int getMensagemRespostaID() {
        return mensagemRespostaID;
    }

    /**
     * Define o valor da propriedade mensagemRespostaID.
     * 
     */
    public void setMensagemRespostaID(int value) {
        this.mensagemRespostaID = value;
    }

    /**
     * Obtém o valor da propriedade resposta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResposta() {
        return resposta;
    }

    /**
     * Define o valor da propriedade resposta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResposta(String value) {
        this.resposta = value;
    }

    /**
     * Obtém o valor da propriedade dataResposta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataResposta() {
        return dataResposta;
    }

    /**
     * Define o valor da propriedade dataResposta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataResposta(String value) {
        this.dataResposta = value;
    }

    /**
     * Obtém o valor da propriedade lido.
     * 
     */
    public short getLido() {
        return lido;
    }

    /**
     * Define o valor da propriedade lido.
     * 
     */
    public void setLido(short value) {
        this.lido = value;
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
     * Obtém o valor da propriedade funcionarioID.
     * 
     */
    public int getFuncionarioID() {
        return funcionarioID;
    }

    /**
     * Define o valor da propriedade funcionarioID.
     * 
     */
    public void setFuncionarioID(int value) {
        this.funcionarioID = value;
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
