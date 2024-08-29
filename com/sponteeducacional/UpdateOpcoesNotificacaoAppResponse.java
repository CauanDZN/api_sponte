
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
 *         &lt;element name="UpdateOpcoesNotificacaoAppResult" type="{http://api.sponteeducacional.net.br/}ArrayOfTokenMobile" minOccurs="0"/&gt;
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
    "updateOpcoesNotificacaoAppResult"
})
@XmlRootElement(name = "UpdateOpcoesNotificacaoAppResponse")
public class UpdateOpcoesNotificacaoAppResponse {

    @XmlElement(name = "UpdateOpcoesNotificacaoAppResult")
    protected ArrayOfTokenMobile updateOpcoesNotificacaoAppResult;

    /**
     * Obtém o valor da propriedade updateOpcoesNotificacaoAppResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTokenMobile }
     *     
     */
    public ArrayOfTokenMobile getUpdateOpcoesNotificacaoAppResult() {
        return updateOpcoesNotificacaoAppResult;
    }

    /**
     * Define o valor da propriedade updateOpcoesNotificacaoAppResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTokenMobile }
     *     
     */
    public void setUpdateOpcoesNotificacaoAppResult(ArrayOfTokenMobile value) {
        this.updateOpcoesNotificacaoAppResult = value;
    }

}
