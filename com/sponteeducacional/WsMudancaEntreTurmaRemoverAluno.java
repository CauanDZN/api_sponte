
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsMudancaEntreTurmaRemoverAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsMudancaEntreTurmaRemoverAluno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MudancaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeAluno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SituacaoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContratoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TurmaOrigem" type="{http://api.sponteeducacional.net.br/}ArrayOfWsInfoTurma" minOccurs="0"/&gt;
 *         &lt;element name="TurmaDestino" type="{http://api.sponteeducacional.net.br/}ArrayOfWsInfoTurma" minOccurs="0"/&gt;
 *         &lt;element name="RemoverAluno" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsMudancaEntreTurmaRemoverAluno", propOrder = {
    "retornoOperacao",
    "mudancaID",
    "alunoID",
    "nomeAluno",
    "situacaoDestino",
    "contratoId",
    "turmaOrigem",
    "turmaDestino",
    "removerAluno",
    "data",
    "observacao"
})
public class WsMudancaEntreTurmaRemoverAluno {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "MudancaID")
    protected int mudancaID;
    @XmlElement(name = "AlunoID")
    protected String alunoID;
    @XmlElement(name = "NomeAluno")
    protected String nomeAluno;
    @XmlElement(name = "SituacaoDestino")
    protected String situacaoDestino;
    @XmlElement(name = "ContratoId")
    protected String contratoId;
    @XmlElement(name = "TurmaOrigem")
    protected ArrayOfWsInfoTurma turmaOrigem;
    @XmlElement(name = "TurmaDestino")
    protected ArrayOfWsInfoTurma turmaDestino;
    @XmlElement(name = "RemoverAluno")
    protected boolean removerAluno;
    @XmlElement(name = "Data")
    protected String data;
    @XmlElement(name = "Observacao")
    protected String observacao;

    /**
     * Obtém o valor da propriedade retornoOperacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetornoOperacao() {
        return retornoOperacao;
    }

    /**
     * Define o valor da propriedade retornoOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetornoOperacao(String value) {
        this.retornoOperacao = value;
    }

    /**
     * Obtém o valor da propriedade mudancaID.
     * 
     */
    public int getMudancaID() {
        return mudancaID;
    }

    /**
     * Define o valor da propriedade mudancaID.
     * 
     */
    public void setMudancaID(int value) {
        this.mudancaID = value;
    }

    /**
     * Obtém o valor da propriedade alunoID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlunoID() {
        return alunoID;
    }

    /**
     * Define o valor da propriedade alunoID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlunoID(String value) {
        this.alunoID = value;
    }

    /**
     * Obtém o valor da propriedade nomeAluno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * Define o valor da propriedade nomeAluno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAluno(String value) {
        this.nomeAluno = value;
    }

    /**
     * Obtém o valor da propriedade situacaoDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoDestino() {
        return situacaoDestino;
    }

    /**
     * Define o valor da propriedade situacaoDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoDestino(String value) {
        this.situacaoDestino = value;
    }

    /**
     * Obtém o valor da propriedade contratoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContratoId() {
        return contratoId;
    }

    /**
     * Define o valor da propriedade contratoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContratoId(String value) {
        this.contratoId = value;
    }

    /**
     * Obtém o valor da propriedade turmaOrigem.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsInfoTurma }
     *     
     */
    public ArrayOfWsInfoTurma getTurmaOrigem() {
        return turmaOrigem;
    }

    /**
     * Define o valor da propriedade turmaOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsInfoTurma }
     *     
     */
    public void setTurmaOrigem(ArrayOfWsInfoTurma value) {
        this.turmaOrigem = value;
    }

    /**
     * Obtém o valor da propriedade turmaDestino.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsInfoTurma }
     *     
     */
    public ArrayOfWsInfoTurma getTurmaDestino() {
        return turmaDestino;
    }

    /**
     * Define o valor da propriedade turmaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsInfoTurma }
     *     
     */
    public void setTurmaDestino(ArrayOfWsInfoTurma value) {
        this.turmaDestino = value;
    }

    /**
     * Obtém o valor da propriedade removerAluno.
     * 
     */
    public boolean isRemoverAluno() {
        return removerAluno;
    }

    /**
     * Define o valor da propriedade removerAluno.
     * 
     */
    public void setRemoverAluno(boolean value) {
        this.removerAluno = value;
    }

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

}
