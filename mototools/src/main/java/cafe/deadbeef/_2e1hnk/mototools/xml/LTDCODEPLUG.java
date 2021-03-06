//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.07 at 05:56:42 PM GMT 
//


package cafe.deadbeef._2e1hnk.mototools.xml;

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
 *         &lt;element ref="{}SECURITY_PARTITION"/&gt;
 *         &lt;element ref="{}APP_PARTITION"/&gt;
 *         &lt;element ref="{}CS_PARTITION"/&gt;
 *         &lt;element ref="{}CS_LANGPACK_PARTITION"/&gt;
 *         &lt;element ref="{}CS_TTSLANGPACK_PARTITION"/&gt;
 *         &lt;element ref="{}FILE_DATA"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="VERSION" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "securitypartition",
    "apppartition",
    "cspartition",
    "cslangpackpartition",
    "csttslangpackpartition",
    "filedata"
})
@XmlRootElement(name = "LTD_CODEPLUG")
public class LTDCODEPLUG {

    @XmlElement(name = "SECURITY_PARTITION", required = true)
    protected SECURITYPARTITION securitypartition;
    @XmlElement(name = "APP_PARTITION", required = true)
    protected APPPARTITION apppartition;
    @XmlElement(name = "CS_PARTITION", required = true)
    protected CSPARTITION cspartition;
    @XmlElement(name = "CS_LANGPACK_PARTITION", required = true)
    protected CSLANGPACKPARTITION cslangpackpartition;
    @XmlElement(name = "CS_TTSLANGPACK_PARTITION", required = true)
    protected CSTTSLANGPACKPARTITION csttslangpackpartition;
    @XmlElement(name = "FILE_DATA", required = true)
    protected FILEDATA filedata;
    @XmlAttribute(name = "VERSION", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String version;

    /**
     * Gets the value of the securitypartition property.
     * 
     * @return
     *     possible object is
     *     {@link SECURITYPARTITION }
     *     
     */
    public SECURITYPARTITION getSECURITYPARTITION() {
        return securitypartition;
    }

    /**
     * Sets the value of the securitypartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECURITYPARTITION }
     *     
     */
    public void setSECURITYPARTITION(SECURITYPARTITION value) {
        this.securitypartition = value;
    }

    /**
     * Gets the value of the apppartition property.
     * 
     * @return
     *     possible object is
     *     {@link APPPARTITION }
     *     
     */
    public APPPARTITION getAPPPARTITION() {
        return apppartition;
    }

    /**
     * Sets the value of the apppartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPPARTITION }
     *     
     */
    public void setAPPPARTITION(APPPARTITION value) {
        this.apppartition = value;
    }

    /**
     * Gets the value of the cspartition property.
     * 
     * @return
     *     possible object is
     *     {@link CSPARTITION }
     *     
     */
    public CSPARTITION getCSPARTITION() {
        return cspartition;
    }

    /**
     * Sets the value of the cspartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSPARTITION }
     *     
     */
    public void setCSPARTITION(CSPARTITION value) {
        this.cspartition = value;
    }

    /**
     * Gets the value of the cslangpackpartition property.
     * 
     * @return
     *     possible object is
     *     {@link CSLANGPACKPARTITION }
     *     
     */
    public CSLANGPACKPARTITION getCSLANGPACKPARTITION() {
        return cslangpackpartition;
    }

    /**
     * Sets the value of the cslangpackpartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSLANGPACKPARTITION }
     *     
     */
    public void setCSLANGPACKPARTITION(CSLANGPACKPARTITION value) {
        this.cslangpackpartition = value;
    }

    /**
     * Gets the value of the csttslangpackpartition property.
     * 
     * @return
     *     possible object is
     *     {@link CSTTSLANGPACKPARTITION }
     *     
     */
    public CSTTSLANGPACKPARTITION getCSTTSLANGPACKPARTITION() {
        return csttslangpackpartition;
    }

    /**
     * Sets the value of the csttslangpackpartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSTTSLANGPACKPARTITION }
     *     
     */
    public void setCSTTSLANGPACKPARTITION(CSTTSLANGPACKPARTITION value) {
        this.csttslangpackpartition = value;
    }

    /**
     * Gets the value of the filedata property.
     * 
     * @return
     *     possible object is
     *     {@link FILEDATA }
     *     
     */
    public FILEDATA getFILEDATA() {
        return filedata;
    }

    /**
     * Sets the value of the filedata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FILEDATA }
     *     
     */
    public void setFILEDATA(FILEDATA value) {
        this.filedata = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERSION() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERSION(String value) {
        this.version = value;
    }

}
