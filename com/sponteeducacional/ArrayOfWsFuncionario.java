
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsFuncionario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsFuncionario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsFuncionario" type="{http://api.sponteeducacional.net.br/}wsFuncionario" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsFuncionario", propOrder = {
    "wsFuncionario"
})
public class ArrayOfWsFuncionario {

    @XmlElement(nillable = true)
    protected List<WsFuncionario> wsFuncionario;

    /**
     * Gets the value of the wsFuncionario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsFuncionario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsFuncionario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsFuncionario }
     * 
     * 
     */
    public List<WsFuncionario> getWsFuncionario() {
        if (wsFuncionario == null) {
            wsFuncionario = new ArrayList<WsFuncionario>();
        }
        return this.wsFuncionario;
    }

}
