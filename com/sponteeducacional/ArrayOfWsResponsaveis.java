
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsResponsaveis complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsResponsaveis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsResponsaveis" type="{http://api.sponteeducacional.net.br/}wsResponsaveis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsResponsaveis", propOrder = {
    "wsResponsaveis"
})
public class ArrayOfWsResponsaveis {

    @XmlElement(nillable = true)
    protected List<WsResponsaveis> wsResponsaveis;

    /**
     * Gets the value of the wsResponsaveis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsResponsaveis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsResponsaveis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsResponsaveis }
     * 
     * 
     */
    public List<WsResponsaveis> getWsResponsaveis() {
        if (wsResponsaveis == null) {
            wsResponsaveis = new ArrayList<WsResponsaveis>();
        }
        return this.wsResponsaveis;
    }

}
