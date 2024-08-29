
package com.sponteeducacional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NotasBoletimAulasLivres complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NotasBoletimAulasLivres"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisciplinaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Disciplina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemRecuperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemExame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nota1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Recuperacao1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotaAposRec1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Faltas1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nota2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Recuperacao2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotaAposRec2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Faltas2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nota3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Recuperacao3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotaAposRec3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Faltas3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nota4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Recuperacao4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotaAposRec4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Faltas4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Media" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecuperacaoFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MediaFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalFaltas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExameFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SituacaoDidatica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotaAposRecFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacao2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacao3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observacao4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HabilidadeDisciplinaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Modulo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SistemaAvaliacaoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Notaconselho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotasBoletimAulasLivres", propOrder = {
    "disciplinaID",
    "disciplina",
    "temRecuperacao",
    "temExame",
    "nota1",
    "recuperacao1",
    "notaAposRec1",
    "faltas1",
    "nota2",
    "recuperacao2",
    "notaAposRec2",
    "faltas2",
    "nota3",
    "recuperacao3",
    "notaAposRec3",
    "faltas3",
    "nota4",
    "recuperacao4",
    "notaAposRec4",
    "faltas4",
    "media",
    "recuperacaoFinal",
    "mediaFinal",
    "totalFaltas",
    "observacao",
    "exameFinal",
    "situacaoDidatica",
    "notaAposRecFinal",
    "observacao2",
    "observacao3",
    "observacao4",
    "habilidadeDisciplinaID",
    "modulo",
    "sistemaAvaliacaoID",
    "notaconselho"
})
public class NotasBoletimAulasLivres {

    @XmlElement(name = "DisciplinaID")
    protected int disciplinaID;
    @XmlElement(name = "Disciplina")
    protected String disciplina;
    @XmlElement(name = "TemRecuperacao")
    protected String temRecuperacao;
    @XmlElement(name = "TemExame")
    protected String temExame;
    @XmlElement(name = "Nota1")
    protected String nota1;
    @XmlElement(name = "Recuperacao1")
    protected String recuperacao1;
    @XmlElement(name = "NotaAposRec1")
    protected String notaAposRec1;
    @XmlElement(name = "Faltas1")
    protected String faltas1;
    @XmlElement(name = "Nota2")
    protected String nota2;
    @XmlElement(name = "Recuperacao2")
    protected String recuperacao2;
    @XmlElement(name = "NotaAposRec2")
    protected String notaAposRec2;
    @XmlElement(name = "Faltas2")
    protected String faltas2;
    @XmlElement(name = "Nota3")
    protected String nota3;
    @XmlElement(name = "Recuperacao3")
    protected String recuperacao3;
    @XmlElement(name = "NotaAposRec3")
    protected String notaAposRec3;
    @XmlElement(name = "Faltas3")
    protected String faltas3;
    @XmlElement(name = "Nota4")
    protected String nota4;
    @XmlElement(name = "Recuperacao4")
    protected String recuperacao4;
    @XmlElement(name = "NotaAposRec4")
    protected String notaAposRec4;
    @XmlElement(name = "Faltas4")
    protected String faltas4;
    @XmlElement(name = "Media")
    protected String media;
    @XmlElement(name = "RecuperacaoFinal")
    protected String recuperacaoFinal;
    @XmlElement(name = "MediaFinal")
    protected String mediaFinal;
    @XmlElement(name = "TotalFaltas")
    protected String totalFaltas;
    @XmlElement(name = "Observacao")
    protected String observacao;
    @XmlElement(name = "ExameFinal")
    protected String exameFinal;
    @XmlElement(name = "SituacaoDidatica")
    protected String situacaoDidatica;
    @XmlElement(name = "NotaAposRecFinal")
    protected String notaAposRecFinal;
    @XmlElement(name = "Observacao2")
    protected String observacao2;
    @XmlElement(name = "Observacao3")
    protected String observacao3;
    @XmlElement(name = "Observacao4")
    protected String observacao4;
    @XmlElement(name = "HabilidadeDisciplinaID")
    protected int habilidadeDisciplinaID;
    @XmlElement(name = "Modulo")
    protected int modulo;
    @XmlElement(name = "SistemaAvaliacaoID")
    protected int sistemaAvaliacaoID;
    @XmlElement(name = "Notaconselho")
    protected String notaconselho;

