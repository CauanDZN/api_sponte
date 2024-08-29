
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PlanoCurso complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PlanoCurso"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CursoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PlanoCursoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DescricaoPlano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Situacao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Padrao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValorPrimeiraParcelaMensalidade" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DataPrimeiraParcelaMensalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroParcelasMensalidade" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValorParcelaMensalidade" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DataInicialMensalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BolsaIDMensalidade" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DescricaoBolsaMensalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanoContaIDMensalidade" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DescricaoPlanoContaMensalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroParcelasMaterial" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValorParcelaMaterial" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DataInicialMaterial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemEstoqueIDMaterial" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DescricaoItemMaterial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanoContaIDMaterial" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DescricaoPlanoMaterial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroParcelasMatricula" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValorParcelaMatricula" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DataInicialMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanoContaIDMatricula" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DescricaoPlanoMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroParcelasOutros" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValorParcelaOutros" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DataInicialOutros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanoContaIDOutros" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DescricaoPlanoOutros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MesConsiderarAtual" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanoCurso", propOrder = {
    "cursoID",
    "planoCursoID",
    "descricaoPlano",
    "situacao",
    "padrao",
    "valorPrimeiraParcelaMensalidade",
    "dataPrimeiraParcelaMensalidade",
    "numeroParcelasMensalidade",
    "valorParcelaMensalidade",
    "dataInicialMensalidade",
    "bolsaIDMensalidade",
    "descricaoBolsaMensalidade",
    "planoContaIDMensalidade",
    "descricaoPlanoContaMensalidade",
    "numeroParcelasMaterial",
    "valorParcelaMaterial",
    "dataInicialMaterial",
    "itemEstoqueIDMaterial",
    "descricaoItemMaterial",
    "planoContaIDMaterial",
    "descricaoPlanoMaterial",
    "numeroParcelasMatricula",
    "valorParcelaMatricula",
    "dataInicialMatricula",
    "planoContaIDMatricula",
    "descricaoPlanoMatricula",
    "numeroParcelasOutros",
    "valorParcelaOutros",
    "dataInicialOutros",
    "planoContaIDOutros",
    "descricaoPlanoOutros",
    "mesConsiderarAtual"
})
public class PlanoCurso {

    @XmlElement(name = "CursoID")
    protected int cursoID;
    @XmlElement(name = "PlanoCursoID")
    protected int planoCursoID;
    @XmlElement(name = "DescricaoPlano")
    protected String descricaoPlano;
    @XmlElement(name = "Situacao")
    protected int situacao;
    @XmlElement(name = "Padrao")
    protected int padrao;
    @XmlElement(name = "ValorPrimeiraParcelaMensalidade")
    protected double valorPrimeiraParcelaMensalidade;
    @XmlElement(name = "DataPrimeiraParcelaMensalidade")
    protected String dataPrimeiraParcelaMensalidade;
    @XmlElement(name = "NumeroParcelasMensalidade")
    protected int numeroParcelasMensalidade;
    @XmlElement(name = "ValorParcelaMensalidade")
    protected double valorParcelaMensalidade;
    @XmlElement(name = "DataInicialMensalidade")
    protected String dataInicialMensalidade;
    @XmlElement(name = "BolsaIDMensalidade")
    protected int bolsaIDMensalidade;
    @XmlElement(name = "DescricaoBolsaMensalidade")
    protected String descricaoBolsaMensalidade;
    @XmlElement(name = "PlanoContaIDMensalidade")
    protected int planoContaIDMensalidade;
    @XmlElement(name = "DescricaoPlanoContaMensalidade")
    protected String descricaoPlanoContaMensalidade;
    @XmlElement(name = "NumeroParcelasMaterial")
    protected int numeroParcelasMaterial;
    @XmlElement(name = "ValorParcelaMaterial")
    protected double valorParcelaMaterial;
    @XmlElement(name = "DataInicialMaterial")
    protected String dataInicialMaterial;
    @XmlElement(name = "ItemEstoqueIDMaterial")
    protected int itemEstoqueIDMaterial;
    @XmlElement(name = "DescricaoItemMaterial")
    protected String descricaoItemMaterial;
    @XmlElement(name = "PlanoContaIDMaterial")
    protected int planoContaIDMaterial;
    @XmlElement(name = "DescricaoPlanoMaterial")
    protected String descricaoPlanoMaterial;
    @XmlElement(name = "NumeroParcelasMatricula")
    protected int numeroParcelasMatricula;
    @XmlElement(name = "ValorParcelaMatricula")
    protected double valorParcelaMatricula;
    @XmlElement(name = "DataInicialMatricula")
    protected String dataInicialMatricula;
    @XmlElement(name = "PlanoContaIDMatricula")
    protected int planoContaIDMatricula;
    @XmlElement(name = "DescricaoPlanoMatricula")
    protected String descricaoPlanoMatricula;
    @XmlElement(name = "NumeroParcelasOutros")
    protected int numeroParcelasOutros;
    @XmlElement(name = "ValorParcelaOutros")
    protected double valorParcelaOutros;
    @XmlElement(name = "DataInicialOutros")
    protected String dataInicialOutros;
    @XmlElement(name = "PlanoContaIDOutros")
    protected int planoContaIDOutros;
    @XmlElement(name = "DescricaoPlanoOutros")
    protected String descricaoPlanoOutros;
    @XmlElement(name = "MesConsiderarAtual")
    protected int mesConsiderarAtual;

