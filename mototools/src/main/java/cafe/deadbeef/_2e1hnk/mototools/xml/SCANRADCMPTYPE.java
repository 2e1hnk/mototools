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
 *         &lt;element ref="{}SC_OHSUSPSCAN"/&gt;
 *         &lt;element ref="{}SC_NUMPRISAM"/&gt;
 *         &lt;element ref="{}SC_PSDEFSIGEN"/&gt;
 *         &lt;element ref="{}SC_PSCANALERTEN"/&gt;
 *         &lt;element ref="{}SC_NUIDELEN"/&gt;
 *         &lt;element ref="{}SC_HANGTIME"/&gt;
 *         &lt;element ref="{}SC_HANGTIME_DIGITAL"/&gt;
 *         &lt;element ref="{}SC_RADSCANMONHT"/&gt;
 *         &lt;element ref="{}SC_RADDTCSQ"/&gt;
 *         &lt;element ref="{}SC_USERINITSCANRT"/&gt;
 *         &lt;element ref="{}SCAN_RAD_DTPL"/&gt;
 *         &lt;element ref="{}SCAN_RAD_DATAHOLDTIME"/&gt;
 *         &lt;element ref="{}SC_DGTSCANDTT"/&gt;
 *         &lt;element ref="{}SC_VTSCHANGTM"/&gt;
 *         &lt;element ref="{}SC_FSTVTRSSITHD"/&gt;
 *         &lt;element ref="{}SC_STVTRSSITHD"/&gt;
 *         &lt;element ref="{}SC_ANALOGCRDTTM"/&gt;
 *         &lt;element ref="{}SC_ALGHANGTIME"/&gt;
 *         &lt;element ref="{}SRCT_RESERVED"/&gt;
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
    "scohsuspscan",
    "scnumprisam",
    "scpsdefsigen",
    "scpscanalerten",
    "scnuidelen",
    "schangtime",
    "schangtimedigital",
    "scradscanmonht",
    "scraddtcsq",
    "scuserinitscanrt",
    "scanraddtpl",
    "scanraddataholdtime",
    "scdgtscandtt",
    "scvtschangtm",
    "scfstvtrssithd",
    "scstvtrssithd",
    "scanalogcrdttm",
    "scalghangtime",
    "srctreserved"
})
@XmlRootElement(name = "SCAN_RAD_CMP_TYPE")
public class SCANRADCMPTYPE {

    @XmlElement(name = "SC_OHSUSPSCAN", required = true)
    protected SCOHSUSPSCAN scohsuspscan;
    @XmlElement(name = "SC_NUMPRISAM", required = true)
    protected SCNUMPRISAM scnumprisam;
    @XmlElement(name = "SC_PSDEFSIGEN", required = true)
    protected SCPSDEFSIGEN scpsdefsigen;
    @XmlElement(name = "SC_PSCANALERTEN", required = true)
    protected SCPSCANALERTEN scpscanalerten;
    @XmlElement(name = "SC_NUIDELEN", required = true)
    protected SCNUIDELEN scnuidelen;
    @XmlElement(name = "SC_HANGTIME", required = true)
    protected SCHANGTIME schangtime;
    @XmlElement(name = "SC_HANGTIME_DIGITAL", required = true)
    protected SCHANGTIMEDIGITAL schangtimedigital;
    @XmlElement(name = "SC_RADSCANMONHT", required = true)
    protected SCRADSCANMONHT scradscanmonht;
    @XmlElement(name = "SC_RADDTCSQ", required = true)
    protected SCRADDTCSQ scraddtcsq;
    @XmlElement(name = "SC_USERINITSCANRT", required = true)
    protected SCUSERINITSCANRT scuserinitscanrt;
    @XmlElement(name = "SCAN_RAD_DTPL", required = true)
    protected SCANRADDTPL scanraddtpl;
    @XmlElement(name = "SCAN_RAD_DATAHOLDTIME", required = true)
    protected SCANRADDATAHOLDTIME scanraddataholdtime;
    @XmlElement(name = "SC_DGTSCANDTT", required = true)
    protected SCDGTSCANDTT scdgtscandtt;
    @XmlElement(name = "SC_VTSCHANGTM", required = true)
    protected SCVTSCHANGTM scvtschangtm;
    @XmlElement(name = "SC_FSTVTRSSITHD", required = true)
    protected SCFSTVTRSSITHD scfstvtrssithd;
    @XmlElement(name = "SC_STVTRSSITHD", required = true)
    protected SCSTVTRSSITHD scstvtrssithd;
    @XmlElement(name = "SC_ANALOGCRDTTM", required = true)
    protected SCANALOGCRDTTM scanalogcrdttm;
    @XmlElement(name = "SC_ALGHANGTIME", required = true)
    protected SCALGHANGTIME scalghangtime;
    @XmlElement(name = "SRCT_RESERVED", required = true)
    protected SRCTRESERVED srctreserved;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the scohsuspscan property.
     * 
     * @return
     *     possible object is
     *     {@link SCOHSUSPSCAN }
     *     
     */
    public SCOHSUSPSCAN getSCOHSUSPSCAN() {
        return scohsuspscan;
    }

