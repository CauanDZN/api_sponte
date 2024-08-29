
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Integrantes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Integrantes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroChamada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModulosMatriculados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Disciplinas" type="{http://api.sponteeducacional.net.br/}ArrayOfWsDisciplinas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Integrantes", propOrder = {
    "alunoID",
    "nome",
    "numeroChamada",
    "numeroContrato",
    "modulosMatriculados",
    "disciplinas"
})
public class Integrantes {

    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "NumeroChamada")
    protected String numeroChamada;
    @XmlElement(name = "NumeroContrato")
    protected String numeroContrato;
    @XmlElement(name = "ModulosMatriculados")
    protected String modulosMatriculados;
    @XmlElement(name = "Disciplinas")
    protected ArrayOfWsDisciplinas disciplinas;

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
     * Obtém o valor da propriedade numeroChamada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroChamada() {
        return numeroChamada;
    }

    /**
     * Define o valor da propriedade numeroChamada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroChamada(String value) {
        this.numeroChamada = value;
    }

    /**
     * Obtém o valor da propriedade numeroContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Define o valor da propriedade numeroContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroContrato(String value) {
        this.numeroContrato = value;
    }

    /**
     * Obtém o valor da propriedade modulosMatriculados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulosMatriculados() {
        return modulosMatriculados;
    }

    /**
     * Define o valor da propriedade modulosMatriculados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulosMatriculados(String value) {
        this.modulosMatriculados = value;
    }

    /**
     * Obtém o valor da propriedade disciplinas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsDisciplinas }
     *     
     */
    public ArrayOfWsDisciplinas getDisciplinas() {
        return disciplinas;
    }

    /**
     * Define o valor da propriedade disciplinas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsDisciplinas }
     *     
     */
    public void setDisciplinas(ArrayOfWsDisciplinas value) {
        this.disciplinas = value;
    }

}
