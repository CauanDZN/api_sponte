
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsFinanceiro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsFinanceiro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoUnidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContaReceberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Aluno" type="{http://api.sponteeducacional.net.br/}ArrayOfWsInfoAluno" minOccurs="0"/&gt;
 *         &lt;element name="NumeroParcelas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SituacaoContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Curso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Turma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalValorBruto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalValorLiquido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalDescontoReais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalDescontoPercentual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoPlano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parcelas" type="{http://api.sponteeducacional.net.br/}ArrayOfWsParcela" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsFinanceiro", propOrder = {
    "retornoOperacao",
    "codigoUnidade",
    "contaReceberID",
    "aluno",
    "numeroParcelas",
    "numeroContrato",
    "situacaoContrato",
    "curso",
    "serie",
    "turma",
    "totalValorBruto",
    "totalValorLiquido",
    "totalDescontoReais",
    "totalDescontoPercentual",
    "categoria",
    "tipoPlano",
    "parcelas"
})
public class WsFinanceiro {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "CodigoUnidade")
    protected String codigoUnidade;
    @XmlElement(name = "ContaReceberID")
    protected String contaReceberID;
    @XmlElement(name = "Aluno")
    protected ArrayOfWsInfoAluno aluno;
    @XmlElement(name = "NumeroParcelas")
    protected String numeroParcelas;
    @XmlElement(name = "NumeroContrato")
    protected String numeroContrato;
    @XmlElement(name = "SituacaoContrato")
    protected String situacaoContrato;
    @XmlElement(name = "Curso")
    protected String curso;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "Turma")
    protected String turma;
    @XmlElement(name = "TotalValorBruto")
    protected String totalValorBruto;
    @XmlElement(name = "TotalValorLiquido")
    protected String totalValorLiquido;
    @XmlElement(name = "TotalDescontoReais")
    protected String totalDescontoReais;
    @XmlElement(name = "TotalDescontoPercentual")
    protected String totalDescontoPercentual;
    @XmlElement(name = "Categoria")
    protected String categoria;
    @XmlElement(name = "TipoPlano")
    protected String tipoPlano;
    @XmlElement(name = "Parcelas")
    protected ArrayOfWsParcela parcelas;

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
     * Obtém o valor da propriedade codigoUnidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUnidade() {
        return codigoUnidade;
    }

    /**
     * Define o valor da propriedade codigoUnidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUnidade(String value) {
        this.codigoUnidade = value;
    }

    /**
     * Obtém o valor da propriedade contaReceberID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContaReceberID() {
        return contaReceberID;
    }

    /**
     * Define o valor da propriedade contaReceberID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContaReceberID(String value) {
        this.contaReceberID = value;
    }

    /**
     * Obtém o valor da propriedade aluno.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsInfoAluno }
     *     
     */
    public ArrayOfWsInfoAluno getAluno() {
        return aluno;
    }

    /**
     * Define o valor da propriedade aluno.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsInfoAluno }
     *     
     */
    public void setAluno(ArrayOfWsInfoAluno value) {
        this.aluno = value;
    }

    /**
     * Obtém o valor da propriedade numeroParcelas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroParcelas() {
        return numeroParcelas;
    }

    /**
     * Define o valor da propriedade numeroParcelas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroParcelas(String value) {
        this.numeroParcelas = value;
    }

    /**
     * Obtém o valor da propriedade numeroContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Define o valor da propriedade numeroContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroContrato(String value) {
        this.numeroContrato = value;
    }

    /**
     * Obtém o valor da propriedade situacaoContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoContrato() {
        return situacaoContrato;
    }

    /**
     * Define o valor da propriedade situacaoContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoContrato(String value) {
        this.situacaoContrato = value;
    }

    /**
     * Obtém o valor da propriedade curso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Define o valor da propriedade curso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurso(String value) {
        this.curso = value;
    }

    /**
     * Obtém o valor da propriedade serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define o valor da propriedade serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtém o valor da propriedade turma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurma() {
        return turma;
    }

    /**
     * Define o valor da propriedade turma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurma(String value) {
        this.turma = value;
    }

    /**
     * Obtém o valor da propriedade totalValorBruto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalValorBruto() {
        return totalValorBruto;
    }

    /**
     * Define o valor da propriedade totalValorBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalValorBruto(String value) {
        this.totalValorBruto = value;
    }

    /**
     * Obtém o valor da propriedade totalValorLiquido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalValorLiquido() {
        return totalValorLiquido;
    }

    /**
     * Define o valor da propriedade totalValorLiquido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalValorLiquido(String value) {
        this.totalValorLiquido = value;
    }

    /**
     * Obtém o valor da propriedade totalDescontoReais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDescontoReais() {
        return totalDescontoReais;
    }

    /**
     * Define o valor da propriedade totalDescontoReais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDescontoReais(String value) {
        this.totalDescontoReais = value;
    }

    /**
     * Obtém o valor da propriedade totalDescontoPercentual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDescontoPercentual() {
        return totalDescontoPercentual;
    }

    /**
     * Define o valor da propriedade totalDescontoPercentual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDescontoPercentual(String value) {
        this.totalDescontoPercentual = value;
    }

    /**
     * Obtém o valor da propriedade categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define o valor da propriedade categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtém o valor da propriedade tipoPlano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPlano() {
        return tipoPlano;
    }

    /**
     * Define o valor da propriedade tipoPlano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPlano(String value) {
        this.tipoPlano = value;
    }

    /**
     * Obtém o valor da propriedade parcelas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsParcela }
     *     
     */
    public ArrayOfWsParcela getParcelas() {
        return parcelas;
    }

    /**
     * Define o valor da propriedade parcelas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsParcela }
     *     
     */
    public void setParcelas(ArrayOfWsParcela value) {
        this.parcelas = value;
    }

}
