
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de HabilidadesAPI complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="HabilidadesAPI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompetenciaPeriodoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeHabilidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConceitoHabilidadeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ConceitoHabilidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HabilidadesAPI", propOrder = {
    "competenciaPeriodoID",
    "nomeHabilidade",
    "conceitoHabilidadeID",
    "conceitoHabilidade"
})
public class HabilidadesAPI {

    @XmlElement(name = "CompetenciaPeriodoID")
    protected int competenciaPeriodoID;
    @XmlElement(name = "NomeHabilidade")
    protected String nomeHabilidade;
    @XmlElement(name = "ConceitoHabilidadeID")
    protected int conceitoHabilidadeID;
    @XmlElement(name = "ConceitoHabilidade")
    protected String conceitoHabilidade;

    /**
     * Obtém o valor da propriedade competenciaPeriodoID.
     * 
     */
    public int getCompetenciaPeriodoID() {
        return competenciaPeriodoID;
    }

    /**
     * Define o valor da propriedade competenciaPeriodoID.
     * 
     */
    public void setCompetenciaPeriodoID(int value) {
        this.competenciaPeriodoID = value;
    }

    /**
     * Obtém o valor da propriedade nomeHabilidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    /**
     * Define o valor da propriedade nomeHabilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeHabilidade(String value) {
        this.nomeHabilidade = value;
    }

    /**
     * Obtém o valor da propriedade conceitoHabilidadeID.
     * 
     */
    public int getConceitoHabilidadeID() {
        return conceitoHabilidadeID;
    }

    /**
     * Define o valor da propriedade conceitoHabilidadeID.
     * 
     */
    public void setConceitoHabilidadeID(int value) {
        this.conceitoHabilidadeID = value;
    }

    /**
     * Obtém o valor da propriedade conceitoHabilidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceitoHabilidade() {
        return conceitoHabilidade;
    }

    /**
     * Define o valor da propriedade conceitoHabilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceitoHabilidade(String value) {
        this.conceitoHabilidade = value;
    }

}
