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
 *         &lt;element ref="{}ST_SRCH_DLL_TYPE_NTLLISHTYPE"/&gt;
 *         &lt;element ref="{}ST_SRCH_DLL_TYPE_NTLLISHID"/&gt;
 *         &lt;element ref="{}SSP_LLEQ"/&gt;
 *         &lt;element ref="{}SSP_CNVPERCOMP"/&gt;
 *         &lt;element ref="{}SSP_CNVPERCOMPTYPE"/&gt;
 *         &lt;element ref="{}SSP_CNVPERCOMPID"/&gt;
 *         &lt;element ref="{}SSPL_RESERVED"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Applicable" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="ListID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="ListLetID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stsrchdlltypentllishtype",
    "stsrchdlltypentllishid",
    "ssplleq",
    "sspcnvpercomp",
    "sspcnvpercomptype",
    "sspcnvpercompid",
    "ssplreserved"
})
@XmlRootElement(name = "ST_SRCH_DLL_TYPE")
public class STSRCHDLLTYPE {

    @XmlElement(name = "ST_SRCH_DLL_TYPE_NTLLISHTYPE", required = true)
    protected STSRCHDLLTYPENTLLISHTYPE stsrchdlltypentllishtype;
    @XmlElement(name = "ST_SRCH_DLL_TYPE_NTLLISHID", required = true)
    protected STSRCHDLLTYPENTLLISHID stsrchdlltypentllishid;
    @XmlElement(name = "SSP_LLEQ", required = true)
    protected SSPLLEQ ssplleq;
    @XmlElement(name = "SSP_CNVPERCOMP", required = true)
    protected SSPCNVPERCOMP sspcnvpercomp;
    @XmlElement(name = "SSP_CNVPERCOMPTYPE", required = true)
    protected SSPCNVPERCOMPTYPE sspcnvpercomptype;
    @XmlElement(name = "SSP_CNVPERCOMPID", required = true)
    protected SSPCNVPERCOMPID sspcnvpercompid;
    @XmlElement(name = "SSPL_RESERVED", required = true)
    protected SSPLRESERVED ssplreserved;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;
    @XmlAttribute(name = "ListLetID", required = true)
    protected BigInteger listLetID;

    /**
     * Gets the value of the stsrchdlltypentllishtype property.
     * 
     * @return
     *     possible object is
     *     {@link STSRCHDLLTYPENTLLISHTYPE }
     *     
     */
    public STSRCHDLLTYPENTLLISHTYPE getSTSRCHDLLTYPENTLLISHTYPE() {
        return stsrchdlltypentllishtype;
    }

    /**
     * Sets the value of the stsrchdlltypentllishtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link STSRCHDLLTYPENTLLISHTYPE }
     *     
     */
    public void setSTSRCHDLLTYPENTLLISHTYPE(STSRCHDLLTYPENTLLISHTYPE value) {
        this.stsrchdlltypentllishtype = value;
    }

    /**
     * Gets the value of the stsrchdlltypentllishid property.
     * 
     * @return
     *     possible object is
     *     {@link STSRCHDLLTYPENTLLISHID }
     *     
     */
    public STSRCHDLLTYPENTLLISHID getSTSRCHDLLTYPENTLLISHID() {
        return stsrchdlltypentllishid;
    }

    /**
     * Sets the value of the stsrchdlltypentllishid property.
     * 
     * @param value
     *     allowed object is
     *     {@link STSRCHDLLTYPENTLLISHID }
     *     
     */
    public void setSTSRCHDLLTYPENTLLISHID(STSRCHDLLTYPENTLLISHID value) {
        this.stsrchdlltypentllishid = value;
    }

    /**
     * Gets the value of the ssplleq property.
     * 
     * @return
     *     possible object is
     *     {@link SSPLLEQ }
     *     
     */
    public SSPLLEQ getSSPLLEQ() {
        return ssplleq;
    }

    /**
     * Sets the value of the ssplleq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSPLLEQ }
     *     
     */
    public void setSSPLLEQ(SSPLLEQ value) {
        this.ssplleq = value;
    }

    /**
     * Gets the value of the sspcnvpercomp property.
     * 
     * @return
     *     possible object is
     *     {@link SSPCNVPERCOMP }
     *     
     */
    public SSPCNVPERCOMP getSSPCNVPERCOMP() {
        return sspcnvpercomp;
    }

    /**
     * Sets the value of the sspcnvpercomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSPCNVPERCOMP }
     *     
     */
    public void setSSPCNVPERCOMP(SSPCNVPERCOMP value) {
        this.sspcnvpercomp = value;
    }

    /**
     * Gets the value of the sspcnvpercomptype property.
     * 
     * @return
     *     possible object is
     *     {@link SSPCNVPERCOMPTYPE }
     *     
     */
    public SSPCNVPERCOMPTYPE getSSPCNVPERCOMPTYPE() {
        return sspcnvpercomptype;
    }

    /**
     * Sets the value of the sspcnvpercomptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSPCNVPERCOMPTYPE }
     *     
     */
    public void setSSPCNVPERCOMPTYPE(SSPCNVPERCOMPTYPE value) {
        this.sspcnvpercomptype = value;
    }

    /**
     * Gets the value of the sspcnvpercompid property.
     * 
     * @return
     *     possible object is
     *     {@link SSPCNVPERCOMPID }
     *     
     */
    public SSPCNVPERCOMPID getSSPCNVPERCOMPID() {
        return sspcnvpercompid;
    }

    /**
     * Sets the value of the sspcnvpercompid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSPCNVPERCOMPID }
     *     
     */
    public void setSSPCNVPERCOMPID(SSPCNVPERCOMPID value) {
        this.sspcnvpercompid = value;
    }

    /**
     * Gets the value of the ssplreserved property.
     * 
     * @return
     *     possible object is
     *     {@link SSPLRESERVED }
     *     
     */
    public SSPLRESERVED getSSPLRESERVED() {
        return ssplreserved;
    }

    /**
     * Sets the value of the ssplreserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSPLRESERVED }
     *     
     */
    public void setSSPLRESERVED(SSPLRESERVED value) {
        this.ssplreserved = value;
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

    /**
     * Gets the value of the listLetID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getListLetID() {
        return listLetID;
    }

    /**
     * Sets the value of the listLetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setListLetID(BigInteger value) {
        this.listLetID = value;
    }

}
