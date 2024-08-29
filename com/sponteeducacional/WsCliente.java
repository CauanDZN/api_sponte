
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsCliente complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClienteID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplementoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataCadastro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InscricaoEstadual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ramal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefoneFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Conta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoClienteBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EscolaAluno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmpresaAluno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsCliente", propOrder = {
    "retornoOperacao",
    "clienteID",
    "situacao",
    "nome",
    "cpf",
    "rg",
    "cnpj",
    "razaoSocial",
    "cep",
    "endereco",
    "numeroEndereco",
    "complementoEndereco",
    "email",
    "dataCadastro",
    "inscricaoEstadual",
    "inscricaoMunicipal",
    "observacao",
    "telefone",
    "ramal",
    "celular",
    "telefoneFax",
    "tipo",
    "cidade",
    "bairro",
    "agencia",
    "conta",
    "codigoClienteBanco",
    "cliente",
    "fornecedor",
    "escolaAluno",
    "empresaAluno",
    "contato"
})
public class WsCliente {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "ClienteID")
    protected int clienteID;
    @XmlElement(name = "Situacao")
    protected String situacao;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "CPF")
    protected String cpf;
    @XmlElement(name = "RG")
    protected String rg;
    @XmlElement(name = "CNPJ")
    protected String cnpj;
    @XmlElement(name = "RazaoSocial")
    protected String razaoSocial;
    @XmlElement(name = "CEP")
    protected String cep;
    @XmlElement(name = "Endereco")
    protected String endereco;
    @XmlElement(name = "NumeroEndereco")
    protected String numeroEndereco;
    @XmlElement(name = "ComplementoEndereco")
    protected String complementoEndereco;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "DataCadastro")
    protected String dataCadastro;
    @XmlElement(name = "InscricaoEstadual")
    protected String inscricaoEstadual;
    @XmlElement(name = "InscricaoMunicipal")
    protected String inscricaoMunicipal;
    @XmlElement(name = "Observacao")
    protected String observacao;
    @XmlElement(name = "Telefone")
    protected String telefone;
    @XmlElement(name = "Ramal")
    protected String ramal;
    @XmlElement(name = "Celular")
    protected String celular;
    @XmlElement(name = "TelefoneFax")
    protected String telefoneFax;
    @XmlElement(name = "Tipo")
    protected String tipo;
    @XmlElement(name = "Cidade")
    protected String cidade;
    @XmlElement(name = "Bairro")
    protected String bairro;
    @XmlElement(name = "Agencia")
    protected String agencia;
    @XmlElement(name = "Conta")
    protected String conta;
    @XmlElement(name = "CodigoClienteBanco")
    protected String codigoClienteBanco;
    @XmlElement(name = "Cliente")
    protected String cliente;
    @XmlElement(name = "Fornecedor")
    protected String fornecedor;
    @XmlElement(name = "EscolaAluno")
    protected String escolaAluno;
    @XmlElement(name = "EmpresaAluno")
    protected String empresaAluno;
    @XmlElement(name = "Contato")
    protected String contato;

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
     * Obtém o valor da propriedade clienteID.
     * 
     */
    public int getClienteID() {
        return clienteID;
    }

    /**
     * Define o valor da propriedade clienteID.
     * 
     */
    public void setClienteID(int value) {
        this.clienteID = value;
    }

    /**
     * Obtém o valor da propriedade situacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * Define o valor da propriedade situacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacao(String value) {
        this.situacao = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPF(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade rg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRG() {
        return rg;
    }

    /**
     * Define o valor da propriedade rg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRG(String value) {
        this.rg = value;
    }

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJ() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJ(String value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade razaoSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Define o valor da propriedade razaoSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEP() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEP(String value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade numeroEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    /**
     * Define o valor da propriedade numeroEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEndereco(String value) {
        this.numeroEndereco = value;
    }

    /**
     * Obtém o valor da propriedade complementoEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    /**
     * Define o valor da propriedade complementoEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoEndereco(String value) {
        this.complementoEndereco = value;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade dataCadastro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCadastro() {
        return dataCadastro;
    }

    /**
     * Define o valor da propriedade dataCadastro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCadastro(String value) {
        this.dataCadastro = value;
    }

    /**
     * Obtém o valor da propriedade inscricaoEstadual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    /**
     * Define o valor da propriedade inscricaoEstadual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoEstadual(String value) {
        this.inscricaoEstadual = value;
    }

    /**
     * Obtém o valor da propriedade inscricaoMunicipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    /**
     * Define o valor da propriedade inscricaoMunicipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoMunicipal(String value) {
        this.inscricaoMunicipal = value;
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
     * Obtém o valor da propriedade telefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o valor da propriedade telefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone(String value) {
        this.telefone = value;
    }

    /**
     * Obtém o valor da propriedade ramal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamal() {
        return ramal;
    }

    /**
     * Define o valor da propriedade ramal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamal(String value) {
        this.ramal = value;
    }

    /**
     * Obtém o valor da propriedade celular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Define o valor da propriedade celular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

    /**
     * Obtém o valor da propriedade telefoneFax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneFax() {
        return telefoneFax;
    }

    /**
     * Define o valor da propriedade telefoneFax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneFax(String value) {
        this.telefoneFax = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade agencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define o valor da propriedade agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencia(String value) {
        this.agencia = value;
    }

    /**
     * Obtém o valor da propriedade conta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConta() {
        return conta;
    }

    /**
     * Define o valor da propriedade conta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConta(String value) {
        this.conta = value;
    }

    /**
     * Obtém o valor da propriedade codigoClienteBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClienteBanco() {
        return codigoClienteBanco;
    }

    /**
     * Define o valor da propriedade codigoClienteBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClienteBanco(String value) {
        this.codigoClienteBanco = value;
    }

    /**
     * Obtém o valor da propriedade cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define o valor da propriedade cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtém o valor da propriedade fornecedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * Define o valor da propriedade fornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFornecedor(String value) {
        this.fornecedor = value;
    }

    /**
     * Obtém o valor da propriedade escolaAluno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscolaAluno() {
        return escolaAluno;
    }

    /**
     * Define o valor da propriedade escolaAluno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscolaAluno(String value) {
        this.escolaAluno = value;
    }

    /**
     * Obtém o valor da propriedade empresaAluno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresaAluno() {
        return empresaAluno;
    }

    /**
     * Define o valor da propriedade empresaAluno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresaAluno(String value) {
        this.empresaAluno = value;
    }

    /**
     * Obtém o valor da propriedade contato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define o valor da propriedade contato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContato(String value) {
        this.contato = value;
    }

}
