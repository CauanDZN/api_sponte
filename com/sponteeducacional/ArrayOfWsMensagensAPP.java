
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsMensagensAPP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsMensagensAPP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsMensagensAPP" type="{http://api.sponteeducacional.net.br/}wsMensagensAPP" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsMensagensAPP", propOrder = {
    "wsMensagensAPP"
})
public class ArrayOfWsMensagensAPP {

    @XmlElement(nillable = true)
    protected List<WsMensagensAPP> wsMensagensAPP;

    /**
     * Gets the value of the wsMensagensAPP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsMensagensAPP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsMensagensAPP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsMensagensAPP }
     * 
     * 
     */
    public List<WsMensagensAPP> getWsMensagensAPP() {
        if (wsMensagensAPP == null) {
            wsMensagensAPP = new ArrayList<WsMensagensAPP>();
        }
        return this.wsMensagensAPP;
    }

}
