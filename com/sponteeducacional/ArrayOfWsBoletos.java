
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsBoletos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsBoletos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsBoletos" type="{http://api.sponteeducacional.net.br/}wsBoletos" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsBoletos", propOrder = {
    "wsBoletos"
})
public class ArrayOfWsBoletos {

    @XmlElement(nillable = true)
    protected List<WsBoletos> wsBoletos;

    /**
     * Gets the value of the wsBoletos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsBoletos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsBoletos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsBoletos }
     * 
     * 
     */
    public List<WsBoletos> getWsBoletos() {
        if (wsBoletos == null) {
            wsBoletos = new ArrayList<WsBoletos>();
        }
        return this.wsBoletos;
    }

}
