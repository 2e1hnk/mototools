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
 *         &lt;element ref="{}CAPACITY_PLUS_UCL_DLL_TYPE_NTLLISHTYPE"/&gt;
 *         &lt;element ref="{}CAPACITY_PLUS_UCL_DLL_TYPE_NTLLISHID"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_LLEQ"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_CALLTYPE"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_UKPOTCFLG"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_CALLPRCDTNEN"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_ROUTETYPE"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_TXTMSGALTTNTP"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_CALLLSTID"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_CALLALIAS"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_RINGTYPE"/&gt;
 *         &lt;element ref="{}CAPPLUSUCL_CONNECTTYPE"/&gt;
 *         &lt;element ref="{}CAPPLUSUCLL_RESERVED"/&gt;
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
    "capacityplusucldlltypentllishtype",
    "capacityplusucldlltypentllishid",
    "capplusucllleq",
    "capplusuclcalltype",
    "capplusuclukpotcflg",
    "capplusuclcallprcdtnen",
    "capplusuclroutetype",
    "capplusucltxtmsgalttntp",
    "capplusuclcalllstid",
    "capplusuclcallalias",
    "capplusuclringtype",
    "capplusuclconnecttype",
    "capplusucllreserved"
})
@XmlRootElement(name = "CAPACITY_PLUS_UCL_DLL_TYPE")
public class CAPACITYPLUSUCLDLLTYPE {

    @XmlElement(name = "CAPACITY_PLUS_UCL_DLL_TYPE_NTLLISHTYPE", required = true)
    protected CAPACITYPLUSUCLDLLTYPENTLLISHTYPE capacityplusucldlltypentllishtype;
    @XmlElement(name = "CAPACITY_PLUS_UCL_DLL_TYPE_NTLLISHID", required = true)
    protected CAPACITYPLUSUCLDLLTYPENTLLISHID capacityplusucldlltypentllishid;
    @XmlElement(name = "CAPPLUSUCL_LLEQ", required = true)
    protected CAPPLUSUCLLLEQ capplusucllleq;
    @XmlElement(name = "CAPPLUSUCL_CALLTYPE", required = true)
    protected CAPPLUSUCLCALLTYPE capplusuclcalltype;
    @XmlElement(name = "CAPPLUSUCL_UKPOTCFLG", required = true)
    protected CAPPLUSUCLUKPOTCFLG capplusuclukpotcflg;
    @XmlElement(name = "CAPPLUSUCL_CALLPRCDTNEN", required = true)
    protected CAPPLUSUCLCALLPRCDTNEN capplusuclcallprcdtnen;
    @XmlElement(name = "CAPPLUSUCL_ROUTETYPE", required = true)
    protected CAPPLUSUCLROUTETYPE capplusuclroutetype;
    @XmlElement(name = "CAPPLUSUCL_TXTMSGALTTNTP", required = true)
    protected CAPPLUSUCLTXTMSGALTTNTP capplusucltxtmsgalttntp;
    @XmlElement(name = "CAPPLUSUCL_CALLLSTID", required = true)
    protected CAPPLUSUCLCALLLSTID capplusuclcalllstid;
    @XmlElement(name = "CAPPLUSUCL_CALLALIAS", required = true)
    protected CAPPLUSUCLCALLALIAS capplusuclcallalias;
    @XmlElement(name = "CAPPLUSUCL_RINGTYPE", required = true)
    protected CAPPLUSUCLRINGTYPE capplusuclringtype;
    @XmlElement(name = "CAPPLUSUCL_CONNECTTYPE", required = true)
    protected CAPPLUSUCLCONNECTTYPE capplusuclconnecttype;
    @XmlElement(name = "CAPPLUSUCLL_RESERVED", required = true)
    protected CAPPLUSUCLLRESERVED capplusucllreserved;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;
    @XmlAttribute(name = "ListLetID", required = true)
    protected BigInteger listLetID;

    /**
     * Gets the value of the capacityplusucldlltypentllishtype property.
     * 
     * @return
     *     possible object is
     *     {@link CAPACITYPLUSUCLDLLTYPENTLLISHTYPE }
     *     
     */
    public CAPACITYPLUSUCLDLLTYPENTLLISHTYPE getCAPACITYPLUSUCLDLLTYPENTLLISHTYPE() {
        return capacityplusucldlltypentllishtype;
    }

    /**
     * Sets the value of the capacityplusucldlltypentllishtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPACITYPLUSUCLDLLTYPENTLLISHTYPE }
     *     
     */
    public void setCAPACITYPLUSUCLDLLTYPENTLLISHTYPE(CAPACITYPLUSUCLDLLTYPENTLLISHTYPE value) {
        this.capacityplusucldlltypentllishtype = value;
    }

    /**
     * Gets the value of the capacityplusucldlltypentllishid property.
     * 
     * @return
     *     possible object is
     *     {@link CAPACITYPLUSUCLDLLTYPENTLLISHID }
     *     
     */
    public CAPACITYPLUSUCLDLLTYPENTLLISHID getCAPACITYPLUSUCLDLLTYPENTLLISHID() {
        return capacityplusucldlltypentllishid;
    }

    /**
     * Sets the value of the capacityplusucldlltypentllishid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPACITYPLUSUCLDLLTYPENTLLISHID }
     *     
     */
    public void setCAPACITYPLUSUCLDLLTYPENTLLISHID(CAPACITYPLUSUCLDLLTYPENTLLISHID value) {
        this.capacityplusucldlltypentllishid = value;
    }

    /**
     * Gets the value of the capplusucllleq property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLLLEQ }
     *     
     */
    public CAPPLUSUCLLLEQ getCAPPLUSUCLLLEQ() {
        return capplusucllleq;
    }

