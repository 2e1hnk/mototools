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
 *         &lt;element ref="{}SP_SCLSTTYPE"/&gt;
 *         &lt;element ref="{}SP_LSTCTG"/&gt;
 *         &lt;element ref="{}SP_LEDSZ"/&gt;
 *         &lt;element ref="{}SP_LEQMAX"/&gt;
 *         &lt;element ref="{}SP_LLEQMAX"/&gt;
 *         &lt;element ref="{}SCAN_PER_DLH_TYPE_FTLLISHTYPE"/&gt;
 *         &lt;element ref="{}SCAN_PER_DLH_TYPE_FTLLISHID"/&gt;
 *         &lt;element ref="{}SP_VTSCPRETMDL"/&gt;
 *         &lt;element ref="{}SP_PR1MEM"/&gt;
 *         &lt;element ref="{}SP_PR1MEMTYPE"/&gt;
 *         &lt;element ref="{}SP_PR1MEMID"/&gt;
 *         &lt;element ref="{}SP_PR2MEM"/&gt;
 *         &lt;element ref="{}SP_PR2MEMTYPE"/&gt;
 *         &lt;element ref="{}SP_PR2MEMID"/&gt;
 *         &lt;element ref="{}SP_DSGTXMEM"/&gt;
 *         &lt;element ref="{}SP_DSGTXMEMTYPE"/&gt;
 *         &lt;element ref="{}SP_DSGTXMEMID"/&gt;
 *         &lt;element ref="{}SCAN_RAD_TBPRIOSAMP"/&gt;
 *         &lt;element ref="{}SP_SCANLISTALIAS"/&gt;
 *         &lt;element ref="{}SP_DISPVTCHRCV"/&gt;
 *         &lt;element ref="{}SP_ERLMT"/&gt;
 *         &lt;element ref="{}SP_DISPTXCH"/&gt;
 *         &lt;element ref="{}SP_TLKSCNEN"/&gt;
 *         &lt;element ref="{}SP_PLLOCKCHMARKEN"/&gt;
 *         &lt;element ref="{}SP_SCPLTYPE"/&gt;
 *         &lt;element ref="{}SC_SCANSIGHT"/&gt;
 *         &lt;element ref="{}SP_SCHSKIPCYCLE"/&gt;
 *         &lt;element ref="{}SP_ATACKSC"/&gt;
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
    "spsclsttype",
    "splstctg",
    "spledsz",
    "spleqmax",
    "splleqmax",
    "scanperdlhtypeftllishtype",
    "scanperdlhtypeftllishid",
    "spvtscpretmdl",
    "sppr1MEM",
    "sppr1MEMTYPE",
    "sppr1MEMID",
    "sppr2MEM",
    "sppr2MEMTYPE",
    "sppr2MEMID",
    "spdsgtxmem",
    "spdsgtxmemtype",
    "spdsgtxmemid",
    "scanradtbpriosamp",
    "spscanlistalias",
    "spdispvtchrcv",
    "sperlmt",
    "spdisptxch",
    "sptlkscnen",
    "sppllockchmarken",
    "spscpltype",
    "scscansight",
    "spschskipcycle",
    "spatacksc"
})
@XmlRootElement(name = "SCAN_PER_DLH_TYPE")
public class SCANPERDLHTYPE {

