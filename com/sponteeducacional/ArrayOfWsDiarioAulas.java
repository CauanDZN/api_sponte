
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsDiarioAulas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsDiarioAulas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsDiarioAulas" type="{http://api.sponteeducacional.net.br/}wsDiarioAulas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsDiarioAulas", propOrder = {
    "wsDiarioAulas"
})
public class ArrayOfWsDiarioAulas {

    @XmlElement(nillable = true)
    protected List<WsDiarioAulas> wsDiarioAulas;

    /**
     * Gets the value of the wsDiarioAulas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsDiarioAulas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsDiarioAulas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsDiarioAulas }
     * 
     * 
     */
    public List<WsDiarioAulas> getWsDiarioAulas() {
        if (wsDiarioAulas == null) {
            wsDiarioAulas = new ArrayList<WsDiarioAulas>();
        }
        return this.wsDiarioAulas;
    }

}
