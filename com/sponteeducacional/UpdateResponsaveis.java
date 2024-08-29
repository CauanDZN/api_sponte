
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nCodigoCliente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nResponsavelID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dDataNascimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nParentesco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nNumeroEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCPFCNPJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sBairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sTelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nAlunoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lResponsavelFinanceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lResponsavelDidatico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sProfissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nTipoPessoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nCodigoCliente",
    "sToken",
    "nResponsavelID",
    "sNome",
    "dDataNascimento",
    "nParentesco",
    "scep",
    "sEndereco",
    "nNumeroEndereco",
    "srg",
    "scpfcnpj",
    "sCidade",
    "sBairro",
    "sEmail",
    "sTelefone",
    "sCelular",
    "nAlunoID",
    "lResponsavelFinanceiro",
    "lResponsavelDidatico",
    "sObservacao",
    "sSexo",
    "sProfissao",
    "nTipoPessoa"
})
@XmlRootElement(name = "UpdateResponsaveis")
public class UpdateResponsaveis {

    protected int nCodigoCliente;
    protected String sToken;
    protected int nResponsavelID;
    protected String sNome;
    protected String dDataNascimento;
    protected String nParentesco;
    @XmlElement(name = "sCEP")
    protected String scep;
    protected String sEndereco;
    protected String nNumeroEndereco;
    @XmlElement(name = "sRG")
    protected String srg;
    @XmlElement(name = "sCPFCNPJ")
    protected String scpfcnpj;
    protected String sCidade;
    protected String sBairro;
    protected String sEmail;
    protected String sTelefone;
    protected String sCelular;
    protected String nAlunoID;
    protected String lResponsavelFinanceiro;
    protected String lResponsavelDidatico;
    protected String sObservacao;
    protected String sSexo;
    protected String sProfissao;
    protected String nTipoPessoa;

    /**
     * Obtém o valor da propriedade nCodigoCliente.
     * 
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }

    /**
     * Define o valor da propriedade nCodigoCliente.
     * 
     */
    public void setNCodigoCliente(int value) {
        this.nCodigoCliente = value;
    }

    /**
     * Obtém o valor da propriedade sToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSToken() {
        return sToken;
    }

    /**
     * Define o valor da propriedade sToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSToken(String value) {
        this.sToken = value;
    }

    /**
     * Obtém o valor da propriedade nResponsavelID.
     * 
     */
    public int getNResponsavelID() {
        return nResponsavelID;
    }

    /**
     * Define o valor da propriedade nResponsavelID.
     * 
     */
    public void setNResponsavelID(int value) {
        this.nResponsavelID = value;
    }

    /**
     * Obtém o valor da propriedade sNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNome() {
        return sNome;
    }

    /**
     * Define o valor da propriedade sNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNome(String value) {
        this.sNome = value;
    }

    /**
     * Obtém o valor da propriedade dDataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDataNascimento() {
        return dDataNascimento;
    }

    /**
     * Define o valor da propriedade dDataNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDataNascimento(String value) {
        this.dDataNascimento = value;
    }

    /**
     * Obtém o valor da propriedade nParentesco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNParentesco() {
        return nParentesco;
    }

    /**
     * Define o valor da propriedade nParentesco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNParentesco(String value) {
        this.nParentesco = value;
    }

    /**
     * Obtém o valor da propriedade scep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCEP() {
        return scep;
    }

    /**
     * Define o valor da propriedade scep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCEP(String value) {
        this.scep = value;
    }

    /**
     * Obtém o valor da propriedade sEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEndereco() {
        return sEndereco;
    }

    /**
     * Define o valor da propriedade sEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEndereco(String value) {
        this.sEndereco = value;
    }

    /**
     * Obtém o valor da propriedade nNumeroEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNNumeroEndereco() {
        return nNumeroEndereco;
    }

    /**
     * Define o valor da propriedade nNumeroEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNNumeroEndereco(String value) {
        this.nNumeroEndereco = value;
    }

    /**
     * Obtém o valor da propriedade srg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRG() {
        return srg;
    }

    /**
     * Define o valor da propriedade srg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRG(String value) {
        this.srg = value;
    }

    /**
     * Obtém o valor da propriedade scpfcnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCPFCNPJ() {
        return scpfcnpj;
    }

    /**
     * Define o valor da propriedade scpfcnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCPFCNPJ(String value) {
        this.scpfcnpj = value;
    }

    /**
     * Obtém o valor da propriedade sCidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCidade() {
        return sCidade;
    }

    /**
     * Define o valor da propriedade sCidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCidade(String value) {
        this.sCidade = value;
    }

    /**
     * Obtém o valor da propriedade sBairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBairro() {
        return sBairro;
    }

    /**
     * Define o valor da propriedade sBairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBairro(String value) {
        this.sBairro = value;
    }

    /**
     * Obtém o valor da propriedade sEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEmail() {
        return sEmail;
    }

    /**
     * Define o valor da propriedade sEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEmail(String value) {
        this.sEmail = value;
    }

    /**
     * Obtém o valor da propriedade sTelefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTelefone() {
        return sTelefone;
    }

    /**
     * Define o valor da propriedade sTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTelefone(String value) {
        this.sTelefone = value;
    }

    /**
     * Obtém o valor da propriedade sCelular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCelular() {
        return sCelular;
    }

    /**
     * Define o valor da propriedade sCelular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCelular(String value) {
        this.sCelular = value;
    }

    /**
     * Obtém o valor da propriedade nAlunoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAlunoID() {
        return nAlunoID;
    }

    /**
     * Define o valor da propriedade nAlunoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAlunoID(String value) {
        this.nAlunoID = value;
    }

    /**
     * Obtém o valor da propriedade lResponsavelFinanceiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLResponsavelFinanceiro() {
        return lResponsavelFinanceiro;
    }

    /**
     * Define o valor da propriedade lResponsavelFinanceiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLResponsavelFinanceiro(String value) {
        this.lResponsavelFinanceiro = value;
    }

    /**
     * Obtém o valor da propriedade lResponsavelDidatico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLResponsavelDidatico() {
        return lResponsavelDidatico;
    }

    /**
     * Define o valor da propriedade lResponsavelDidatico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLResponsavelDidatico(String value) {
        this.lResponsavelDidatico = value;
    }

    /**
     * Obtém o valor da propriedade sObservacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSObservacao() {
        return sObservacao;
    }

    /**
     * Define o valor da propriedade sObservacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSObservacao(String value) {
        this.sObservacao = value;
    }

    /**
     * Obtém o valor da propriedade sSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSexo() {
        return sSexo;
    }

    /**
     * Define o valor da propriedade sSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSexo(String value) {
        this.sSexo = value;
    }

    /**
     * Obtém o valor da propriedade sProfissao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSProfissao() {
        return sProfissao;
    }

    /**
     * Define o valor da propriedade sProfissao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSProfissao(String value) {
        this.sProfissao = value;
    }

    /**
     * Obtém o valor da propriedade nTipoPessoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTipoPessoa() {
        return nTipoPessoa;
    }

    /**
     * Define o valor da propriedade nTipoPessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTipoPessoa(String value) {
        this.nTipoPessoa = value;
    }

}
