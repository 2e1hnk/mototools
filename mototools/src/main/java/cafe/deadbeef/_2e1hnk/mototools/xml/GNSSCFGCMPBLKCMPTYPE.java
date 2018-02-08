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
 *         &lt;element ref="{}GNSSCFGCMPBLK_GPS"/&gt;
 *         &lt;element ref="{}GNSSCFGCMPBLK_GLONASS"/&gt;
 *         &lt;element ref="{}GNSSCFGCMPBLK_BEIDOU"/&gt;
 *         &lt;element ref="{}GNSSCFGCMPBLK_GALILEO"/&gt;
 *         &lt;element ref="{}GNSSCFGCMPBLK_QZSS"/&gt;
 *         &lt;element ref="{}GNSSCFGCMPBLK_GNSSCOMBINATION1"/&gt;
 *         &lt;element ref="{}GNSSCFGCMPBLK_GNSSCOMBINATION2"/&gt;
 *         &lt;element ref="{}GNSSCFGCMPBLK_GNSSCOMBINATION3"/&gt;
 *         &lt;element ref="{}GNSSCFGCMPBLK_GNSSCOMBINATION4"/&gt;
 *         &lt;element ref="{}GNSSCFGCMPBLK_USERSELECTION"/&gt;
 *         &lt;element ref="{}GNSSCFGCMPBLK_RESERVED"/&gt;
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
    "gnsscfgcmpblkgps",
    "gnsscfgcmpblkglonass",
    "gnsscfgcmpblkbeidou",
    "gnsscfgcmpblkgalileo",
    "gnsscfgcmpblkqzss",
    "gnsscfgcmpblkgnsscombination1",
    "gnsscfgcmpblkgnsscombination2",
    "gnsscfgcmpblkgnsscombination3",
    "gnsscfgcmpblkgnsscombination4",
    "gnsscfgcmpblkuserselection",
    "gnsscfgcmpblkreserved"
})
@XmlRootElement(name = "GNSSCFGCMPBLK_CMP_TYPE")
public class GNSSCFGCMPBLKCMPTYPE {

    @XmlElement(name = "GNSSCFGCMPBLK_GPS", required = true)
    protected GNSSCFGCMPBLKGPS gnsscfgcmpblkgps;
    @XmlElement(name = "GNSSCFGCMPBLK_GLONASS", required = true)
    protected GNSSCFGCMPBLKGLONASS gnsscfgcmpblkglonass;
    @XmlElement(name = "GNSSCFGCMPBLK_BEIDOU", required = true)
    protected GNSSCFGCMPBLKBEIDOU gnsscfgcmpblkbeidou;
    @XmlElement(name = "GNSSCFGCMPBLK_GALILEO", required = true)
    protected GNSSCFGCMPBLKGALILEO gnsscfgcmpblkgalileo;
    @XmlElement(name = "GNSSCFGCMPBLK_QZSS", required = true)
    protected GNSSCFGCMPBLKQZSS gnsscfgcmpblkqzss;
    @XmlElement(name = "GNSSCFGCMPBLK_GNSSCOMBINATION1", required = true)
    protected GNSSCFGCMPBLKGNSSCOMBINATION1 gnsscfgcmpblkgnsscombination1;
    @XmlElement(name = "GNSSCFGCMPBLK_GNSSCOMBINATION2", required = true)
    protected GNSSCFGCMPBLKGNSSCOMBINATION2 gnsscfgcmpblkgnsscombination2;
    @XmlElement(name = "GNSSCFGCMPBLK_GNSSCOMBINATION3", required = true)
    protected GNSSCFGCMPBLKGNSSCOMBINATION3 gnsscfgcmpblkgnsscombination3;
    @XmlElement(name = "GNSSCFGCMPBLK_GNSSCOMBINATION4", required = true)
    protected GNSSCFGCMPBLKGNSSCOMBINATION4 gnsscfgcmpblkgnsscombination4;
    @XmlElement(name = "GNSSCFGCMPBLK_USERSELECTION", required = true)
    protected GNSSCFGCMPBLKUSERSELECTION gnsscfgcmpblkuserselection;
    @XmlElement(name = "GNSSCFGCMPBLK_RESERVED", required = true)
    protected GNSSCFGCMPBLKRESERVED gnsscfgcmpblkreserved;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the gnsscfgcmpblkgps property.
     * 
     * @return
     *     possible object is
     *     {@link GNSSCFGCMPBLKGPS }
     *     
     */
    public GNSSCFGCMPBLKGPS getGNSSCFGCMPBLKGPS() {
        return gnsscfgcmpblkgps;
    }

