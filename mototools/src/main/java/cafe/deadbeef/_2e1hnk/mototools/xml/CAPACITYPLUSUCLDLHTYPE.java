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
 *         &lt;element ref="{}CAPPLUSUCL_LSTCTG"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_LEDSZ"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_LEQMAX"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_LLEQMAX"/&gt;
 *         &lt;element ref="{}CAPACITY_PLUS_UCL_DLH_TYPE_FTLLISHTYPE"/&gt;
 *         &lt;element ref="{}CAPACITY_PLUS_UCL_DLH_TYPE_FTLLISHID"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_ALPHNUMSRCHEN"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_RESERVED"/&gt;
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
    "capplusucllstctg",
    "capplusuclledsz",
    "capplusuclleqmax",
    "capplusucllleqmax",
    "capacityplusucldlhtypeftllishtype",
    "capacityplusucldlhtypeftllishid",
    "capplusuclalphnumsrchen",
    "capplusuclreserved"
})
@XmlRootElement(name = "CAPACITY_PLUS_UCL_DLH_TYPE")
public class CAPACITYPLUSUCLDLHTYPE {

    @XmlElement(name = "CAPPLUSUCL_LSTCTG", required = true)
    protected CAPPLUSUCLLSTCTG capplusucllstctg;
    @XmlElement(name = "CAPPLUSUCL_LEDSZ", required = true)
    protected CAPPLUSUCLLEDSZ capplusuclledsz;
    @XmlElement(name = "CAPPLUSUCL_LEQMAX", required = true)
    protected CAPPLUSUCLLEQMAX capplusuclleqmax;
    @XmlElement(name = "CAPPLUSUCL_LLEQMAX", required = true)
    protected CAPPLUSUCLLLEQMAX capplusucllleqmax;
    @XmlElement(name = "CAPACITY_PLUS_UCL_DLH_TYPE_FTLLISHTYPE", required = true)
    protected CAPACITYPLUSUCLDLHTYPEFTLLISHTYPE capacityplusucldlhtypeftllishtype;
    @XmlElement(name = "CAPACITY_PLUS_UCL_DLH_TYPE_FTLLISHID", required = true)
    protected CAPACITYPLUSUCLDLHTYPEFTLLISHID capacityplusucldlhtypeftllishid;
    @XmlElement(name = "CAPPLUSUCL_ALPHNUMSRCHEN", required = true)
    protected CAPPLUSUCLALPHNUMSRCHEN capplusuclalphnumsrchen;
    @XmlElement(name = "CAPPLUSUCL_RESERVED", required = true)
    protected CAPPLUSUCLRESERVED capplusuclreserved;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the capplusucllstctg property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLLSTCTG }
     *     
     */
    public CAPPLUSUCLLSTCTG getCAPPLUSUCLLSTCTG() {
        return capplusucllstctg;
    }

    /**
     * Sets the value of the capplusucllstctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLLSTCTG }
     *     
     */
    public void setCAPPLUSUCLLSTCTG(CAPPLUSUCLLSTCTG value) {
        this.capplusucllstctg = value;
    }

    /**
     * Gets the value of the capplusuclledsz property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLLEDSZ }
     *     
     */
    public CAPPLUSUCLLEDSZ getCAPPLUSUCLLEDSZ() {
        return capplusuclledsz;
    }

    /**
     * Sets the value of the capplusuclledsz property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLLEDSZ }
     *     
     */
    public void setCAPPLUSUCLLEDSZ(CAPPLUSUCLLEDSZ value) {
        this.capplusuclledsz = value;
    }

    /**
     * Gets the value of the capplusuclleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLLEQMAX }
     *     
     */
    public CAPPLUSUCLLEQMAX getCAPPLUSUCLLEQMAX() {
        return capplusuclleqmax;
    }

    /**
     * Sets the value of the capplusuclleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLLEQMAX }
     *     
     */
    public void setCAPPLUSUCLLEQMAX(CAPPLUSUCLLEQMAX value) {
        this.capplusuclleqmax = value;
    }

    /**
     * Gets the value of the capplusucllleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLLLEQMAX }
     *     
     */
    public CAPPLUSUCLLLEQMAX getCAPPLUSUCLLLEQMAX() {
        return capplusucllleqmax;
    }

    /**
     * Sets the value of the capplusucllleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLLLEQMAX }
     *     
     */
    public void setCAPPLUSUCLLLEQMAX(CAPPLUSUCLLLEQMAX value) {
        this.capplusucllleqmax = value;
    }

    /**
     * Gets the value of the capacityplusucldlhtypeftllishtype property.
     * 
     * @return
     *     possible object is
     *     {@link CAPACITYPLUSUCLDLHTYPEFTLLISHTYPE }
     *     
     */
    public CAPACITYPLUSUCLDLHTYPEFTLLISHTYPE getCAPACITYPLUSUCLDLHTYPEFTLLISHTYPE() {
        return capacityplusucldlhtypeftllishtype;
    }

    /**
     * Sets the value of the capacityplusucldlhtypeftllishtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPACITYPLUSUCLDLHTYPEFTLLISHTYPE }
     *     
     */
    public void setCAPACITYPLUSUCLDLHTYPEFTLLISHTYPE(CAPACITYPLUSUCLDLHTYPEFTLLISHTYPE value) {
        this.capacityplusucldlhtypeftllishtype = value;
    }

    /**
     * Gets the value of the capacityplusucldlhtypeftllishid property.
     * 
     * @return
     *     possible object is
     *     {@link CAPACITYPLUSUCLDLHTYPEFTLLISHID }
     *     
     */
    public CAPACITYPLUSUCLDLHTYPEFTLLISHID getCAPACITYPLUSUCLDLHTYPEFTLLISHID() {
        return capacityplusucldlhtypeftllishid;
    }

    /**
     * Sets the value of the capacityplusucldlhtypeftllishid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPACITYPLUSUCLDLHTYPEFTLLISHID }
     *     
     */
    public void setCAPACITYPLUSUCLDLHTYPEFTLLISHID(CAPACITYPLUSUCLDLHTYPEFTLLISHID value) {
        this.capacityplusucldlhtypeftllishid = value;
    }

    /**
     * Gets the value of the capplusuclalphnumsrchen property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLALPHNUMSRCHEN }
     *     
     */
    public CAPPLUSUCLALPHNUMSRCHEN getCAPPLUSUCLALPHNUMSRCHEN() {
        return capplusuclalphnumsrchen;
    }

    /**
     * Sets the value of the capplusuclalphnumsrchen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLALPHNUMSRCHEN }
     *     
     */
    public void setCAPPLUSUCLALPHNUMSRCHEN(CAPPLUSUCLALPHNUMSRCHEN value) {
        this.capplusuclalphnumsrchen = value;
    }

    /**
     * Gets the value of the capplusuclreserved property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLRESERVED }
     *     
     */
    public CAPPLUSUCLRESERVED getCAPPLUSUCLRESERVED() {
        return capplusuclreserved;
    }

    /**
     * Sets the value of the capplusuclreserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLRESERVED }
     *     
     */
    public void setCAPPLUSUCLRESERVED(CAPPLUSUCLRESERVED value) {
        this.capplusuclreserved = value;
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
