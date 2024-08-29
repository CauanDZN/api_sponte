
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsAppPortalNotas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsAppPortalNotas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetornoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorPrimariaApp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorSecundariaApp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImagemLogoApp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PermiteAlterarFotoApp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="PermiteAlterarDadosPessoaisApp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="PermiteAlterarEnderecoApp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="PermiteExibirFinanceiroApp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="UsaMenuMovimentacao" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAppPortalNotas", propOrder = {
    "retornoOperacao",
    "corPrimariaApp",
    "corSecundariaApp",
    "imagemLogoApp",
    "permiteAlterarFotoApp",
    "permiteAlterarDadosPessoaisApp",
    "permiteAlterarEnderecoApp",
    "permiteExibirFinanceiroApp",
    "usaMenuMovimentacao"
})
public class WsAppPortalNotas {

    @XmlElement(name = "RetornoOperacao")
    protected String retornoOperacao;
    @XmlElement(name = "CorPrimariaApp")
    protected String corPrimariaApp;
    @XmlElement(name = "CorSecundariaApp")
    protected String corSecundariaApp;
    @XmlElement(name = "ImagemLogoApp")
    protected String imagemLogoApp;
    @XmlElement(name = "PermiteAlterarFotoApp")
    @XmlSchemaType(name = "unsignedByte")
    protected short permiteAlterarFotoApp;
    @XmlElement(name = "PermiteAlterarDadosPessoaisApp")
    @XmlSchemaType(name = "unsignedByte")
    protected short permiteAlterarDadosPessoaisApp;
    @XmlElement(name = "PermiteAlterarEnderecoApp")
    @XmlSchemaType(name = "unsignedByte")
    protected short permiteAlterarEnderecoApp;
    @XmlElement(name = "PermiteExibirFinanceiroApp")
    @XmlSchemaType(name = "unsignedByte")
    protected short permiteExibirFinanceiroApp;
    @XmlElement(name = "UsaMenuMovimentacao")
    @XmlSchemaType(name = "unsignedByte")
    protected short usaMenuMovimentacao;

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
     * Obtém o valor da propriedade corPrimariaApp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorPrimariaApp() {
        return corPrimariaApp;
    }

    /**
     * Define o valor da propriedade corPrimariaApp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorPrimariaApp(String value) {
        this.corPrimariaApp = value;
    }

    /**
     * Obtém o valor da propriedade corSecundariaApp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorSecundariaApp() {
        return corSecundariaApp;
    }

    /**
     * Define o valor da propriedade corSecundariaApp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorSecundariaApp(String value) {
        this.corSecundariaApp = value;
    }

    /**
     * Obtém o valor da propriedade imagemLogoApp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagemLogoApp() {
        return imagemLogoApp;
    }

    /**
     * Define o valor da propriedade imagemLogoApp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagemLogoApp(String value) {
        this.imagemLogoApp = value;
    }

    /**
     * Obtém o valor da propriedade permiteAlterarFotoApp.
     * 
     */
    public short getPermiteAlterarFotoApp() {
        return permiteAlterarFotoApp;
    }

    /**
     * Define o valor da propriedade permiteAlterarFotoApp.
     * 
     */
    public void setPermiteAlterarFotoApp(short value) {
        this.permiteAlterarFotoApp = value;
    }

    /**
     * Obtém o valor da propriedade permiteAlterarDadosPessoaisApp.
     * 
     */
    public short getPermiteAlterarDadosPessoaisApp() {
        return permiteAlterarDadosPessoaisApp;
    }

    /**
     * Define o valor da propriedade permiteAlterarDadosPessoaisApp.
     * 
     */
    public void setPermiteAlterarDadosPessoaisApp(short value) {
        this.permiteAlterarDadosPessoaisApp = value;
    }

    /**
     * Obtém o valor da propriedade permiteAlterarEnderecoApp.
     * 
     */
    public short getPermiteAlterarEnderecoApp() {
        return permiteAlterarEnderecoApp;
    }

    /**
     * Define o valor da propriedade permiteAlterarEnderecoApp.
     * 
     */
    public void setPermiteAlterarEnderecoApp(short value) {
        this.permiteAlterarEnderecoApp = value;
    }

    /**
     * Obtém o valor da propriedade permiteExibirFinanceiroApp.
     * 
     */
    public short getPermiteExibirFinanceiroApp() {
        return permiteExibirFinanceiroApp;
    }

    /**
     * Define o valor da propriedade permiteExibirFinanceiroApp.
     * 
     */
    public void setPermiteExibirFinanceiroApp(short value) {
        this.permiteExibirFinanceiroApp = value;
    }

    /**
     * Obtém o valor da propriedade usaMenuMovimentacao.
     * 
     */
    public short getUsaMenuMovimentacao() {
        return usaMenuMovimentacao;
    }

    /**
     * Define o valor da propriedade usaMenuMovimentacao.
     * 
     */
    public void setUsaMenuMovimentacao(short value) {
        this.usaMenuMovimentacao = value;
    }

}
