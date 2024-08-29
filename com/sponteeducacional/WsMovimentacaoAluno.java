
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de wsMovimentacaoAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="wsMovimentacaoAluno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlunoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DataEntrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataSaida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoraEntrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoraSaida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsMovimentacaoAluno", propOrder = {
    "alunoID",
    "dataEntrada",
    "dataSaida",
    "horaEntrada",
    "horaSaida"
})
public class WsMovimentacaoAluno {

    @XmlElement(name = "AlunoID")
    protected int alunoID;
    @XmlElement(name = "DataEntrada")
    protected String dataEntrada;
    @XmlElement(name = "DataSaida")
    protected String dataSaida;
    @XmlElement(name = "HoraEntrada")
    protected String horaEntrada;
    @XmlElement(name = "HoraSaida")
    protected String horaSaida;

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
     * Obtém o valor da propriedade dataEntrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * Define o valor da propriedade dataEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEntrada(String value) {
        this.dataEntrada = value;
    }

    /**
     * Obtém o valor da propriedade dataSaida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSaida() {
        return dataSaida;
    }

    /**
     * Define o valor da propriedade dataSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSaida(String value) {
        this.dataSaida = value;
    }

    /**
     * Obtém o valor da propriedade horaEntrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraEntrada() {
        return horaEntrada;
    }

    /**
     * Define o valor da propriedade horaEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraEntrada(String value) {
        this.horaEntrada = value;
    }

    /**
     * Obtém o valor da propriedade horaSaida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraSaida() {
        return horaSaida;
    }

    /**
     * Define o valor da propriedade horaSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraSaida(String value) {
        this.horaSaida = value;
    }

}
