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
 *         &lt;element ref="{}QCII_UCL_DLL_TYPE_NTLLISHTYPE"/&gt;
 *         &lt;element ref="{}QCII_UCL_DLL_TYPE_NTLLISHID"/&gt;
 *         &lt;element ref="{}QU_LLEQ"/&gt;
 *         &lt;element ref="{}QU_STRIPPLDPL"/&gt;
 *         &lt;element ref="{}QU_CALLFORMAT"/&gt;
 *         &lt;element ref="{}QU_RVRTPERS"/&gt;
 *         &lt;element ref="{}QU_RVRTPERSTYPE"/&gt;
 *         &lt;element ref="{}QU_RVRTPERSID"/&gt;
 *         &lt;element ref="{}QU_TONEATXFRE"/&gt;
 *         &lt;element ref="{}QU_CODEA"/&gt;
 *         &lt;element ref="{}QU_TONEBTXFRE"/&gt;
 *         &lt;element ref="{}QU_CODEB"/&gt;
 *         &lt;element ref="{}QU_CALLENTRYALIAS"/&gt;
 *         &lt;element ref="{}QU_QCIISYS"/&gt;
 *         &lt;element ref="{}QU_QCIISYSTYPE"/&gt;
 *         &lt;element ref="{}QU_QCIISYSID"/&gt;
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
    "qciiucldlltypentllishtype",
    "qciiucldlltypentllishid",
    "qulleq",
    "qustrippldpl",
    "qucallformat",
    "qurvrtpers",
    "qurvrtperstype",
    "qurvrtpersid",
    "qutoneatxfre",
    "qucodea",
    "qutonebtxfre",
    "qucodeb",
    "qucallentryalias",
    "quqciisys",
    "quqciisystype",
    "quqciisysid"
})
@XmlRootElement(name = "QCII_UCL_DLL_TYPE")
public class QCIIUCLDLLTYPE {

    @XmlElement(name = "QCII_UCL_DLL_TYPE_NTLLISHTYPE", required = true)
    protected QCIIUCLDLLTYPENTLLISHTYPE qciiucldlltypentllishtype;
    @XmlElement(name = "QCII_UCL_DLL_TYPE_NTLLISHID", required = true)
    protected QCIIUCLDLLTYPENTLLISHID qciiucldlltypentllishid;
    @XmlElement(name = "QU_LLEQ", required = true)
    protected QULLEQ qulleq;
    @XmlElement(name = "QU_STRIPPLDPL", required = true)
    protected QUSTRIPPLDPL qustrippldpl;
    @XmlElement(name = "QU_CALLFORMAT", required = true)
    protected QUCALLFORMAT qucallformat;
    @XmlElement(name = "QU_RVRTPERS", required = true)
    protected QURVRTPERS qurvrtpers;
    @XmlElement(name = "QU_RVRTPERSTYPE", required = true)
    protected QURVRTPERSTYPE qurvrtperstype;
    @XmlElement(name = "QU_RVRTPERSID", required = true)
    protected QURVRTPERSID qurvrtpersid;
    @XmlElement(name = "QU_TONEATXFRE", required = true)
    protected QUTONEATXFRE qutoneatxfre;
    @XmlElement(name = "QU_CODEA", required = true)
    protected QUCODEA qucodea;
    @XmlElement(name = "QU_TONEBTXFRE", required = true)
    protected QUTONEBTXFRE qutonebtxfre;
    @XmlElement(name = "QU_CODEB", required = true)
    protected QUCODEB qucodeb;
    @XmlElement(name = "QU_CALLENTRYALIAS", required = true)
    protected QUCALLENTRYALIAS qucallentryalias;
    @XmlElement(name = "QU_QCIISYS", required = true)
    protected QUQCIISYS quqciisys;
    @XmlElement(name = "QU_QCIISYSTYPE", required = true)
    protected QUQCIISYSTYPE quqciisystype;
    @XmlElement(name = "QU_QCIISYSID", required = true)
    protected QUQCIISYSID quqciisysid;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;
    @XmlAttribute(name = "ListLetID", required = true)
    protected BigInteger listLetID;

