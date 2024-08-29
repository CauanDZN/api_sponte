
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
 *         &lt;element name="UpdateSituacaoComunicadoAppResult" type="{http://api.sponteeducacional.net.br/}wsAtualizaSituacaoComunicado" minOccurs="0"/&gt;
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
    "updateSituacaoComunicadoAppResult"
})
@XmlRootElement(name = "UpdateSituacaoComunicadoAppResponse")
public class UpdateSituacaoComunicadoAppResponse {

    @XmlElement(name = "UpdateSituacaoComunicadoAppResult")
    protected WsAtualizaSituacaoComunicado updateSituacaoComunicadoAppResult;

    /**
     * Obtém o valor da propriedade updateSituacaoComunicadoAppResult.
     * 
     * @return
     *     possible object is
     *     {@link WsAtualizaSituacaoComunicado }
     *     
     */
    public WsAtualizaSituacaoComunicado getUpdateSituacaoComunicadoAppResult() {
        return updateSituacaoComunicadoAppResult;
    }

    /**
     * Define o valor da propriedade updateSituacaoComunicadoAppResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WsAtualizaSituacaoComunicado }
     *     
     */
    public void setUpdateSituacaoComunicadoAppResult(WsAtualizaSituacaoComunicado value) {
        this.updateSituacaoComunicadoAppResult = value;
    }

}
