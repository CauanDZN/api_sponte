
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfTokenMobile complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTokenMobile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TokenMobile" type="{http://api.sponteeducacional.net.br/}TokenMobile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTokenMobile", propOrder = {
    "tokenMobile"
})
public class ArrayOfTokenMobile {

    @XmlElement(name = "TokenMobile", nillable = true)
    protected List<TokenMobile> tokenMobile;

    /**
     * Gets the value of the tokenMobile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tokenMobile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTokenMobile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TokenMobile }
     * 
     * 
     */
    public List<TokenMobile> getTokenMobile() {
        if (tokenMobile == null) {
            tokenMobile = new ArrayList<TokenMobile>();
        }
        return this.tokenMobile;
    }

}
