//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.05 at 02:22:03 PM GMT 
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
 *         &lt;element ref="{}CAPPLUSESS_EMGCYALRMTYPE"/&gt;
 *         &lt;element ref="{}CAPPLUSESS_EMALRTSEL"/&gt;
 *         &lt;element ref="{}CAPPLUSESS_EMHOTMICTXDUR"/&gt;
 *         &lt;element ref="{}CAPPLUSESS_CAPPLUSECALLIDITEM"/&gt;
 *         &lt;element ref="{}CAPPLUSESS_CAPPLUSECALLIDITEMTYPE"/&gt;
 *         &lt;element ref="{}CAPPLUSESS_CAPPLUSECALLIDITEMID"/&gt;
 *         &lt;element ref="{}CAPPLUSESS_POLITERETRYNUM"/&gt;
 *         &lt;element ref="{}CAPPLUSESS_CAPPLUSEAWT"/&gt;
 *         &lt;element ref="{}CAPPLUSESS_ALIAS"/&gt;
 *         &lt;element ref="{}CAPPLUSESS_EMHOTMICRXDUR"/&gt;
 *         &lt;element ref="{}CAPPLUSESS_EMHOTMICCLCNT"/&gt;
 *         &lt;element ref="{}CAPPLUSESS_EMERINT"/&gt;
 *         &lt;element ref="{}CAPPLUSESS_RESERVED"/&gt;
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
    "capplusessemgcyalrmtype",
    "capplusessemalrtsel",
    "capplusessemhotmictxdur",
    "capplusesscapplusecalliditem",
    "capplusesscapplusecalliditemtype",
    "capplusesscapplusecalliditemid",
    "capplusesspoliteretrynum",
    "capplusesscappluseawt",
    "capplusessalias",
    "capplusessemhotmicrxdur",
    "capplusessemhotmicclcnt",
    "capplusessemerint",
    "capplusessreserved"
})
@XmlRootElement(name = "CAPACITY_PLUS_ESS_CMP_TYPE")
public class CAPACITYPLUSESSCMPTYPE {