    /**
     * Sets the value of the capplusucllleq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLLLEQ }
     *     
     */
    public void setCAPPLUSUCLLLEQ(CAPPLUSUCLLLEQ value) {
        this.capplusucllleq = value;
    }

    /**
     * Gets the value of the capplusuclcalltype property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLCALLTYPE }
     *     
     */
    public CAPPLUSUCLCALLTYPE getCAPPLUSUCLCALLTYPE() {
        return capplusuclcalltype;
    }

    /**
     * Sets the value of the capplusuclcalltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLCALLTYPE }
     *     
     */
    public void setCAPPLUSUCLCALLTYPE(CAPPLUSUCLCALLTYPE value) {
        this.capplusuclcalltype = value;
    }

    /**
     * Gets the value of the capplusuclukpotcflg property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLUKPOTCFLG }
     *     
     */
    public CAPPLUSUCLUKPOTCFLG getCAPPLUSUCLUKPOTCFLG() {
        return capplusuclukpotcflg;
    }

    /**
     * Sets the value of the capplusuclukpotcflg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLUKPOTCFLG }
     *     
     */
    public void setCAPPLUSUCLUKPOTCFLG(CAPPLUSUCLUKPOTCFLG value) {
        this.capplusuclukpotcflg = value;
    }

    /**
     * Gets the value of the capplusuclcallprcdtnen property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLCALLPRCDTNEN }
     *     
     */
    public CAPPLUSUCLCALLPRCDTNEN getCAPPLUSUCLCALLPRCDTNEN() {
        return capplusuclcallprcdtnen;
    }

    /**
     * Sets the value of the capplusuclcallprcdtnen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLCALLPRCDTNEN }
     *     
     */
    public void setCAPPLUSUCLCALLPRCDTNEN(CAPPLUSUCLCALLPRCDTNEN value) {
        this.capplusuclcallprcdtnen = value;
    }

    /**
     * Gets the value of the capplusuclroutetype property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLROUTETYPE }
     *     
     */
    public CAPPLUSUCLROUTETYPE getCAPPLUSUCLROUTETYPE() {
        return capplusuclroutetype;
    }

    /**
     * Sets the value of the capplusuclroutetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLROUTETYPE }
     *     
     */
    public void setCAPPLUSUCLROUTETYPE(CAPPLUSUCLROUTETYPE value) {
        this.capplusuclroutetype = value;
    }

    /**
     * Gets the value of the capplusucltxtmsgalttntp property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLTXTMSGALTTNTP }
     *     
     */
    public CAPPLUSUCLTXTMSGALTTNTP getCAPPLUSUCLTXTMSGALTTNTP() {
        return capplusucltxtmsgalttntp;
    }

    /**
     * Sets the value of the capplusucltxtmsgalttntp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLTXTMSGALTTNTP }
     *     
     */
    public void setCAPPLUSUCLTXTMSGALTTNTP(CAPPLUSUCLTXTMSGALTTNTP value) {
        this.capplusucltxtmsgalttntp = value;
    }

    /**
     * Gets the value of the capplusuclcalllstid property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLCALLLSTID }
     *     
     */
    public CAPPLUSUCLCALLLSTID getCAPPLUSUCLCALLLSTID() {
        return capplusuclcalllstid;
    }

    /**
     * Sets the value of the capplusuclcalllstid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLCALLLSTID }
     *     
     */
    public void setCAPPLUSUCLCALLLSTID(CAPPLUSUCLCALLLSTID value) {
        this.capplusuclcalllstid = value;
    }

    /**
     * Gets the value of the capplusuclcallalias property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLCALLALIAS }
     *     
     */
    public CAPPLUSUCLCALLALIAS getCAPPLUSUCLCALLALIAS() {
        return capplusuclcallalias;
    }

    /**
     * Sets the value of the capplusuclcallalias property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLCALLALIAS }
     *     
     */
    public void setCAPPLUSUCLCALLALIAS(CAPPLUSUCLCALLALIAS value) {
        this.capplusuclcallalias = value;
    }

    /**
     * Gets the value of the capplusuclringtype property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLRINGTYPE }
     *     
     */
    public CAPPLUSUCLRINGTYPE getCAPPLUSUCLRINGTYPE() {
        return capplusuclringtype;
    }

    /**
     * Sets the value of the capplusuclringtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLRINGTYPE }
     *     
     */
    public void setCAPPLUSUCLRINGTYPE(CAPPLUSUCLRINGTYPE value) {
        this.capplusuclringtype = value;
    }

    /**
     * Gets the value of the capplusuclconnecttype property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLCONNECTTYPE }
     *     
     */
    public CAPPLUSUCLCONNECTTYPE getCAPPLUSUCLCONNECTTYPE() {
        return capplusuclconnecttype;
    }

    /**
     * Sets the value of the capplusuclconnecttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLCONNECTTYPE }
     *     
     */
    public void setCAPPLUSUCLCONNECTTYPE(CAPPLUSUCLCONNECTTYPE value) {
        this.capplusuclconnecttype = value;
    }

    /**
     * Gets the value of the capplusucllreserved property.
     * 
     * @return
     *     possible object is
     *     {@link CAPPLUSUCLLRESERVED }
     *     
     */
    public CAPPLUSUCLLRESERVED getCAPPLUSUCLLRESERVED() {
        return capplusucllreserved;
    }

    /**
     * Sets the value of the capplusucllreserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPPLUSUCLLRESERVED }
     *     
     */
    public void setCAPPLUSUCLLRESERVED(CAPPLUSUCLLRESERVED value) {
        this.capplusucllreserved = value;
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
