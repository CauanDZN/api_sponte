
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsDisciplinas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsDisciplinas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsDisciplinas" type="{http://api.sponteeducacional.net.br/}wsDisciplinas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsDisciplinas", propOrder = {
    "wsDisciplinas"
})
public class ArrayOfWsDisciplinas {

    @XmlElement(nillable = true)
    protected List<WsDisciplinas> wsDisciplinas;

    /**
     * Gets the value of the wsDisciplinas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsDisciplinas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsDisciplinas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsDisciplinas }
     * 
     * 
     */
    public List<WsDisciplinas> getWsDisciplinas() {
        if (wsDisciplinas == null) {
            wsDisciplinas = new ArrayList<WsDisciplinas>();
        }
        return this.wsDisciplinas;
    }

}
