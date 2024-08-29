
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsSituacoesAlunos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsSituacoesAlunos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://api.sponteeducacional.net.br/}RetornoApiBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SituacoesAlunos" type="{http://api.sponteeducacional.net.br/}ArrayOfSituacoesAlunos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsSituacoesAlunos", propOrder = {
    "situacoesAlunos"
})
public class WsSituacoesAlunos
    extends RetornoApiBase
{

    @XmlElement(name = "SituacoesAlunos")
    protected ArrayOfSituacoesAlunos situacoesAlunos;

    /**
     * Obtém o valor da propriedade situacoesAlunos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSituacoesAlunos }
     *     
     */
    public ArrayOfSituacoesAlunos getSituacoesAlunos() {
        return situacoesAlunos;
    }

    /**
     * Define o valor da propriedade situacoesAlunos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSituacoesAlunos }
     *     
     */
    public void setSituacoesAlunos(ArrayOfSituacoesAlunos value) {
        this.situacoesAlunos = value;
    }

}
