
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsFuncionario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsFuncionario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FuncionarioID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataNascimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CidadeNatal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Atendente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Professor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataAdmissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataDemissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarteiraProfissional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplementoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsFuncionario", propOrder = {
    "retornoOperacao",
    "funcionarioID",
    "nome",
    "cpf",
    "rg",
    "dataNascimento",
    "cep",
    "endereco",
    "numeroEndereco",
    "email",
    "observacao",
    "telefone",
    "celular",
    "numeroMatricula",
    "sexo",
    "cidade",
    "bairro",
    "cidadeNatal",
    "cargo",
    "atendente",
    "professor",
    "situacao",
    "dataAdmissao",
    "dataDemissao",
    "carteiraProfissional",
    "pis",
    "estadoCivil",
    "complementoEndereco"
})
public class WsFuncionario {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "FuncionarioID")
    protected int funcionarioID;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "CPF")
    protected String cpf;
    @XmlElement(name = "RG")
    protected String rg;
    @XmlElement(name = "DataNascimento")
    protected String dataNascimento;
    @XmlElement(name = "CEP")
    protected String cep;
    @XmlElement(name = "Endereco")
    protected String endereco;
    @XmlElement(name = "NumeroEndereco")
    protected String numeroEndereco;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Observacao")
    protected String observacao;
    @XmlElement(name = "Telefone")
    protected String telefone;
    @XmlElement(name = "Celular")
    protected String celular;
    @XmlElement(name = "NumeroMatricula")
    protected String numeroMatricula;
    @XmlElement(name = "Sexo")
    protected String sexo;
    @XmlElement(name = "Cidade")
    protected String cidade;
    @XmlElement(name = "Bairro")
    protected String bairro;
    @XmlElement(name = "CidadeNatal")
    protected String cidadeNatal;
    @XmlElement(name = "Cargo")
    protected String cargo;
    @XmlElement(name = "Atendente")
    protected String atendente;
    @XmlElement(name = "Professor")
    protected String professor;
    @XmlElement(name = "Situacao")
    protected String situacao;
    @XmlElement(name = "DataAdmissao")
    protected String dataAdmissao;
    @XmlElement(name = "DataDemissao")
    protected String dataDemissao;
    @XmlElement(name = "CarteiraProfissional")
    protected String carteiraProfissional;
    @XmlElement(name = "Pis")
    protected String pis;
    @XmlElement(name = "EstadoCivil")
    protected String estadoCivil;
    @XmlElement(name = "ComplementoEndereco")
    protected String complementoEndereco;

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
     * Obtém o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define o valor da propriedade dataNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNascimento(String value) {
        this.dataNascimento = value;
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
     * Obtém o valor da propriedade numeroMatricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    /**
     * Define o valor da propriedade numeroMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMatricula(String value) {
        this.numeroMatricula = value;
    }

    /**
     * Obtém o valor da propriedade sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define o valor da propriedade sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
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
     * Obtém o valor da propriedade cidadeNatal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeNatal() {
        return cidadeNatal;
    }

    /**
     * Define o valor da propriedade cidadeNatal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeNatal(String value) {
        this.cidadeNatal = value;
    }

    /**
     * Obtém o valor da propriedade cargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define o valor da propriedade cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Obtém o valor da propriedade atendente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtendente() {
        return atendente;
    }

    /**
     * Define o valor da propriedade atendente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtendente(String value) {
        this.atendente = value;
    }

    /**
     * Obtém o valor da propriedade professor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessor() {
        return professor;
    }

    /**
     * Define o valor da propriedade professor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessor(String value) {
        this.professor = value;
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
     * Obtém o valor da propriedade dataAdmissao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * Define o valor da propriedade dataAdmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAdmissao(String value) {
        this.dataAdmissao = value;
    }

    /**
     * Obtém o valor da propriedade dataDemissao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDemissao() {
        return dataDemissao;
    }

    /**
     * Define o valor da propriedade dataDemissao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDemissao(String value) {
        this.dataDemissao = value;
    }

    /**
     * Obtém o valor da propriedade carteiraProfissional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarteiraProfissional() {
        return carteiraProfissional;
    }

    /**
     * Define o valor da propriedade carteiraProfissional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarteiraProfissional(String value) {
        this.carteiraProfissional = value;
    }

    /**
     * Obtém o valor da propriedade pis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPis() {
        return pis;
    }

    /**
     * Define o valor da propriedade pis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPis(String value) {
        this.pis = value;
    }

    /**
     * Obtém o valor da propriedade estadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define o valor da propriedade estadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
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

}
