
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
 *         &lt;element name="NovaRespostaMensagemAppResult" type="{http://api.sponteeducacional.net.br/}wsRetNovaRespostaMensagem" minOccurs="0"/&gt;
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
    "novaRespostaMensagemAppResult"
})
@XmlRootElement(name = "NovaRespostaMensagemAppResponse")
public class NovaRespostaMensagemAppResponse {

    @XmlElement(name = "NovaRespostaMensagemAppResult")
    protected WsRetNovaRespostaMensagem novaRespostaMensagemAppResult;

    /**
     * Obtém o valor da propriedade novaRespostaMensagemAppResult.
     * 
     * @return
     *     possible object is
     *     {@link WsRetNovaRespostaMensagem }
     *     
     */
    public WsRetNovaRespostaMensagem getNovaRespostaMensagemAppResult() {
        return novaRespostaMensagemAppResult;
    }

    /**
     * Define o valor da propriedade novaRespostaMensagemAppResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WsRetNovaRespostaMensagem }
     *     
     */
    public void setNovaRespostaMensagemAppResult(WsRetNovaRespostaMensagem value) {
        this.novaRespostaMensagemAppResult = value;
    }

}