    @XmlElement(name = "SP_SCLSTTYPE", required = true)
    protected SPSCLSTTYPE spsclsttype;
    @XmlElement(name = "SP_LSTCTG", required = true)
    protected SPLSTCTG splstctg;
    @XmlElement(name = "SP_LEDSZ", required = true)
    protected SPLEDSZ spledsz;
    @XmlElement(name = "SP_LEQMAX", required = true)
    protected SPLEQMAX spleqmax;
    @XmlElement(name = "SP_LLEQMAX", required = true)
    protected SPLLEQMAX splleqmax;
    @XmlElement(name = "SCAN_PER_DLH_TYPE_FTLLISHTYPE", required = true)
    protected SCANPERDLHTYPEFTLLISHTYPE scanperdlhtypeftllishtype;
    @XmlElement(name = "SCAN_PER_DLH_TYPE_FTLLISHID", required = true)
    protected SCANPERDLHTYPEFTLLISHID scanperdlhtypeftllishid;
    @XmlElement(name = "SP_VTSCPRETMDL", required = true)
    protected SPVTSCPRETMDL spvtscpretmdl;
    @XmlElement(name = "SP_PR1MEM", required = true)
    protected SPPR1MEM sppr1MEM;
    @XmlElement(name = "SP_PR1MEMTYPE", required = true)
    protected SPPR1MEMTYPE sppr1MEMTYPE;
    @XmlElement(name = "SP_PR1MEMID", required = true)
    protected SPPR1MEMID sppr1MEMID;
    @XmlElement(name = "SP_PR2MEM", required = true)
    protected SPPR2MEM sppr2MEM;
    @XmlElement(name = "SP_PR2MEMTYPE", required = true)
    protected SPPR2MEMTYPE sppr2MEMTYPE;
    @XmlElement(name = "SP_PR2MEMID", required = true)
    protected SPPR2MEMID sppr2MEMID;
    @XmlElement(name = "SP_DSGTXMEM", required = true)
    protected SPDSGTXMEM spdsgtxmem;
    @XmlElement(name = "SP_DSGTXMEMTYPE", required = true)
    protected SPDSGTXMEMTYPE spdsgtxmemtype;
    @XmlElement(name = "SP_DSGTXMEMID", required = true)
    protected SPDSGTXMEMID spdsgtxmemid;
    @XmlElement(name = "SCAN_RAD_TBPRIOSAMP", required = true)
    protected SCANRADTBPRIOSAMP scanradtbpriosamp;
    @XmlElement(name = "SP_SCANLISTALIAS", required = true)
    protected SPSCANLISTALIAS spscanlistalias;
    @XmlElement(name = "SP_DISPVTCHRCV", required = true)
    protected SPDISPVTCHRCV spdispvtchrcv;
    @XmlElement(name = "SP_ERLMT", required = true)
    protected SPERLMT sperlmt;
    @XmlElement(name = "SP_DISPTXCH", required = true)
    protected SPDISPTXCH spdisptxch;
    @XmlElement(name = "SP_TLKSCNEN", required = true)
    protected SPTLKSCNEN sptlkscnen;
    @XmlElement(name = "SP_PLLOCKCHMARKEN", required = true)
    protected SPPLLOCKCHMARKEN sppllockchmarken;
    @XmlElement(name = "SP_SCPLTYPE", required = true)
    protected SPSCPLTYPE spscpltype;
    @XmlElement(name = "SC_SCANSIGHT", required = true)
    protected SCSCANSIGHT scscansight;
    @XmlElement(name = "SP_SCHSKIPCYCLE", required = true)
    protected SPSCHSKIPCYCLE spschskipcycle;
    @XmlElement(name = "SP_ATACKSC", required = true)
    protected SPATACKSC spatacksc;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the spsclsttype property.
     * 
     * @return
     *     possible object is
     *     {@link SPSCLSTTYPE }
     *     
     */
    public SPSCLSTTYPE getSPSCLSTTYPE() {
        return spsclsttype;
    }

    /**
     * Sets the value of the spsclsttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPSCLSTTYPE }
     *     
     */
    public void setSPSCLSTTYPE(SPSCLSTTYPE value) {
        this.spsclsttype = value;
    }

    /**
     * Gets the value of the splstctg property.
     * 
     * @return
     *     possible object is
     *     {@link SPLSTCTG }
     *     
     */
    public SPLSTCTG getSPLSTCTG() {
        return splstctg;
    }

    /**
     * Sets the value of the splstctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPLSTCTG }
     *     
     */
    public void setSPLSTCTG(SPLSTCTG value) {
        this.splstctg = value;
    }

    /**
     * Gets the value of the spledsz property.
     * 
     * @return
     *     possible object is
     *     {@link SPLEDSZ }
     *     
     */
    public SPLEDSZ getSPLEDSZ() {
        return spledsz;
    }

    /**
     * Sets the value of the spledsz property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPLEDSZ }
     *     
     */
    public void setSPLEDSZ(SPLEDSZ value) {
        this.spledsz = value;
    }

