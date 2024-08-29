
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsIntegrantesTurma complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsIntegrantesTurma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MatrizCurricularID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Integrantes" type="{http://api.sponteeducacional.net.br/}ArrayOfIntegrantes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsIntegrantesTurma", propOrder = {
    "retornoOperacao",
    "matrizCurricularID",
    "nome",
    "integrantes"
})
public class WsIntegrantesTurma {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "MatrizCurricularID")
    protected int matrizCurricularID;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "Integrantes")
    protected ArrayOfIntegrantes integrantes;

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
     * Obtém o valor da propriedade matrizCurricularID.
     * 
     */
    public int getMatrizCurricularID() {
        return matrizCurricularID;
    }

    /**
     * Define o valor da propriedade matrizCurricularID.
     * 
     */
    public void setMatrizCurricularID(int value) {
        this.matrizCurricularID = value;
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
     * Obtém o valor da propriedade integrantes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIntegrantes }
     *     
     */
    public ArrayOfIntegrantes getIntegrantes() {
        return integrantes;
    }

    /**
     * Define o valor da propriedade integrantes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIntegrantes }
     *     
     */
    public void setIntegrantes(ArrayOfIntegrantes value) {
        this.integrantes = value;
    }

}
