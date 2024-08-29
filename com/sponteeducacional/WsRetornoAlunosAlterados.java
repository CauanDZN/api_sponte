
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsRetornoAlunosAlterados complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsRetornoAlunosAlterados"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://api.sponteeducacional.net.br/}RetornoApiBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alunos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsRetornoAlunosAlterados", propOrder = {
    "alunos"
})
public class WsRetornoAlunosAlterados
    extends RetornoApiBase
{

    @XmlElement(name = "Alunos")
    protected String alunos;

    /**
     * Obtém o valor da propriedade alunos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlunos() {
        return alunos;
    }

    /**
     * Define o valor da propriedade alunos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlunos(String value) {
        this.alunos = value;
    }

}
