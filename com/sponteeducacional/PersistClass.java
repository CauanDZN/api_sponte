
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PersistClass complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PersistClass"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidateDataOverwrite" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersistClass", propOrder = {
    "validateDataOverwrite"
})
@XmlSeeAlso({
    TokenMobile.class
})
public abstract class PersistClass {

    @XmlElement(name = "ValidateDataOverwrite")
    protected boolean validateDataOverwrite;

    /**
     * Obtém o valor da propriedade validateDataOverwrite.
     * 
     */
    public boolean isValidateDataOverwrite() {
        return validateDataOverwrite;
    }

    /**
     * Define o valor da propriedade validateDataOverwrite.
     * 
     */
    public void setValidateDataOverwrite(boolean value) {
        this.validateDataOverwrite = value;
    }

}
