
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsHorarioDetalhes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsHorarioDetalhes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsHorarioDetalhes" type="{http://api.sponteeducacional.net.br/}wsHorarioDetalhes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsHorarioDetalhes", propOrder = {
    "wsHorarioDetalhes"
})
public class ArrayOfWsHorarioDetalhes {

    @XmlElement(nillable = true)
    protected List<WsHorarioDetalhes> wsHorarioDetalhes;

    /**
     * Gets the value of the wsHorarioDetalhes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsHorarioDetalhes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsHorarioDetalhes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsHorarioDetalhes }
     * 
     * 
     */
    public List<WsHorarioDetalhes> getWsHorarioDetalhes() {
        if (wsHorarioDetalhes == null) {
            wsHorarioDetalhes = new ArrayList<WsHorarioDetalhes>();
        }
        return this.wsHorarioDetalhes;
    }

}
