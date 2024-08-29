
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfWsAtualizaSenhaAlunoResponsavel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWsAtualizaSenhaAlunoResponsavel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsAtualizaSenhaAlunoResponsavel" type="{http://api.sponteeducacional.net.br/}wsAtualizaSenhaAlunoResponsavel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWsAtualizaSenhaAlunoResponsavel", propOrder = {
    "wsAtualizaSenhaAlunoResponsavel"
})
public class ArrayOfWsAtualizaSenhaAlunoResponsavel {

    @XmlElement(nillable = true)
    protected List<WsAtualizaSenhaAlunoResponsavel> wsAtualizaSenhaAlunoResponsavel;

    /**
     * Gets the value of the wsAtualizaSenhaAlunoResponsavel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsAtualizaSenhaAlunoResponsavel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsAtualizaSenhaAlunoResponsavel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAtualizaSenhaAlunoResponsavel }
     * 
     * 
     */
    public List<WsAtualizaSenhaAlunoResponsavel> getWsAtualizaSenhaAlunoResponsavel() {
        if (wsAtualizaSenhaAlunoResponsavel == null) {
            wsAtualizaSenhaAlunoResponsavel = new ArrayList<WsAtualizaSenhaAlunoResponsavel>();
        }
        return this.wsAtualizaSenhaAlunoResponsavel;
    }

}
