
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsFormasCobrancas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsFormasCobrancas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsFormasCobrancas" type="{http://api.sponteeducacional.net.br/}wsFormasCobrancas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsFormasCobrancas", propOrder = {
    "wsFormasCobrancas"
})
public class ArrayOfWsFormasCobrancas {

    @XmlElement(nillable = true)
    protected List<WsFormasCobrancas> wsFormasCobrancas;

    /**
     * Gets the value of the wsFormasCobrancas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsFormasCobrancas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsFormasCobrancas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsFormasCobrancas }
     * 
     * 
     */
    public List<WsFormasCobrancas> getWsFormasCobrancas() {
        if (wsFormasCobrancas == null) {
            wsFormasCobrancas = new ArrayList<WsFormasCobrancas>();
        }
        return this.wsFormasCobrancas;
    }

}
