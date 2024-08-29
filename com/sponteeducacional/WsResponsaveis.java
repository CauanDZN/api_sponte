
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsResponsaveis complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsResponsaveis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponsavelID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parentesco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsResponsaveis", propOrder = {
    "responsavelID",
    "nome",
    "parentesco"
})
public class WsResponsaveis {

    @XmlElement(name = "ResponsavelID")
    protected int responsavelID;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "Parentesco")
    protected String parentesco;

    /**
     * Obtém o valor da propriedade responsavelID.
     * 
     */
    public int getResponsavelID() {
        return responsavelID;
    }

    /**
     * Define o valor da propriedade responsavelID.
     * 
     */
    public void setResponsavelID(int value) {
        this.responsavelID = value;
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
     * Obtém o valor da propriedade parentesco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentesco() {
        return parentesco;
    }

    /**
     * Define o valor da propriedade parentesco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentesco(String value) {
        this.parentesco = value;
    }

}
