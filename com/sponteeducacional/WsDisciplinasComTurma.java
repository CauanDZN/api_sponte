
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsDisciplinasComTurma complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsDisciplinasComTurma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TurmaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Turma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisciplinaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Modulo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsDisciplinasComTurma", propOrder = {
    "turmaID",
    "turma",
    "disciplinaID",
    "nome",
    "modulo"
})
public class WsDisciplinasComTurma {

    @XmlElement(name = "TurmaID")
    protected int turmaID;
    @XmlElement(name = "Turma")
    protected String turma;
    @XmlElement(name = "DisciplinaID")
    protected int disciplinaID;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "Modulo")
    protected int modulo;

    /**
     * Obtém o valor da propriedade turmaID.
     * 
     */
    public int getTurmaID() {
        return turmaID;
    }

    /**
     * Define o valor da propriedade turmaID.
     * 
     */
    public void setTurmaID(int value) {
        this.turmaID = value;
    }

    /**
     * Obtém o valor da propriedade turma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurma() {
        return turma;
    }

    /**
     * Define o valor da propriedade turma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurma(String value) {
        this.turma = value;
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
     */
    public int getModulo() {
        return modulo;
    }

    /**
     * Define o valor da propriedade modulo.
     * 
     */
    public void setModulo(int value) {
        this.modulo = value;
    }

}
