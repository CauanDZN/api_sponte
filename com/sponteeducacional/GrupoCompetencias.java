
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GrupoCompetencias complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GrupoCompetencias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrupoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeGrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListaHabilidades" type="{http://api.sponteeducacional.net.br/}ArrayOfHabilidadesAPI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrupoCompetencias", propOrder = {
    "grupoID",
    "nomeGrupo",
    "listaHabilidades"
})
public class GrupoCompetencias {

    @XmlElement(name = "GrupoID")
    protected int grupoID;
    @XmlElement(name = "NomeGrupo")
    protected String nomeGrupo;
    @XmlElement(name = "ListaHabilidades")
    protected ArrayOfHabilidadesAPI listaHabilidades;

    /**
     * Obtém o valor da propriedade grupoID.
     * 
     */
    public int getGrupoID() {
        return grupoID;
    }

    /**
     * Define o valor da propriedade grupoID.
     * 
     */
    public void setGrupoID(int value) {
        this.grupoID = value;
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
     * Obtém o valor da propriedade listaHabilidades.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHabilidadesAPI }
     *     
     */
    public ArrayOfHabilidadesAPI getListaHabilidades() {
        return listaHabilidades;
    }

    /**
     * Define o valor da propriedade listaHabilidades.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHabilidadesAPI }
     *     
     */
    public void setListaHabilidades(ArrayOfHabilidadesAPI value) {
        this.listaHabilidades = value;
    }

}
