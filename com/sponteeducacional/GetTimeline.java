
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
 *         &lt;element name="student_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="responsible_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pagenumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "studentId",
    "responsibleId",
    "pagenumber"
})
@XmlRootElement(name = "GetTimeline")
public class GetTimeline {

    protected String token;
    protected int codCliSponte;
    @XmlElement(name = "student_id")
    protected int studentId;
    @XmlElement(name = "responsible_id")
    protected int responsibleId;
    protected int pagenumber;

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
     * Obtém o valor da propriedade studentId.
     * 
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Define o valor da propriedade studentId.
     * 
     */
    public void setStudentId(int value) {
        this.studentId = value;
    }

    /**
     * Obtém o valor da propriedade responsibleId.
     * 
     */
    public int getResponsibleId() {
        return responsibleId;
    }

    /**
     * Define o valor da propriedade responsibleId.
     * 
     */
    public void setResponsibleId(int value) {
        this.responsibleId = value;
    }

    /**
     * Obtém o valor da propriedade pagenumber.
     * 
     */
    public int getPagenumber() {
        return pagenumber;
    }

    /**
     * Define o valor da propriedade pagenumber.
     * 
     */
    public void setPagenumber(int value) {
        this.pagenumber = value;
    }

}