    /**
     * Sets the value of the gnsscfgcmpblkgps property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNSSCFGCMPBLKGPS }
     *     
     */
    public void setGNSSCFGCMPBLKGPS(GNSSCFGCMPBLKGPS value) {
        this.gnsscfgcmpblkgps = value;
    }

    /**
     * Gets the value of the gnsscfgcmpblkglonass property.
     * 
     * @return
     *     possible object is
     *     {@link GNSSCFGCMPBLKGLONASS }
     *     
     */
    public GNSSCFGCMPBLKGLONASS getGNSSCFGCMPBLKGLONASS() {
        return gnsscfgcmpblkglonass;
    }

    /**
     * Sets the value of the gnsscfgcmpblkglonass property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNSSCFGCMPBLKGLONASS }
     *     
     */
    public void setGNSSCFGCMPBLKGLONASS(GNSSCFGCMPBLKGLONASS value) {
        this.gnsscfgcmpblkglonass = value;
    }

    /**
     * Gets the value of the gnsscfgcmpblkbeidou property.
     * 
     * @return
     *     possible object is
     *     {@link GNSSCFGCMPBLKBEIDOU }
     *     
     */
    public GNSSCFGCMPBLKBEIDOU getGNSSCFGCMPBLKBEIDOU() {
        return gnsscfgcmpblkbeidou;
    }

    /**
     * Sets the value of the gnsscfgcmpblkbeidou property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNSSCFGCMPBLKBEIDOU }
     *     
     */
    public void setGNSSCFGCMPBLKBEIDOU(GNSSCFGCMPBLKBEIDOU value) {
        this.gnsscfgcmpblkbeidou = value;
    }

    /**
     * Gets the value of the gnsscfgcmpblkgalileo property.
     * 
     * @return
     *     possible object is
     *     {@link GNSSCFGCMPBLKGALILEO }
     *     
     */
    public GNSSCFGCMPBLKGALILEO getGNSSCFGCMPBLKGALILEO() {
        return gnsscfgcmpblkgalileo;
    }

    /**
     * Sets the value of the gnsscfgcmpblkgalileo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNSSCFGCMPBLKGALILEO }
     *     
     */
    public void setGNSSCFGCMPBLKGALILEO(GNSSCFGCMPBLKGALILEO value) {
        this.gnsscfgcmpblkgalileo = value;
    }

    /**
     * Gets the value of the gnsscfgcmpblkqzss property.
     * 
     * @return
     *     possible object is
     *     {@link GNSSCFGCMPBLKQZSS }
     *     
     */
    public GNSSCFGCMPBLKQZSS getGNSSCFGCMPBLKQZSS() {
        return gnsscfgcmpblkqzss;
    }

    /**
     * Sets the value of the gnsscfgcmpblkqzss property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNSSCFGCMPBLKQZSS }
     *     
     */
    public void setGNSSCFGCMPBLKQZSS(GNSSCFGCMPBLKQZSS value) {
        this.gnsscfgcmpblkqzss = value;
    }

    /**
     * Gets the value of the gnsscfgcmpblkgnsscombination1 property.
     * 
     * @return
     *     possible object is
     *     {@link GNSSCFGCMPBLKGNSSCOMBINATION1 }
     *     
     */
    public GNSSCFGCMPBLKGNSSCOMBINATION1 getGNSSCFGCMPBLKGNSSCOMBINATION1() {
        return gnsscfgcmpblkgnsscombination1;
    }

