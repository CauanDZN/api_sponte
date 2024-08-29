
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsertTimelineResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "insertTimelineResult"
})
@XmlRootElement(name = "InsertTimelineResponse")
public class InsertTimelineResponse {

    @XmlElement(name = "InsertTimelineResult")
    protected boolean insertTimelineResult;

    /**
     * Obtém o valor da propriedade insertTimelineResult.
     * 
     */
    public boolean isInsertTimelineResult() {
        return insertTimelineResult;
    }

    /**
     * Define o valor da propriedade insertTimelineResult.
     * 
     */
    public void setInsertTimelineResult(boolean value) {
        this.insertTimelineResult = value;
    }

}
