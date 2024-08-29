
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsAtendimentos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsAtendimentos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeAluno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AtendenteID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeAtendente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResultadoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DescricaoResultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoAtendimentoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeTipoAtendimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataAtendimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAtendimentos", propOrder = {
    "alunoID",
    "nomeAluno",
    "atendenteID",
    "nomeAtendente",
    "resultadoID",
    "descricaoResultado",
    "tipoAtendimentoID",
    "nomeTipoAtendimento",
    "dataAtendimento",
    "observacao",
    "retornoOperacao"
})
public class WsAtendimentos {

    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "NomeAluno")
    protected String nomeAluno;
    @XmlElement(name = "AtendenteID")
    protected int atendenteID;
    @XmlElement(name = "NomeAtendente")
    protected String nomeAtendente;
    @XmlElement(name = "ResultadoID")
    protected int resultadoID;
    @XmlElement(name = "DescricaoResultado")
    protected String descricaoResultado;
    @XmlElement(name = "TipoAtendimentoID")
    protected int tipoAtendimentoID;
    @XmlElement(name = "NomeTipoAtendimento")
    protected String nomeTipoAtendimento;
    @XmlElement(name = "DataAtendimento")
    protected String dataAtendimento;
    @XmlElement(name = "Observacao")
    protected String observacao;
    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;

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
     * Obtém o valor da propriedade nomeAluno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * Define o valor da propriedade nomeAluno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAluno(String value) {
        this.nomeAluno = value;
    }

    /**
     * Obtém o valor da propriedade atendenteID.
     * 
     */
    public int getAtendenteID() {
        return atendenteID;
    }

    /**
     * Define o valor da propriedade atendenteID.
     * 
     */
    public void setAtendenteID(int value) {
        this.atendenteID = value;
    }

    /**
     * Obtém o valor da propriedade nomeAtendente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAtendente() {
        return nomeAtendente;
    }

    /**
     * Define o valor da propriedade nomeAtendente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAtendente(String value) {
        this.nomeAtendente = value;
    }

    /**
     * Obtém o valor da propriedade resultadoID.
     * 
     */
    public int getResultadoID() {
        return resultadoID;
    }

    /**
     * Define o valor da propriedade resultadoID.
     * 
     */
    public void setResultadoID(int value) {
        this.resultadoID = value;
    }

    /**
     * Obtém o valor da propriedade descricaoResultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoResultado() {
        return descricaoResultado;
    }

    /**
     * Define o valor da propriedade descricaoResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoResultado(String value) {
        this.descricaoResultado = value;
    }

    /**
     * Obtém o valor da propriedade tipoAtendimentoID.
     * 
     */
    public int getTipoAtendimentoID() {
        return tipoAtendimentoID;
    }

    /**
     * Define o valor da propriedade tipoAtendimentoID.
     * 
     */
    public void setTipoAtendimentoID(int value) {
        this.tipoAtendimentoID = value;
    }

    /**
     * Obtém o valor da propriedade nomeTipoAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTipoAtendimento() {
        return nomeTipoAtendimento;
    }

    /**
     * Define o valor da propriedade nomeTipoAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTipoAtendimento(String value) {
        this.nomeTipoAtendimento = value;
    }

    /**
     * Obtém o valor da propriedade dataAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAtendimento() {
        return dataAtendimento;
    }

    /**
     * Define o valor da propriedade dataAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAtendimento(String value) {
        this.dataAtendimento = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

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

}
