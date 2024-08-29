
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsDisciplinaDetalhada complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsDisciplinaDetalhada"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeTraducao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sigla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoDisciplina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AreaConhecimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Professores" type="{http://api.sponteeducacional.net.br/}ArrayOfWsProfessores" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsDisciplinaDetalhada", propOrder = {
    "retornoOperacao",
    "nome",
    "nomeTraducao",
    "sigla",
    "tipoCurso",
    "tipoDisciplina",
    "areaConhecimento",
    "professores"
})
public class WsDisciplinaDetalhada {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "NomeTraducao")
    protected String nomeTraducao;
    @XmlElement(name = "Sigla")
    protected String sigla;
    @XmlElement(name = "TipoCurso")
    protected String tipoCurso;
    @XmlElement(name = "TipoDisciplina")
    protected String tipoDisciplina;
    @XmlElement(name = "AreaConhecimento")
    protected String areaConhecimento;
    @XmlElement(name = "Professores")
    protected ArrayOfWsProfessores professores;

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
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade nomeTraducao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTraducao() {
        return nomeTraducao;
    }

    /**
     * Define o valor da propriedade nomeTraducao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTraducao(String value) {
        this.nomeTraducao = value;
    }

    /**
     * Obtém o valor da propriedade sigla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Define o valor da propriedade sigla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigla(String value) {
        this.sigla = value;
    }

    /**
     * Obtém o valor da propriedade tipoCurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCurso() {
        return tipoCurso;
    }

    /**
     * Define o valor da propriedade tipoCurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCurso(String value) {
        this.tipoCurso = value;
    }

    /**
     * Obtém o valor da propriedade tipoDisciplina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDisciplina() {
        return tipoDisciplina;
    }

    /**
     * Define o valor da propriedade tipoDisciplina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDisciplina(String value) {
        this.tipoDisciplina = value;
    }

    /**
     * Obtém o valor da propriedade areaConhecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    /**
     * Define o valor da propriedade areaConhecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaConhecimento(String value) {
        this.areaConhecimento = value;
    }

    /**
     * Obtém o valor da propriedade professores.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsProfessores }
     *     
     */
    public ArrayOfWsProfessores getProfessores() {
        return professores;
    }

    /**
     * Define o valor da propriedade professores.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsProfessores }
     *     
     */
    public void setProfessores(ArrayOfWsProfessores value) {
        this.professores = value;
    }

}
