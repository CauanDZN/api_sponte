
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="sNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nSituacao" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="nTipo" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="sCPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCNPJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sRazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sNumeroEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sComplementoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sInscricaoEstadual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sInscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sTelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sRamal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sTelefoneFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sBairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sConta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCodigoClienteBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nCliente" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="nFornecedor" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="nEscolaAluno" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="nEmpresaAluno" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="sContato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "sNome",
    "nSituacao",
    "nTipo",
    "scpf",
    "srg",
    "scnpj",
    "sRazaoSocial",
    "scep",
    "sEndereco",
    "sNumeroEndereco",
    "sComplementoEndereco",
    "sEmail",
    "sInscricaoEstadual",
    "sInscricaoMunicipal",
    "sObservacao",
    "sTelefone",
    "sRamal",
    "sCelular",
    "sTelefoneFax",
    "sCidade",
    "sBairro",
    "sAgencia",
    "sConta",
    "sCodigoClienteBanco",
    "nCliente",
    "nFornecedor",
    "nEscolaAluno",
    "nEmpresaAluno",
    "sContato"
})
@XmlRootElement(name = "InsertCliente")
public class InsertCliente {

    protected int nCodigoCliente;
    protected String sToken;
    protected String sNome;
    @XmlSchemaType(name = "unsignedByte")
    protected short nSituacao;
    @XmlSchemaType(name = "unsignedByte")
    protected short nTipo;
    @XmlElement(name = "sCPF")
    protected String scpf;
    @XmlElement(name = "sRG")
    protected String srg;
    @XmlElement(name = "sCNPJ")
    protected String scnpj;
    protected String sRazaoSocial;
    @XmlElement(name = "sCEP")
    protected String scep;
    protected String sEndereco;
    protected String sNumeroEndereco;
    protected String sComplementoEndereco;
    protected String sEmail;
    protected String sInscricaoEstadual;
    protected String sInscricaoMunicipal;
    protected String sObservacao;
    protected String sTelefone;
    protected String sRamal;
    protected String sCelular;
    protected String sTelefoneFax;
    protected String sCidade;
    protected String sBairro;
    protected String sAgencia;
    protected String sConta;
    protected String sCodigoClienteBanco;
    @XmlSchemaType(name = "unsignedByte")
    protected short nCliente;
    @XmlSchemaType(name = "unsignedByte")
    protected short nFornecedor;
    @XmlSchemaType(name = "unsignedByte")
    protected short nEscolaAluno;
    @XmlSchemaType(name = "unsignedByte")
    protected short nEmpresaAluno;
    protected String sContato;

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
     * Obtém o valor da propriedade nSituacao.
     * 
     */
    public short getNSituacao() {
        return nSituacao;
    }

    /**
     * Define o valor da propriedade nSituacao.
     * 
     */
    public void setNSituacao(short value) {
        this.nSituacao = value;
    }

    /**
     * Obtém o valor da propriedade nTipo.
     * 
     */
    public short getNTipo() {
        return nTipo;
    }

    /**
     * Define o valor da propriedade nTipo.
     * 
     */
    public void setNTipo(short value) {
        this.nTipo = value;
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
     * Obtém o valor da propriedade scnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCNPJ() {
        return scnpj;
    }

    /**
     * Define o valor da propriedade scnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCNPJ(String value) {
        this.scnpj = value;
    }

    /**
     * Obtém o valor da propriedade sRazaoSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRazaoSocial() {
        return sRazaoSocial;
    }

    /**
     * Define o valor da propriedade sRazaoSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRazaoSocial(String value) {
        this.sRazaoSocial = value;
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
     * Obtém o valor da propriedade sNumeroEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNumeroEndereco() {
        return sNumeroEndereco;
    }

    /**
     * Define o valor da propriedade sNumeroEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNumeroEndereco(String value) {
        this.sNumeroEndereco = value;
    }

    /**
     * Obtém o valor da propriedade sComplementoEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSComplementoEndereco() {
        return sComplementoEndereco;
    }

    /**
     * Define o valor da propriedade sComplementoEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSComplementoEndereco(String value) {
        this.sComplementoEndereco = value;
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
     * Obtém o valor da propriedade sInscricaoEstadual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSInscricaoEstadual() {
        return sInscricaoEstadual;
    }

    /**
     * Define o valor da propriedade sInscricaoEstadual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSInscricaoEstadual(String value) {
        this.sInscricaoEstadual = value;
    }

    /**
     * Obtém o valor da propriedade sInscricaoMunicipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSInscricaoMunicipal() {
        return sInscricaoMunicipal;
    }

    /**
     * Define o valor da propriedade sInscricaoMunicipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSInscricaoMunicipal(String value) {
        this.sInscricaoMunicipal = value;
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
     * Obtém o valor da propriedade sRamal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRamal() {
        return sRamal;
    }

    /**
     * Define o valor da propriedade sRamal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRamal(String value) {
        this.sRamal = value;
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
     * Obtém o valor da propriedade sTelefoneFax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTelefoneFax() {
        return sTelefoneFax;
    }

    /**
     * Define o valor da propriedade sTelefoneFax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTelefoneFax(String value) {
        this.sTelefoneFax = value;
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
     * Obtém o valor da propriedade sAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAgencia() {
        return sAgencia;
    }

    /**
     * Define o valor da propriedade sAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAgencia(String value) {
        this.sAgencia = value;
    }

    /**
     * Obtém o valor da propriedade sConta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSConta() {
        return sConta;
    }

    /**
     * Define o valor da propriedade sConta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSConta(String value) {
        this.sConta = value;
    }

    /**
     * Obtém o valor da propriedade sCodigoClienteBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCodigoClienteBanco() {
        return sCodigoClienteBanco;
    }

    /**
     * Define o valor da propriedade sCodigoClienteBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCodigoClienteBanco(String value) {
        this.sCodigoClienteBanco = value;
    }

    /**
     * Obtém o valor da propriedade nCliente.
     * 
     */
    public short getNCliente() {
        return nCliente;
    }

    /**
     * Define o valor da propriedade nCliente.
     * 
     */
    public void setNCliente(short value) {
        this.nCliente = value;
    }

    /**
     * Obtém o valor da propriedade nFornecedor.
     * 
     */
    public short getNFornecedor() {
        return nFornecedor;
    }

    /**
     * Define o valor da propriedade nFornecedor.
     * 
     */
    public void setNFornecedor(short value) {
        this.nFornecedor = value;
    }

    /**
     * Obtém o valor da propriedade nEscolaAluno.
     * 
     */
    public short getNEscolaAluno() {
        return nEscolaAluno;
    }

    /**
     * Define o valor da propriedade nEscolaAluno.
     * 
     */
    public void setNEscolaAluno(short value) {
        this.nEscolaAluno = value;
    }

    /**
     * Obtém o valor da propriedade nEmpresaAluno.
     * 
     */
    public short getNEmpresaAluno() {
        return nEmpresaAluno;
    }

    /**
     * Define o valor da propriedade nEmpresaAluno.
     * 
     */
    public void setNEmpresaAluno(short value) {
        this.nEmpresaAluno = value;
    }

    /**
     * Obtém o valor da propriedade sContato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSContato() {
        return sContato;
    }

    /**
     * Define o valor da propriedade sContato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSContato(String value) {
        this.sContato = value;
    }

}
