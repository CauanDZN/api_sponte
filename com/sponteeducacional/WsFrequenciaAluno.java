
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsFrequenciaAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsFrequenciaAluno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeAluno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorasAssistidas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HorasFaltas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PercentualFrequencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalFaltas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalPresencas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Faltas" type="{http://api.sponteeducacional.net.br/}ArrayOfWsFaltasAluno" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsFrequenciaAluno", propOrder = {
    "alunoID",
    "nomeAluno",
    "horasAssistidas",
    "horasFaltas",
    "percentualFrequencia",
    "totalFaltas",
    "totalPresencas",
    "faltas"
})
public class WsFrequenciaAluno {

    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "NomeAluno")
    protected String nomeAluno;
    @XmlElement(name = "HorasAssistidas")
    protected String horasAssistidas;
    @XmlElement(name = "HorasFaltas")
    protected String horasFaltas;
    @XmlElement(name = "PercentualFrequencia")
    protected String percentualFrequencia;
    @XmlElement(name = "TotalFaltas")
    protected int totalFaltas;
    @XmlElement(name = "TotalPresencas")
    protected int totalPresencas;
    @XmlElement(name = "Faltas")
    protected ArrayOfWsFaltasAluno faltas;

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
     * Obtém o valor da propriedade nomeAluno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * Define o valor da propriedade nomeAluno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAluno(String value) {
        this.nomeAluno = value;
    }

    /**
     * Obtém o valor da propriedade horasAssistidas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorasAssistidas() {
        return horasAssistidas;
    }

    /**
     * Define o valor da propriedade horasAssistidas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorasAssistidas(String value) {
        this.horasAssistidas = value;
    }

    /**
     * Obtém o valor da propriedade horasFaltas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorasFaltas() {
        return horasFaltas;
    }

    /**
     * Define o valor da propriedade horasFaltas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorasFaltas(String value) {
        this.horasFaltas = value;
    }

    /**
     * Obtém o valor da propriedade percentualFrequencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentualFrequencia() {
        return percentualFrequencia;
    }

    /**
     * Define o valor da propriedade percentualFrequencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentualFrequencia(String value) {
        this.percentualFrequencia = value;
    }

    /**
     * Obtém o valor da propriedade totalFaltas.
     * 
     */
    public int getTotalFaltas() {
        return totalFaltas;
    }

    /**
     * Define o valor da propriedade totalFaltas.
     * 
     */
    public void setTotalFaltas(int value) {
        this.totalFaltas = value;
    }

    /**
     * Obtém o valor da propriedade totalPresencas.
     * 
     */
    public int getTotalPresencas() {
        return totalPresencas;
    }

    /**
     * Define o valor da propriedade totalPresencas.
     * 
     */
    public void setTotalPresencas(int value) {
        this.totalPresencas = value;
    }

    /**
     * Obtém o valor da propriedade faltas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsFaltasAluno }
     *     
     */
    public ArrayOfWsFaltasAluno getFaltas() {
        return faltas;
    }

    /**
     * Define o valor da propriedade faltas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsFaltasAluno }
     *     
     */
    public void setFaltas(ArrayOfWsFaltasAluno value) {
        this.faltas = value;
    }

}
