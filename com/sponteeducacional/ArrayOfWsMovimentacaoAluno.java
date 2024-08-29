
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsMovimentacaoAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsMovimentacaoAluno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsMovimentacaoAluno" type="{http://api.sponteeducacional.net.br/}wsMovimentacaoAluno" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsMovimentacaoAluno", propOrder = {
    "wsMovimentacaoAluno"
})
public class ArrayOfWsMovimentacaoAluno {

    @XmlElement(nillable = true)
    protected List<WsMovimentacaoAluno> wsMovimentacaoAluno;

    /**
     * Gets the value of the wsMovimentacaoAluno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsMovimentacaoAluno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsMovimentacaoAluno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsMovimentacaoAluno }
     * 
     * 
     */
    public List<WsMovimentacaoAluno> getWsMovimentacaoAluno() {
        if (wsMovimentacaoAluno == null) {
            wsMovimentacaoAluno = new ArrayList<WsMovimentacaoAluno>();
        }
        return this.wsMovimentacaoAluno;
    }

}
