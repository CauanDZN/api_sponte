
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCliSponte" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="timeline_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="read" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "codCliSponte",
    "timelineId",
    "read"
})
@XmlRootElement(name = "UpdateReadTimeline")
public class UpdateReadTimeline {

    protected String token;
    protected int codCliSponte;
    @XmlElement(name = "timeline_id")
    protected String timelineId;
    protected boolean read;

    /**
     * Obtém o valor da propriedade token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define o valor da propriedade token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtém o valor da propriedade codCliSponte.
     * 
     */
    public int getCodCliSponte() {
        return codCliSponte;
    }

    /**
     * Define o valor da propriedade codCliSponte.
     * 
     */
    public void setCodCliSponte(int value) {
        this.codCliSponte = value;
    }

    /**
     * Obtém o valor da propriedade timelineId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimelineId() {
        return timelineId;
    }

    /**
     * Define o valor da propriedade timelineId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimelineId(String value) {
        this.timelineId = value;
    }

    /**
     * Obtém o valor da propriedade read.
     * 
     */
    public boolean isRead() {
        return read;
    }

    /**
     * Define o valor da propriedade read.
     * 
     */
    public void setRead(boolean value) {
        this.read = value;
    }

}