    /**
     * Sets the value of the scohsuspscan property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCOHSUSPSCAN }
     *     
     */
    public void setSCOHSUSPSCAN(SCOHSUSPSCAN value) {
        this.scohsuspscan = value;
    }

    /**
     * Gets the value of the scnumprisam property.
     * 
     * @return
     *     possible object is
     *     {@link SCNUMPRISAM }
     *     
     */
    public SCNUMPRISAM getSCNUMPRISAM() {
        return scnumprisam;
    }

    /**
     * Sets the value of the scnumprisam property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCNUMPRISAM }
     *     
     */
    public void setSCNUMPRISAM(SCNUMPRISAM value) {
        this.scnumprisam = value;
    }

    /**
     * Gets the value of the scpsdefsigen property.
     * 
     * @return
     *     possible object is
     *     {@link SCPSDEFSIGEN }
     *     
     */
    public SCPSDEFSIGEN getSCPSDEFSIGEN() {
        return scpsdefsigen;
    }

    /**
     * Sets the value of the scpsdefsigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCPSDEFSIGEN }
     *     
     */
    public void setSCPSDEFSIGEN(SCPSDEFSIGEN value) {
        this.scpsdefsigen = value;
    }

    /**
     * Gets the value of the scpscanalerten property.
     * 
     * @return
     *     possible object is
     *     {@link SCPSCANALERTEN }
     *     
     */
    public SCPSCANALERTEN getSCPSCANALERTEN() {
        return scpscanalerten;
    }

    /**
     * Sets the value of the scpscanalerten property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCPSCANALERTEN }
     *     
     */
    public void setSCPSCANALERTEN(SCPSCANALERTEN value) {
        this.scpscanalerten = value;
    }

    /**
     * Gets the value of the scnuidelen property.
     * 
     * @return
     *     possible object is
     *     {@link SCNUIDELEN }
     *     
     */
    public SCNUIDELEN getSCNUIDELEN() {
        return scnuidelen;
    }

    /**
     * Sets the value of the scnuidelen property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCNUIDELEN }
     *     
     */
    public void setSCNUIDELEN(SCNUIDELEN value) {
        this.scnuidelen = value;
    }

    /**
     * Gets the value of the schangtime property.
     * 
     * @return
     *     possible object is
     *     {@link SCHANGTIME }
     *     
     */
    public SCHANGTIME getSCHANGTIME() {
        return schangtime;
    }

    /**
     * Sets the value of the schangtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHANGTIME }
     *     
     */
    public void setSCHANGTIME(SCHANGTIME value) {
        this.schangtime = value;
    }

    /**
     * Gets the value of the schangtimedigital property.
     * 
     * @return
     *     possible object is
     *     {@link SCHANGTIMEDIGITAL }
     *     
     */
    public SCHANGTIMEDIGITAL getSCHANGTIMEDIGITAL() {
        return schangtimedigital;
    }

    /**
     * Sets the value of the schangtimedigital property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHANGTIMEDIGITAL }
     *     
     */
    public void setSCHANGTIMEDIGITAL(SCHANGTIMEDIGITAL value) {
        this.schangtimedigital = value;
    }

    /**
     * Gets the value of the scradscanmonht property.
     * 
     * @return
     *     possible object is
     *     {@link SCRADSCANMONHT }
     *     
     */
    public SCRADSCANMONHT getSCRADSCANMONHT() {
        return scradscanmonht;
    }

    /**
     * Sets the value of the scradscanmonht property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCRADSCANMONHT }
     *     
     */
    public void setSCRADSCANMONHT(SCRADSCANMONHT value) {
        this.scradscanmonht = value;
    }

    /**
     * Gets the value of the scraddtcsq property.
     * 
     * @return
     *     possible object is
     *     {@link SCRADDTCSQ }
     *     
     */
    public SCRADDTCSQ getSCRADDTCSQ() {
        return scraddtcsq;
    }

    /**
     * Sets the value of the scraddtcsq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCRADDTCSQ }
     *     
     */
    public void setSCRADDTCSQ(SCRADDTCSQ value) {
        this.scraddtcsq = value;
    }

    /**
     * Gets the value of the scuserinitscanrt property.
     * 
     * @return
     *     possible object is
     *     {@link SCUSERINITSCANRT }
     *     
     */
    public SCUSERINITSCANRT getSCUSERINITSCANRT() {
        return scuserinitscanrt;
    }

