
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsAluno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://api.sponteeducacional.net.br/}RetornoApiBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Midia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataNascimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataCadastro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoginPortal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenhaPortal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TurmaAtual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponsavelFinanceiroID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ResponsavelDidaticoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumeroMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CidadeNatal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Inadimplente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Origem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CursoInteresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfoBloqueada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nacionalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Classificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Responsaveis" type="{http://api.sponteeducacional.net.br/}ArrayOfWsResponsaveis" minOccurs="0"/&gt;
 *         &lt;element name="ComplementoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAluno", propOrder = {
    "alunoID",
    "nome",
    "cpf",
    "rg",
    "midia",
    "dataNascimento",
    "cep",
    "endereco",
    "numeroEndereco",
    "email",
    "dataCadastro",
    "ra",
    "loginPortal",
    "senhaPortal",
    "observacao",
    "telefone",
    "celular",
    "turmaAtual",
    "responsavelFinanceiroID",
    "responsavelDidaticoID",
    "numeroMatricula",
    "sexo",
    "situacao",
    "cidade",
    "bairro",
    "cidadeNatal",
    "inadimplente",
    "origem",
    "nomeOrigem",
    "cursoInteresse",
    "infoBloqueada",
    "nacionalidade",
    "classificacao",
    "responsaveis",
    "complementoEndereco"
})
public class WsAluno
    extends RetornoApiBase
{

    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "CPF")
    protected String cpf;
    @XmlElement(name = "RG")
    protected String rg;
    @XmlElement(name = "Midia")
    protected String midia;
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
    @XmlElement(name = "DataCadastro")
    protected String dataCadastro;
    @XmlElement(name = "RA")
    protected String ra;
    @XmlElement(name = "LoginPortal")
    protected String loginPortal;
    @XmlElement(name = "SenhaPortal")
    protected String senhaPortal;
    @XmlElement(name = "Observacao")
    protected String observacao;
    @XmlElement(name = "Telefone")
    protected String telefone;
    @XmlElement(name = "Celular")
    protected String celular;
    @XmlElement(name = "TurmaAtual")
    protected String turmaAtual;
    @XmlElement(name = "ResponsavelFinanceiroID")
    protected int responsavelFinanceiroID;
    @XmlElement(name = "ResponsavelDidaticoID")
    protected int responsavelDidaticoID;
    @XmlElement(name = "NumeroMatricula")
    protected String numeroMatricula;
    @XmlElement(name = "Sexo")
    protected String sexo;
    @XmlElement(name = "Situacao")
    protected String situacao;
    @XmlElement(name = "Cidade")
    protected String cidade;
    @XmlElement(name = "Bairro")
    protected String bairro;
    @XmlElement(name = "CidadeNatal")
    protected String cidadeNatal;
    @XmlElement(name = "Inadimplente")
    protected String inadimplente;
    @XmlElement(name = "Origem")
    protected int origem;
    @XmlElement(name = "NomeOrigem")
    protected String nomeOrigem;
    @XmlElement(name = "CursoInteresse")
    protected String cursoInteresse;
    @XmlElement(name = "InfoBloqueada")
    protected String infoBloqueada;
    @XmlElement(name = "Nacionalidade")
    protected String nacionalidade;
    @XmlElement(name = "Classificacao")
    protected String classificacao;
    @XmlElement(name = "Responsaveis")
    protected ArrayOfWsResponsaveis responsaveis;
    @XmlElement(name = "ComplementoEndereco")
    protected String complementoEndereco;

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
     * Obtém o valor da propriedade midia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidia() {
        return midia;
    }

    /**
     * Define o valor da propriedade midia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidia(String value) {
        this.midia = value;
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
     * Obtém o valor da propriedade ra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRA() {
        return ra;
    }

    /**
     * Define o valor da propriedade ra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRA(String value) {
        this.ra = value;
    }

    /**
     * Obtém o valor da propriedade loginPortal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginPortal() {
        return loginPortal;
    }

    /**
     * Define o valor da propriedade loginPortal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginPortal(String value) {
        this.loginPortal = value;
    }

    /**
     * Obtém o valor da propriedade senhaPortal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaPortal() {
        return senhaPortal;
    }

    /**
     * Define o valor da propriedade senhaPortal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaPortal(String value) {
        this.senhaPortal = value;
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
     * Obtém o valor da propriedade turmaAtual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurmaAtual() {
        return turmaAtual;
    }

    /**
     * Define o valor da propriedade turmaAtual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurmaAtual(String value) {
        this.turmaAtual = value;
    }

    /**
     * Obtém o valor da propriedade responsavelFinanceiroID.
     * 
     */
    public int getResponsavelFinanceiroID() {
        return responsavelFinanceiroID;
    }

    /**
     * Define o valor da propriedade responsavelFinanceiroID.
     * 
     */
    public void setResponsavelFinanceiroID(int value) {
        this.responsavelFinanceiroID = value;
    }

    /**
     * Obtém o valor da propriedade responsavelDidaticoID.
     * 
     */
    public int getResponsavelDidaticoID() {
        return responsavelDidaticoID;
    }

    /**
     * Define o valor da propriedade responsavelDidaticoID.
     * 
     */
    public void setResponsavelDidaticoID(int value) {
        this.responsavelDidaticoID = value;
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
     * Obtém o valor da propriedade inadimplente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInadimplente() {
        return inadimplente;
    }

    /**
     * Define o valor da propriedade inadimplente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInadimplente(String value) {
        this.inadimplente = value;
    }

    /**
     * Obtém o valor da propriedade origem.
     * 
     */
    public int getOrigem() {
        return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     */
    public void setOrigem(int value) {
        this.origem = value;
    }

    /**
     * Obtém o valor da propriedade nomeOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeOrigem() {
        return nomeOrigem;
    }

    /**
     * Define o valor da propriedade nomeOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeOrigem(String value) {
        this.nomeOrigem = value;
    }

    /**
     * Obtém o valor da propriedade cursoInteresse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCursoInteresse() {
        return cursoInteresse;
    }

    /**
     * Define o valor da propriedade cursoInteresse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCursoInteresse(String value) {
        this.cursoInteresse = value;
    }

    /**
     * Obtém o valor da propriedade infoBloqueada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoBloqueada() {
        return infoBloqueada;
    }

    /**
     * Define o valor da propriedade infoBloqueada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoBloqueada(String value) {
        this.infoBloqueada = value;
    }

    /**
     * Obtém o valor da propriedade nacionalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Define o valor da propriedade nacionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidade(String value) {
        this.nacionalidade = value;
    }

    /**
     * Obtém o valor da propriedade classificacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificacao() {
        return classificacao;
    }

    /**
     * Define o valor da propriedade classificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificacao(String value) {
        this.classificacao = value;
    }

    /**
     * Obtém o valor da propriedade responsaveis.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsResponsaveis }
     *     
     */
    public ArrayOfWsResponsaveis getResponsaveis() {
        return responsaveis;
    }

    /**
     * Define o valor da propriedade responsaveis.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsResponsaveis }
     *     
     */
    public void setResponsaveis(ArrayOfWsResponsaveis value) {
        this.responsaveis = value;
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
