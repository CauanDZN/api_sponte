
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsDisciplinasNotasParciais complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsDisciplinasNotasParciais"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisciplinaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeDisciplina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SistemaAvaliacaoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeSistemaAvaliacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotasPeriodos" type="{http://api.sponteeducacional.net.br/}ArrayOfWsNotasPeriodos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsDisciplinasNotasParciais", propOrder = {
    "disciplinaID",
    "nomeDisciplina",
    "sistemaAvaliacaoID",
    "nomeSistemaAvaliacao",
    "notasPeriodos"
})
public class WsDisciplinasNotasParciais {

    @XmlElement(name = "DisciplinaID")
    protected int disciplinaID;
    @XmlElement(name = "NomeDisciplina")
    protected String nomeDisciplina;
    @XmlElement(name = "SistemaAvaliacaoID")
    protected int sistemaAvaliacaoID;
    @XmlElement(name = "NomeSistemaAvaliacao")
    protected String nomeSistemaAvaliacao;
    @XmlElement(name = "NotasPeriodos")
    protected ArrayOfWsNotasPeriodos notasPeriodos;

    /**
     * Obtém o valor da propriedade disciplinaID.
     * 
     */
    public int getDisciplinaID() {
        return disciplinaID;
    }

    /**
     * Define o valor da propriedade disciplinaID.
     * 
     */
    public void setDisciplinaID(int value) {
        this.disciplinaID = value;
    }

    /**
     * Obtém o valor da propriedade nomeDisciplina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * Define o valor da propriedade nomeDisciplina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeDisciplina(String value) {
        this.nomeDisciplina = value;
    }

    /**
     * Obtém o valor da propriedade sistemaAvaliacaoID.
     * 
     */
    public int getSistemaAvaliacaoID() {
        return sistemaAvaliacaoID;
    }

    /**
     * Define o valor da propriedade sistemaAvaliacaoID.
     * 
     */
    public void setSistemaAvaliacaoID(int value) {
        this.sistemaAvaliacaoID = value;
    }

    /**
     * Obtém o valor da propriedade nomeSistemaAvaliacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSistemaAvaliacao() {
        return nomeSistemaAvaliacao;
    }

    /**
     * Define o valor da propriedade nomeSistemaAvaliacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSistemaAvaliacao(String value) {
        this.nomeSistemaAvaliacao = value;
    }

    /**
     * Obtém o valor da propriedade notasPeriodos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsNotasPeriodos }
     *     
     */
    public ArrayOfWsNotasPeriodos getNotasPeriodos() {
        return notasPeriodos;
    }

    /**
     * Define o valor da propriedade notasPeriodos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsNotasPeriodos }
     *     
     */
    public void setNotasPeriodos(ArrayOfWsNotasPeriodos value) {
        this.notasPeriodos = value;
    }

}