    /**
     * Sets the value of the gnsscfgcmpblkgnsscombination1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNSSCFGCMPBLKGNSSCOMBINATION1 }
     *     
     */
    public void setGNSSCFGCMPBLKGNSSCOMBINATION1(GNSSCFGCMPBLKGNSSCOMBINATION1 value) {
        this.gnsscfgcmpblkgnsscombination1 = value;
    }

    /**
     * Gets the value of the gnsscfgcmpblkgnsscombination2 property.
     * 
     * @return
     *     possible object is
     *     {@link GNSSCFGCMPBLKGNSSCOMBINATION2 }
     *     
     */
    public GNSSCFGCMPBLKGNSSCOMBINATION2 getGNSSCFGCMPBLKGNSSCOMBINATION2() {
        return gnsscfgcmpblkgnsscombination2;
    }

    /**
     * Sets the value of the gnsscfgcmpblkgnsscombination2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNSSCFGCMPBLKGNSSCOMBINATION2 }
     *     
     */
    public void setGNSSCFGCMPBLKGNSSCOMBINATION2(GNSSCFGCMPBLKGNSSCOMBINATION2 value) {
        this.gnsscfgcmpblkgnsscombination2 = value;
    }

    /**
     * Gets the value of the gnsscfgcmpblkgnsscombination3 property.
     * 
     * @return
     *     possible object is
     *     {@link GNSSCFGCMPBLKGNSSCOMBINATION3 }
     *     
     */
    public GNSSCFGCMPBLKGNSSCOMBINATION3 getGNSSCFGCMPBLKGNSSCOMBINATION3() {
        return gnsscfgcmpblkgnsscombination3;
    }

    /**
     * Sets the value of the gnsscfgcmpblkgnsscombination3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNSSCFGCMPBLKGNSSCOMBINATION3 }
     *     
     */
    public void setGNSSCFGCMPBLKGNSSCOMBINATION3(GNSSCFGCMPBLKGNSSCOMBINATION3 value) {
        this.gnsscfgcmpblkgnsscombination3 = value;
    }

    /**
     * Gets the value of the gnsscfgcmpblkgnsscombination4 property.
     * 
     * @return
     *     possible object is
     *     {@link GNSSCFGCMPBLKGNSSCOMBINATION4 }
     *     
     */
    public GNSSCFGCMPBLKGNSSCOMBINATION4 getGNSSCFGCMPBLKGNSSCOMBINATION4() {
        return gnsscfgcmpblkgnsscombination4;
    }

    /**
     * Sets the value of the gnsscfgcmpblkgnsscombination4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNSSCFGCMPBLKGNSSCOMBINATION4 }
     *     
     */
    public void setGNSSCFGCMPBLKGNSSCOMBINATION4(GNSSCFGCMPBLKGNSSCOMBINATION4 value) {
        this.gnsscfgcmpblkgnsscombination4 = value;
    }

    /**
     * Gets the value of the gnsscfgcmpblkuserselection property.
     * 
     * @return
     *     possible object is
     *     {@link GNSSCFGCMPBLKUSERSELECTION }
     *     
     */
    public GNSSCFGCMPBLKUSERSELECTION getGNSSCFGCMPBLKUSERSELECTION() {
        return gnsscfgcmpblkuserselection;
    }

    /**
     * Sets the value of the gnsscfgcmpblkuserselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNSSCFGCMPBLKUSERSELECTION }
     *     
     */
    public void setGNSSCFGCMPBLKUSERSELECTION(GNSSCFGCMPBLKUSERSELECTION value) {
        this.gnsscfgcmpblkuserselection = value;
    }

    /**
     * Gets the value of the gnsscfgcmpblkreserved property.
     * 
     * @return
     *     possible object is
     *     {@link GNSSCFGCMPBLKRESERVED }
     *     
     */
    public GNSSCFGCMPBLKRESERVED getGNSSCFGCMPBLKRESERVED() {
        return gnsscfgcmpblkreserved;
    }

    /**
     * Sets the value of the gnsscfgcmpblkreserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNSSCFGCMPBLKRESERVED }
     *     
     */
    public void setGNSSCFGCMPBLKRESERVED(GNSSCFGCMPBLKRESERVED value) {
        this.gnsscfgcmpblkreserved = value;
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
