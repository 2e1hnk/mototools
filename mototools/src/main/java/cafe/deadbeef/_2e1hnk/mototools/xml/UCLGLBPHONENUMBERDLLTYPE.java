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
 *         &lt;element ref="{}UCL_GLB_PHONE_NUMBER_DLL_TYPE_NTLLISHTYPE"/&gt;
 *         &lt;element ref="{}UCL_GLB_PHONE_NUMBER_DLL_TYPE_NTLLISHID"/&gt;
 *         &lt;element ref="{}PU_LLEQ"/&gt;
 *         &lt;element ref="{}PU_OTCF"/&gt;
 *         &lt;element ref="{}PHNUCLELL_CALLID"/&gt;
 *         &lt;element ref="{}PHNUCLELL_CALLALIAS"/&gt;
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
    "uclglbphonenumberdlltypentllishtype",
    "uclglbphonenumberdlltypentllishid",
    "pulleq",
    "puotcf",
    "phnuclellcallid",
    "phnuclellcallalias"
})
@XmlRootElement(name = "UCL_GLB_PHONE_NUMBER_DLL_TYPE")
public class UCLGLBPHONENUMBERDLLTYPE {

    @XmlElement(name = "UCL_GLB_PHONE_NUMBER_DLL_TYPE_NTLLISHTYPE", required = true)
    protected UCLGLBPHONENUMBERDLLTYPENTLLISHTYPE uclglbphonenumberdlltypentllishtype;
    @XmlElement(name = "UCL_GLB_PHONE_NUMBER_DLL_TYPE_NTLLISHID", required = true)
    protected UCLGLBPHONENUMBERDLLTYPENTLLISHID uclglbphonenumberdlltypentllishid;
    @XmlElement(name = "PU_LLEQ", required = true)
    protected PULLEQ pulleq;
    @XmlElement(name = "PU_OTCF", required = true)
    protected PUOTCF puotcf;
    @XmlElement(name = "PHNUCLELL_CALLID", required = true)
    protected PHNUCLELLCALLID phnuclellcallid;
    @XmlElement(name = "PHNUCLELL_CALLALIAS", required = true)
    protected PHNUCLELLCALLALIAS phnuclellcallalias;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;
    @XmlAttribute(name = "ListLetID", required = true)
    protected BigInteger listLetID;

    /**
     * Gets the value of the uclglbphonenumberdlltypentllishtype property.
     * 
     * @return
     *     possible object is
     *     {@link UCLGLBPHONENUMBERDLLTYPENTLLISHTYPE }
     *     
     */
    public UCLGLBPHONENUMBERDLLTYPENTLLISHTYPE getUCLGLBPHONENUMBERDLLTYPENTLLISHTYPE() {
        return uclglbphonenumberdlltypentllishtype;
    }

    /**
     * Sets the value of the uclglbphonenumberdlltypentllishtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCLGLBPHONENUMBERDLLTYPENTLLISHTYPE }
     *     
     */
    public void setUCLGLBPHONENUMBERDLLTYPENTLLISHTYPE(UCLGLBPHONENUMBERDLLTYPENTLLISHTYPE value) {
        this.uclglbphonenumberdlltypentllishtype = value;
    }

    /**
     * Gets the value of the uclglbphonenumberdlltypentllishid property.
     * 
     * @return
     *     possible object is
     *     {@link UCLGLBPHONENUMBERDLLTYPENTLLISHID }
     *     
     */
    public UCLGLBPHONENUMBERDLLTYPENTLLISHID getUCLGLBPHONENUMBERDLLTYPENTLLISHID() {
        return uclglbphonenumberdlltypentllishid;
    }

    /**
     * Sets the value of the uclglbphonenumberdlltypentllishid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCLGLBPHONENUMBERDLLTYPENTLLISHID }
     *     
     */
    public void setUCLGLBPHONENUMBERDLLTYPENTLLISHID(UCLGLBPHONENUMBERDLLTYPENTLLISHID value) {
        this.uclglbphonenumberdlltypentllishid = value;
    }

    /**
     * Gets the value of the pulleq property.
     * 
     * @return
     *     possible object is
     *     {@link PULLEQ }
     *     
     */
    public PULLEQ getPULLEQ() {
        return pulleq;
    }

    /**
     * Sets the value of the pulleq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PULLEQ }
     *     
     */
    public void setPULLEQ(PULLEQ value) {
        this.pulleq = value;
    }

    /**
     * Gets the value of the puotcf property.
     * 
     * @return
     *     possible object is
     *     {@link PUOTCF }
     *     
     */
    public PUOTCF getPUOTCF() {
        return puotcf;
    }

    /**
     * Sets the value of the puotcf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PUOTCF }
     *     
     */
    public void setPUOTCF(PUOTCF value) {
        this.puotcf = value;
    }

    /**
     * Gets the value of the phnuclellcallid property.
     * 
     * @return
     *     possible object is
     *     {@link PHNUCLELLCALLID }
     *     
     */
    public PHNUCLELLCALLID getPHNUCLELLCALLID() {
        return phnuclellcallid;
    }

    /**
     * Sets the value of the phnuclellcallid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PHNUCLELLCALLID }
     *     
     */
    public void setPHNUCLELLCALLID(PHNUCLELLCALLID value) {
        this.phnuclellcallid = value;
    }

    /**
     * Gets the value of the phnuclellcallalias property.
     * 
     * @return
     *     possible object is
     *     {@link PHNUCLELLCALLALIAS }
     *     
     */
    public PHNUCLELLCALLALIAS getPHNUCLELLCALLALIAS() {
        return phnuclellcallalias;
    }

    /**
     * Sets the value of the phnuclellcallalias property.
     * 
     * @param value
     *     allowed object is
     *     {@link PHNUCLELLCALLALIAS }
     *     
     */
    public void setPHNUCLELLCALLALIAS(PHNUCLELLCALLALIAS value) {
        this.phnuclellcallalias = value;
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
