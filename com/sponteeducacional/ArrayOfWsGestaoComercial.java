
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsGestaoComercial complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsGestaoComercial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsGestaoComercial" type="{http://api.sponteeducacional.net.br/}wsGestaoComercial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsGestaoComercial", propOrder = {
    "wsGestaoComercial"
})
public class ArrayOfWsGestaoComercial {

    @XmlElement(nillable = true)
    protected List<WsGestaoComercial> wsGestaoComercial;

    /**
     * Gets the value of the wsGestaoComercial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsGestaoComercial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsGestaoComercial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsGestaoComercial }
     * 
     * 
     */
    public List<WsGestaoComercial> getWsGestaoComercial() {
        if (wsGestaoComercial == null) {
            wsGestaoComercial = new ArrayList<WsGestaoComercial>();
        }
        return this.wsGestaoComercial;
    }

}
