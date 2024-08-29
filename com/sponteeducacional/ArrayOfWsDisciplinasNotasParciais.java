
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsDisciplinasNotasParciais complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsDisciplinasNotasParciais"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsDisciplinasNotasParciais" type="{http://api.sponteeducacional.net.br/}wsDisciplinasNotasParciais" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsDisciplinasNotasParciais", propOrder = {
    "wsDisciplinasNotasParciais"
})
public class ArrayOfWsDisciplinasNotasParciais {

    @XmlElement(nillable = true)
    protected List<WsDisciplinasNotasParciais> wsDisciplinasNotasParciais;

    /**
     * Gets the value of the wsDisciplinasNotasParciais property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsDisciplinasNotasParciais property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsDisciplinasNotasParciais().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsDisciplinasNotasParciais }
     * 
     * 
     */
    public List<WsDisciplinasNotasParciais> getWsDisciplinasNotasParciais() {
        if (wsDisciplinasNotasParciais == null) {
            wsDisciplinasNotasParciais = new ArrayList<WsDisciplinasNotasParciais>();
        }
        return this.wsDisciplinasNotasParciais;
    }

}
