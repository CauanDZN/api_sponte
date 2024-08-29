
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsBoletim2 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsBoletim2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TurmaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Frequencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResultadoFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListaNotasBoletim" type="{http://api.sponteeducacional.net.br/}ArrayOfNotasBoletim2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsBoletim2", propOrder = {
    "retornoOperacao",
    "alunoID",
    "turmaID",
    "frequencia",
    "resultadoFinal",
    "listaNotasBoletim"
})
public class WsBoletim2 {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "TurmaID")
    protected int turmaID;
    @XmlElement(name = "Frequencia")
    protected String frequencia;
    @XmlElement(name = "ResultadoFinal")
    protected String resultadoFinal;
    @XmlElement(name = "ListaNotasBoletim")
    protected ArrayOfNotasBoletim2 listaNotasBoletim;

    /**
     * Obtém o valor da propriedade retornoOperacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetornoOperacao() {
        return retornoOperacao;
    }

    /**
     * Define o valor da propriedade retornoOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetornoOperacao(String value) {
        this.retornoOperacao = value;
    }

    /**
     * Obtém o valor da propriedade alunoID.
     * 
     */
    public int getAlunoID() {
        return alunoID;
    }

    /**
     * Define o valor da propriedade alunoID.
     * 
     */
    public void setAlunoID(int value) {
        this.alunoID = value;
    }

    /**
     * Obtém o valor da propriedade turmaID.
     * 
     */
    public int getTurmaID() {
        return turmaID;
    }

    /**
     * Define o valor da propriedade turmaID.
     * 
     */
    public void setTurmaID(int value) {
        this.turmaID = value;
    }

    /**
     * Obtém o valor da propriedade frequencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencia() {
        return frequencia;
    }

    /**
     * Define o valor da propriedade frequencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencia(String value) {
        this.frequencia = value;
    }

    /**
     * Obtém o valor da propriedade resultadoFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoFinal() {
        return resultadoFinal;
    }

    /**
     * Define o valor da propriedade resultadoFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoFinal(String value) {
        this.resultadoFinal = value;
    }

    /**
     * Obtém o valor da propriedade listaNotasBoletim.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotasBoletim2 }
     *     
     */
    public ArrayOfNotasBoletim2 getListaNotasBoletim() {
        return listaNotasBoletim;
    }

    /**
     * Define o valor da propriedade listaNotasBoletim.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotasBoletim2 }
     *     
     */
    public void setListaNotasBoletim(ArrayOfNotasBoletim2 value) {
        this.listaNotasBoletim = value;
    }

}
