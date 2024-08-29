
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsSistemaAvaliacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsSistemaAvaliacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SistemaAvaliacaoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeSistemaAvaliacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormaAvaliacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoAvaliacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescricaoPeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MediaMinima" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FrequenciaMinima" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FormaRecuperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsaExameFinal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UsaHabilidadeDescritiva" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FormaLancamentoHabDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sintese" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Padrao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Conceitos" type="{http://api.sponteeducacional.net.br/}ArrayOfWsConceito" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsSistemaAvaliacao", propOrder = {
    "retornoOperacao",
    "sistemaAvaliacaoID",
    "nomeSistemaAvaliacao",
    "formaAvaliacao",
    "tipoAvaliacao",
    "descricaoPeriodo",
    "mediaMinima",
    "frequenciaMinima",
    "formaRecuperacao",
    "usaExameFinal",
    "usaHabilidadeDescritiva",
    "formaLancamentoHabDesc",
    "sintese",
    "padrao",
    "conceitos"
})
public class WsSistemaAvaliacao {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "SistemaAvaliacaoID")
    protected int sistemaAvaliacaoID;
    @XmlElement(name = "NomeSistemaAvaliacao")
    protected String nomeSistemaAvaliacao;
    @XmlElement(name = "FormaAvaliacao")
    protected String formaAvaliacao;
    @XmlElement(name = "TipoAvaliacao")
    protected String tipoAvaliacao;
    @XmlElement(name = "DescricaoPeriodo")
    protected String descricaoPeriodo;
    @XmlElement(name = "MediaMinima")
    protected double mediaMinima;
    @XmlElement(name = "FrequenciaMinima")
    protected double frequenciaMinima;
    @XmlElement(name = "FormaRecuperacao")
    protected String formaRecuperacao;
    @XmlElement(name = "UsaExameFinal")
    protected int usaExameFinal;
    @XmlElement(name = "UsaHabilidadeDescritiva")
    protected int usaHabilidadeDescritiva;
    @XmlElement(name = "FormaLancamentoHabDesc")
    protected String formaLancamentoHabDesc;
    @XmlElement(name = "Sintese")
    protected String sintese;
    @XmlElement(name = "Padrao")
    protected int padrao;
    @XmlElement(name = "Conceitos")
    protected ArrayOfWsConceito conceitos;

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
     * Obtém o valor da propriedade sistemaAvaliacaoID.
     * 
     */
    public int getSistemaAvaliacaoID() {
        return sistemaAvaliacaoID;
    }

    /**
     * Define o valor da propriedade sistemaAvaliacaoID.
     * 
     */
    public void setSistemaAvaliacaoID(int value) {
        this.sistemaAvaliacaoID = value;
    }

    /**
     * Obtém o valor da propriedade nomeSistemaAvaliacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSistemaAvaliacao() {
        return nomeSistemaAvaliacao;
    }

    /**
     * Define o valor da propriedade nomeSistemaAvaliacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSistemaAvaliacao(String value) {
        this.nomeSistemaAvaliacao = value;
    }

    /**
     * Obtém o valor da propriedade formaAvaliacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaAvaliacao() {
        return formaAvaliacao;
    }

    /**
     * Define o valor da propriedade formaAvaliacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaAvaliacao(String value) {
        this.formaAvaliacao = value;
    }

    /**
     * Obtém o valor da propriedade tipoAvaliacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAvaliacao() {
        return tipoAvaliacao;
    }

    /**
     * Define o valor da propriedade tipoAvaliacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAvaliacao(String value) {
        this.tipoAvaliacao = value;
    }

    /**
     * Obtém o valor da propriedade descricaoPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoPeriodo() {
        return descricaoPeriodo;
    }

    /**
     * Define o valor da propriedade descricaoPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoPeriodo(String value) {
        this.descricaoPeriodo = value;
    }

    /**
     * Obtém o valor da propriedade mediaMinima.
     * 
     */
    public double getMediaMinima() {
        return mediaMinima;
    }

    /**
     * Define o valor da propriedade mediaMinima.
     * 
     */
    public void setMediaMinima(double value) {
        this.mediaMinima = value;
    }

    /**
     * Obtém o valor da propriedade frequenciaMinima.
     * 
     */
    public double getFrequenciaMinima() {
        return frequenciaMinima;
    }

    /**
     * Define o valor da propriedade frequenciaMinima.
     * 
     */
    public void setFrequenciaMinima(double value) {
        this.frequenciaMinima = value;
    }

    /**
     * Obtém o valor da propriedade formaRecuperacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaRecuperacao() {
        return formaRecuperacao;
    }

    /**
     * Define o valor da propriedade formaRecuperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaRecuperacao(String value) {
        this.formaRecuperacao = value;
    }

    /**
     * Obtém o valor da propriedade usaExameFinal.
     * 
     */
    public int getUsaExameFinal() {
        return usaExameFinal;
    }

    /**
     * Define o valor da propriedade usaExameFinal.
     * 
     */
    public void setUsaExameFinal(int value) {
        this.usaExameFinal = value;
    }

    /**
     * Obtém o valor da propriedade usaHabilidadeDescritiva.
     * 
     */
    public int getUsaHabilidadeDescritiva() {
        return usaHabilidadeDescritiva;
    }

    /**
     * Define o valor da propriedade usaHabilidadeDescritiva.
     * 
     */
    public void setUsaHabilidadeDescritiva(int value) {
        this.usaHabilidadeDescritiva = value;
    }

    /**
     * Obtém o valor da propriedade formaLancamentoHabDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaLancamentoHabDesc() {
        return formaLancamentoHabDesc;
    }

    /**
     * Define o valor da propriedade formaLancamentoHabDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaLancamentoHabDesc(String value) {
        this.formaLancamentoHabDesc = value;
    }

    /**
     * Obtém o valor da propriedade sintese.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSintese() {
        return sintese;
    }

    /**
     * Define o valor da propriedade sintese.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSintese(String value) {
        this.sintese = value;
    }

    /**
     * Obtém o valor da propriedade padrao.
     * 
     */
    public int getPadrao() {
        return padrao;
    }

    /**
     * Define o valor da propriedade padrao.
     * 
     */
    public void setPadrao(int value) {
        this.padrao = value;
    }

    /**
     * Obtém o valor da propriedade conceitos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsConceito }
     *     
     */
    public ArrayOfWsConceito getConceitos() {
        return conceitos;
    }

    /**
     * Define o valor da propriedade conceitos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsConceito }
     *     
     */
    public void setConceitos(ArrayOfWsConceito value) {
        this.conceitos = value;
    }

}
