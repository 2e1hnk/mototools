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
 *         &lt;element ref="{}S5CLDLH_LC"/&gt;
 *         &lt;element ref="{}S5CLDLH_LEDSZ"/&gt;
 *         &lt;element ref="{}SLT_5_CALL_DLH_LEQMAX"/&gt;
 *         &lt;element ref="{}S5CLDLH_LLEQMAX"/&gt;
 *         &lt;element ref="{}SLT_5_CALL_DLH_TYPE_FTLLISHTYPE"/&gt;
 *         &lt;element ref="{}SLT_5_CALL_DLH_TYPE_FTLLISHID"/&gt;
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
    "s5CLDLHLC",
    "s5CLDLHLEDSZ",
    "slt5CALLDLHLEQMAX",
    "s5CLDLHLLEQMAX",
    "slt5CALLDLHTYPEFTLLISHTYPE",
    "slt5CALLDLHTYPEFTLLISHID"
})
@XmlRootElement(name = "SLT_5_CALL_DLH_TYPE")
public class SLT5CALLDLHTYPE {

    @XmlElement(name = "S5CLDLH_LC", required = true)
    protected S5CLDLHLC s5CLDLHLC;
    @XmlElement(name = "S5CLDLH_LEDSZ", required = true)
    protected S5CLDLHLEDSZ s5CLDLHLEDSZ;
    @XmlElement(name = "SLT_5_CALL_DLH_LEQMAX", required = true)
    protected SLT5CALLDLHLEQMAX slt5CALLDLHLEQMAX;
    @XmlElement(name = "S5CLDLH_LLEQMAX", required = true)
    protected S5CLDLHLLEQMAX s5CLDLHLLEQMAX;
    @XmlElement(name = "SLT_5_CALL_DLH_TYPE_FTLLISHTYPE", required = true)
    protected SLT5CALLDLHTYPEFTLLISHTYPE slt5CALLDLHTYPEFTLLISHTYPE;
    @XmlElement(name = "SLT_5_CALL_DLH_TYPE_FTLLISHID", required = true)
    protected SLT5CALLDLHTYPEFTLLISHID slt5CALLDLHTYPEFTLLISHID;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the s5CLDLHLC property.
     * 
     * @return
     *     possible object is
     *     {@link S5CLDLHLC }
     *     
     */
    public S5CLDLHLC getS5CLDLHLC() {
        return s5CLDLHLC;
    }

    /**
     * Sets the value of the s5CLDLHLC property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5CLDLHLC }
     *     
     */
    public void setS5CLDLHLC(S5CLDLHLC value) {
        this.s5CLDLHLC = value;
    }

    /**
     * Gets the value of the s5CLDLHLEDSZ property.
     * 
     * @return
     *     possible object is
     *     {@link S5CLDLHLEDSZ }
     *     
     */
    public S5CLDLHLEDSZ getS5CLDLHLEDSZ() {
        return s5CLDLHLEDSZ;
    }

    /**
     * Sets the value of the s5CLDLHLEDSZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5CLDLHLEDSZ }
     *     
     */
    public void setS5CLDLHLEDSZ(S5CLDLHLEDSZ value) {
        this.s5CLDLHLEDSZ = value;
    }

    /**
     * Gets the value of the slt5CALLDLHLEQMAX property.
     * 
     * @return
     *     possible object is
     *     {@link SLT5CALLDLHLEQMAX }
     *     
     */
    public SLT5CALLDLHLEQMAX getSLT5CALLDLHLEQMAX() {
        return slt5CALLDLHLEQMAX;
    }

    /**
     * Sets the value of the slt5CALLDLHLEQMAX property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLT5CALLDLHLEQMAX }
     *     
     */
    public void setSLT5CALLDLHLEQMAX(SLT5CALLDLHLEQMAX value) {
        this.slt5CALLDLHLEQMAX = value;
    }

    /**
     * Gets the value of the s5CLDLHLLEQMAX property.
     * 
     * @return
     *     possible object is
     *     {@link S5CLDLHLLEQMAX }
     *     
     */
    public S5CLDLHLLEQMAX getS5CLDLHLLEQMAX() {
        return s5CLDLHLLEQMAX;
    }

    /**
     * Sets the value of the s5CLDLHLLEQMAX property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5CLDLHLLEQMAX }
     *     
     */
    public void setS5CLDLHLLEQMAX(S5CLDLHLLEQMAX value) {
        this.s5CLDLHLLEQMAX = value;
    }

    /**
     * Gets the value of the slt5CALLDLHTYPEFTLLISHTYPE property.
     * 
     * @return
     *     possible object is
     *     {@link SLT5CALLDLHTYPEFTLLISHTYPE }
     *     
     */
    public SLT5CALLDLHTYPEFTLLISHTYPE getSLT5CALLDLHTYPEFTLLISHTYPE() {
        return slt5CALLDLHTYPEFTLLISHTYPE;
    }

    /**
     * Sets the value of the slt5CALLDLHTYPEFTLLISHTYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLT5CALLDLHTYPEFTLLISHTYPE }
     *     
     */
    public void setSLT5CALLDLHTYPEFTLLISHTYPE(SLT5CALLDLHTYPEFTLLISHTYPE value) {
        this.slt5CALLDLHTYPEFTLLISHTYPE = value;
    }

    /**
     * Gets the value of the slt5CALLDLHTYPEFTLLISHID property.
     * 
     * @return
     *     possible object is
     *     {@link SLT5CALLDLHTYPEFTLLISHID }
     *     
     */
    public SLT5CALLDLHTYPEFTLLISHID getSLT5CALLDLHTYPEFTLLISHID() {
        return slt5CALLDLHTYPEFTLLISHID;
    }

    /**
     * Sets the value of the slt5CALLDLHTYPEFTLLISHID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLT5CALLDLHTYPEFTLLISHID }
     *     
     */
    public void setSLT5CALLDLHTYPEFTLLISHID(SLT5CALLDLHTYPEFTLLISHID value) {
        this.slt5CALLDLHTYPEFTLLISHID = value;
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
