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
 *         &lt;element ref="{}JTSO_STSOPTFLDNAME"/>
 *         &lt;element ref="{}JTSO_ACTRSPTXT"/>
 *         &lt;element ref="{}JTSO_ACTSTSNUM"/>
 *         &lt;element ref="{}JTSO_LASTSTATE"/>
 *         &lt;element ref="{}JTSO_RESERVED"/>
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
    "jtsostsoptfldname",
    "jtsoactrsptxt",
    "jtsoactstsnum",
    "jtsolaststate",
    "jtsoreserved"
})
@XmlRootElement(name = "JOBTICKET_STATUS_CMP_TYPE")
public class JOBTICKETSTATUSCMPTYPE {

    @XmlElement(name = "JTSO_STSOPTFLDNAME", required = true)
    protected JTSOSTSOPTFLDNAME jtsostsoptfldname;
    @XmlElement(name = "JTSO_ACTRSPTXT", required = true)
    protected JTSOACTRSPTXT jtsoactrsptxt;
    @XmlElement(name = "JTSO_ACTSTSNUM", required = true)
    protected JTSOACTSTSNUM jtsoactstsnum;
    @XmlElement(name = "JTSO_LASTSTATE", required = true)
    protected JTSOLASTSTATE jtsolaststate;
    @XmlElement(name = "JTSO_RESERVED", required = true)
    protected JTSORESERVED jtsoreserved;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the jtsostsoptfldname property.
     * 
     * @return
     *     possible object is
     *     {@link JTSOSTSOPTFLDNAME }
     *     
     */
    public JTSOSTSOPTFLDNAME getJTSOSTSOPTFLDNAME() {
        return jtsostsoptfldname;
    }

    /**
     * Sets the value of the jtsostsoptfldname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JTSOSTSOPTFLDNAME }
     *     
     */
    public void setJTSOSTSOPTFLDNAME(JTSOSTSOPTFLDNAME value) {
        this.jtsostsoptfldname = value;
    }

    /**
     * Gets the value of the jtsoactrsptxt property.
     * 
     * @return
     *     possible object is
     *     {@link JTSOACTRSPTXT }
     *     
     */
    public JTSOACTRSPTXT getJTSOACTRSPTXT() {
        return jtsoactrsptxt;
    }

    /**
     * Sets the value of the jtsoactrsptxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JTSOACTRSPTXT }
     *     
     */
    public void setJTSOACTRSPTXT(JTSOACTRSPTXT value) {
        this.jtsoactrsptxt = value;
    }

    /**
     * Gets the value of the jtsoactstsnum property.
     * 
     * @return
     *     possible object is
     *     {@link JTSOACTSTSNUM }
     *     
     */
    public JTSOACTSTSNUM getJTSOACTSTSNUM() {
        return jtsoactstsnum;
    }

    /**
     * Sets the value of the jtsoactstsnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JTSOACTSTSNUM }
     *     
     */
    public void setJTSOACTSTSNUM(JTSOACTSTSNUM value) {
        this.jtsoactstsnum = value;
    }

    /**
     * Gets the value of the jtsolaststate property.
     * 
     * @return
     *     possible object is
     *     {@link JTSOLASTSTATE }
     *     
     */
    public JTSOLASTSTATE getJTSOLASTSTATE() {
        return jtsolaststate;
    }

    /**
     * Sets the value of the jtsolaststate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JTSOLASTSTATE }
     *     
     */
    public void setJTSOLASTSTATE(JTSOLASTSTATE value) {
        this.jtsolaststate = value;
    }

    /**
     * Gets the value of the jtsoreserved property.
     * 
     * @return
     *     possible object is
     *     {@link JTSORESERVED }
     *     
     */
    public JTSORESERVED getJTSORESERVED() {
        return jtsoreserved;
    }

    /**
     * Sets the value of the jtsoreserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link JTSORESERVED }
     *     
     */
    public void setJTSORESERVED(JTSORESERVED value) {
        this.jtsoreserved = value;
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
