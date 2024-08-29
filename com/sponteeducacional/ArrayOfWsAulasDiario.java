
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsAulasDiario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsAulasDiario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsAulasDiario" type="{http://api.sponteeducacional.net.br/}wsAulasDiario" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsAulasDiario", propOrder = {
    "wsAulasDiario"
})
public class ArrayOfWsAulasDiario {

    @XmlElement(nillable = true)
    protected List<WsAulasDiario> wsAulasDiario;

    /**
     * Gets the value of the wsAulasDiario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsAulasDiario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsAulasDiario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAulasDiario }
     * 
     * 
     */
    public List<WsAulasDiario> getWsAulasDiario() {
        if (wsAulasDiario == null) {
            wsAulasDiario = new ArrayList<WsAulasDiario>();
        }
        return this.wsAulasDiario;
    }

}
