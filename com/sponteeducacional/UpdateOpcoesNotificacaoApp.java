
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="nAlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nResponsavelID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nNotificaAgenda" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nNotificaAtendimento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nNotificaNota" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nNotificaFinanceiro" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nNotificaComunicados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nNotificaMensagem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sTokenMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nAlunoID",
    "nResponsavelID",
    "nNotificaAgenda",
    "nNotificaAtendimento",
    "nNotificaNota",
    "nNotificaFinanceiro",
    "nNotificaComunicados",
    "nNotificaMensagem",
    "sTokenMobile",
    "sToken"
})
@XmlRootElement(name = "UpdateOpcoesNotificacaoApp")
public class UpdateOpcoesNotificacaoApp {

    protected int nCodigoCliente;
    protected int nAlunoID;
    protected int nResponsavelID;
    protected int nNotificaAgenda;
    protected int nNotificaAtendimento;
    protected int nNotificaNota;
    protected int nNotificaFinanceiro;
    protected int nNotificaComunicados;
    protected int nNotificaMensagem;
    protected String sTokenMobile;
    protected String sToken;

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
     * Obtém o valor da propriedade nNotificaAgenda.
     * 
     */
    public int getNNotificaAgenda() {
        return nNotificaAgenda;
    }

    /**
     * Define o valor da propriedade nNotificaAgenda.
     * 
     */
    public void setNNotificaAgenda(int value) {
        this.nNotificaAgenda = value;
    }

    /**
     * Obtém o valor da propriedade nNotificaAtendimento.
     * 
     */
    public int getNNotificaAtendimento() {
        return nNotificaAtendimento;
    }

    /**
     * Define o valor da propriedade nNotificaAtendimento.
     * 
     */
    public void setNNotificaAtendimento(int value) {
        this.nNotificaAtendimento = value;
    }

    /**
     * Obtém o valor da propriedade nNotificaNota.
     * 
     */
    public int getNNotificaNota() {
        return nNotificaNota;
    }

    /**
     * Define o valor da propriedade nNotificaNota.
     * 
     */
    public void setNNotificaNota(int value) {
        this.nNotificaNota = value;
    }

    /**
     * Obtém o valor da propriedade nNotificaFinanceiro.
     * 
     */
    public int getNNotificaFinanceiro() {
        return nNotificaFinanceiro;
    }

    /**
     * Define o valor da propriedade nNotificaFinanceiro.
     * 
     */
    public void setNNotificaFinanceiro(int value) {
        this.nNotificaFinanceiro = value;
    }

    /**
     * Obtém o valor da propriedade nNotificaComunicados.
     * 
     */
    public int getNNotificaComunicados() {
        return nNotificaComunicados;
    }

    /**
     * Define o valor da propriedade nNotificaComunicados.
     * 
     */
    public void setNNotificaComunicados(int value) {
        this.nNotificaComunicados = value;
    }

    /**
     * Obtém o valor da propriedade nNotificaMensagem.
     * 
     */
    public int getNNotificaMensagem() {
        return nNotificaMensagem;
    }

    /**
     * Define o valor da propriedade nNotificaMensagem.
     * 
     */
    public void setNNotificaMensagem(int value) {
        this.nNotificaMensagem = value;
    }

    /**
     * Obtém o valor da propriedade sTokenMobile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTokenMobile() {
        return sTokenMobile;
    }

    /**
     * Define o valor da propriedade sTokenMobile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTokenMobile(String value) {
        this.sTokenMobile = value;
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

}