    /**
     * Gets the value of the spleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link SPLEQMAX }
     *     
     */
    public SPLEQMAX getSPLEQMAX() {
        return spleqmax;
    }

    /**
     * Sets the value of the spleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPLEQMAX }
     *     
     */
    public void setSPLEQMAX(SPLEQMAX value) {
        this.spleqmax = value;
    }

    /**
     * Gets the value of the splleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link SPLLEQMAX }
     *     
     */
    public SPLLEQMAX getSPLLEQMAX() {
        return splleqmax;
    }

    /**
     * Sets the value of the splleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPLLEQMAX }
     *     
     */
    public void setSPLLEQMAX(SPLLEQMAX value) {
        this.splleqmax = value;
    }

    /**
     * Gets the value of the scanperdlhtypeftllishtype property.
     * 
     * @return
     *     possible object is
     *     {@link SCANPERDLHTYPEFTLLISHTYPE }
     *     
     */
    public SCANPERDLHTYPEFTLLISHTYPE getSCANPERDLHTYPEFTLLISHTYPE() {
        return scanperdlhtypeftllishtype;
    }

    /**
     * Sets the value of the scanperdlhtypeftllishtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCANPERDLHTYPEFTLLISHTYPE }
     *     
     */
    public void setSCANPERDLHTYPEFTLLISHTYPE(SCANPERDLHTYPEFTLLISHTYPE value) {
        this.scanperdlhtypeftllishtype = value;
    }

    /**
     * Gets the value of the scanperdlhtypeftllishid property.
     * 
     * @return
     *     possible object is
     *     {@link SCANPERDLHTYPEFTLLISHID }
     *     
     */
    public SCANPERDLHTYPEFTLLISHID getSCANPERDLHTYPEFTLLISHID() {
        return scanperdlhtypeftllishid;
    }

    /**
     * Sets the value of the scanperdlhtypeftllishid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCANPERDLHTYPEFTLLISHID }
     *     
     */
    public void setSCANPERDLHTYPEFTLLISHID(SCANPERDLHTYPEFTLLISHID value) {
        this.scanperdlhtypeftllishid = value;
    }

    /**
     * Gets the value of the spvtscpretmdl property.
     * 
     * @return
     *     possible object is
     *     {@link SPVTSCPRETMDL }
     *     
     */
    public SPVTSCPRETMDL getSPVTSCPRETMDL() {
        return spvtscpretmdl;
    }

    /**
     * Sets the value of the spvtscpretmdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPVTSCPRETMDL }
     *     
     */
    public void setSPVTSCPRETMDL(SPVTSCPRETMDL value) {
        this.spvtscpretmdl = value;
    }

    /**
     * Gets the value of the sppr1MEM property.
     * 
     * @return
     *     possible object is
     *     {@link SPPR1MEM }
     *     
     */
    public SPPR1MEM getSPPR1MEM() {
        return sppr1MEM;
    }

    /**
     * Sets the value of the sppr1MEM property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPPR1MEM }
     *     
     */
    public void setSPPR1MEM(SPPR1MEM value) {
        this.sppr1MEM = value;
    }

    /**
     * Gets the value of the sppr1MEMTYPE property.
     * 
     * @return
     *     possible object is
     *     {@link SPPR1MEMTYPE }
     *     
     */
    public SPPR1MEMTYPE getSPPR1MEMTYPE() {
        return sppr1MEMTYPE;
    }

    /**
     * Sets the value of the sppr1MEMTYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPPR1MEMTYPE }
     *     
     */
    public void setSPPR1MEMTYPE(SPPR1MEMTYPE value) {
        this.sppr1MEMTYPE = value;
    }

    /**
     * Gets the value of the sppr1MEMID property.
     * 
     * @return
     *     possible object is
     *     {@link SPPR1MEMID }
     *     
     */
    public SPPR1MEMID getSPPR1MEMID() {
        return sppr1MEMID;
    }

    /**
     * Sets the value of the sppr1MEMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPPR1MEMID }
     *     
     */
    public void setSPPR1MEMID(SPPR1MEMID value) {
        this.sppr1MEMID = value;
    }

