
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
 *         &lt;element name="UpdateReadTimelineResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "updateReadTimelineResult"
})
@XmlRootElement(name = "UpdateReadTimelineResponse")
public class UpdateReadTimelineResponse {

    @XmlElement(name = "UpdateReadTimelineResult")
    protected boolean updateReadTimelineResult;

    /**
     * Obtém o valor da propriedade updateReadTimelineResult.
     * 
     */
    public boolean isUpdateReadTimelineResult() {
        return updateReadTimelineResult;
    }

    /**
     * Define o valor da propriedade updateReadTimelineResult.
     * 
     */
    public void setUpdateReadTimelineResult(boolean value) {
        this.updateReadTimelineResult = value;
    }

}
