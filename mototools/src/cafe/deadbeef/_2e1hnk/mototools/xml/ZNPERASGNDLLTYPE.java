//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.30 at 11:46:48 AM GMT 
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
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ZN_PER_ASGN_DLL_TYPE_NTLLISHTYPE"/>
 *         &lt;element ref="{}ZN_PER_ASGN_DLL_TYPE_NTLLISHID"/>
 *         &lt;element ref="{}ZP_LLEQ"/>
 *         &lt;element ref="{}ZP_PERSIT"/>
 *         &lt;element ref="{}ZP_PERSITTYPE"/>
 *         &lt;element ref="{}ZP_PERSITID"/>
 *         &lt;element ref="{}ZPL_RESERVED"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Applicable" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ListID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ListLetID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "znperasgndlltypentllishtype",
    "znperasgndlltypentllishid",
    "zplleq",
    "zppersit",
    "zppersittype",
    "zppersitid",
    "zplreserved"
})
@XmlRootElement(name = "ZN_PER_ASGN_DLL_TYPE")
public class ZNPERASGNDLLTYPE {

    @XmlElement(name = "ZN_PER_ASGN_DLL_TYPE_NTLLISHTYPE", required = true)
    protected ZNPERASGNDLLTYPENTLLISHTYPE znperasgndlltypentllishtype;
    @XmlElement(name = "ZN_PER_ASGN_DLL_TYPE_NTLLISHID", required = true)
    protected ZNPERASGNDLLTYPENTLLISHID znperasgndlltypentllishid;
    @XmlElement(name = "ZP_LLEQ", required = true)
    protected ZPLLEQ zplleq;
    @XmlElement(name = "ZP_PERSIT", required = true)
    protected ZPPERSIT zppersit;
    @XmlElement(name = "ZP_PERSITTYPE", required = true)
    protected ZPPERSITTYPE zppersittype;
    @XmlElement(name = "ZP_PERSITID", required = true)
    protected ZPPERSITID zppersitid;
    @XmlElement(name = "ZPL_RESERVED", required = true)
    protected ZPLRESERVED zplreserved;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;
    @XmlAttribute(name = "ListLetID", required = true)
    protected BigInteger listLetID;

    /**
     * Gets the value of the znperasgndlltypentllishtype property.
     * 
     * @return
     *     possible object is
     *     {@link ZNPERASGNDLLTYPENTLLISHTYPE }
     *     
     */
    public ZNPERASGNDLLTYPENTLLISHTYPE getZNPERASGNDLLTYPENTLLISHTYPE() {
        return znperasgndlltypentllishtype;
    }

    /**
     * Sets the value of the znperasgndlltypentllishtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZNPERASGNDLLTYPENTLLISHTYPE }
     *     
     */
    public void setZNPERASGNDLLTYPENTLLISHTYPE(ZNPERASGNDLLTYPENTLLISHTYPE value) {
        this.znperasgndlltypentllishtype = value;
    }

    /**
     * Gets the value of the znperasgndlltypentllishid property.
     * 
     * @return
     *     possible object is
     *     {@link ZNPERASGNDLLTYPENTLLISHID }
     *     
     */
    public ZNPERASGNDLLTYPENTLLISHID getZNPERASGNDLLTYPENTLLISHID() {
        return znperasgndlltypentllishid;
    }

    /**
     * Sets the value of the znperasgndlltypentllishid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZNPERASGNDLLTYPENTLLISHID }
     *     
     */
    public void setZNPERASGNDLLTYPENTLLISHID(ZNPERASGNDLLTYPENTLLISHID value) {
        this.znperasgndlltypentllishid = value;
    }

    /**
     * Gets the value of the zplleq property.
     * 
     * @return
     *     possible object is
     *     {@link ZPLLEQ }
     *     
     */
    public ZPLLEQ getZPLLEQ() {
        return zplleq;
    }

    /**
     * Sets the value of the zplleq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZPLLEQ }
     *     
     */
    public void setZPLLEQ(ZPLLEQ value) {
        this.zplleq = value;
    }

    /**
     * Gets the value of the zppersit property.
     * 
     * @return
     *     possible object is
     *     {@link ZPPERSIT }
     *     
     */
    public ZPPERSIT getZPPERSIT() {
        return zppersit;
    }

    /**
     * Sets the value of the zppersit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZPPERSIT }
     *     
     */
    public void setZPPERSIT(ZPPERSIT value) {
        this.zppersit = value;
    }

    /**
     * Gets the value of the zppersittype property.
     * 
     * @return
     *     possible object is
     *     {@link ZPPERSITTYPE }
     *     
     */
    public ZPPERSITTYPE getZPPERSITTYPE() {
        return zppersittype;
    }

    /**
     * Sets the value of the zppersittype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZPPERSITTYPE }
     *     
     */
    public void setZPPERSITTYPE(ZPPERSITTYPE value) {
        this.zppersittype = value;
    }

    /**
     * Gets the value of the zppersitid property.
     * 
     * @return
     *     possible object is
     *     {@link ZPPERSITID }
     *     
     */
    public ZPPERSITID getZPPERSITID() {
        return zppersitid;
    }

    /**
     * Sets the value of the zppersitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZPPERSITID }
     *     
     */
    public void setZPPERSITID(ZPPERSITID value) {
        this.zppersitid = value;
    }

    /**
     * Gets the value of the zplreserved property.
     * 
     * @return
     *     possible object is
     *     {@link ZPLRESERVED }
     *     
     */
    public ZPLRESERVED getZPLRESERVED() {
        return zplreserved;
    }

    /**
     * Sets the value of the zplreserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZPLRESERVED }
     *     
     */
    public void setZPLRESERVED(ZPLRESERVED value) {
        this.zplreserved = value;
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
