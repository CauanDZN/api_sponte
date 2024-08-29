
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsHorarioDetalhes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsHorarioDetalhes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiaSemana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroAula" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HorarioInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorarioFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsHorarioDetalhes", propOrder = {
    "diaSemana",
    "numeroAula",
    "horarioInicial",
    "horarioFinal"
})
public class WsHorarioDetalhes {

    @XmlElement(name = "DiaSemana")
    protected String diaSemana;
    @XmlElement(name = "NumeroAula")
    protected int numeroAula;
    @XmlElement(name = "HorarioInicial")
    protected String horarioInicial;
    @XmlElement(name = "HorarioFinal")
    protected String horarioFinal;

    /**
     * Obtém o valor da propriedade diaSemana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiaSemana() {
        return diaSemana;
    }

    /**
     * Define o valor da propriedade diaSemana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiaSemana(String value) {
        this.diaSemana = value;
    }

    /**
     * Obtém o valor da propriedade numeroAula.
     * 
     */
    public int getNumeroAula() {
        return numeroAula;
    }

    /**
     * Define o valor da propriedade numeroAula.
     * 
     */
    public void setNumeroAula(int value) {
        this.numeroAula = value;
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

}
