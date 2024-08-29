
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsAvaliacoesParciais complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsAvaliacoesParciais"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsAvaliacoesParciais" type="{http://api.sponteeducacional.net.br/}wsAvaliacoesParciais" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsAvaliacoesParciais", propOrder = {
    "wsAvaliacoesParciais"
})
public class ArrayOfWsAvaliacoesParciais {

    @XmlElement(nillable = true)
    protected List<WsAvaliacoesParciais> wsAvaliacoesParciais;

    /**
     * Gets the value of the wsAvaliacoesParciais property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsAvaliacoesParciais property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsAvaliacoesParciais().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAvaliacoesParciais }
     * 
     * 
     */
    public List<WsAvaliacoesParciais> getWsAvaliacoesParciais() {
        if (wsAvaliacoesParciais == null) {
            wsAvaliacoesParciais = new ArrayList<WsAvaliacoesParciais>();
        }
        return this.wsAvaliacoesParciais;
    }

}
