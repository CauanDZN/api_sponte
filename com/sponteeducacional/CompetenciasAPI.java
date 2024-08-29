
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CompetenciasAPI complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompetenciasAPI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompetenciaId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeCompetencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListaGrupoCompetencias" type="{http://api.sponteeducacional.net.br/}ArrayOfGrupoCompetencias" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompetenciasAPI", propOrder = {
    "competenciaId",
    "nomeCompetencia",
    "listaGrupoCompetencias"
})
public class CompetenciasAPI {

    @XmlElement(name = "CompetenciaId")
    protected int competenciaId;
    @XmlElement(name = "NomeCompetencia")
    protected String nomeCompetencia;
    @XmlElement(name = "ListaGrupoCompetencias")
    protected ArrayOfGrupoCompetencias listaGrupoCompetencias;

    /**
     * Obtém o valor da propriedade competenciaId.
     * 
     */
    public int getCompetenciaId() {
        return competenciaId;
    }

    /**
     * Define o valor da propriedade competenciaId.
     * 
     */
    public void setCompetenciaId(int value) {
        this.competenciaId = value;
    }

    /**
     * Obtém o valor da propriedade nomeCompetencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCompetencia() {
        return nomeCompetencia;
    }

    /**
     * Define o valor da propriedade nomeCompetencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCompetencia(String value) {
        this.nomeCompetencia = value;
    }

    /**
     * Obtém o valor da propriedade listaGrupoCompetencias.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGrupoCompetencias }
     *     
     */
    public ArrayOfGrupoCompetencias getListaGrupoCompetencias() {
        return listaGrupoCompetencias;
    }

    /**
     * Define o valor da propriedade listaGrupoCompetencias.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGrupoCompetencias }
     *     
     */
    public void setListaGrupoCompetencias(ArrayOfGrupoCompetencias value) {
        this.listaGrupoCompetencias = value;
    }

}
