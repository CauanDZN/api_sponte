
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsSituacoesAlunos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsSituacoesAlunos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsSituacoesAlunos" type="{http://api.sponteeducacional.net.br/}wsSituacoesAlunos" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsSituacoesAlunos", propOrder = {
    "wsSituacoesAlunos"
})
public class ArrayOfWsSituacoesAlunos {

    @XmlElement(nillable = true)
    protected List<WsSituacoesAlunos> wsSituacoesAlunos;

    /**
     * Gets the value of the wsSituacoesAlunos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsSituacoesAlunos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsSituacoesAlunos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsSituacoesAlunos }
     * 
     * 
     */
    public List<WsSituacoesAlunos> getWsSituacoesAlunos() {
        if (wsSituacoesAlunos == null) {
            wsSituacoesAlunos = new ArrayList<WsSituacoesAlunos>();
        }
        return this.wsSituacoesAlunos;
    }

}
