
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsFinanceiro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsFinanceiro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsFinanceiro" type="{http://api.sponteeducacional.net.br/}wsFinanceiro" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsFinanceiro", propOrder = {
    "wsFinanceiro"
})
public class ArrayOfWsFinanceiro {

    @XmlElement(nillable = true)
    protected List<WsFinanceiro> wsFinanceiro;

    /**
     * Gets the value of the wsFinanceiro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsFinanceiro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsFinanceiro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsFinanceiro }
     * 
     * 
     */
    public List<WsFinanceiro> getWsFinanceiro() {
        if (wsFinanceiro == null) {
            wsFinanceiro = new ArrayList<WsFinanceiro>();
        }
        return this.wsFinanceiro;
    }

}
