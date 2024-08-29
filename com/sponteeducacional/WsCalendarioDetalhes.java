
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsCalendarioDetalhes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsCalendarioDetalhes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataTermino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiaUtil" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Cor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EventoAnual" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsCalendarioDetalhes", propOrder = {
    "dataInicio",
    "dataTermino",
    "tipoData",
    "descricao",
    "diaUtil",
    "cor",
    "eventoAnual"
})
public class WsCalendarioDetalhes {

    @XmlElement(name = "DataInicio")
    protected String dataInicio;
    @XmlElement(name = "DataTermino")
    protected String dataTermino;
    @XmlElement(name = "TipoData")
    protected String tipoData;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "DiaUtil")
    protected int diaUtil;
    @XmlElement(name = "Cor")
    protected String cor;
    @XmlElement(name = "EventoAnual")
    protected int eventoAnual;

    /**
     * Obtém o valor da propriedade dataInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * Define o valor da propriedade dataInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicio(String value) {
        this.dataInicio = value;
    }

    /**
     * Obtém o valor da propriedade dataTermino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataTermino() {
        return dataTermino;
    }

    /**
     * Define o valor da propriedade dataTermino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataTermino(String value) {
        this.dataTermino = value;
    }

    /**
     * Obtém o valor da propriedade tipoData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoData() {
        return tipoData;
    }

    /**
     * Define o valor da propriedade tipoData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoData(String value) {
        this.tipoData = value;
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
     * Obtém o valor da propriedade diaUtil.
     * 
     */
    public int getDiaUtil() {
        return diaUtil;
    }

    /**
     * Define o valor da propriedade diaUtil.
     * 
     */
    public void setDiaUtil(int value) {
        this.diaUtil = value;
    }

    /**
     * Obtém o valor da propriedade cor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCor() {
        return cor;
    }

    /**
     * Define o valor da propriedade cor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCor(String value) {
        this.cor = value;
    }

    /**
     * Obtém o valor da propriedade eventoAnual.
     * 
     */
    public int getEventoAnual() {
        return eventoAnual;
    }

    /**
     * Define o valor da propriedade eventoAnual.
     * 
     */
    public void setEventoAnual(int value) {
        this.eventoAnual = value;
    }

}