    /**
     * Sets the value of the scuserinitscanrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCUSERINITSCANRT }
     *     
     */
    public void setSCUSERINITSCANRT(SCUSERINITSCANRT value) {
        this.scuserinitscanrt = value;
    }

    /**
     * Gets the value of the scanraddtpl property.
     * 
     * @return
     *     possible object is
     *     {@link SCANRADDTPL }
     *     
     */
    public SCANRADDTPL getSCANRADDTPL() {
        return scanraddtpl;
    }

    /**
     * Sets the value of the scanraddtpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCANRADDTPL }
     *     
     */
    public void setSCANRADDTPL(SCANRADDTPL value) {
        this.scanraddtpl = value;
    }

    /**
     * Gets the value of the scanraddataholdtime property.
     * 
     * @return
     *     possible object is
     *     {@link SCANRADDATAHOLDTIME }
     *     
     */
    public SCANRADDATAHOLDTIME getSCANRADDATAHOLDTIME() {
        return scanraddataholdtime;
    }

    /**
     * Sets the value of the scanraddataholdtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCANRADDATAHOLDTIME }
     *     
     */
    public void setSCANRADDATAHOLDTIME(SCANRADDATAHOLDTIME value) {
        this.scanraddataholdtime = value;
    }

    /**
     * Gets the value of the scdgtscandtt property.
     * 
     * @return
     *     possible object is
     *     {@link SCDGTSCANDTT }
     *     
     */
    public SCDGTSCANDTT getSCDGTSCANDTT() {
        return scdgtscandtt;
    }

    /**
     * Sets the value of the scdgtscandtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCDGTSCANDTT }
     *     
     */
    public void setSCDGTSCANDTT(SCDGTSCANDTT value) {
        this.scdgtscandtt = value;
    }

    /**
     * Gets the value of the scvtschangtm property.
     * 
     * @return
     *     possible object is
     *     {@link SCVTSCHANGTM }
     *     
     */
    public SCVTSCHANGTM getSCVTSCHANGTM() {
        return scvtschangtm;
    }

    /**
     * Sets the value of the scvtschangtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCVTSCHANGTM }
     *     
     */
    public void setSCVTSCHANGTM(SCVTSCHANGTM value) {
        this.scvtschangtm = value;
    }

    /**
     * Gets the value of the scfstvtrssithd property.
     * 
     * @return
     *     possible object is
     *     {@link SCFSTVTRSSITHD }
     *     
     */
    public SCFSTVTRSSITHD getSCFSTVTRSSITHD() {
        return scfstvtrssithd;
    }

    /**
     * Sets the value of the scfstvtrssithd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCFSTVTRSSITHD }
     *     
     */
    public void setSCFSTVTRSSITHD(SCFSTVTRSSITHD value) {
        this.scfstvtrssithd = value;
    }

    /**
     * Gets the value of the scstvtrssithd property.
     * 
     * @return
     *     possible object is
     *     {@link SCSTVTRSSITHD }
     *     
     */
    public SCSTVTRSSITHD getSCSTVTRSSITHD() {
        return scstvtrssithd;
    }

    /**
     * Sets the value of the scstvtrssithd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCSTVTRSSITHD }
     *     
     */
    public void setSCSTVTRSSITHD(SCSTVTRSSITHD value) {
        this.scstvtrssithd = value;
    }

    /**
     * Gets the value of the scanalogcrdttm property.
     * 
     * @return
     *     possible object is
     *     {@link SCANALOGCRDTTM }
     *     
     */
    public SCANALOGCRDTTM getSCANALOGCRDTTM() {
        return scanalogcrdttm;
    }

    /**
     * Sets the value of the scanalogcrdttm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCANALOGCRDTTM }
     *     
     */
    public void setSCANALOGCRDTTM(SCANALOGCRDTTM value) {
        this.scanalogcrdttm = value;
    }

    /**
     * Gets the value of the scalghangtime property.
     * 
     * @return
     *     possible object is
     *     {@link SCALGHANGTIME }
     *     
     */
    public SCALGHANGTIME getSCALGHANGTIME() {
        return scalghangtime;
    }

    /**
     * Sets the value of the scalghangtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCALGHANGTIME }
     *     
     */
    public void setSCALGHANGTIME(SCALGHANGTIME value) {
        this.scalghangtime = value;
    }

    /**
     * Gets the value of the srctreserved property.
     * 
     * @return
     *     possible object is
     *     {@link SRCTRESERVED }
     *     
     */
    public SRCTRESERVED getSRCTRESERVED() {
        return srctreserved;
    }

    /**
     * Sets the value of the srctreserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link SRCTRESERVED }
     *     
     */
    public void setSRCTRESERVED(SRCTRESERVED value) {
        this.srctreserved = value;
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
