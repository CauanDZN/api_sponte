
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsGrupoAvaliacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsGrupoAvaliacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrupoAvaliacaoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeGrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Peso" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsGrupoAvaliacao", propOrder = {
    "grupoAvaliacaoID",
    "nomeGrupo",
    "peso"
})
public class WsGrupoAvaliacao {

    @XmlElement(name = "GrupoAvaliacaoID")
    protected int grupoAvaliacaoID;
    @XmlElement(name = "NomeGrupo")
    protected String nomeGrupo;
    @XmlElement(name = "Peso")
    protected double peso;

    /**
     * Obtém o valor da propriedade grupoAvaliacaoID.
     * 
     */
    public int getGrupoAvaliacaoID() {
        return grupoAvaliacaoID;
    }

    /**
     * Define o valor da propriedade grupoAvaliacaoID.
     * 
     */
    public void setGrupoAvaliacaoID(int value) {
        this.grupoAvaliacaoID = value;
    }

    /**
     * Obtém o valor da propriedade nomeGrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeGrupo() {
        return nomeGrupo;
    }

    /**
     * Define o valor da propriedade nomeGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeGrupo(String value) {
        this.nomeGrupo = value;
    }

    /**
     * Obtém o valor da propriedade peso.
     * 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Define o valor da propriedade peso.
     * 
     */
    public void setPeso(double value) {
        this.peso = value;
    }

}
