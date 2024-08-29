
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
 *         &lt;element name="nAlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sMidia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dDataNascimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sBairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nNumeroEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nResponsavelFinanceiroID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nResponsavelDidaticoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sTelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sProfissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCidadeNatal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sRa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sNumeroMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSituacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCursoInteresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sInfoBloqueada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sOrigemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sOrigemNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nAlunoID",
    "sNome",
    "sMidia",
    "dDataNascimento",
    "sCidade",
    "sBairro",
    "scep",
    "sEndereco",
    "nNumeroEndereco",
    "scpf",
    "srg",
    "nResponsavelFinanceiroID",
    "nResponsavelDidaticoID",
    "sEmail",
    "sTelefone",
    "sCelular",
    "sObservacao",
    "sSexo",
    "sProfissao",
    "sCidadeNatal",
    "sRa",
    "sNumeroMatricula",
    "sSituacao",
    "sCursoInteresse",
    "sInfoBloqueada",
    "sOrigemID",
    "sOrigemNome"
})
@XmlRootElement(name = "UpdateAlunos2")
public class UpdateAlunos2 {

    protected int nCodigoCliente;
    protected String sToken;
    protected int nAlunoID;
    protected String sNome;
    protected String sMidia;
    protected String dDataNascimento;
    protected String sCidade;
    protected String sBairro;
    @XmlElement(name = "sCEP")
    protected String scep;
    protected String sEndereco;
    protected String nNumeroEndereco;
    @XmlElement(name = "sCPF")
    protected String scpf;
    @XmlElement(name = "sRG")
    protected String srg;
    protected String nResponsavelFinanceiroID;
    protected String nResponsavelDidaticoID;
    protected String sEmail;
    protected String sTelefone;
    protected String sCelular;
    protected String sObservacao;
    protected String sSexo;
    protected String sProfissao;
    protected String sCidadeNatal;
    protected String sRa;
    protected String sNumeroMatricula;
    protected String sSituacao;
    protected String sCursoInteresse;
    protected String sInfoBloqueada;
    protected String sOrigemID;
    protected String sOrigemNome;

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
     * Obtém o valor da propriedade nAlunoID.
     * 
     */
    public int getNAlunoID() {
        return nAlunoID;
    }

    /**
     * Define o valor da propriedade nAlunoID.
     * 
     */
    public void setNAlunoID(int value) {
        this.nAlunoID = value;
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
     * Obtém o valor da propriedade sMidia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMidia() {
        return sMidia;
    }

    /**
     * Define o valor da propriedade sMidia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMidia(String value) {
        this.sMidia = value;
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
     * Obtém o valor da propriedade scpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCPF() {
        return scpf;
    }

    /**
     * Define o valor da propriedade scpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCPF(String value) {
        this.scpf = value;
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
     * Obtém o valor da propriedade nResponsavelFinanceiroID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNResponsavelFinanceiroID() {
        return nResponsavelFinanceiroID;
    }

    /**
     * Define o valor da propriedade nResponsavelFinanceiroID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNResponsavelFinanceiroID(String value) {
        this.nResponsavelFinanceiroID = value;
    }

    /**
     * Obtém o valor da propriedade nResponsavelDidaticoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNResponsavelDidaticoID() {
        return nResponsavelDidaticoID;
    }

    /**
     * Define o valor da propriedade nResponsavelDidaticoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNResponsavelDidaticoID(String value) {
        this.nResponsavelDidaticoID = value;
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
     * Obtém o valor da propriedade sCidadeNatal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCidadeNatal() {
        return sCidadeNatal;
    }

    /**
     * Define o valor da propriedade sCidadeNatal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCidadeNatal(String value) {
        this.sCidadeNatal = value;
    }

    /**
     * Obtém o valor da propriedade sRa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRa() {
        return sRa;
    }

    /**
     * Define o valor da propriedade sRa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRa(String value) {
        this.sRa = value;
    }

    /**
     * Obtém o valor da propriedade sNumeroMatricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNumeroMatricula() {
        return sNumeroMatricula;
    }

    /**
     * Define o valor da propriedade sNumeroMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNumeroMatricula(String value) {
        this.sNumeroMatricula = value;
    }

    /**
     * Obtém o valor da propriedade sSituacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSituacao() {
        return sSituacao;
    }

    /**
     * Define o valor da propriedade sSituacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSituacao(String value) {
        this.sSituacao = value;
    }

    /**
     * Obtém o valor da propriedade sCursoInteresse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCursoInteresse() {
        return sCursoInteresse;
    }

    /**
     * Define o valor da propriedade sCursoInteresse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCursoInteresse(String value) {
        this.sCursoInteresse = value;
    }

    /**
     * Obtém o valor da propriedade sInfoBloqueada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSInfoBloqueada() {
        return sInfoBloqueada;
    }

    /**
     * Define o valor da propriedade sInfoBloqueada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSInfoBloqueada(String value) {
        this.sInfoBloqueada = value;
    }

    /**
     * Obtém o valor da propriedade sOrigemID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOrigemID() {
        return sOrigemID;
    }

    /**
     * Define o valor da propriedade sOrigemID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOrigemID(String value) {
        this.sOrigemID = value;
    }

    /**
     * Obtém o valor da propriedade sOrigemNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOrigemNome() {
        return sOrigemNome;
    }

    /**
     * Define o valor da propriedade sOrigemNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOrigemNome(String value) {
        this.sOrigemNome = value;
    }

}
