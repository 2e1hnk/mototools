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
 *         &lt;element ref="{}RI_LPGYEAR"/&gt;
 *         &lt;element ref="{}RI_LPGMONTH"/&gt;
 *         &lt;element ref="{}RI_LPGDAY"/&gt;
 *         &lt;element ref="{}RI_LPGHOUR"/&gt;
 *         &lt;element ref="{}RI_LPGMINUTES"/&gt;
 *         &lt;element ref="{}RI_LPGDATE"/&gt;
 *         &lt;element ref="{}RI_LPGSOURCE"/&gt;
 *         &lt;element ref="{}RI_MAJAPPVERS"/&gt;
 *         &lt;element ref="{}RI_MIDAPPVERS"/&gt;
 *         &lt;element ref="{}RI_MINAPPVERS"/&gt;
 *         &lt;element ref="{}RI_APPVERS"/&gt;
 *         &lt;element ref="{}RI_NUMRADIORST"/&gt;
 *         &lt;element ref="{}RI_RESERVED2"/&gt;
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
    "rilpgyear",
    "rilpgmonth",
    "rilpgday",
    "rilpghour",
    "rilpgminutes",
    "rilpgdate",
    "rilpgsource",
    "rimajappvers",
    "rimidappvers",
    "riminappvers",
    "riappvers",
    "rinumradiorst",
    "rireserved2"
})
@XmlRootElement(name = "RAD_APP_INFO_CMP_TYPE")
public class RADAPPINFOCMPTYPE {

    @XmlElement(name = "RI_LPGYEAR", required = true)
    protected RILPGYEAR rilpgyear;
    @XmlElement(name = "RI_LPGMONTH", required = true)
    protected RILPGMONTH rilpgmonth;
    @XmlElement(name = "RI_LPGDAY", required = true)
    protected RILPGDAY rilpgday;
    @XmlElement(name = "RI_LPGHOUR", required = true)
    protected RILPGHOUR rilpghour;
    @XmlElement(name = "RI_LPGMINUTES", required = true)
    protected RILPGMINUTES rilpgminutes;
    @XmlElement(name = "RI_LPGDATE", required = true)
    protected RILPGDATE rilpgdate;
    @XmlElement(name = "RI_LPGSOURCE", required = true)
    protected RILPGSOURCE rilpgsource;
    @XmlElement(name = "RI_MAJAPPVERS", required = true)
    protected RIMAJAPPVERS rimajappvers;
    @XmlElement(name = "RI_MIDAPPVERS", required = true)
    protected RIMIDAPPVERS rimidappvers;
    @XmlElement(name = "RI_MINAPPVERS", required = true)
    protected RIMINAPPVERS riminappvers;
    @XmlElement(name = "RI_APPVERS", required = true)
    protected RIAPPVERS riappvers;
    @XmlElement(name = "RI_NUMRADIORST", required = true)
    protected RINUMRADIORST rinumradiorst;
    @XmlElement(name = "RI_RESERVED2", required = true)
    protected RIRESERVED2 rireserved2;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the rilpgyear property.
     * 
     * @return
     *     possible object is
     *     {@link RILPGYEAR }
     *     
     */
    public RILPGYEAR getRILPGYEAR() {
        return rilpgyear;
    }

    /**
     * Sets the value of the rilpgyear property.
     * 
     * @param value
     *     allowed object is
     *     {@link RILPGYEAR }
     *     
     */
    public void setRILPGYEAR(RILPGYEAR value) {
        this.rilpgyear = value;
    }

    /**
     * Gets the value of the rilpgmonth property.
     * 
     * @return
     *     possible object is
     *     {@link RILPGMONTH }
     *     
     */
    public RILPGMONTH getRILPGMONTH() {
        return rilpgmonth;
    }

    /**
     * Sets the value of the rilpgmonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link RILPGMONTH }
     *     
     */
    public void setRILPGMONTH(RILPGMONTH value) {
        this.rilpgmonth = value;
    }

    /**
     * Gets the value of the rilpgday property.
     * 
     * @return
     *     possible object is
     *     {@link RILPGDAY }
     *     
     */
    public RILPGDAY getRILPGDAY() {
        return rilpgday;
    }

    /**
     * Sets the value of the rilpgday property.
     * 
     * @param value
     *     allowed object is
     *     {@link RILPGDAY }
     *     
     */
    public void setRILPGDAY(RILPGDAY value) {
        this.rilpgday = value;
    }

