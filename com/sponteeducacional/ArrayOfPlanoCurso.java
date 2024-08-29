
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfPlanoCurso complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPlanoCurso"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlanoCurso" type="{http://api.sponteeducacional.net.br/}PlanoCurso" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPlanoCurso", propOrder = {
    "planoCurso"
})
public class ArrayOfPlanoCurso {

    @XmlElement(name = "PlanoCurso", nillable = true)
    protected List<PlanoCurso> planoCurso;

    /**
     * Gets the value of the planoCurso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planoCurso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanoCurso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanoCurso }
     * 
     * 
     */
    public List<PlanoCurso> getPlanoCurso() {
        if (planoCurso == null) {
            planoCurso = new ArrayList<PlanoCurso>();
        }
        return this.planoCurso;
    }

}
