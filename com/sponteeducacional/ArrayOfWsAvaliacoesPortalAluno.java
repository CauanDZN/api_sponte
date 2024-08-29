
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsAvaliacoesPortalAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsAvaliacoesPortalAluno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsAvaliacoesPortalAluno" type="{http://api.sponteeducacional.net.br/}wsAvaliacoesPortalAluno" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsAvaliacoesPortalAluno", propOrder = {
    "wsAvaliacoesPortalAluno"
})
public class ArrayOfWsAvaliacoesPortalAluno {

    @XmlElement(nillable = true)
    protected List<WsAvaliacoesPortalAluno> wsAvaliacoesPortalAluno;

    /**
     * Gets the value of the wsAvaliacoesPortalAluno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsAvaliacoesPortalAluno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsAvaliacoesPortalAluno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAvaliacoesPortalAluno }
     * 
     * 
     */
    public List<WsAvaliacoesPortalAluno> getWsAvaliacoesPortalAluno() {
        if (wsAvaliacoesPortalAluno == null) {
            wsAvaliacoesPortalAluno = new ArrayList<WsAvaliacoesPortalAluno>();
        }
        return this.wsAvaliacoesPortalAluno;
    }

}
