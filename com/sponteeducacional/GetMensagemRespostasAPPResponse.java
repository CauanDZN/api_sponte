
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
 *         &lt;element name="GetMensagemRespostasAPPResult" type="{http://api.sponteeducacional.net.br/}wsMensagemAPP" minOccurs="0"/&gt;
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
    "getMensagemRespostasAPPResult"
})
@XmlRootElement(name = "GetMensagemRespostasAPPResponse")
public class GetMensagemRespostasAPPResponse {

    @XmlElement(name = "GetMensagemRespostasAPPResult")
    protected WsMensagemAPP getMensagemRespostasAPPResult;

    /**
     * Obtém o valor da propriedade getMensagemRespostasAPPResult.
     * 
     * @return
     *     possible object is
     *     {@link WsMensagemAPP }
     *     
     */
    public WsMensagemAPP getGetMensagemRespostasAPPResult() {
        return getMensagemRespostasAPPResult;
    }

    /**
     * Define o valor da propriedade getMensagemRespostasAPPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WsMensagemAPP }
     *     
     */
    public void setGetMensagemRespostasAPPResult(WsMensagemAPP value) {
        this.getMensagemRespostasAPPResult = value;
    }

}
