
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsLocacaoAmbientesHorarios complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsLocacaoAmbientesHorarios"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocacaoAmbienteHorarioID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Padrao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Ativo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocacaoAmbientesHorariosDetalhes" type="{http://api.sponteeducacional.net.br/}ArrayOfWsLocacaoAmbientesHorariosDetalhes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsLocacaoAmbientesHorarios", propOrder = {
    "locacaoAmbienteHorarioID",
    "descricao",
    "padrao",
    "ativo",
    "locacaoAmbientesHorariosDetalhes"
})
public class WsLocacaoAmbientesHorarios {

    @XmlElement(name = "LocacaoAmbienteHorarioID")
    protected int locacaoAmbienteHorarioID;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "Padrao")
    protected int padrao;
    @XmlElement(name = "Ativo")
    protected int ativo;
    @XmlElement(name = "LocacaoAmbientesHorariosDetalhes")
    protected ArrayOfWsLocacaoAmbientesHorariosDetalhes locacaoAmbientesHorariosDetalhes;

    /**
     * Obtém o valor da propriedade locacaoAmbienteHorarioID.
     * 
     */
    public int getLocacaoAmbienteHorarioID() {
        return locacaoAmbienteHorarioID;
    }

    /**
     * Define o valor da propriedade locacaoAmbienteHorarioID.
     * 
     */
    public void setLocacaoAmbienteHorarioID(int value) {
        this.locacaoAmbienteHorarioID = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade padrao.
     * 
     */
    public int getPadrao() {
        return padrao;
    }

    /**
     * Define o valor da propriedade padrao.
     * 
     */
    public void setPadrao(int value) {
        this.padrao = value;
    }

    /**
     * Obtém o valor da propriedade ativo.
     * 
     */
    public int getAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     */
    public void setAtivo(int value) {
        this.ativo = value;
    }

    /**
     * Obtém o valor da propriedade locacaoAmbientesHorariosDetalhes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsLocacaoAmbientesHorariosDetalhes }
     *     
     */
    public ArrayOfWsLocacaoAmbientesHorariosDetalhes getLocacaoAmbientesHorariosDetalhes() {
        return locacaoAmbientesHorariosDetalhes;
    }

    /**
     * Define o valor da propriedade locacaoAmbientesHorariosDetalhes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsLocacaoAmbientesHorariosDetalhes }
     *     
     */
    public void setLocacaoAmbientesHorariosDetalhes(ArrayOfWsLocacaoAmbientesHorariosDetalhes value) {
        this.locacaoAmbientesHorariosDetalhes = value;
    }

}
