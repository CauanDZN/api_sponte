
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsComunicadoAPP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsComunicadoAPP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComunicadoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Comunicado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Funcionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Lido" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Anexos" type="{http://api.sponteeducacional.net.br/}ArrayOfWsAnexosComunicados" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsComunicadoAPP", propOrder = {
    "retornoOperacao",
    "comunicadoID",
    "comunicado",
    "data",
    "funcionario",
    "lido",
    "descricao",
    "alunoID",
    "anexos"
})
public class WsComunicadoAPP {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "ComunicadoID")
    protected int comunicadoID;
    @XmlElement(name = "Comunicado")
    protected String comunicado;
    @XmlElement(name = "Data")
    protected String data;
    @XmlElement(name = "Funcionario")
    protected String funcionario;
    @XmlElement(name = "Lido")
    @XmlSchemaType(name = "unsignedByte")
    protected short lido;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "Anexos")
    protected ArrayOfWsAnexosComunicados anexos;

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
     * Obtém o valor da propriedade comunicadoID.
     * 
     */
    public int getComunicadoID() {
        return comunicadoID;
    }

    /**
     * Define o valor da propriedade comunicadoID.
     * 
     */
    public void setComunicadoID(int value) {
        this.comunicadoID = value;
    }

    /**
     * Obtém o valor da propriedade comunicado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComunicado() {
        return comunicado;
    }

    /**
     * Define o valor da propriedade comunicado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComunicado(String value) {
        this.comunicado = value;
    }

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
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
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
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
     * Obtém o valor da propriedade anexos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsAnexosComunicados }
     *     
     */
    public ArrayOfWsAnexosComunicados getAnexos() {
        return anexos;
    }

    /**
     * Define o valor da propriedade anexos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsAnexosComunicados }
     *     
     */
    public void setAnexos(ArrayOfWsAnexosComunicados value) {
        this.anexos = value;
    }

}
