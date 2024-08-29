
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsNotasPeriodos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsNotasPeriodos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomePeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormulaCalculoLivre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MediaPrevista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotasParciais" type="{http://api.sponteeducacional.net.br/}ArrayOfWsNotaParcial" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsNotasPeriodos", propOrder = {
    "periodo",
    "nomePeriodo",
    "formulaCalculoLivre",
    "mediaPrevista",
    "notasParciais"
})
public class WsNotasPeriodos {

    @XmlElement(name = "Periodo")
    protected int periodo;
    @XmlElement(name = "NomePeriodo")
    protected String nomePeriodo;
    @XmlElement(name = "FormulaCalculoLivre")
    protected String formulaCalculoLivre;
    @XmlElement(name = "MediaPrevista")
    protected String mediaPrevista;
    @XmlElement(name = "NotasParciais")
    protected ArrayOfWsNotaParcial notasParciais;

    /**
     * Obtém o valor da propriedade periodo.
     * 
     */
    public int getPeriodo() {
        return periodo;
    }

    /**
     * Define o valor da propriedade periodo.
     * 
     */
    public void setPeriodo(int value) {
        this.periodo = value;
    }

    /**
     * Obtém o valor da propriedade nomePeriodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePeriodo() {
        return nomePeriodo;
    }

    /**
     * Define o valor da propriedade nomePeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePeriodo(String value) {
        this.nomePeriodo = value;
    }

    /**
     * Obtém o valor da propriedade formulaCalculoLivre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaCalculoLivre() {
        return formulaCalculoLivre;
    }

    /**
     * Define o valor da propriedade formulaCalculoLivre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaCalculoLivre(String value) {
        this.formulaCalculoLivre = value;
    }

    /**
     * Obtém o valor da propriedade mediaPrevista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaPrevista() {
        return mediaPrevista;
    }

    /**
     * Define o valor da propriedade mediaPrevista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaPrevista(String value) {
        this.mediaPrevista = value;
    }

    /**
     * Obtém o valor da propriedade notasParciais.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsNotaParcial }
     *     
     */
    public ArrayOfWsNotaParcial getNotasParciais() {
        return notasParciais;
    }

    /**
     * Define o valor da propriedade notasParciais.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsNotaParcial }
     *     
     */
    public void setNotasParciais(ArrayOfWsNotaParcial value) {
        this.notasParciais = value;
    }

}
