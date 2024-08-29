
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsPlanoCurso complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsPlanoCurso"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsPlanoCurso" type="{http://api.sponteeducacional.net.br/}wsPlanoCurso" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsPlanoCurso", propOrder = {
    "wsPlanoCurso"
})
public class ArrayOfWsPlanoCurso {

    @XmlElement(nillable = true)
    protected List<WsPlanoCurso> wsPlanoCurso;

    /**
     * Gets the value of the wsPlanoCurso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsPlanoCurso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsPlanoCurso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsPlanoCurso }
     * 
     * 
     */
    public List<WsPlanoCurso> getWsPlanoCurso() {
        if (wsPlanoCurso == null) {
            wsPlanoCurso = new ArrayList<WsPlanoCurso>();
        }
        return this.wsPlanoCurso;
    }

}
