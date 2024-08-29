
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
 *         &lt;element name="UpdateSenhaPortalResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsAtualizaSenhaAlunoResponsavel" minOccurs="0"/&gt;
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
    "updateSenhaPortalResult"
})
@XmlRootElement(name = "UpdateSenhaPortalResponse")
public class UpdateSenhaPortalResponse {

    @XmlElement(name = "UpdateSenhaPortalResult")
    protected ArrayOfWsAtualizaSenhaAlunoResponsavel updateSenhaPortalResult;

    /**
     * Obtém o valor da propriedade updateSenhaPortalResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsAtualizaSenhaAlunoResponsavel }
     *     
     */
    public ArrayOfWsAtualizaSenhaAlunoResponsavel getUpdateSenhaPortalResult() {
        return updateSenhaPortalResult;
    }

    /**
     * Define o valor da propriedade updateSenhaPortalResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsAtualizaSenhaAlunoResponsavel }
     *     
     */
    public void setUpdateSenhaPortalResult(ArrayOfWsAtualizaSenhaAlunoResponsavel value) {
        this.updateSenhaPortalResult = value;
    }

}