    @XmlElement(name = "CAPPLUSESS_EMGCYALRMTYPE", required = true)
    protected CAPPLUSESSEMGCYALRMTYPE capplusessemgcyalrmtype;
    @XmlElement(name = "CAPPLUSESS_EMALRTSEL", required = true)
    protected CAPPLUSESSEMALRTSEL capplusessemalrtsel;
    @XmlElement(name = "CAPPLUSESS_EMHOTMICTXDUR", required = true)
    protected CAPPLUSESSEMHOTMICTXDUR capplusessemhotmictxdur;
    @XmlElement(name = "CAPPLUSESS_CAPPLUSECALLIDITEM", required = true)
    protected CAPPLUSESSCAPPLUSECALLIDITEM capplusesscapplusecalliditem;
    @XmlElement(name = "CAPPLUSESS_CAPPLUSECALLIDITEMTYPE", required = true)
    protected CAPPLUSESSCAPPLUSECALLIDITEMTYPE capplusesscapplusecalliditemtype;
    @XmlElement(name = "CAPPLUSESS_CAPPLUSECALLIDITEMID", required = true)
    protected CAPPLUSESSCAPPLUSECALLIDITEMID capplusesscapplusecalliditemid;
    @XmlElement(name = "CAPPLUSESS_POLITERETRYNUM", required = true)
    protected CAPPLUSESSPOLITERETRYNUM capplusesspoliteretrynum;
    @XmlElement(name = "CAPPLUSESS_CAPPLUSEAWT", required = true)
    protected CAPPLUSESSCAPPLUSEAWT capplusesscappluseawt;
    @XmlElement(name = "CAPPLUSESS_ALIAS", required = true)
    protected CAPPLUSESSALIAS capplusessalias;
    @XmlElement(name = "CAPPLUSESS_EMHOTMICRXDUR", required = true)
    protected CAPPLUSESSEMHOTMICRXDUR capplusessemhotmicrxdur;
    @XmlElement(name = "CAPPLUSESS_EMHOTMICCLCNT", required = true)
    protected CAPPLUSESSEMHOTMICCLCNT capplusessemhotmicclcnt;
    @XmlElement(name = "CAPPLUSESS_EMERINT", required = true)
    protected CAPPLUSESSEMERINT capplusessemerint;
    @XmlElement(name = "CAPPLUSESS_RESERVED", required = true)
    protected CAPPLUSESSRESERVED capplusessreserved;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the capplusessemgcyalrmtype property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSESSEMGCYALRMTYPE }
     *     
     */
    public CAPPLUSESSEMGCYALRMTYPE getCAPPLUSESSEMGCYALRMTYPE() {
        return capplusessemgcyalrmtype;
    }

    /**
     * Sets the value of the capplusessemgcyalrmtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSESSEMGCYALRMTYPE }
     *     
     */
    public void setCAPPLUSESSEMGCYALRMTYPE(CAPPLUSESSEMGCYALRMTYPE value) {
        this.capplusessemgcyalrmtype = value;
    }

    /**
     * Gets the value of the capplusessemalrtsel property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSESSEMALRTSEL }
     *     
     */
    public CAPPLUSESSEMALRTSEL getCAPPLUSESSEMALRTSEL() {
        return capplusessemalrtsel;
    }

    /**
     * Sets the value of the capplusessemalrtsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSESSEMALRTSEL }
     *     
     */
    public void setCAPPLUSESSEMALRTSEL(CAPPLUSESSEMALRTSEL value) {
        this.capplusessemalrtsel = value;
    }

    /**
     * Gets the value of the capplusessemhotmictxdur property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSESSEMHOTMICTXDUR }
     *     
     */
    public CAPPLUSESSEMHOTMICTXDUR getCAPPLUSESSEMHOTMICTXDUR() {
        return capplusessemhotmictxdur;
    }

    /**
     * Sets the value of the capplusessemhotmictxdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSESSEMHOTMICTXDUR }
     *     
     */
    public void setCAPPLUSESSEMHOTMICTXDUR(CAPPLUSESSEMHOTMICTXDUR value) {
        this.capplusessemhotmictxdur = value;
    }

    /**
     * Gets the value of the capplusesscapplusecalliditem property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSESSCAPPLUSECALLIDITEM }
     *     
     */
    public CAPPLUSESSCAPPLUSECALLIDITEM getCAPPLUSESSCAPPLUSECALLIDITEM() {
        return capplusesscapplusecalliditem;
    }

    /**
     * Sets the value of the capplusesscapplusecalliditem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSESSCAPPLUSECALLIDITEM }
     *     
     */
    public void setCAPPLUSESSCAPPLUSECALLIDITEM(CAPPLUSESSCAPPLUSECALLIDITEM value) {
        this.capplusesscapplusecalliditem = value;
    }

    /**
     * Gets the value of the capplusesscapplusecalliditemtype property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSESSCAPPLUSECALLIDITEMTYPE }
     *     
     */
    public CAPPLUSESSCAPPLUSECALLIDITEMTYPE getCAPPLUSESSCAPPLUSECALLIDITEMTYPE() {
        return capplusesscapplusecalliditemtype;
    }

    /**
     * Sets the value of the capplusesscapplusecalliditemtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSESSCAPPLUSECALLIDITEMTYPE }
     *     
     */
    public void setCAPPLUSESSCAPPLUSECALLIDITEMTYPE(CAPPLUSESSCAPPLUSECALLIDITEMTYPE value) {
        this.capplusesscapplusecalliditemtype = value;
    }

    /**
     * Gets the value of the capplusesscapplusecalliditemid property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSESSCAPPLUSECALLIDITEMID }
     *     
     */
    public CAPPLUSESSCAPPLUSECALLIDITEMID getCAPPLUSESSCAPPLUSECALLIDITEMID() {
        return capplusesscapplusecalliditemid;
    }

    /**
     * Sets the value of the capplusesscapplusecalliditemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSESSCAPPLUSECALLIDITEMID }
     *     
     */
    public void setCAPPLUSESSCAPPLUSECALLIDITEMID(CAPPLUSESSCAPPLUSECALLIDITEMID value) {
        this.capplusesscapplusecalliditemid = value;
    }

    /**
     * Gets the value of the capplusesspoliteretrynum property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSESSPOLITERETRYNUM }
     *     
     */
    public CAPPLUSESSPOLITERETRYNUM getCAPPLUSESSPOLITERETRYNUM() {
        return capplusesspoliteretrynum;
    }

    /**
     * Sets the value of the capplusesspoliteretrynum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSESSPOLITERETRYNUM }
     *     
     */
    public void setCAPPLUSESSPOLITERETRYNUM(CAPPLUSESSPOLITERETRYNUM value) {
        this.capplusesspoliteretrynum = value;
    }

    /**
     * Gets the value of the capplusesscappluseawt property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSESSCAPPLUSEAWT }
     *     
     */
    public CAPPLUSESSCAPPLUSEAWT getCAPPLUSESSCAPPLUSEAWT() {
        return capplusesscappluseawt;
    }

    /**
     * Sets the value of the capplusesscappluseawt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSESSCAPPLUSEAWT }
     *     
     */
    public void setCAPPLUSESSCAPPLUSEAWT(CAPPLUSESSCAPPLUSEAWT value) {
        this.capplusesscappluseawt = value;
    }

    /**
     * Gets the value of the capplusessalias property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSESSALIAS }
     *     
     */
    public CAPPLUSESSALIAS getCAPPLUSESSALIAS() {
        return capplusessalias;
    }

    /**
     * Sets the value of the capplusessalias property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSESSALIAS }
     *     
     */
    public void setCAPPLUSESSALIAS(CAPPLUSESSALIAS value) {
        this.capplusessalias = value;
    }

    /**
     * Gets the value of the capplusessemhotmicrxdur property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSESSEMHOTMICRXDUR }
     *     
     */
    public CAPPLUSESSEMHOTMICRXDUR getCAPPLUSESSEMHOTMICRXDUR() {
        return capplusessemhotmicrxdur;
    }

    /**
     * Sets the value of the capplusessemhotmicrxdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSESSEMHOTMICRXDUR }
     *     
     */
    public void setCAPPLUSESSEMHOTMICRXDUR(CAPPLUSESSEMHOTMICRXDUR value) {
        this.capplusessemhotmicrxdur = value;
    }

    /**
     * Gets the value of the capplusessemhotmicclcnt property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSESSEMHOTMICCLCNT }
     *     
     */
    public CAPPLUSESSEMHOTMICCLCNT getCAPPLUSESSEMHOTMICCLCNT() {
        return capplusessemhotmicclcnt;
    }

    /**
     * Sets the value of the capplusessemhotmicclcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSESSEMHOTMICCLCNT }
     *     
     */
    public void setCAPPLUSESSEMHOTMICCLCNT(CAPPLUSESSEMHOTMICCLCNT value) {
        this.capplusessemhotmicclcnt = value;
    }

    /**
     * Gets the value of the capplusessemerint property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSESSEMERINT }
     *     
     */
    public CAPPLUSESSEMERINT getCAPPLUSESSEMERINT() {
        return capplusessemerint;
    }

    /**
     * Sets the value of the capplusessemerint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSESSEMERINT }
     *     
     */
    public void setCAPPLUSESSEMERINT(CAPPLUSESSEMERINT value) {
        this.capplusessemerint = value;
    }

    /**
     * Gets the value of the capplusessreserved property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSESSRESERVED }
     *     
     */
    public CAPPLUSESSRESERVED getCAPPLUSESSRESERVED() {
        return capplusessreserved;
    }

    /**
     * Sets the value of the capplusessreserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSESSRESERVED }
     *     
     */
    public void setCAPPLUSESSRESERVED(CAPPLUSESSRESERVED value) {
        this.capplusessreserved = value;
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
