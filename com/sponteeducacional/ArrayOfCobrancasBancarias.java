
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfCobrancasBancarias complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCobrancasBancarias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CobrancasBancarias" type="{http://api.sponteeducacional.net.br/}CobrancasBancarias" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCobrancasBancarias", propOrder = {
    "cobrancasBancarias"
})
public class ArrayOfCobrancasBancarias {

    @XmlElement(name = "CobrancasBancarias", nillable = true)
    protected List<CobrancasBancarias> cobrancasBancarias;

    /**
     * Gets the value of the cobrancasBancarias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cobrancasBancarias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCobrancasBancarias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CobrancasBancarias }
     * 
     * 
     */
    public List<CobrancasBancarias> getCobrancasBancarias() {
        if (cobrancasBancarias == null) {
            cobrancasBancarias = new ArrayList<CobrancasBancarias>();
        }
        return this.cobrancasBancarias;
    }

}
