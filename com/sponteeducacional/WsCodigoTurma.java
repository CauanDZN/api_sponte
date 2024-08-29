
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsCodigoTurma complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsCodigoTurma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://api.sponteeducacional.net.br/}wsTurma"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoTurma" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsCodigoTurma", propOrder = {
    "codigoTurma"
})
public class WsCodigoTurma
    extends WsTurma
{

    @XmlElement(name = "CodigoTurma")
    protected int codigoTurma;

    /**
     * Obtém o valor da propriedade codigoTurma.
     * 
     */
    public int getCodigoTurma() {
        return codigoTurma;
    }

    /**
     * Define o valor da propriedade codigoTurma.
     * 
     */
    public void setCodigoTurma(int value) {
        this.codigoTurma = value;
    }

}
