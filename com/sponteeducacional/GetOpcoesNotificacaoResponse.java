
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
 *         &lt;element name="GetOpcoesNotificacaoResult" type="{http://api.sponteeducacional.net.br/}ArrayOfWsAppPortalNotasNotificacao" minOccurs="0"/&gt;
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
    "getOpcoesNotificacaoResult"
})
@XmlRootElement(name = "GetOpcoesNotificacaoResponse")
public class GetOpcoesNotificacaoResponse {

    @XmlElement(name = "GetOpcoesNotificacaoResult")
    protected ArrayOfWsAppPortalNotasNotificacao getOpcoesNotificacaoResult;

    /**
     * Obtém o valor da propriedade getOpcoesNotificacaoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsAppPortalNotasNotificacao }
     *     
     */
    public ArrayOfWsAppPortalNotasNotificacao getGetOpcoesNotificacaoResult() {
        return getOpcoesNotificacaoResult;
    }

    /**
     * Define o valor da propriedade getOpcoesNotificacaoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsAppPortalNotasNotificacao }
     *     
     */
    public void setGetOpcoesNotificacaoResult(ArrayOfWsAppPortalNotasNotificacao value) {
        this.getOpcoesNotificacaoResult = value;
    }

}
