
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsAgendaAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsAgendaAluno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://api.sponteeducacional.net.br/}RetornoApiBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AulasDiario" type="{http://api.sponteeducacional.net.br/}ArrayOfWsAulasDiarioClasseAluno" minOccurs="0"/&gt;
 *         &lt;element name="AvaliacoesPortal" type="{http://api.sponteeducacional.net.br/}ArrayOfWsAvaliacoesPortalAluno" minOccurs="0"/&gt;
 *         &lt;element name="AulasLivres" type="{http://api.sponteeducacional.net.br/}ArrayOfWsAulasLivresAluno" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAgendaAluno", propOrder = {
    "alunoID",
    "aulasDiario",
    "avaliacoesPortal",
    "aulasLivres"
})
public class WsAgendaAluno
    extends RetornoApiBase
{

    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "AulasDiario")
    protected ArrayOfWsAulasDiarioClasseAluno aulasDiario;
    @XmlElement(name = "AvaliacoesPortal")
    protected ArrayOfWsAvaliacoesPortalAluno avaliacoesPortal;
    @XmlElement(name = "AulasLivres")
    protected ArrayOfWsAulasLivresAluno aulasLivres;

    /**
     * Obtém o valor da propriedade alunoID.
     * 
     */
    public int getAlunoID() {
        return alunoID;
    }

    /**
     * Define o valor da propriedade alunoID.
     * 
     */
    public void setAlunoID(int value) {
        this.alunoID = value;
    }

    /**
     * Obtém o valor da propriedade aulasDiario.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsAulasDiarioClasseAluno }
     *     
     */
    public ArrayOfWsAulasDiarioClasseAluno getAulasDiario() {
        return aulasDiario;
    }

    /**
     * Define o valor da propriedade aulasDiario.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsAulasDiarioClasseAluno }
     *     
     */
    public void setAulasDiario(ArrayOfWsAulasDiarioClasseAluno value) {
        this.aulasDiario = value;
    }

    /**
     * Obtém o valor da propriedade avaliacoesPortal.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsAvaliacoesPortalAluno }
     *     
     */
    public ArrayOfWsAvaliacoesPortalAluno getAvaliacoesPortal() {
        return avaliacoesPortal;
    }

    /**
     * Define o valor da propriedade avaliacoesPortal.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsAvaliacoesPortalAluno }
     *     
     */
    public void setAvaliacoesPortal(ArrayOfWsAvaliacoesPortalAluno value) {
        this.avaliacoesPortal = value;
    }

    /**
     * Obtém o valor da propriedade aulasLivres.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsAulasLivresAluno }
     *     
     */
    public ArrayOfWsAulasLivresAluno getAulasLivres() {
        return aulasLivres;
    }

    /**
     * Define o valor da propriedade aulasLivres.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsAulasLivresAluno }
     *     
     */
    public void setAulasLivres(ArrayOfWsAulasLivresAluno value) {
        this.aulasLivres = value;
    }

}
