
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsMatrizCurricular complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsMatrizCurricular"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsMatrizCurricular" type="{http://api.sponteeducacional.net.br/}wsMatrizCurricular" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsMatrizCurricular", propOrder = {
    "wsMatrizCurricular"
})
public class ArrayOfWsMatrizCurricular {

    @XmlElement(nillable = true)
    protected List<WsMatrizCurricular> wsMatrizCurricular;

    /**
     * Gets the value of the wsMatrizCurricular property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsMatrizCurricular property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsMatrizCurricular().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsMatrizCurricular }
     * 
     * 
     */
    public List<WsMatrizCurricular> getWsMatrizCurricular() {
        if (wsMatrizCurricular == null) {
            wsMatrizCurricular = new ArrayList<WsMatrizCurricular>();
        }
        return this.wsMatrizCurricular;
    }

}