    /**
     * Gets the value of the rilpghour property.
     * 
     * @return
     *     possible object is
     *     {@link RILPGHOUR }
     *     
     */
    public RILPGHOUR getRILPGHOUR() {
        return rilpghour;
    }

    /**
     * Sets the value of the rilpghour property.
     * 
     * @param value
     *     allowed object is
     *     {@link RILPGHOUR }
     *     
     */
    public void setRILPGHOUR(RILPGHOUR value) {
        this.rilpghour = value;
    }

    /**
     * Gets the value of the rilpgminutes property.
     * 
     * @return
     *     possible object is
     *     {@link RILPGMINUTES }
     *     
     */
    public RILPGMINUTES getRILPGMINUTES() {
        return rilpgminutes;
    }

    /**
     * Sets the value of the rilpgminutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RILPGMINUTES }
     *     
     */
    public void setRILPGMINUTES(RILPGMINUTES value) {
        this.rilpgminutes = value;
    }

    /**
     * Gets the value of the rilpgdate property.
     * 
     * @return
     *     possible object is
     *     {@link RILPGDATE }
     *     
     */
    public RILPGDATE getRILPGDATE() {
        return rilpgdate;
    }

    /**
     * Sets the value of the rilpgdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RILPGDATE }
     *     
     */
    public void setRILPGDATE(RILPGDATE value) {
        this.rilpgdate = value;
    }

    /**
     * Gets the value of the rilpgsource property.
     * 
     * @return
     *     possible object is
     *     {@link RILPGSOURCE }
     *     
     */
    public RILPGSOURCE getRILPGSOURCE() {
        return rilpgsource;
    }

    /**
     * Sets the value of the rilpgsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RILPGSOURCE }
     *     
     */
    public void setRILPGSOURCE(RILPGSOURCE value) {
        this.rilpgsource = value;
    }

    /**
     * Gets the value of the rimajappvers property.
     * 
     * @return
     *     possible object is
     *     {@link RIMAJAPPVERS }
     *     
     */
    public RIMAJAPPVERS getRIMAJAPPVERS() {
        return rimajappvers;
    }

    /**
     * Sets the value of the rimajappvers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RIMAJAPPVERS }
     *     
     */
    public void setRIMAJAPPVERS(RIMAJAPPVERS value) {
        this.rimajappvers = value;
    }

    /**
     * Gets the value of the rimidappvers property.
     * 
     * @return
     *     possible object is
     *     {@link RIMIDAPPVERS }
     *     
     */
    public RIMIDAPPVERS getRIMIDAPPVERS() {
        return rimidappvers;
    }

    /**
     * Sets the value of the rimidappvers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RIMIDAPPVERS }
     *     
     */
    public void setRIMIDAPPVERS(RIMIDAPPVERS value) {
        this.rimidappvers = value;
    }

    /**
     * Gets the value of the riminappvers property.
     * 
     * @return
     *     possible object is
     *     {@link RIMINAPPVERS }
     *     
     */
    public RIMINAPPVERS getRIMINAPPVERS() {
        return riminappvers;
    }

    /**
     * Sets the value of the riminappvers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RIMINAPPVERS }
     *     
     */
    public void setRIMINAPPVERS(RIMINAPPVERS value) {
        this.riminappvers = value;
    }

    /**
     * Gets the value of the riappvers property.
     * 
     * @return
     *     possible object is
     *     {@link RIAPPVERS }
     *     
     */
    public RIAPPVERS getRIAPPVERS() {
        return riappvers;
    }

    /**
     * Sets the value of the riappvers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RIAPPVERS }
     *     
     */
    public void setRIAPPVERS(RIAPPVERS value) {
        this.riappvers = value;
    }

    /**
     * Gets the value of the rinumradiorst property.
     * 
     * @return
     *     possible object is
     *     {@link RINUMRADIORST }
     *     
     */
    public RINUMRADIORST getRINUMRADIORST() {
        return rinumradiorst;
    }

    /**
     * Sets the value of the rinumradiorst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RINUMRADIORST }
     *     
     */
    public void setRINUMRADIORST(RINUMRADIORST value) {
        this.rinumradiorst = value;
    }

    /**
     * Gets the value of the rireserved2 property.
     * 
     * @return
     *     possible object is
     *     {@link RIRESERVED2 }
     *     
     */
    public RIRESERVED2 getRIRESERVED2() {
        return rireserved2;
    }

    /**
     * Sets the value of the rireserved2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RIRESERVED2 }
     *     
     */
    public void setRIRESERVED2(RIRESERVED2 value) {
        this.rireserved2 = value;
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
