
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsInfoTurma complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsInfoTurma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TurmaId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnoLetivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsInfoTurma", propOrder = {
    "turmaId",
    "nome",
    "anoLetivo",
    "turno",
    "serie"
})
public class WsInfoTurma {

    @XmlElement(name = "TurmaId")
    protected int turmaId;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "AnoLetivo")
    protected String anoLetivo;
    @XmlElement(name = "Turno")
    protected String turno;
    @XmlElement(name = "Serie")
    protected String serie;

    /**
     * Obtém o valor da propriedade turmaId.
     * 
     */
    public int getTurmaId() {
        return turmaId;
    }

    /**
     * Define o valor da propriedade turmaId.
     * 
     */
    public void setTurmaId(int value) {
        this.turmaId = value;
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
     * Obtém o valor da propriedade anoLetivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoLetivo() {
        return anoLetivo;
    }

    /**
     * Define o valor da propriedade anoLetivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoLetivo(String value) {
        this.anoLetivo = value;
    }

    /**
     * Obtém o valor da propriedade turno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurno() {
        return turno;
    }

    /**
     * Define o valor da propriedade turno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurno(String value) {
        this.turno = value;
    }

    /**
     * Obtém o valor da propriedade serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define o valor da propriedade serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

}
