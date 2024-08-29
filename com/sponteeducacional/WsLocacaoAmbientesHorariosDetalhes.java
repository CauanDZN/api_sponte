
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsLocacaoAmbientesHorariosDetalhes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsLocacaoAmbientesHorariosDetalhes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocacaoAmbienteHorarioDetalheID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocacaoAmbienteHorarioID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HoraInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoraFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ativo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsLocacaoAmbientesHorariosDetalhes", propOrder = {
    "locacaoAmbienteHorarioDetalheID",
    "locacaoAmbienteHorarioID",
    "horaInicial",
    "horaFinal",
    "ativo"
})
public class WsLocacaoAmbientesHorariosDetalhes {

    @XmlElement(name = "LocacaoAmbienteHorarioDetalheID")
    protected int locacaoAmbienteHorarioDetalheID;
    @XmlElement(name = "LocacaoAmbienteHorarioID")
    protected int locacaoAmbienteHorarioID;
    @XmlElement(name = "HoraInicial")
    protected String horaInicial;
    @XmlElement(name = "HoraFinal")
    protected String horaFinal;
    @XmlElement(name = "Ativo")
    protected int ativo;

    /**
     * Obtém o valor da propriedade locacaoAmbienteHorarioDetalheID.
     * 
     */
    public int getLocacaoAmbienteHorarioDetalheID() {
        return locacaoAmbienteHorarioDetalheID;
    }

    /**
     * Define o valor da propriedade locacaoAmbienteHorarioDetalheID.
     * 
     */
    public void setLocacaoAmbienteHorarioDetalheID(int value) {
        this.locacaoAmbienteHorarioDetalheID = value;
    }

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
     * Obtém o valor da propriedade horaInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraInicial() {
        return horaInicial;
    }

    /**
     * Define o valor da propriedade horaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraInicial(String value) {
        this.horaInicial = value;
    }

    /**
     * Obtém o valor da propriedade horaFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraFinal() {
        return horaFinal;
    }

    /**
     * Define o valor da propriedade horaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraFinal(String value) {
        this.horaFinal = value;
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

}
