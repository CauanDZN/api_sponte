
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Indicador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Indicador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NomeIndicador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Meta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Real" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Performance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Indicador", propOrder = {
    "nomeIndicador",
    "meta",
    "real",
    "performance"
})
public class Indicador {

    @XmlElement(name = "NomeIndicador")
    protected String nomeIndicador;
    @XmlElement(name = "Meta")
    protected int meta;
    @XmlElement(name = "Real")
    protected int real;
    @XmlElement(name = "Performance")
    protected double performance;

    /**
     * Obtém o valor da propriedade nomeIndicador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeIndicador() {
        return nomeIndicador;
    }

    /**
     * Define o valor da propriedade nomeIndicador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeIndicador(String value) {
        this.nomeIndicador = value;
    }

    /**
     * Obtém o valor da propriedade meta.
     * 
     */
    public int getMeta() {
        return meta;
    }

    /**
     * Define o valor da propriedade meta.
     * 
     */
    public void setMeta(int value) {
        this.meta = value;
    }

    /**
     * Obtém o valor da propriedade real.
     * 
     */
    public int getReal() {
        return real;
    }

    /**
     * Define o valor da propriedade real.
     * 
     */
    public void setReal(int value) {
        this.real = value;
    }

    /**
     * Obtém o valor da propriedade performance.
     * 
     */
    public double getPerformance() {
        return performance;
    }

    /**
     * Define o valor da propriedade performance.
     * 
     */
    public void setPerformance(double value) {
        this.performance = value;
    }

}
