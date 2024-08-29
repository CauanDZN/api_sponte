
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsOrigensAlunos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsOrigensAlunos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://api.sponteeducacional.net.br/}RetornoApiBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrigensAlunos" type="{http://api.sponteeducacional.net.br/}ArrayOfOrigensAlunos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsOrigensAlunos", propOrder = {
    "origensAlunos"
})
public class WsOrigensAlunos
    extends RetornoApiBase
{

    @XmlElement(name = "OrigensAlunos")
    protected ArrayOfOrigensAlunos origensAlunos;

    /**
     * Obtém o valor da propriedade origensAlunos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrigensAlunos }
     *     
     */
    public ArrayOfOrigensAlunos getOrigensAlunos() {
        return origensAlunos;
    }

    /**
     * Define o valor da propriedade origensAlunos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrigensAlunos }
     *     
     */
    public void setOrigensAlunos(ArrayOfOrigensAlunos value) {
        this.origensAlunos = value;
    }

}
