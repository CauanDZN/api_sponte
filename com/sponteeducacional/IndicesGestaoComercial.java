
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IndicesGestaoComercial complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IndicesGestaoComercial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FuncionarioID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomeFuncionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Indicadores" type="{http://api.sponteeducacional.net.br/}ArrayOfIndicador" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicesGestaoComercial", propOrder = {
    "funcionarioID",
    "nomeFuncionario",
    "indicadores"
})
public class IndicesGestaoComercial {

    @XmlElement(name = "FuncionarioID")
    protected int funcionarioID;
    @XmlElement(name = "NomeFuncionario")
    protected String nomeFuncionario;
    @XmlElement(name = "Indicadores")
    protected ArrayOfIndicador indicadores;

    /**
     * Obtém o valor da propriedade funcionarioID.
     * 
     */
    public int getFuncionarioID() {
        return funcionarioID;
    }

    /**
     * Define o valor da propriedade funcionarioID.
     * 
     */
    public void setFuncionarioID(int value) {
        this.funcionarioID = value;
    }

    /**
     * Obtém o valor da propriedade nomeFuncionario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    /**
     * Define o valor da propriedade nomeFuncionario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFuncionario(String value) {
        this.nomeFuncionario = value;
    }

    /**
     * Obtém o valor da propriedade indicadores.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndicador }
     *     
     */
    public ArrayOfIndicador getIndicadores() {
        return indicadores;
    }

    /**
     * Define o valor da propriedade indicadores.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndicador }
     *     
     */
    public void setIndicadores(ArrayOfIndicador value) {
        this.indicadores = value;
    }

}
