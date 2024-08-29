
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsAppPortalNotasNotificacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsAppPortalNotasNotificacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsAppPortalNotasNotificacao" type="{http://api.sponteeducacional.net.br/}wsAppPortalNotasNotificacao" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsAppPortalNotasNotificacao", propOrder = {
    "wsAppPortalNotasNotificacao"
})
public class ArrayOfWsAppPortalNotasNotificacao {

    @XmlElement(nillable = true)
    protected List<WsAppPortalNotasNotificacao> wsAppPortalNotasNotificacao;

    /**
     * Gets the value of the wsAppPortalNotasNotificacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsAppPortalNotasNotificacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsAppPortalNotasNotificacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAppPortalNotasNotificacao }
     * 
     * 
     */
    public List<WsAppPortalNotasNotificacao> getWsAppPortalNotasNotificacao() {
        if (wsAppPortalNotasNotificacao == null) {
            wsAppPortalNotasNotificacao = new ArrayList<WsAppPortalNotasNotificacao>();
        }
        return this.wsAppPortalNotasNotificacao;
    }

}
