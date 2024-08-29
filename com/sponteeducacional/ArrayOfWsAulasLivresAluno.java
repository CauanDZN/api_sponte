
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsAulasLivresAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsAulasLivresAluno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsAulasLivresAluno" type="{http://api.sponteeducacional.net.br/}wsAulasLivresAluno" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsAulasLivresAluno", propOrder = {
    "wsAulasLivresAluno"
})
public class ArrayOfWsAulasLivresAluno {

    @XmlElement(nillable = true)
    protected List<WsAulasLivresAluno> wsAulasLivresAluno;

    /**
     * Gets the value of the wsAulasLivresAluno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsAulasLivresAluno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsAulasLivresAluno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAulasLivresAluno }
     * 
     * 
     */
    public List<WsAulasLivresAluno> getWsAulasLivresAluno() {
        if (wsAulasLivresAluno == null) {
            wsAulasLivresAluno = new ArrayList<WsAulasLivresAluno>();
        }
        return this.wsAulasLivresAluno;
    }

}
