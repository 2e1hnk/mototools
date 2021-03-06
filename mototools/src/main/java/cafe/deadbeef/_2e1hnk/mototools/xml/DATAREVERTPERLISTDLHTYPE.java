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
 *         &lt;element ref="{}DATAREVERT_LSTCTG"/&gt;
 *         &lt;element ref="{}DATAREVERT_LEDSZ"/&gt;
 *         &lt;element ref="{}DATAREVERT_LEQMAX"/&gt;
 *         &lt;element ref="{}DATAREVERT_LLEQMAX"/&gt;
 *         &lt;element ref="{}DATA_REVERT_PER_LIST_DLH_TYPE_FTLLISHTYPE"/&gt;
 *         &lt;element ref="{}DATA_REVERT_PER_LIST_DLH_TYPE_FTLLISHID"/&gt;
 *         &lt;element ref="{}DATAREVERT_TRUNKPERALIAS"/&gt;
 *         &lt;element ref="{}DATAREVERT_SCHGPSWDSZ"/&gt;
 *         &lt;element ref="{}DATAREVERT_SCHGPSWDSZ_GUI"/&gt;
 *         &lt;element ref="{}DATAREVERT_CPCTRTEN"/&gt;
 *         &lt;element ref="{}DATAREVERT_RESERVED0"/&gt;
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
    "datarevertlstctg",
    "datarevertledsz",
    "datarevertleqmax",
    "datarevertlleqmax",
    "datarevertperlistdlhtypeftllishtype",
    "datarevertperlistdlhtypeftllishid",
    "datareverttrunkperalias",
    "datarevertschgpswdsz",
    "datarevertschgpswdszgui",
    "datarevertcpctrten",
    "datarevertreserved0"
})
@XmlRootElement(name = "DATA_REVERT_PER_LIST_DLH_TYPE")
public class DATAREVERTPERLISTDLHTYPE {

    @XmlElement(name = "DATAREVERT_LSTCTG", required = true)
    protected DATAREVERTLSTCTG datarevertlstctg;
    @XmlElement(name = "DATAREVERT_LEDSZ", required = true)
    protected DATAREVERTLEDSZ datarevertledsz;
    @XmlElement(name = "DATAREVERT_LEQMAX", required = true)
    protected DATAREVERTLEQMAX datarevertleqmax;
    @XmlElement(name = "DATAREVERT_LLEQMAX", required = true)
    protected DATAREVERTLLEQMAX datarevertlleqmax;
    @XmlElement(name = "DATA_REVERT_PER_LIST_DLH_TYPE_FTLLISHTYPE", required = true)
    protected DATAREVERTPERLISTDLHTYPEFTLLISHTYPE datarevertperlistdlhtypeftllishtype;
    @XmlElement(name = "DATA_REVERT_PER_LIST_DLH_TYPE_FTLLISHID", required = true)
    protected DATAREVERTPERLISTDLHTYPEFTLLISHID datarevertperlistdlhtypeftllishid;
    @XmlElement(name = "DATAREVERT_TRUNKPERALIAS", required = true)
    protected DATAREVERTTRUNKPERALIAS datareverttrunkperalias;
    @XmlElement(name = "DATAREVERT_SCHGPSWDSZ", required = true)
    protected DATAREVERTSCHGPSWDSZ datarevertschgpswdsz;
    @XmlElement(name = "DATAREVERT_SCHGPSWDSZ_GUI", required = true)
    protected DATAREVERTSCHGPSWDSZGUI datarevertschgpswdszgui;
    @XmlElement(name = "DATAREVERT_CPCTRTEN", required = true)
    protected DATAREVERTCPCTRTEN datarevertcpctrten;
    @XmlElement(name = "DATAREVERT_RESERVED0", required = true)
    protected DATAREVERTRESERVED0 datarevertreserved0;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the datarevertlstctg property.
     * 
     * @return
     *     possible object is
     *     {@link DATAREVERTLSTCTG }
     *     
     */
    public DATAREVERTLSTCTG getDATAREVERTLSTCTG() {
        return datarevertlstctg;
    }

    /**
     * Sets the value of the datarevertlstctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAREVERTLSTCTG }
     *     
     */
    public void setDATAREVERTLSTCTG(DATAREVERTLSTCTG value) {
        this.datarevertlstctg = value;
    }

    /**
     * Gets the value of the datarevertledsz property.
     * 
     * @return
     *     possible object is
     *     {@link DATAREVERTLEDSZ }
     *     
     */
    public DATAREVERTLEDSZ getDATAREVERTLEDSZ() {
        return datarevertledsz;
    }

    /**
     * Sets the value of the datarevertledsz property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAREVERTLEDSZ }
     *     
     */
    public void setDATAREVERTLEDSZ(DATAREVERTLEDSZ value) {
        this.datarevertledsz = value;
    }

    /**
     * Gets the value of the datarevertleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link DATAREVERTLEQMAX }
     *     
     */
    public DATAREVERTLEQMAX getDATAREVERTLEQMAX() {
        return datarevertleqmax;
    }

    /**
     * Sets the value of the datarevertleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAREVERTLEQMAX }
     *     
     */
    public void setDATAREVERTLEQMAX(DATAREVERTLEQMAX value) {
        this.datarevertleqmax = value;
    }

