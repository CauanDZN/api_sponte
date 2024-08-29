
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
 *         &lt;element name="InsertPlanoContaPagarResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsRetornoParcelasPagar" minOccurs="0"/&gt;
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
    "insertPlanoContaPagarResult"
})
@XmlRootElement(name = "InsertPlanoContaPagarResponse")
public class InsertPlanoContaPagarResponse {

    @XmlElement(name = "InsertPlanoContaPagarResult")
    protected ArrayOfWsRetornoParcelasPagar insertPlanoContaPagarResult;

    /**
     * Obtém o valor da propriedade insertPlanoContaPagarResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsRetornoParcelasPagar }
     *     
     */
    public ArrayOfWsRetornoParcelasPagar getInsertPlanoContaPagarResult() {
        return insertPlanoContaPagarResult;
    }

    /**
     * Define o valor da propriedade insertPlanoContaPagarResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsRetornoParcelasPagar }
     *     
     */
    public void setInsertPlanoContaPagarResult(ArrayOfWsRetornoParcelasPagar value) {
        this.insertPlanoContaPagarResult = value;
    }

}