    /**
     * Gets the value of the sppr2MEM property.
     * 
     * @return
     *     possible object is
     *     {@link SPPR2MEM }
     *     
     */
    public SPPR2MEM getSPPR2MEM() {
        return sppr2MEM;
    }

    /**
     * Sets the value of the sppr2MEM property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPPR2MEM }
     *     
     */
    public void setSPPR2MEM(SPPR2MEM value) {
        this.sppr2MEM = value;
    }

    /**
     * Gets the value of the sppr2MEMTYPE property.
     * 
     * @return
     *     possible object is
     *     {@link SPPR2MEMTYPE }
     *     
     */
    public SPPR2MEMTYPE getSPPR2MEMTYPE() {
        return sppr2MEMTYPE;
    }

    /**
     * Sets the value of the sppr2MEMTYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPPR2MEMTYPE }
     *     
     */
    public void setSPPR2MEMTYPE(SPPR2MEMTYPE value) {
        this.sppr2MEMTYPE = value;
    }

    /**
     * Gets the value of the sppr2MEMID property.
     * 
     * @return
     *     possible object is
     *     {@link SPPR2MEMID }
     *     
     */
    public SPPR2MEMID getSPPR2MEMID() {
        return sppr2MEMID;
    }

    /**
     * Sets the value of the sppr2MEMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPPR2MEMID }
     *     
     */
    public void setSPPR2MEMID(SPPR2MEMID value) {
        this.sppr2MEMID = value;
    }

    /**
     * Gets the value of the spdsgtxmem property.
     * 
     * @return
     *     possible object is
     *     {@link SPDSGTXMEM }
     *     
     */
    public SPDSGTXMEM getSPDSGTXMEM() {
        return spdsgtxmem;
    }

    /**
     * Sets the value of the spdsgtxmem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPDSGTXMEM }
     *     
     */
    public void setSPDSGTXMEM(SPDSGTXMEM value) {
        this.spdsgtxmem = value;
    }

    /**
     * Gets the value of the spdsgtxmemtype property.
     * 
     * @return
     *     possible object is
     *     {@link SPDSGTXMEMTYPE }
     *     
     */
    public SPDSGTXMEMTYPE getSPDSGTXMEMTYPE() {
        return spdsgtxmemtype;
    }

    /**
     * Sets the value of the spdsgtxmemtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPDSGTXMEMTYPE }
     *     
     */
    public void setSPDSGTXMEMTYPE(SPDSGTXMEMTYPE value) {
        this.spdsgtxmemtype = value;
    }

    /**
     * Gets the value of the spdsgtxmemid property.
     * 
     * @return
     *     possible object is
     *     {@link SPDSGTXMEMID }
     *     
     */
    public SPDSGTXMEMID getSPDSGTXMEMID() {
        return spdsgtxmemid;
    }

    /**
     * Sets the value of the spdsgtxmemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPDSGTXMEMID }
     *     
     */
    public void setSPDSGTXMEMID(SPDSGTXMEMID value) {
        this.spdsgtxmemid = value;
    }

    /**
     * Gets the value of the scanradtbpriosamp property.
     * 
     * @return
     *     possible object is
     *     {@link SCANRADTBPRIOSAMP }
     *     
     */
    public SCANRADTBPRIOSAMP getSCANRADTBPRIOSAMP() {
        return scanradtbpriosamp;
    }

    /**
     * Sets the value of the scanradtbpriosamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCANRADTBPRIOSAMP }
     *     
     */
    public void setSCANRADTBPRIOSAMP(SCANRADTBPRIOSAMP value) {
        this.scanradtbpriosamp = value;
    }

    /**
     * Gets the value of the spscanlistalias property.
     * 
     * @return
     *     possible object is
     *     {@link SPSCANLISTALIAS }
     *     
     */
    public SPSCANLISTALIAS getSPSCANLISTALIAS() {
        return spscanlistalias;
    }

    /**
     * Sets the value of the spscanlistalias property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPSCANLISTALIAS }
     *     
     */
    public void setSPSCANLISTALIAS(SPSCANLISTALIAS value) {
        this.spscanlistalias = value;
    }

