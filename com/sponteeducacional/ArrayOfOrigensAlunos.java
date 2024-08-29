
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfOrigensAlunos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrigensAlunos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrigensAlunos" type="{http://api.sponteeducacional.net.br/}OrigensAlunos" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrigensAlunos", propOrder = {
    "origensAlunos"
})
public class ArrayOfOrigensAlunos {

    @XmlElement(name = "OrigensAlunos", nillable = true)
    protected List<OrigensAlunos> origensAlunos;

    /**
     * Gets the value of the origensAlunos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origensAlunos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigensAlunos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrigensAlunos }
     * 
     * 
     */
    public List<OrigensAlunos> getOrigensAlunos() {
        if (origensAlunos == null) {
            origensAlunos = new ArrayList<OrigensAlunos>();
        }
        return this.origensAlunos;
    }

}
