
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ModalidadeTurma complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ModalidadeTurma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ModalidadeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DescricaoModalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TurmaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeTurma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModalidadeTurma", propOrder = {
    "modalidadeID",
    "descricaoModalidade",
    "turmaID",
    "nomeTurma"
})
public class ModalidadeTurma {

    @XmlElement(name = "ModalidadeID")
    protected int modalidadeID;
    @XmlElement(name = "DescricaoModalidade")
    protected String descricaoModalidade;
    @XmlElement(name = "TurmaID")
    protected int turmaID;
    @XmlElement(name = "NomeTurma")
    protected String nomeTurma;

    /**
     * Obtém o valor da propriedade modalidadeID.
     * 
     */
    public int getModalidadeID() {
        return modalidadeID;
    }

    /**
     * Define o valor da propriedade modalidadeID.
     * 
     */
    public void setModalidadeID(int value) {
        this.modalidadeID = value;
    }

    /**
     * Obtém o valor da propriedade descricaoModalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoModalidade() {
        return descricaoModalidade;
    }

    /**
     * Define o valor da propriedade descricaoModalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoModalidade(String value) {
        this.descricaoModalidade = value;
    }

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
     * Obtém o valor da propriedade nomeTurma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTurma() {
        return nomeTurma;
    }

    /**
     * Define o valor da propriedade nomeTurma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTurma(String value) {
        this.nomeTurma = value;
    }

}