    /**
     * Gets the value of the spdispvtchrcv property.
     * 
     * @return
     *     possible object is
     *     {@link SPDISPVTCHRCV }
     *     
     */
    public SPDISPVTCHRCV getSPDISPVTCHRCV() {
        return spdispvtchrcv;
    }

    /**
     * Sets the value of the spdispvtchrcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPDISPVTCHRCV }
     *     
     */
    public void setSPDISPVTCHRCV(SPDISPVTCHRCV value) {
        this.spdispvtchrcv = value;
    }

    /**
     * Gets the value of the sperlmt property.
     * 
     * @return
     *     possible object is
     *     {@link SPERLMT }
     *     
     */
    public SPERLMT getSPERLMT() {
        return sperlmt;
    }

    /**
     * Sets the value of the sperlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPERLMT }
     *     
     */
    public void setSPERLMT(SPERLMT value) {
        this.sperlmt = value;
    }

    /**
     * Gets the value of the spdisptxch property.
     * 
     * @return
     *     possible object is
     *     {@link SPDISPTXCH }
     *     
     */
    public SPDISPTXCH getSPDISPTXCH() {
        return spdisptxch;
    }

    /**
     * Sets the value of the spdisptxch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPDISPTXCH }
     *     
     */
    public void setSPDISPTXCH(SPDISPTXCH value) {
        this.spdisptxch = value;
    }

    /**
     * Gets the value of the sptlkscnen property.
     * 
     * @return
     *     possible object is
     *     {@link SPTLKSCNEN }
     *     
     */
    public SPTLKSCNEN getSPTLKSCNEN() {
        return sptlkscnen;
    }

    /**
     * Sets the value of the sptlkscnen property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPTLKSCNEN }
     *     
     */
    public void setSPTLKSCNEN(SPTLKSCNEN value) {
        this.sptlkscnen = value;
    }

    /**
     * Gets the value of the sppllockchmarken property.
     * 
     * @return
     *     possible object is
     *     {@link SPPLLOCKCHMARKEN }
     *     
     */
    public SPPLLOCKCHMARKEN getSPPLLOCKCHMARKEN() {
        return sppllockchmarken;
    }

    /**
     * Sets the value of the sppllockchmarken property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPPLLOCKCHMARKEN }
     *     
     */
    public void setSPPLLOCKCHMARKEN(SPPLLOCKCHMARKEN value) {
        this.sppllockchmarken = value;
    }

    /**
     * Gets the value of the spscpltype property.
     * 
     * @return
     *     possible object is
     *     {@link SPSCPLTYPE }
     *     
     */
    public SPSCPLTYPE getSPSCPLTYPE() {
        return spscpltype;
    }

    /**
     * Sets the value of the spscpltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPSCPLTYPE }
     *     
     */
    public void setSPSCPLTYPE(SPSCPLTYPE value) {
        this.spscpltype = value;
    }

    /**
     * Gets the value of the scscansight property.
     * 
     * @return
     *     possible object is
     *     {@link SCSCANSIGHT }
     *     
     */
    public SCSCANSIGHT getSCSCANSIGHT() {
        return scscansight;
    }

    /**
     * Sets the value of the scscansight property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCSCANSIGHT }
     *     
     */
    public void setSCSCANSIGHT(SCSCANSIGHT value) {
        this.scscansight = value;
    }

    /**
     * Gets the value of the spschskipcycle property.
     * 
     * @return
     *     possible object is
     *     {@link SPSCHSKIPCYCLE }
     *     
     */
    public SPSCHSKIPCYCLE getSPSCHSKIPCYCLE() {
        return spschskipcycle;
    }

    /**
     * Sets the value of the spschskipcycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPSCHSKIPCYCLE }
     *     
     */
    public void setSPSCHSKIPCYCLE(SPSCHSKIPCYCLE value) {
        this.spschskipcycle = value;
    }

    /**
     * Gets the value of the spatacksc property.
     * 
     * @return
     *     possible object is
     *     {@link SPATACKSC }
     *     
     */
    public SPATACKSC getSPATACKSC() {
        return spatacksc;
    }

    /**
     * Sets the value of the spatacksc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPATACKSC }
     *     
     */
    public void setSPATACKSC(SPATACKSC value) {
        this.spatacksc = value;
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
