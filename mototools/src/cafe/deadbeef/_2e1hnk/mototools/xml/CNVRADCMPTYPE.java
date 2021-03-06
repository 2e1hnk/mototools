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
 *         &lt;element ref="{}CR_MONTYPE"/>
 *         &lt;element ref="{}CR_TXINTIME"/>
 *         &lt;element ref="{}CR_LIGHTSEN"/>
 *         &lt;element ref="{}CR_RESERVED"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Applicable" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ListID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "crmontype",
    "crtxintime",
    "crlightsen",
    "crreserved"
})
@XmlRootElement(name = "CNV_RAD_CMP_TYPE")
public class CNVRADCMPTYPE {

    @XmlElement(name = "CR_MONTYPE", required = true)
    protected CRMONTYPE crmontype;
    @XmlElement(name = "CR_TXINTIME", required = true)
    protected CRTXINTIME crtxintime;
    @XmlElement(name = "CR_LIGHTSEN", required = true)
    protected CRLIGHTSEN crlightsen;
    @XmlElement(name = "CR_RESERVED", required = true)
    protected CRRESERVED crreserved;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the crmontype property.
     * 
     * @return
     *     possible object is
     *     {@link CRMONTYPE }
     *     
     */
    public CRMONTYPE getCRMONTYPE() {
        return crmontype;
    }

    /**
     * Sets the value of the crmontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMONTYPE }
     *     
     */
    public void setCRMONTYPE(CRMONTYPE value) {
        this.crmontype = value;
    }

    /**
     * Gets the value of the crtxintime property.
     * 
     * @return
     *     possible object is
     *     {@link CRTXINTIME }
     *     
     */
    public CRTXINTIME getCRTXINTIME() {
        return crtxintime;
    }

    /**
     * Sets the value of the crtxintime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRTXINTIME }
     *     
     */
    public void setCRTXINTIME(CRTXINTIME value) {
        this.crtxintime = value;
    }

    /**
     * Gets the value of the crlightsen property.
     * 
     * @return
     *     possible object is
     *     {@link CRLIGHTSEN }
     *     
     */
    public CRLIGHTSEN getCRLIGHTSEN() {
        return crlightsen;
    }

    /**
     * Sets the value of the crlightsen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRLIGHTSEN }
     *     
     */
    public void setCRLIGHTSEN(CRLIGHTSEN value) {
        this.crlightsen = value;
    }

    /**
     * Gets the value of the crreserved property.
     * 
     * @return
     *     possible object is
     *     {@link CRRESERVED }
     *     
     */
    public CRRESERVED getCRRESERVED() {
        return crreserved;
    }

    /**
     * Sets the value of the crreserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRRESERVED }
     *     
     */
    public void setCRRESERVED(CRRESERVED value) {
        this.crreserved = value;
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
