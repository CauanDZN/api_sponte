
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
 *         &lt;element name="InsertTurmaResult" minOccurs="0"&gt;
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
    "insertTurmaResult"
})
@XmlRootElement(name = "InsertTurmaResponse")
public class InsertTurmaResponse {

    @XmlElement(name = "InsertTurmaResult")
    protected InsertTurmaResponse.InsertTurmaResult insertTurmaResult;

    /**
     * Obtém o valor da propriedade insertTurmaResult.
     * 
     * @return
     *     possible object is
     *     {@link InsertTurmaResponse.InsertTurmaResult }
     *     
     */
    public InsertTurmaResponse.InsertTurmaResult getInsertTurmaResult() {
        return insertTurmaResult;
    }

    /**
     * Define o valor da propriedade insertTurmaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertTurmaResponse.InsertTurmaResult }
     *     
     */
    public void setInsertTurmaResult(InsertTurmaResponse.InsertTurmaResult value) {
        this.insertTurmaResult = value;
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
    public static class InsertTurmaResult {

        @XmlElement(name = "XmlSchemaElements", required = true)
        protected InsertTurmaResponse.InsertTurmaResult.XmlSchemaElements xmlSchemaElements;
        @XmlElement(name = "XmlDiffgramElements", required = true)
        protected InsertTurmaResponse.InsertTurmaResult.XmlDiffgramElements xmlDiffgramElements;

        /**
         * Obtém o valor da propriedade xmlSchemaElements.
         * 
         * @return
         *     possible object is
         *     {@link InsertTurmaResponse.InsertTurmaResult.XmlSchemaElements }
         *     
         */
        public InsertTurmaResponse.InsertTurmaResult.XmlSchemaElements getXmlSchemaElements() {
            return xmlSchemaElements;
        }

        /**
         * Define o valor da propriedade xmlSchemaElements.
         * 
         * @param value
         *     allowed object is
         *     {@link InsertTurmaResponse.InsertTurmaResult.XmlSchemaElements }
         *     
         */
        public void setXmlSchemaElements(InsertTurmaResponse.InsertTurmaResult.XmlSchemaElements value) {
            this.xmlSchemaElements = value;
        }

        /**
         * Obtém o valor da propriedade xmlDiffgramElements.
         * 
         * @return
         *     possible object is
         *     {@link InsertTurmaResponse.InsertTurmaResult.XmlDiffgramElements }
         *     
         */
        public InsertTurmaResponse.InsertTurmaResult.XmlDiffgramElements getXmlDiffgramElements() {
            return xmlDiffgramElements;
        }

        /**
         * Define o valor da propriedade xmlDiffgramElements.
         * 
         * @param value
         *     allowed object is
         *     {@link InsertTurmaResponse.InsertTurmaResult.XmlDiffgramElements }
         *     
         */
        public void setXmlDiffgramElements(InsertTurmaResponse.InsertTurmaResult.XmlDiffgramElements value) {
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