    /**
     * Gets the value of the qciiucldlltypentllishtype property.
     * 
     * @return
     *     possible object is
     *     {@link QCIIUCLDLLTYPENTLLISHTYPE }
     *     
     */
    public QCIIUCLDLLTYPENTLLISHTYPE getQCIIUCLDLLTYPENTLLISHTYPE() {
        return qciiucldlltypentllishtype;
    }

    /**
     * Sets the value of the qciiucldlltypentllishtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link QCIIUCLDLLTYPENTLLISHTYPE }
     *     
     */
    public void setQCIIUCLDLLTYPENTLLISHTYPE(QCIIUCLDLLTYPENTLLISHTYPE value) {
        this.qciiucldlltypentllishtype = value;
    }

    /**
     * Gets the value of the qciiucldlltypentllishid property.
     * 
     * @return
     *     possible object is
     *     {@link QCIIUCLDLLTYPENTLLISHID }
     *     
     */
    public QCIIUCLDLLTYPENTLLISHID getQCIIUCLDLLTYPENTLLISHID() {
        return qciiucldlltypentllishid;
    }

    /**
     * Sets the value of the qciiucldlltypentllishid property.
     * 
     * @param value
     *     allowed object is
     *     {@link QCIIUCLDLLTYPENTLLISHID }
     *     
     */
    public void setQCIIUCLDLLTYPENTLLISHID(QCIIUCLDLLTYPENTLLISHID value) {
        this.qciiucldlltypentllishid = value;
    }

    /**
     * Gets the value of the qulleq property.
     * 
     * @return
     *     possible object is
     *     {@link QULLEQ }
     *     
     */
    public QULLEQ getQULLEQ() {
        return qulleq;
    }

    /**
     * Sets the value of the qulleq property.
     * 
     * @param value
     *     allowed object is
     *     {@link QULLEQ }
     *     
     */
    public void setQULLEQ(QULLEQ value) {
        this.qulleq = value;
    }

    /**
     * Gets the value of the qustrippldpl property.
     * 
     * @return
     *     possible object is
     *     {@link QUSTRIPPLDPL }
     *     
     */
    public QUSTRIPPLDPL getQUSTRIPPLDPL() {
        return qustrippldpl;
    }

    /**
     * Sets the value of the qustrippldpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUSTRIPPLDPL }
     *     
     */
    public void setQUSTRIPPLDPL(QUSTRIPPLDPL value) {
        this.qustrippldpl = value;
    }

    /**
     * Gets the value of the qucallformat property.
     * 
     * @return
     *     possible object is
     *     {@link QUCALLFORMAT }
     *     
     */
    public QUCALLFORMAT getQUCALLFORMAT() {
        return qucallformat;
    }

    /**
     * Sets the value of the qucallformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUCALLFORMAT }
     *     
     */
    public void setQUCALLFORMAT(QUCALLFORMAT value) {
        this.qucallformat = value;
    }

    /**
     * Gets the value of the qurvrtpers property.
     * 
     * @return
     *     possible object is
     *     {@link QURVRTPERS }
     *     
     */
    public QURVRTPERS getQURVRTPERS() {
        return qurvrtpers;
    }

    /**
     * Sets the value of the qurvrtpers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QURVRTPERS }
     *     
     */
    public void setQURVRTPERS(QURVRTPERS value) {
        this.qurvrtpers = value;
    }

    /**
     * Gets the value of the qurvrtperstype property.
     * 
     * @return
     *     possible object is
     *     {@link QURVRTPERSTYPE }
     *     
     */
    public QURVRTPERSTYPE getQURVRTPERSTYPE() {
        return qurvrtperstype;
    }

    /**
     * Sets the value of the qurvrtperstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link QURVRTPERSTYPE }
     *     
     */
    public void setQURVRTPERSTYPE(QURVRTPERSTYPE value) {
        this.qurvrtperstype = value;
    }

    /**
     * Gets the value of the qurvrtpersid property.
     * 
     * @return
     *     possible object is
     *     {@link QURVRTPERSID }
     *     
     */
    public QURVRTPERSID getQURVRTPERSID() {
        return qurvrtpersid;
    }

