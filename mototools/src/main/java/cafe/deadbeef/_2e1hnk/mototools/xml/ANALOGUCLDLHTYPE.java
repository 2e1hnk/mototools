//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.07 at 05:56:42 PM GMT 
//


package cafe.deadbeef._2e1hnk.mototools.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}AU_LSTCTG"/&gt;
 *         &lt;element ref="{}AU_LEDSZ"/&gt;
 *         &lt;element ref="{}AU_LEQMAX"/&gt;
 *         &lt;element ref="{}AU_LLEQMAX"/&gt;
 *         &lt;element ref="{}ANALOG_UCL_DLH_TYPE_FTLLISHTYPE"/&gt;
 *         &lt;element ref="{}AU_ALPHNUMSRCHEN"/&gt;
 *         &lt;element ref="{}ANALOG_UCL_DLH_TYPE_FTLLISHID"/&gt;
 *         &lt;element ref="{}AU_RESERVED"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Applicable" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="ListID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aulstctg",
    "auledsz",
    "auleqmax",
    "aulleqmax",
    "analogucldlhtypeftllishtype",
    "aualphnumsrchen",
    "analogucldlhtypeftllishid",
    "aureserved"
})
@XmlRootElement(name = "ANALOG_UCL_DLH_TYPE")
public class ANALOGUCLDLHTYPE {

    @XmlElement(name = "AU_LSTCTG", required = true)
    protected AULSTCTG aulstctg;
    @XmlElement(name = "AU_LEDSZ", required = true)
    protected AULEDSZ auledsz;
    @XmlElement(name = "AU_LEQMAX", required = true)
    protected AULEQMAX auleqmax;
    @XmlElement(name = "AU_LLEQMAX", required = true)
    protected AULLEQMAX aulleqmax;
    @XmlElement(name = "ANALOG_UCL_DLH_TYPE_FTLLISHTYPE", required = true)
    protected ANALOGUCLDLHTYPEFTLLISHTYPE analogucldlhtypeftllishtype;
    @XmlElement(name = "AU_ALPHNUMSRCHEN", required = true)
    protected AUALPHNUMSRCHEN aualphnumsrchen;
    @XmlElement(name = "ANALOG_UCL_DLH_TYPE_FTLLISHID", required = true)
    protected ANALOGUCLDLHTYPEFTLLISHID analogucldlhtypeftllishid;
    @XmlElement(name = "AU_RESERVED", required = true)
    protected AURESERVED aureserved;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the aulstctg property.
     * 
     * @return
     *     possible object is
     *     {@link AULSTCTG }
     *     
     */
    public AULSTCTG getAULSTCTG() {
        return aulstctg;
    }

    /**
     * Sets the value of the aulstctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AULSTCTG }
     *     
     */
    public void setAULSTCTG(AULSTCTG value) {
        this.aulstctg = value;
    }

    /**
     * Gets the value of the auledsz property.
     * 
     * @return
     *     possible object is
     *     {@link AULEDSZ }
     *     
     */
    public AULEDSZ getAULEDSZ() {
        return auledsz;
    }

    /**
     * Sets the value of the auledsz property.
     * 
     * @param value
     *     allowed object is
     *     {@link AULEDSZ }
     *     
     */
    public void setAULEDSZ(AULEDSZ value) {
        this.auledsz = value;
    }

    /**
     * Gets the value of the auleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link AULEQMAX }
     *     
     */
    public AULEQMAX getAULEQMAX() {
        return auleqmax;
    }

    /**
     * Sets the value of the auleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AULEQMAX }
     *     
     */
    public void setAULEQMAX(AULEQMAX value) {
        this.auleqmax = value;
    }

    /**
     * Gets the value of the aulleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link AULLEQMAX }
     *     
     */
    public AULLEQMAX getAULLEQMAX() {
        return aulleqmax;
    }

    /**
     * Sets the value of the aulleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AULLEQMAX }
     *     
     */
    public void setAULLEQMAX(AULLEQMAX value) {
        this.aulleqmax = value;
    }

    /**
     * Gets the value of the analogucldlhtypeftllishtype property.
     * 
     * @return
     *     possible object is
     *     {@link ANALOGUCLDLHTYPEFTLLISHTYPE }
     *     
     */
    public ANALOGUCLDLHTYPEFTLLISHTYPE getANALOGUCLDLHTYPEFTLLISHTYPE() {
        return analogucldlhtypeftllishtype;
    }

    /**
     * Sets the value of the analogucldlhtypeftllishtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ANALOGUCLDLHTYPEFTLLISHTYPE }
     *     
     */
    public void setANALOGUCLDLHTYPEFTLLISHTYPE(ANALOGUCLDLHTYPEFTLLISHTYPE value) {
        this.analogucldlhtypeftllishtype = value;
    }

    /**
     * Gets the value of the aualphnumsrchen property.
     * 
     * @return
     *     possible object is
     *     {@link AUALPHNUMSRCHEN }
     *     
     */
    public AUALPHNUMSRCHEN getAUALPHNUMSRCHEN() {
        return aualphnumsrchen;
    }

    /**
     * Sets the value of the aualphnumsrchen property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUALPHNUMSRCHEN }
     *     
     */
    public void setAUALPHNUMSRCHEN(AUALPHNUMSRCHEN value) {
        this.aualphnumsrchen = value;
    }

    /**
     * Gets the value of the analogucldlhtypeftllishid property.
     * 
     * @return
     *     possible object is
     *     {@link ANALOGUCLDLHTYPEFTLLISHID }
     *     
     */
    public ANALOGUCLDLHTYPEFTLLISHID getANALOGUCLDLHTYPEFTLLISHID() {
        return analogucldlhtypeftllishid;
    }

    /**
     * Sets the value of the analogucldlhtypeftllishid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ANALOGUCLDLHTYPEFTLLISHID }
     *     
     */
    public void setANALOGUCLDLHTYPEFTLLISHID(ANALOGUCLDLHTYPEFTLLISHID value) {
        this.analogucldlhtypeftllishid = value;
    }

    /**
     * Gets the value of the aureserved property.
     * 
     * @return
     *     possible object is
     *     {@link AURESERVED }
     *     
     */
    public AURESERVED getAURESERVED() {
        return aureserved;
    }

    /**
     * Sets the value of the aureserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link AURESERVED }
     *     
     */
    public void setAURESERVED(AURESERVED value) {
        this.aureserved = value;
    }

    /**
     * Gets the value of the applicable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicable() {
        return applicable;
    }

    /**
     * Sets the value of the applicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicable(String value) {
        this.applicable = value;
    }

    /**
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setListID(BigInteger value) {
        this.listID = value;
    }

}
