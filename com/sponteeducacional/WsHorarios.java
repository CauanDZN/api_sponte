
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsHorarios complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsHorarios"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HorarioID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroAulas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HorariosDetalhes" type="{http://api.sponteeducacional.net.br/}ArrayOfWsHorarioDetalhes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsHorarios", propOrder = {
    "horarioID",
    "nome",
    "numeroAulas",
    "ativo",
    "horariosDetalhes"
})
public class WsHorarios {

    @XmlElement(name = "HorarioID")
    protected int horarioID;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "NumeroAulas")
    protected int numeroAulas;
    @XmlElement(name = "Ativo")
    protected boolean ativo;
    @XmlElement(name = "HorariosDetalhes")
    protected ArrayOfWsHorarioDetalhes horariosDetalhes;

    /**
     * Obtém o valor da propriedade horarioID.
     * 
     */
    public int getHorarioID() {
        return horarioID;
    }

    /**
     * Define o valor da propriedade horarioID.
     * 
     */
    public void setHorarioID(int value) {
        this.horarioID = value;
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
     * Obtém o valor da propriedade numeroAulas.
     * 
     */
    public int getNumeroAulas() {
        return numeroAulas;
    }

    /**
     * Define o valor da propriedade numeroAulas.
     * 
     */
    public void setNumeroAulas(int value) {
        this.numeroAulas = value;
    }

    /**
     * Obtém o valor da propriedade ativo.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
    }

    /**
     * Obtém o valor da propriedade horariosDetalhes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsHorarioDetalhes }
     *     
     */
    public ArrayOfWsHorarioDetalhes getHorariosDetalhes() {
        return horariosDetalhes;
    }

    /**
     * Define o valor da propriedade horariosDetalhes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsHorarioDetalhes }
     *     
     */
    public void setHorariosDetalhes(ArrayOfWsHorarioDetalhes value) {
        this.horariosDetalhes = value;
    }

}