    /**
     * Sets the value of the qurvrtpersid property.
     * 
     * @param value
     *     allowed object is
     *     {@link QURVRTPERSID }
     *     
     */
    public void setQURVRTPERSID(QURVRTPERSID value) {
        this.qurvrtpersid = value;
    }

    /**
     * Gets the value of the qutoneatxfre property.
     * 
     * @return
     *     possible object is
     *     {@link QUTONEATXFRE }
     *     
     */
    public QUTONEATXFRE getQUTONEATXFRE() {
        return qutoneatxfre;
    }

    /**
     * Sets the value of the qutoneatxfre property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUTONEATXFRE }
     *     
     */
    public void setQUTONEATXFRE(QUTONEATXFRE value) {
        this.qutoneatxfre = value;
    }

    /**
     * Gets the value of the qucodea property.
     * 
     * @return
     *     possible object is
     *     {@link QUCODEA }
     *     
     */
    public QUCODEA getQUCODEA() {
        return qucodea;
    }

    /**
     * Sets the value of the qucodea property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUCODEA }
     *     
     */
    public void setQUCODEA(QUCODEA value) {
        this.qucodea = value;
    }

    /**
     * Gets the value of the qutonebtxfre property.
     * 
     * @return
     *     possible object is
     *     {@link QUTONEBTXFRE }
     *     
     */
    public QUTONEBTXFRE getQUTONEBTXFRE() {
        return qutonebtxfre;
    }

    /**
     * Sets the value of the qutonebtxfre property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUTONEBTXFRE }
     *     
     */
    public void setQUTONEBTXFRE(QUTONEBTXFRE value) {
        this.qutonebtxfre = value;
    }

    /**
     * Gets the value of the qucodeb property.
     * 
     * @return
     *     possible object is
     *     {@link QUCODEB }
     *     
     */
    public QUCODEB getQUCODEB() {
        return qucodeb;
    }

    /**
     * Sets the value of the qucodeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUCODEB }
     *     
     */
    public void setQUCODEB(QUCODEB value) {
        this.qucodeb = value;
    }

    /**
     * Gets the value of the qucallentryalias property.
     * 
     * @return
     *     possible object is
     *     {@link QUCALLENTRYALIAS }
     *     
     */
    public QUCALLENTRYALIAS getQUCALLENTRYALIAS() {
        return qucallentryalias;
    }

    /**
     * Sets the value of the qucallentryalias property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUCALLENTRYALIAS }
     *     
     */
    public void setQUCALLENTRYALIAS(QUCALLENTRYALIAS value) {
        this.qucallentryalias = value;
    }

    /**
     * Gets the value of the quqciisys property.
     * 
     * @return
     *     possible object is
     *     {@link QUQCIISYS }
     *     
     */
    public QUQCIISYS getQUQCIISYS() {
        return quqciisys;
    }

    /**
     * Sets the value of the quqciisys property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUQCIISYS }
     *     
     */
    public void setQUQCIISYS(QUQCIISYS value) {
        this.quqciisys = value;
    }

    /**
     * Gets the value of the quqciisystype property.
     * 
     * @return
     *     possible object is
     *     {@link QUQCIISYSTYPE }
     *     
     */
    public QUQCIISYSTYPE getQUQCIISYSTYPE() {
        return quqciisystype;
    }

    /**
     * Sets the value of the quqciisystype property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUQCIISYSTYPE }
     *     
     */
    public void setQUQCIISYSTYPE(QUQCIISYSTYPE value) {
        this.quqciisystype = value;
    }

    /**
     * Gets the value of the quqciisysid property.
     * 
     * @return
     *     possible object is
     *     {@link QUQCIISYSID }
     *     
     */
    public QUQCIISYSID getQUQCIISYSID() {
        return quqciisysid;
    }

    /**
     * Sets the value of the quqciisysid property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUQCIISYSID }
     *     
     */
    public void setQUQCIISYSID(QUQCIISYSID value) {
        this.quqciisysid = value;
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
