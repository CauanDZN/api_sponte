
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsMovimentacoesAlunos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsMovimentacoesAlunos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsMovimentacoesAlunos" type="{http://api.sponteeducacional.net.br/}wsMovimentacoesAlunos" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsMovimentacoesAlunos", propOrder = {
    "wsMovimentacoesAlunos"
})
public class ArrayOfWsMovimentacoesAlunos {

    @XmlElement(nillable = true)
    protected List<WsMovimentacoesAlunos> wsMovimentacoesAlunos;

    /**
     * Gets the value of the wsMovimentacoesAlunos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsMovimentacoesAlunos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsMovimentacoesAlunos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsMovimentacoesAlunos }
     * 
     * 
     */
    public List<WsMovimentacoesAlunos> getWsMovimentacoesAlunos() {
        if (wsMovimentacoesAlunos == null) {
            wsMovimentacoesAlunos = new ArrayList<WsMovimentacoesAlunos>();
        }
        return this.wsMovimentacoesAlunos;
    }

}
