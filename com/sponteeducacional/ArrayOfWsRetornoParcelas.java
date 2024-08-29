
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsRetornoParcelas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsRetornoParcelas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsRetornoParcelas" type="{http://api.sponteeducacional.net.br/}wsRetornoParcelas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsRetornoParcelas", propOrder = {
    "wsRetornoParcelas"
})
public class ArrayOfWsRetornoParcelas {

    @XmlElement(nillable = true)
    protected List<WsRetornoParcelas> wsRetornoParcelas;

    /**
     * Gets the value of the wsRetornoParcelas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsRetornoParcelas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsRetornoParcelas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsRetornoParcelas }
     * 
     * 
     */
    public List<WsRetornoParcelas> getWsRetornoParcelas() {
        if (wsRetornoParcelas == null) {
            wsRetornoParcelas = new ArrayList<WsRetornoParcelas>();
        }
        return this.wsRetornoParcelas;
    }

}