    /**
     * Gets the value of the datarevertlleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link DATAREVERTLLEQMAX }
     *     
     */
    public DATAREVERTLLEQMAX getDATAREVERTLLEQMAX() {
        return datarevertlleqmax;
    }

    /**
     * Sets the value of the datarevertlleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAREVERTLLEQMAX }
     *     
     */
    public void setDATAREVERTLLEQMAX(DATAREVERTLLEQMAX value) {
        this.datarevertlleqmax = value;
    }

    /**
     * Gets the value of the datarevertperlistdlhtypeftllishtype property.
     * 
     * @return
     *     possible object is
     *     {@link DATAREVERTPERLISTDLHTYPEFTLLISHTYPE }
     *     
     */
    public DATAREVERTPERLISTDLHTYPEFTLLISHTYPE getDATAREVERTPERLISTDLHTYPEFTLLISHTYPE() {
        return datarevertperlistdlhtypeftllishtype;
    }

    /**
     * Sets the value of the datarevertperlistdlhtypeftllishtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAREVERTPERLISTDLHTYPEFTLLISHTYPE }
     *     
     */
    public void setDATAREVERTPERLISTDLHTYPEFTLLISHTYPE(DATAREVERTPERLISTDLHTYPEFTLLISHTYPE value) {
        this.datarevertperlistdlhtypeftllishtype = value;
    }

    /**
     * Gets the value of the datarevertperlistdlhtypeftllishid property.
     * 
     * @return
     *     possible object is
     *     {@link DATAREVERTPERLISTDLHTYPEFTLLISHID }
     *     
     */
    public DATAREVERTPERLISTDLHTYPEFTLLISHID getDATAREVERTPERLISTDLHTYPEFTLLISHID() {
        return datarevertperlistdlhtypeftllishid;
    }

    /**
     * Sets the value of the datarevertperlistdlhtypeftllishid property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAREVERTPERLISTDLHTYPEFTLLISHID }
     *     
     */
    public void setDATAREVERTPERLISTDLHTYPEFTLLISHID(DATAREVERTPERLISTDLHTYPEFTLLISHID value) {
        this.datarevertperlistdlhtypeftllishid = value;
    }

    /**
     * Gets the value of the datareverttrunkperalias property.
     * 
     * @return
     *     possible object is
     *     {@link DATAREVERTTRUNKPERALIAS }
     *     
     */
    public DATAREVERTTRUNKPERALIAS getDATAREVERTTRUNKPERALIAS() {
        return datareverttrunkperalias;
    }

    /**
     * Sets the value of the datareverttrunkperalias property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAREVERTTRUNKPERALIAS }
     *     
     */
    public void setDATAREVERTTRUNKPERALIAS(DATAREVERTTRUNKPERALIAS value) {
        this.datareverttrunkperalias = value;
    }

    /**
     * Gets the value of the datarevertschgpswdsz property.
     * 
     * @return
     *     possible object is
     *     {@link DATAREVERTSCHGPSWDSZ }
     *     
     */
    public DATAREVERTSCHGPSWDSZ getDATAREVERTSCHGPSWDSZ() {
        return datarevertschgpswdsz;
    }

    /**
     * Sets the value of the datarevertschgpswdsz property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAREVERTSCHGPSWDSZ }
     *     
     */
    public void setDATAREVERTSCHGPSWDSZ(DATAREVERTSCHGPSWDSZ value) {
        this.datarevertschgpswdsz = value;
    }

    /**
     * Gets the value of the datarevertschgpswdszgui property.
     * 
     * @return
     *     possible object is
     *     {@link DATAREVERTSCHGPSWDSZGUI }
     *     
     */
    public DATAREVERTSCHGPSWDSZGUI getDATAREVERTSCHGPSWDSZGUI() {
        return datarevertschgpswdszgui;
    }

    /**
     * Sets the value of the datarevertschgpswdszgui property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAREVERTSCHGPSWDSZGUI }
     *     
     */
    public void setDATAREVERTSCHGPSWDSZGUI(DATAREVERTSCHGPSWDSZGUI value) {
        this.datarevertschgpswdszgui = value;
    }

    /**
     * Gets the value of the datarevertcpctrten property.
     * 
     * @return
     *     possible object is
     *     {@link DATAREVERTCPCTRTEN }
     *     
     */
    public DATAREVERTCPCTRTEN getDATAREVERTCPCTRTEN() {
        return datarevertcpctrten;
    }

    /**
     * Sets the value of the datarevertcpctrten property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAREVERTCPCTRTEN }
     *     
     */
    public void setDATAREVERTCPCTRTEN(DATAREVERTCPCTRTEN value) {
        this.datarevertcpctrten = value;
    }

    /**
     * Gets the value of the datarevertreserved0 property.
     * 
     * @return
     *     possible object is
     *     {@link DATAREVERTRESERVED0 }
     *     
     */
    public DATAREVERTRESERVED0 getDATAREVERTRESERVED0() {
        return datarevertreserved0;
    }

    /**
     * Sets the value of the datarevertreserved0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAREVERTRESERVED0 }
     *     
     */
    public void setDATAREVERTRESERVED0(DATAREVERTRESERVED0 value) {
        this.datarevertreserved0 = value;
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