    /**
     * Obtém o valor da propriedade disciplinaID.
     * 
     */
    public int getDisciplinaID() {
        return disciplinaID;
    }

    /**
     * Define o valor da propriedade disciplinaID.
     * 
     */
    public void setDisciplinaID(int value) {
        this.disciplinaID = value;
    }

    /**
     * Obtém o valor da propriedade disciplina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * Define o valor da propriedade disciplina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplina(String value) {
        this.disciplina = value;
    }

    /**
     * Obtém o valor da propriedade temRecuperacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemRecuperacao() {
        return temRecuperacao;
    }

    /**
     * Define o valor da propriedade temRecuperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemRecuperacao(String value) {
        this.temRecuperacao = value;
    }

    /**
     * Obtém o valor da propriedade temExame.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemExame() {
        return temExame;
    }

    /**
     * Define o valor da propriedade temExame.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemExame(String value) {
        this.temExame = value;
    }

    /**
     * Obtém o valor da propriedade nota1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota1() {
        return nota1;
    }

    /**
     * Define o valor da propriedade nota1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota1(String value) {
        this.nota1 = value;
    }

    /**
     * Obtém o valor da propriedade recuperacao1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecuperacao1() {
        return recuperacao1;
    }

    /**
     * Define o valor da propriedade recuperacao1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecuperacao1(String value) {
        this.recuperacao1 = value;
    }

    /**
     * Obtém o valor da propriedade notaAposRec1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaAposRec1() {
        return notaAposRec1;
    }

    /**
     * Define o valor da propriedade notaAposRec1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaAposRec1(String value) {
        this.notaAposRec1 = value;
    }

    /**
     * Obtém o valor da propriedade faltas1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaltas1() {
        return faltas1;
    }

    /**
     * Define o valor da propriedade faltas1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaltas1(String value) {
        this.faltas1 = value;
    }

    /**
     * Obtém o valor da propriedade nota2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota2() {
        return nota2;
    }

    /**
     * Define o valor da propriedade nota2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota2(String value) {
        this.nota2 = value;
    }

    /**
     * Obtém o valor da propriedade recuperacao2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecuperacao2() {
        return recuperacao2;
    }

    /**
     * Define o valor da propriedade recuperacao2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecuperacao2(String value) {
        this.recuperacao2 = value;
    }

    /**
     * Obtém o valor da propriedade notaAposRec2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaAposRec2() {
        return notaAposRec2;
    }

    /**
     * Define o valor da propriedade notaAposRec2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaAposRec2(String value) {
        this.notaAposRec2 = value;
    }

    /**
     * Obtém o valor da propriedade faltas2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaltas2() {
        return faltas2;
    }

    /**
     * Define o valor da propriedade faltas2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaltas2(String value) {
        this.faltas2 = value;
    }

    /**
     * Obtém o valor da propriedade nota3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota3() {
        return nota3;
    }

    /**
     * Define o valor da propriedade nota3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota3(String value) {
        this.nota3 = value;
    }

    /**
     * Obtém o valor da propriedade recuperacao3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecuperacao3() {
        return recuperacao3;
    }

    /**
     * Define o valor da propriedade recuperacao3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecuperacao3(String value) {
        this.recuperacao3 = value;
    }

    /**
     * Obtém o valor da propriedade notaAposRec3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaAposRec3() {
        return notaAposRec3;
    }

    /**
     * Define o valor da propriedade notaAposRec3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaAposRec3(String value) {
        this.notaAposRec3 = value;
    }

    /**
     * Obtém o valor da propriedade faltas3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaltas3() {
        return faltas3;
    }

    /**
     * Define o valor da propriedade faltas3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaltas3(String value) {
        this.faltas3 = value;
    }

    /**
     * Obtém o valor da propriedade nota4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota4() {
        return nota4;
    }

    /**
     * Define o valor da propriedade nota4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota4(String value) {
        this.nota4 = value;
    }

    /**
     * Obtém o valor da propriedade recuperacao4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecuperacao4() {
        return recuperacao4;
    }

    /**
     * Define o valor da propriedade recuperacao4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecuperacao4(String value) {
        this.recuperacao4 = value;
    }

    /**
     * Obtém o valor da propriedade notaAposRec4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaAposRec4() {
        return notaAposRec4;
    }

    /**
     * Define o valor da propriedade notaAposRec4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaAposRec4(String value) {
        this.notaAposRec4 = value;
    }

    /**
     * Obtém o valor da propriedade faltas4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaltas4() {
        return faltas4;
    }

    /**
     * Define o valor da propriedade faltas4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaltas4(String value) {
        this.faltas4 = value;
    }

    /**
     * Obtém o valor da propriedade media.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedia() {
        return media;
    }

    /**
     * Define o valor da propriedade media.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedia(String value) {
        this.media = value;
    }

    /**
     * Obtém o valor da propriedade recuperacaoFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecuperacaoFinal() {
        return recuperacaoFinal;
    }

    /**
     * Define o valor da propriedade recuperacaoFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecuperacaoFinal(String value) {
        this.recuperacaoFinal = value;
    }

    /**
     * Obtém o valor da propriedade mediaFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaFinal() {
        return mediaFinal;
    }

    /**
     * Define o valor da propriedade mediaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaFinal(String value) {
        this.mediaFinal = value;
    }

    /**
     * Obtém o valor da propriedade totalFaltas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFaltas() {
        return totalFaltas;
    }

    /**
     * Define o valor da propriedade totalFaltas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFaltas(String value) {
        this.totalFaltas = value;
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

    /**
     * Obtém o valor da propriedade exameFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExameFinal() {
        return exameFinal;
    }

    /**
     * Define o valor da propriedade exameFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExameFinal(String value) {
        this.exameFinal = value;
    }

    /**
     * Obtém o valor da propriedade situacaoDidatica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoDidatica() {
        return situacaoDidatica;
    }

    /**
     * Define o valor da propriedade situacaoDidatica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoDidatica(String value) {
        this.situacaoDidatica = value;
    }

    /**
     * Obtém o valor da propriedade notaAposRecFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaAposRecFinal() {
        return notaAposRecFinal;
    }

    /**
     * Define o valor da propriedade notaAposRecFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaAposRecFinal(String value) {
        this.notaAposRecFinal = value;
    }

    /**
     * Obtém o valor da propriedade observacao2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao2() {
        return observacao2;
    }

    /**
     * Define o valor da propriedade observacao2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao2(String value) {
        this.observacao2 = value;
    }

    /**
     * Obtém o valor da propriedade observacao3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao3() {
        return observacao3;
    }

    /**
     * Define o valor da propriedade observacao3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao3(String value) {
        this.observacao3 = value;
    }

    /**
     * Obtém o valor da propriedade observacao4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao4() {
        return observacao4;
    }

    /**
     * Define o valor da propriedade observacao4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao4(String value) {
        this.observacao4 = value;
    }

    /**
     * Obtém o valor da propriedade habilidadeDisciplinaID.
     * 
     */
    public int getHabilidadeDisciplinaID() {
        return habilidadeDisciplinaID;
    }

    /**
     * Define o valor da propriedade habilidadeDisciplinaID.
     * 
     */
    public void setHabilidadeDisciplinaID(int value) {
        this.habilidadeDisciplinaID = value;
    }

    /**
     * Obtém o valor da propriedade modulo.
     * 
     */
    public int getModulo() {
        return modulo;
    }

    /**
     * Define o valor da propriedade modulo.
     * 
     */
    public void setModulo(int value) {
        this.modulo = value;
    }

    /**
     * Obtém o valor da propriedade sistemaAvaliacaoID.
     * 
     */
    public int getSistemaAvaliacaoID() {
        return sistemaAvaliacaoID;
    }

    /**
     * Define o valor da propriedade sistemaAvaliacaoID.
     * 
     */
    public void setSistemaAvaliacaoID(int value) {
        this.sistemaAvaliacaoID = value;
    }

    /**
     * Obtém o valor da propriedade notaconselho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaconselho() {
        return notaconselho;
    }

    /**
     * Define o valor da propriedade notaconselho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaconselho(String value) {
        this.notaconselho = value;
    }

}
