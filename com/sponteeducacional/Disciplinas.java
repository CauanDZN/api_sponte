
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Disciplinas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Disciplinas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisciplinaAgrupada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisciplinaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Modulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisciplinasFilhas" type="{http://api.sponteeducacional.net.br/}ArrayOfDisciplinas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disciplinas", propOrder = {
    "disciplinaAgrupada",
    "disciplinaID",
    "nome",
    "modulo",
    "ch",
    "disciplinasFilhas"
})
public class Disciplinas {

    @XmlElement(name = "DisciplinaAgrupada")
    protected String disciplinaAgrupada;
    @XmlElement(name = "DisciplinaID")
    protected int disciplinaID;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "Modulo")
    protected String modulo;
    @XmlElement(name = "CH")
    protected String ch;
    @XmlElement(name = "DisciplinasFilhas")
    protected ArrayOfDisciplinas disciplinasFilhas;

    /**
     * Obtém o valor da propriedade disciplinaAgrupada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplinaAgrupada() {
        return disciplinaAgrupada;
    }

    /**
     * Define o valor da propriedade disciplinaAgrupada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplinaAgrupada(String value) {
        this.disciplinaAgrupada = value;
    }

    /**
     * Obtém o valor da propriedade disciplinaID.
     * 
     */
    public int getDisciplinaID() {
        return disciplinaID;
    }

    /**
     * Define o valor da propriedade disciplinaID.
     * 
     */
    public void setDisciplinaID(int value) {
        this.disciplinaID = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade modulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * Define o valor da propriedade modulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulo(String value) {
        this.modulo = value;
    }

    /**
     * Obtém o valor da propriedade ch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCH() {
        return ch;
    }

    /**
     * Define o valor da propriedade ch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCH(String value) {
        this.ch = value;
    }

    /**
     * Obtém o valor da propriedade disciplinasFilhas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDisciplinas }
     *     
     */
    public ArrayOfDisciplinas getDisciplinasFilhas() {
        return disciplinasFilhas;
    }

    /**
     * Define o valor da propriedade disciplinasFilhas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDisciplinas }
     *     
     */
    public void setDisciplinasFilhas(ArrayOfDisciplinas value) {
        this.disciplinasFilhas = value;
    }

}
