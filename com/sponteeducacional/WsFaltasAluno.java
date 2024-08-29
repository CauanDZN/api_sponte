
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsFaltasAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsFaltasAluno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataAula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DuracaoAula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsFaltasAluno", propOrder = {
    "dataAula",
    "horarioInicial",
    "horarioFinal",
    "duracaoAula"
})
public class WsFaltasAluno {

    @XmlElement(name = "DataAula")
    protected String dataAula;
    @XmlElement(name = "HorarioInicial")
    protected String horarioInicial;
    @XmlElement(name = "HorarioFinal")
    protected String horarioFinal;
    @XmlElement(name = "DuracaoAula")
    protected String duracaoAula;

    /**
     * Obtém o valor da propriedade dataAula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAula() {
        return dataAula;
    }

    /**
     * Define o valor da propriedade dataAula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAula(String value) {
        this.dataAula = value;
    }

    /**
     * Obtém o valor da propriedade horarioInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorarioInicial() {
        return horarioInicial;
    }

    /**
     * Define o valor da propriedade horarioInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorarioInicial(String value) {
        this.horarioInicial = value;
    }

    /**
     * Obtém o valor da propriedade horarioFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorarioFinal() {
        return horarioFinal;
    }

    /**
     * Define o valor da propriedade horarioFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorarioFinal(String value) {
        this.horarioFinal = value;
    }

    /**
     * Obtém o valor da propriedade duracaoAula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuracaoAula() {
        return duracaoAula;
    }

    /**
     * Define o valor da propriedade duracaoAula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuracaoAula(String value) {
        this.duracaoAula = value;
    }

}
