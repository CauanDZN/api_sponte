
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsDescontos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsDescontos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dias" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Desconto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsDescontos", propOrder = {
    "dias",
    "desconto"
})
public class WsDescontos {

    @XmlElement(name = "Dias")
    protected int dias;
    @XmlElement(name = "Desconto")
    protected double desconto;

    /**
     * Obtém o valor da propriedade dias.
     * 
     */
    public int getDias() {
        return dias;
    }

    /**
     * Define o valor da propriedade dias.
     * 
     */
    public void setDias(int value) {
        this.dias = value;
    }

    /**
     * Obtém o valor da propriedade desconto.
     * 
     */
    public double getDesconto() {
        return desconto;
    }

    /**
     * Define o valor da propriedade desconto.
     * 
     */
    public void setDesconto(double value) {
        this.desconto = value;
    }

}
