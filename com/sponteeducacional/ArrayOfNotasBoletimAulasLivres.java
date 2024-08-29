
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfNotasBoletimAulasLivres complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNotasBoletimAulasLivres"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotasBoletimAulasLivres" type="{http://api.sponteeducacional.net.br/}NotasBoletimAulasLivres" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNotasBoletimAulasLivres", propOrder = {
    "notasBoletimAulasLivres"
})
public class ArrayOfNotasBoletimAulasLivres {

    @XmlElement(name = "NotasBoletimAulasLivres", nillable = true)
    protected List<NotasBoletimAulasLivres> notasBoletimAulasLivres;

    /**
     * Gets the value of the notasBoletimAulasLivres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notasBoletimAulasLivres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotasBoletimAulasLivres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotasBoletimAulasLivres }
     * 
     * 
     */
    public List<NotasBoletimAulasLivres> getNotasBoletimAulasLivres() {
        if (notasBoletimAulasLivres == null) {
            notasBoletimAulasLivres = new ArrayList<NotasBoletimAulasLivres>();
        }
        return this.notasBoletimAulasLivres;
    }

}
