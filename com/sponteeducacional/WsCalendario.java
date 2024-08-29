
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsCalendario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsCalendario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalendarioID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeCalendario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SabadoSemAula" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DomingoSemAula" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Padrao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DiasLetivos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CalendarioDetalhes" type="{http://api.sponteeducacional.net.br/}ArrayOfWsCalendarioDetalhes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsCalendario", propOrder = {
    "retornoOperacao",
    "calendarioID",
    "nomeCalendario",
    "sabadoSemAula",
    "domingoSemAula",
    "padrao",
    "diasLetivos",
    "calendarioDetalhes"
})
public class WsCalendario {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "CalendarioID")
    protected int calendarioID;
    @XmlElement(name = "NomeCalendario")
    protected String nomeCalendario;
    @XmlElement(name = "SabadoSemAula")
    protected int sabadoSemAula;
    @XmlElement(name = "DomingoSemAula")
    protected int domingoSemAula;
    @XmlElement(name = "Padrao")
    protected int padrao;
    @XmlElement(name = "DiasLetivos")
    protected int diasLetivos;
    @XmlElement(name = "CalendarioDetalhes")
    protected ArrayOfWsCalendarioDetalhes calendarioDetalhes;

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
     * Obtém o valor da propriedade calendarioID.
     * 
     */
    public int getCalendarioID() {
        return calendarioID;
    }

    /**
     * Define o valor da propriedade calendarioID.
     * 
     */
    public void setCalendarioID(int value) {
        this.calendarioID = value;
    }

    /**
     * Obtém o valor da propriedade nomeCalendario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCalendario() {
        return nomeCalendario;
    }

    /**
     * Define o valor da propriedade nomeCalendario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCalendario(String value) {
        this.nomeCalendario = value;
    }

    /**
     * Obtém o valor da propriedade sabadoSemAula.
     * 
     */
    public int getSabadoSemAula() {
        return sabadoSemAula;
    }

    /**
     * Define o valor da propriedade sabadoSemAula.
     * 
     */
    public void setSabadoSemAula(int value) {
        this.sabadoSemAula = value;
    }

    /**
     * Obtém o valor da propriedade domingoSemAula.
     * 
     */
    public int getDomingoSemAula() {
        return domingoSemAula;
    }

    /**
     * Define o valor da propriedade domingoSemAula.
     * 
     */
    public void setDomingoSemAula(int value) {
        this.domingoSemAula = value;
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
     * Obtém o valor da propriedade diasLetivos.
     * 
     */
    public int getDiasLetivos() {
        return diasLetivos;
    }

    /**
     * Define o valor da propriedade diasLetivos.
     * 
     */
    public void setDiasLetivos(int value) {
        this.diasLetivos = value;
    }

    /**
     * Obtém o valor da propriedade calendarioDetalhes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsCalendarioDetalhes }
     *     
     */
    public ArrayOfWsCalendarioDetalhes getCalendarioDetalhes() {
        return calendarioDetalhes;
    }

    /**
     * Define o valor da propriedade calendarioDetalhes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsCalendarioDetalhes }
     *     
     */
    public void setCalendarioDetalhes(ArrayOfWsCalendarioDetalhes value) {
        this.calendarioDetalhes = value;
    }

}
