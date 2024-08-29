
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsAnexosComunicados complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsAnexosComunicados"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsAnexosComunicados" type="{http://api.sponteeducacional.net.br/}wsAnexosComunicados" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsAnexosComunicados", propOrder = {
    "wsAnexosComunicados"
})
public class ArrayOfWsAnexosComunicados {

    @XmlElement(nillable = true)
    protected List<WsAnexosComunicados> wsAnexosComunicados;

    /**
     * Gets the value of the wsAnexosComunicados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsAnexosComunicados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsAnexosComunicados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAnexosComunicados }
     * 
     * 
     */
    public List<WsAnexosComunicados> getWsAnexosComunicados() {
        if (wsAnexosComunicados == null) {
            wsAnexosComunicados = new ArrayList<WsAnexosComunicados>();
        }
        return this.wsAnexosComunicados;
    }

}
