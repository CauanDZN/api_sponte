
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsOcorrencias complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsOcorrencias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://api.sponteeducacional.net.br/}RetornoApiBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Aluno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OcorrenciaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Funcionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Turma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescricaoTipoOcorrencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailEnviado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TipoInclusao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NotificacaoApp" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsOcorrencias", propOrder = {
    "alunoID",
    "aluno",
    "ocorrenciaID",
    "usuario",
    "funcionario",
    "turma",
    "descricaoTipoOcorrencia",
    "descricao",
    "data",
    "periodo",
    "emailEnviado",
    "tipoInclusao",
    "notificacaoApp",
    "template"
})
public class WsOcorrencias
    extends RetornoApiBase
{

    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "Aluno")
    protected String aluno;
    @XmlElement(name = "OcorrenciaID")
    protected int ocorrenciaID;
    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Funcionario")
    protected String funcionario;
    @XmlElement(name = "Turma")
    protected String turma;
    @XmlElement(name = "DescricaoTipoOcorrencia")
    protected String descricaoTipoOcorrencia;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "Data")
    protected String data;
    @XmlElement(name = "Periodo")
    protected String periodo;
    @XmlElement(name = "EmailEnviado")
    protected int emailEnviado;
    @XmlElement(name = "TipoInclusao")
    protected int tipoInclusao;
    @XmlElement(name = "NotificacaoApp")
    protected int notificacaoApp;
    @XmlElement(name = "Template")
    protected String template;

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
     * Obtém o valor da propriedade aluno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAluno() {
        return aluno;
    }

    /**
     * Define o valor da propriedade aluno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAluno(String value) {
        this.aluno = value;
    }

    /**
     * Obtém o valor da propriedade ocorrenciaID.
     * 
     */
    public int getOcorrenciaID() {
        return ocorrenciaID;
    }

    /**
     * Define o valor da propriedade ocorrenciaID.
     * 
     */
    public void setOcorrenciaID(int value) {
        this.ocorrenciaID = value;
    }

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade funcionario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncionario() {
        return funcionario;
    }

    /**
     * Define o valor da propriedade funcionario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncionario(String value) {
        this.funcionario = value;
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
     * Obtém o valor da propriedade descricaoTipoOcorrencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoTipoOcorrencia() {
        return descricaoTipoOcorrencia;
    }

    /**
     * Define o valor da propriedade descricaoTipoOcorrencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoTipoOcorrencia(String value) {
        this.descricaoTipoOcorrencia = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Obtém o valor da propriedade periodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Define o valor da propriedade periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
    }

    /**
     * Obtém o valor da propriedade emailEnviado.
     * 
     */
    public int getEmailEnviado() {
        return emailEnviado;
    }

    /**
     * Define o valor da propriedade emailEnviado.
     * 
     */
    public void setEmailEnviado(int value) {
        this.emailEnviado = value;
    }

    /**
     * Obtém o valor da propriedade tipoInclusao.
     * 
     */
    public int getTipoInclusao() {
        return tipoInclusao;
    }

    /**
     * Define o valor da propriedade tipoInclusao.
     * 
     */
    public void setTipoInclusao(int value) {
        this.tipoInclusao = value;
    }

    /**
     * Obtém o valor da propriedade notificacaoApp.
     * 
     */
    public int getNotificacaoApp() {
        return notificacaoApp;
    }

    /**
     * Define o valor da propriedade notificacaoApp.
     * 
     */
    public void setNotificacaoApp(int value) {
        this.notificacaoApp = value;
    }

    /**
     * Obtém o valor da propriedade template.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Define o valor da propriedade template.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

}
