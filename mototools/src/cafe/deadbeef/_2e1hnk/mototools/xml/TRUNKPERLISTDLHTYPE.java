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
 *         &lt;element ref="{}TP_LSTCTG"/>
 *         &lt;element ref="{}TP_LEDSZ"/>
 *         &lt;element ref="{}TP_LEQMAX"/>
 *         &lt;element ref="{}TP_LLEQMAX"/>
 *         &lt;element ref="{}TRUNK_PER_LIST_DLH_TYPE_FTLLISHTYPE"/>
 *         &lt;element ref="{}TRUNK_PER_LIST_DLH_TYPE_FTLLISHID"/>
 *         &lt;element ref="{}TP_TRUNKPERALIAS"/>
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
    "tplstctg",
    "tpledsz",
    "tpleqmax",
    "tplleqmax",
    "trunkperlistdlhtypeftllishtype",
    "trunkperlistdlhtypeftllishid",
    "tptrunkperalias"
})
@XmlRootElement(name = "TRUNK_PER_LIST_DLH_TYPE")
public class TRUNKPERLISTDLHTYPE {

    @XmlElement(name = "TP_LSTCTG", required = true)
    protected TPLSTCTG tplstctg;
    @XmlElement(name = "TP_LEDSZ", required = true)
    protected TPLEDSZ tpledsz;
    @XmlElement(name = "TP_LEQMAX", required = true)
    protected TPLEQMAX tpleqmax;
    @XmlElement(name = "TP_LLEQMAX", required = true)
    protected TPLLEQMAX tplleqmax;
    @XmlElement(name = "TRUNK_PER_LIST_DLH_TYPE_FTLLISHTYPE", required = true)
    protected TRUNKPERLISTDLHTYPEFTLLISHTYPE trunkperlistdlhtypeftllishtype;
    @XmlElement(name = "TRUNK_PER_LIST_DLH_TYPE_FTLLISHID", required = true)
    protected TRUNKPERLISTDLHTYPEFTLLISHID trunkperlistdlhtypeftllishid;
    @XmlElement(name = "TP_TRUNKPERALIAS", required = true)
    protected TPTRUNKPERALIAS tptrunkperalias;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the tplstctg property.
     * 
     * @return
     *     possible object is
     *     {@link TPLSTCTG }
     *     
     */
    public TPLSTCTG getTPLSTCTG() {
        return tplstctg;
    }

    /**
     * Sets the value of the tplstctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPLSTCTG }
     *     
     */
    public void setTPLSTCTG(TPLSTCTG value) {
        this.tplstctg = value;
    }

    /**
     * Gets the value of the tpledsz property.
     * 
     * @return
     *     possible object is
     *     {@link TPLEDSZ }
     *     
     */
    public TPLEDSZ getTPLEDSZ() {
        return tpledsz;
    }

    /**
     * Sets the value of the tpledsz property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPLEDSZ }
     *     
     */
    public void setTPLEDSZ(TPLEDSZ value) {
        this.tpledsz = value;
    }

    /**
     * Gets the value of the tpleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link TPLEQMAX }
     *     
     */
    public TPLEQMAX getTPLEQMAX() {
        return tpleqmax;
    }

    /**
     * Sets the value of the tpleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPLEQMAX }
     *     
     */
    public void setTPLEQMAX(TPLEQMAX value) {
        this.tpleqmax = value;
    }

    /**
     * Gets the value of the tplleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link TPLLEQMAX }
     *     
     */
    public TPLLEQMAX getTPLLEQMAX() {
        return tplleqmax;
    }

    /**
     * Sets the value of the tplleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPLLEQMAX }
     *     
     */
    public void setTPLLEQMAX(TPLLEQMAX value) {
        this.tplleqmax = value;
    }

    /**
     * Gets the value of the trunkperlistdlhtypeftllishtype property.
     * 
     * @return
     *     possible object is
     *     {@link TRUNKPERLISTDLHTYPEFTLLISHTYPE }
     *     
     */
    public TRUNKPERLISTDLHTYPEFTLLISHTYPE getTRUNKPERLISTDLHTYPEFTLLISHTYPE() {
        return trunkperlistdlhtypeftllishtype;
    }

    /**
     * Sets the value of the trunkperlistdlhtypeftllishtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRUNKPERLISTDLHTYPEFTLLISHTYPE }
     *     
     */
    public void setTRUNKPERLISTDLHTYPEFTLLISHTYPE(TRUNKPERLISTDLHTYPEFTLLISHTYPE value) {
        this.trunkperlistdlhtypeftllishtype = value;
    }

    /**
     * Gets the value of the trunkperlistdlhtypeftllishid property.
     * 
     * @return
     *     possible object is
     *     {@link TRUNKPERLISTDLHTYPEFTLLISHID }
     *     
     */
    public TRUNKPERLISTDLHTYPEFTLLISHID getTRUNKPERLISTDLHTYPEFTLLISHID() {
        return trunkperlistdlhtypeftllishid;
    }

    /**
     * Sets the value of the trunkperlistdlhtypeftllishid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRUNKPERLISTDLHTYPEFTLLISHID }
     *     
     */
    public void setTRUNKPERLISTDLHTYPEFTLLISHID(TRUNKPERLISTDLHTYPEFTLLISHID value) {
        this.trunkperlistdlhtypeftllishid = value;
    }

    /**
     * Gets the value of the tptrunkperalias property.
     * 
     * @return
     *     possible object is
     *     {@link TPTRUNKPERALIAS }
     *     
     */
    public TPTRUNKPERALIAS getTPTRUNKPERALIAS() {
        return tptrunkperalias;
    }

    /**
     * Sets the value of the tptrunkperalias property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPTRUNKPERALIAS }
     *     
     */
    public void setTPTRUNKPERALIAS(TPTRUNKPERALIAS value) {
        this.tptrunkperalias = value;
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
