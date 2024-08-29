
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsComunicadoAPP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsComunicadoAPP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsComunicadoAPP" type="{http://api.sponteeducacional.net.br/}wsComunicadoAPP" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsComunicadoAPP", propOrder = {
    "wsComunicadoAPP"
})
public class ArrayOfWsComunicadoAPP {

    @XmlElement(nillable = true)
    protected List<WsComunicadoAPP> wsComunicadoAPP;

    /**
     * Gets the value of the wsComunicadoAPP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsComunicadoAPP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsComunicadoAPP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsComunicadoAPP }
     * 
     * 
     */
    public List<WsComunicadoAPP> getWsComunicadoAPP() {
        if (wsComunicadoAPP == null) {
            wsComunicadoAPP = new ArrayList<WsComunicadoAPP>();
        }
        return this.wsComunicadoAPP;
    }

}
