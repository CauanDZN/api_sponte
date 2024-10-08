
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
 *         &lt;element name="InsertOrDeleteTokenAppResult" type="{http://api.sponteeducacional.net.br/}ArrayOfTokenMobile" minOccurs="0"/&gt;
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
    "insertOrDeleteTokenAppResult"
})
@XmlRootElement(name = "InsertOrDeleteTokenAppResponse")
public class InsertOrDeleteTokenAppResponse {

    @XmlElement(name = "InsertOrDeleteTokenAppResult")
    protected ArrayOfTokenMobile insertOrDeleteTokenAppResult;

    /**
     * Obtém o valor da propriedade insertOrDeleteTokenAppResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTokenMobile }
     *     
     */
    public ArrayOfTokenMobile getInsertOrDeleteTokenAppResult() {
        return insertOrDeleteTokenAppResult;
    }

    /**
     * Define o valor da propriedade insertOrDeleteTokenAppResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTokenMobile }
     *     
     */
    public void setInsertOrDeleteTokenAppResult(ArrayOfTokenMobile value) {
        this.insertOrDeleteTokenAppResult = value;
    }

}