    /**
     * Obtém o valor da propriedade cursoID.
     * 
     */
    public int getCursoID() {
        return cursoID;
    }

    /**
     * Define o valor da propriedade cursoID.
     * 
     */
    public void setCursoID(int value) {
        this.cursoID = value;
    }

    /**
     * Obtém o valor da propriedade planoCursoID.
     * 
     */
    public int getPlanoCursoID() {
        return planoCursoID;
    }

    /**
     * Define o valor da propriedade planoCursoID.
     * 
     */
    public void setPlanoCursoID(int value) {
        this.planoCursoID = value;
    }

    /**
     * Obtém o valor da propriedade descricaoPlano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoPlano() {
        return descricaoPlano;
    }

    /**
     * Define o valor da propriedade descricaoPlano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoPlano(String value) {
        this.descricaoPlano = value;
    }

    /**
     * Obtém o valor da propriedade situacao.
     * 
     */
    public int getSituacao() {
        return situacao;
    }

    /**
     * Define o valor da propriedade situacao.
     * 
     */
    public void setSituacao(int value) {
        this.situacao = value;
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
     * Obtém o valor da propriedade valorPrimeiraParcelaMensalidade.
     * 
     */
    public double getValorPrimeiraParcelaMensalidade() {
        return valorPrimeiraParcelaMensalidade;
    }

    /**
     * Define o valor da propriedade valorPrimeiraParcelaMensalidade.
     * 
     */
    public void setValorPrimeiraParcelaMensalidade(double value) {
        this.valorPrimeiraParcelaMensalidade = value;
    }

    /**
     * Obtém o valor da propriedade dataPrimeiraParcelaMensalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPrimeiraParcelaMensalidade() {
        return dataPrimeiraParcelaMensalidade;
    }

    /**
     * Define o valor da propriedade dataPrimeiraParcelaMensalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPrimeiraParcelaMensalidade(String value) {
        this.dataPrimeiraParcelaMensalidade = value;
    }

    /**
     * Obtém o valor da propriedade numeroParcelasMensalidade.
     * 
     */
    public int getNumeroParcelasMensalidade() {
        return numeroParcelasMensalidade;
    }

    /**
     * Define o valor da propriedade numeroParcelasMensalidade.
     * 
     */
    public void setNumeroParcelasMensalidade(int value) {
        this.numeroParcelasMensalidade = value;
    }

    /**
     * Obtém o valor da propriedade valorParcelaMensalidade.
     * 
     */
    public double getValorParcelaMensalidade() {
        return valorParcelaMensalidade;
    }

    /**
     * Define o valor da propriedade valorParcelaMensalidade.
     * 
     */
    public void setValorParcelaMensalidade(double value) {
        this.valorParcelaMensalidade = value;
    }

    /**
     * Obtém o valor da propriedade dataInicialMensalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicialMensalidade() {
        return dataInicialMensalidade;
    }

    /**
     * Define o valor da propriedade dataInicialMensalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicialMensalidade(String value) {
        this.dataInicialMensalidade = value;
    }

    /**
     * Obtém o valor da propriedade bolsaIDMensalidade.
     * 
     */
    public int getBolsaIDMensalidade() {
        return bolsaIDMensalidade;
    }

    /**
     * Define o valor da propriedade bolsaIDMensalidade.
     * 
     */
    public void setBolsaIDMensalidade(int value) {
        this.bolsaIDMensalidade = value;
    }

    /**
     * Obtém o valor da propriedade descricaoBolsaMensalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoBolsaMensalidade() {
        return descricaoBolsaMensalidade;
    }

    /**
     * Define o valor da propriedade descricaoBolsaMensalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoBolsaMensalidade(String value) {
        this.descricaoBolsaMensalidade = value;
    }

    /**
     * Obtém o valor da propriedade planoContaIDMensalidade.
     * 
     */
    public int getPlanoContaIDMensalidade() {
        return planoContaIDMensalidade;
    }

    /**
     * Define o valor da propriedade planoContaIDMensalidade.
     * 
     */
    public void setPlanoContaIDMensalidade(int value) {
        this.planoContaIDMensalidade = value;
    }

    /**
     * Obtém o valor da propriedade descricaoPlanoContaMensalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoPlanoContaMensalidade() {
        return descricaoPlanoContaMensalidade;
    }

    /**
     * Define o valor da propriedade descricaoPlanoContaMensalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoPlanoContaMensalidade(String value) {
        this.descricaoPlanoContaMensalidade = value;
    }

    /**
     * Obtém o valor da propriedade numeroParcelasMaterial.
     * 
     */
    public int getNumeroParcelasMaterial() {
        return numeroParcelasMaterial;
    }

    /**
     * Define o valor da propriedade numeroParcelasMaterial.
     * 
     */
    public void setNumeroParcelasMaterial(int value) {
        this.numeroParcelasMaterial = value;
    }

    /**
     * Obtém o valor da propriedade valorParcelaMaterial.
     * 
     */
    public double getValorParcelaMaterial() {
        return valorParcelaMaterial;
    }

    /**
     * Define o valor da propriedade valorParcelaMaterial.
     * 
     */
    public void setValorParcelaMaterial(double value) {
        this.valorParcelaMaterial = value;
    }

    /**
     * Obtém o valor da propriedade dataInicialMaterial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicialMaterial() {
        return dataInicialMaterial;
    }

    /**
     * Define o valor da propriedade dataInicialMaterial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicialMaterial(String value) {
        this.dataInicialMaterial = value;
    }

    /**
     * Obtém o valor da propriedade itemEstoqueIDMaterial.
     * 
     */
    public int getItemEstoqueIDMaterial() {
        return itemEstoqueIDMaterial;
    }

    /**
     * Define o valor da propriedade itemEstoqueIDMaterial.
     * 
     */
    public void setItemEstoqueIDMaterial(int value) {
        this.itemEstoqueIDMaterial = value;
    }

    /**
     * Obtém o valor da propriedade descricaoItemMaterial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoItemMaterial() {
        return descricaoItemMaterial;
    }

    /**
     * Define o valor da propriedade descricaoItemMaterial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoItemMaterial(String value) {
        this.descricaoItemMaterial = value;
    }

    /**
     * Obtém o valor da propriedade planoContaIDMaterial.
     * 
     */
    public int getPlanoContaIDMaterial() {
        return planoContaIDMaterial;
    }

    /**
     * Define o valor da propriedade planoContaIDMaterial.
     * 
     */
    public void setPlanoContaIDMaterial(int value) {
        this.planoContaIDMaterial = value;
    }

    /**
     * Obtém o valor da propriedade descricaoPlanoMaterial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoPlanoMaterial() {
        return descricaoPlanoMaterial;
    }

    /**
     * Define o valor da propriedade descricaoPlanoMaterial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoPlanoMaterial(String value) {
        this.descricaoPlanoMaterial = value;
    }

    /**
     * Obtém o valor da propriedade numeroParcelasMatricula.
     * 
     */
    public int getNumeroParcelasMatricula() {
        return numeroParcelasMatricula;
    }

    /**
     * Define o valor da propriedade numeroParcelasMatricula.
     * 
     */
    public void setNumeroParcelasMatricula(int value) {
        this.numeroParcelasMatricula = value;
    }

    /**
     * Obtém o valor da propriedade valorParcelaMatricula.
     * 
     */
    public double getValorParcelaMatricula() {
        return valorParcelaMatricula;
    }

    /**
     * Define o valor da propriedade valorParcelaMatricula.
     * 
     */
    public void setValorParcelaMatricula(double value) {
        this.valorParcelaMatricula = value;
    }

    /**
     * Obtém o valor da propriedade dataInicialMatricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicialMatricula() {
        return dataInicialMatricula;
    }

    /**
     * Define o valor da propriedade dataInicialMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicialMatricula(String value) {
        this.dataInicialMatricula = value;
    }

    /**
     * Obtém o valor da propriedade planoContaIDMatricula.
     * 
     */
    public int getPlanoContaIDMatricula() {
        return planoContaIDMatricula;
    }

    /**
     * Define o valor da propriedade planoContaIDMatricula.
     * 
     */
    public void setPlanoContaIDMatricula(int value) {
        this.planoContaIDMatricula = value;
    }

    /**
     * Obtém o valor da propriedade descricaoPlanoMatricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoPlanoMatricula() {
        return descricaoPlanoMatricula;
    }

    /**
     * Define o valor da propriedade descricaoPlanoMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoPlanoMatricula(String value) {
        this.descricaoPlanoMatricula = value;
    }

    /**
     * Obtém o valor da propriedade numeroParcelasOutros.
     * 
     */
    public int getNumeroParcelasOutros() {
        return numeroParcelasOutros;
    }

    /**
     * Define o valor da propriedade numeroParcelasOutros.
     * 
     */
    public void setNumeroParcelasOutros(int value) {
        this.numeroParcelasOutros = value;
    }

    /**
     * Obtém o valor da propriedade valorParcelaOutros.
     * 
     */
    public double getValorParcelaOutros() {
        return valorParcelaOutros;
    }

    /**
     * Define o valor da propriedade valorParcelaOutros.
     * 
     */
    public void setValorParcelaOutros(double value) {
        this.valorParcelaOutros = value;
    }

    /**
     * Obtém o valor da propriedade dataInicialOutros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicialOutros() {
        return dataInicialOutros;
    }

    /**
     * Define o valor da propriedade dataInicialOutros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicialOutros(String value) {
        this.dataInicialOutros = value;
    }

    /**
     * Obtém o valor da propriedade planoContaIDOutros.
     * 
     */
    public int getPlanoContaIDOutros() {
        return planoContaIDOutros;
    }

    /**
     * Define o valor da propriedade planoContaIDOutros.
     * 
     */
    public void setPlanoContaIDOutros(int value) {
        this.planoContaIDOutros = value;
    }

    /**
     * Obtém o valor da propriedade descricaoPlanoOutros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoPlanoOutros() {
        return descricaoPlanoOutros;
    }

    /**
     * Define o valor da propriedade descricaoPlanoOutros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoPlanoOutros(String value) {
        this.descricaoPlanoOutros = value;
    }

    /**
     * Obtém o valor da propriedade mesConsiderarAtual.
     * 
     */
    public int getMesConsiderarAtual() {
        return mesConsiderarAtual;
    }

    /**
     * Define o valor da propriedade mesConsiderarAtual.
     * 
     */
    public void setMesConsiderarAtual(int value) {
        this.mesConsiderarAtual = value;
    }

}
