
package com.sponteeducacional;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetLinhaDigitavelBoletosResult" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="XmlSchemaElements"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;any processContents='lax' namespace='http://www.w3.org/2001/XMLSchema' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="XmlDiffgramElements"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;any processContents='lax' namespace='urn:schemas-microsoft-com:xml-diffgram-v1'/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getLinhaDigitavelBoletosResult"
})
@XmlRootElement(name = "GetLinhaDigitavelBoletosResponse")
public class GetLinhaDigitavelBoletosResponse {

    @XmlElement(name = "GetLinhaDigitavelBoletosResult")
    protected GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult getLinhaDigitavelBoletosResult;

    /**
     * Obtém o valor da propriedade getLinhaDigitavelBoletosResult.
     * 
     * @return
     *     possible object is
     *     {@link GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult }
     *     
     */
    public GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult getGetLinhaDigitavelBoletosResult() {
        return getLinhaDigitavelBoletosResult;
    }

    /**
     * Define o valor da propriedade getLinhaDigitavelBoletosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult }
     *     
     */
    public void setGetLinhaDigitavelBoletosResult(GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult value) {
        this.getLinhaDigitavelBoletosResult = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="XmlSchemaElements"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;any processContents='lax' namespace='http://www.w3.org/2001/XMLSchema' maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="XmlDiffgramElements"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;any processContents='lax' namespace='urn:schemas-microsoft-com:xml-diffgram-v1'/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "xmlSchemaElements",
        "xmlDiffgramElements"
    })
    public static class GetLinhaDigitavelBoletosResult {

        @XmlElement(name = "XmlSchemaElements", required = true)
        protected GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlSchemaElements xmlSchemaElements;
        @XmlElement(name = "XmlDiffgramElements", required = true)
        protected GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlDiffgramElements xmlDiffgramElements;

        /**
         * Obtém o valor da propriedade xmlSchemaElements.
         * 
         * @return
         *     possible object is
         *     {@link GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlSchemaElements }
         *     
         */
        public GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlSchemaElements getXmlSchemaElements() {
            return xmlSchemaElements;
        }

        /**
         * Define o valor da propriedade xmlSchemaElements.
         * 
         * @param value
         *     allowed object is
         *     {@link GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlSchemaElements }
         *     
         */
        public void setXmlSchemaElements(GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlSchemaElements value) {
            this.xmlSchemaElements = value;
        }

        /**
         * Obtém o valor da propriedade xmlDiffgramElements.
         * 
         * @return
         *     possible object is
         *     {@link GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlDiffgramElements }
         *     
         */
        public GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlDiffgramElements getXmlDiffgramElements() {
            return xmlDiffgramElements;
        }

        /**
         * Define o valor da propriedade xmlDiffgramElements.
         * 
         * @param value
         *     allowed object is
         *     {@link GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlDiffgramElements }
         *     
         */
        public void setXmlDiffgramElements(GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlDiffgramElements value) {
            this.xmlDiffgramElements = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;any processContents='lax' namespace='urn:schemas-microsoft-com:xml-diffgram-v1'/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class XmlDiffgramElements {

            @XmlAnyElement(lax = true)
            protected Object any;

            /**
             * Obtém o valor da propriedade any.
             * 
             * @return
             *     possible object is
             *     {@link Element }
             *     {@link Object }
             *     
             */
            public Object getAny() {
                return any;
            }

            /**
             * Define o valor da propriedade any.
             * 
             * @param value
             *     allowed object is
             *     {@link Element }
             *     {@link Object }
             *     
             */
            public void setAny(Object value) {
                this.any = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;any processContents='lax' namespace='http://www.w3.org/2001/XMLSchema' maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class XmlSchemaElements {

            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Element }
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
            }

        }

    }

}
