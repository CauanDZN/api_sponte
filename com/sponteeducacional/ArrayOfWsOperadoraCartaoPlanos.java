
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsOperadoraCartaoPlanos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsOperadoraCartaoPlanos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsOperadoraCartaoPlanos" type="{http://api.sponteeducacional.net.br/}wsOperadoraCartaoPlanos" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsOperadoraCartaoPlanos", propOrder = {
    "wsOperadoraCartaoPlanos"
})
public class ArrayOfWsOperadoraCartaoPlanos {

    @XmlElement(nillable = true)
    protected List<WsOperadoraCartaoPlanos> wsOperadoraCartaoPlanos;

    /**
     * Gets the value of the wsOperadoraCartaoPlanos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsOperadoraCartaoPlanos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsOperadoraCartaoPlanos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsOperadoraCartaoPlanos }
     * 
     * 
     */
    public List<WsOperadoraCartaoPlanos> getWsOperadoraCartaoPlanos() {
        if (wsOperadoraCartaoPlanos == null) {
            wsOperadoraCartaoPlanos = new ArrayList<WsOperadoraCartaoPlanos>();
        }
        return this.wsOperadoraCartaoPlanos;
    }

}
