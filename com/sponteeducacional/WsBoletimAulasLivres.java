
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsBoletimAulasLivres complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsBoletimAulasLivres"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContratoAulaLivreID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ListaNotasBoletim" type="{http://api.sponteeducacional.net.br/}ArrayOfNotasBoletimAulasLivres" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsBoletimAulasLivres", propOrder = {
    "retornoOperacao",
    "contratoAulaLivreID",
    "listaNotasBoletim"
})
public class WsBoletimAulasLivres {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "ContratoAulaLivreID")
    protected int contratoAulaLivreID;
    @XmlElement(name = "ListaNotasBoletim")
    protected ArrayOfNotasBoletimAulasLivres listaNotasBoletim;

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
     * Obtém o valor da propriedade contratoAulaLivreID.
     * 
     */
    public int getContratoAulaLivreID() {
        return contratoAulaLivreID;
    }

    /**
     * Define o valor da propriedade contratoAulaLivreID.
     * 
     */
    public void setContratoAulaLivreID(int value) {
        this.contratoAulaLivreID = value;
    }

    /**
     * Obtém o valor da propriedade listaNotasBoletim.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotasBoletimAulasLivres }
     *     
     */
    public ArrayOfNotasBoletimAulasLivres getListaNotasBoletim() {
        return listaNotasBoletim;
    }

    /**
     * Define o valor da propriedade listaNotasBoletim.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotasBoletimAulasLivres }
     *     
     */
    public void setListaNotasBoletim(ArrayOfNotasBoletimAulasLivres value) {
        this.listaNotasBoletim = value;
    }

}
