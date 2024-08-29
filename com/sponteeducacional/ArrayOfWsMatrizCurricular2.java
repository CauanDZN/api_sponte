
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsMatrizCurricular2 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsMatrizCurricular2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsMatrizCurricular2" type="{http://api.sponteeducacional.net.br/}wsMatrizCurricular2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsMatrizCurricular2", propOrder = {
    "wsMatrizCurricular2"
})
public class ArrayOfWsMatrizCurricular2 {

    @XmlElement(nillable = true)
    protected List<WsMatrizCurricular2> wsMatrizCurricular2;

    /**
     * Gets the value of the wsMatrizCurricular2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsMatrizCurricular2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsMatrizCurricular2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsMatrizCurricular2 }
     * 
     * 
     */
    public List<WsMatrizCurricular2> getWsMatrizCurricular2() {
        if (wsMatrizCurricular2 == null) {
            wsMatrizCurricular2 = new ArrayList<WsMatrizCurricular2>();
        }
        return this.wsMatrizCurricular2;
    }

}
