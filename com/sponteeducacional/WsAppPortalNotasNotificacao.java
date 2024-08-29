
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsAppPortalNotasNotificacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsAppPortalNotasNotificacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ResponsavelID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SistemaOperacional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotificaAgenda" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NotificaAtendimento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NotificaNotas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NotificaFinanceiro" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NotificaComunicados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NotificaMensagens" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAppPortalNotasNotificacao", propOrder = {
    "retornoOperacao",
    "alunoID",
    "responsavelID",
    "sistemaOperacional",
    "token",
    "notificaAgenda",
    "notificaAtendimento",
    "notificaNotas",
    "notificaFinanceiro",
    "notificaComunicados",
    "notificaMensagens"
})
public class WsAppPortalNotasNotificacao {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "ResponsavelID")
    protected int responsavelID;
    @XmlElement(name = "SistemaOperacional")
    protected String sistemaOperacional;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "NotificaAgenda")
    protected int notificaAgenda;
    @XmlElement(name = "NotificaAtendimento")
    protected int notificaAtendimento;
    @XmlElement(name = "NotificaNotas")
    protected int notificaNotas;
    @XmlElement(name = "NotificaFinanceiro")
    protected int notificaFinanceiro;
    @XmlElement(name = "NotificaComunicados")
    protected int notificaComunicados;
    @XmlElement(name = "NotificaMensagens")
    protected int notificaMensagens;

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
     * Obtém o valor da propriedade responsavelID.
     * 
     */
    public int getResponsavelID() {
        return responsavelID;
    }

    /**
     * Define o valor da propriedade responsavelID.
     * 
     */
    public void setResponsavelID(int value) {
        this.responsavelID = value;
    }

    /**
     * Obtém o valor da propriedade sistemaOperacional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    /**
     * Define o valor da propriedade sistemaOperacional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaOperacional(String value) {
        this.sistemaOperacional = value;
    }

    /**
     * Obtém o valor da propriedade token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define o valor da propriedade token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtém o valor da propriedade notificaAgenda.
     * 
     */
    public int getNotificaAgenda() {
        return notificaAgenda;
    }

    /**
     * Define o valor da propriedade notificaAgenda.
     * 
     */
    public void setNotificaAgenda(int value) {
        this.notificaAgenda = value;
    }

    /**
     * Obtém o valor da propriedade notificaAtendimento.
     * 
     */
    public int getNotificaAtendimento() {
        return notificaAtendimento;
    }

    /**
     * Define o valor da propriedade notificaAtendimento.
     * 
     */
    public void setNotificaAtendimento(int value) {
        this.notificaAtendimento = value;
    }

    /**
     * Obtém o valor da propriedade notificaNotas.
     * 
     */
    public int getNotificaNotas() {
        return notificaNotas;
    }

    /**
     * Define o valor da propriedade notificaNotas.
     * 
     */
    public void setNotificaNotas(int value) {
        this.notificaNotas = value;
    }

    /**
     * Obtém o valor da propriedade notificaFinanceiro.
     * 
     */
    public int getNotificaFinanceiro() {
        return notificaFinanceiro;
    }

    /**
     * Define o valor da propriedade notificaFinanceiro.
     * 
     */
    public void setNotificaFinanceiro(int value) {
        this.notificaFinanceiro = value;
    }

    /**
     * Obtém o valor da propriedade notificaComunicados.
     * 
     */
    public int getNotificaComunicados() {
        return notificaComunicados;
    }

    /**
     * Define o valor da propriedade notificaComunicados.
     * 
     */
    public void setNotificaComunicados(int value) {
        this.notificaComunicados = value;
    }

    /**
     * Obtém o valor da propriedade notificaMensagens.
     * 
     */
    public int getNotificaMensagens() {
        return notificaMensagens;
    }

    /**
     * Define o valor da propriedade notificaMensagens.
     * 
     */
    public void setNotificaMensagens(int value) {
        this.notificaMensagens = value;
    }

}
