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
 *         &lt;element ref="{}PRISVC_PKEYID"/&gt;
 *         &lt;element ref="{}PRISVC_PKEY"/&gt;
 *         &lt;element ref="{}PRISVC_PKEYIND"/&gt;
 *         &lt;element ref="{}PRISVC_PKEYALIAS"/&gt;
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
    "prisvcpkeyid",
    "prisvcpkey",
    "prisvcpkeyind",
    "prisvcpkeyalias"
})
@XmlRootElement(name = "PRIVACY_SERVICE_CMP_TYPE")
public class PRIVACYSERVICECMPTYPE {

    @XmlElement(name = "PRISVC_PKEYID", required = true)
    protected PRISVCPKEYID prisvcpkeyid;
    @XmlElement(name = "PRISVC_PKEY", required = true)
    protected PRISVCPKEY prisvcpkey;
    @XmlElement(name = "PRISVC_PKEYIND", required = true)
    protected PRISVCPKEYIND prisvcpkeyind;
    @XmlElement(name = "PRISVC_PKEYALIAS", required = true)
    protected PRISVCPKEYALIAS prisvcpkeyalias;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the prisvcpkeyid property.
     * 
     * @return
     *     possible object is
     *     {@link PRISVCPKEYID }
     *     
     */
    public PRISVCPKEYID getPRISVCPKEYID() {
        return prisvcpkeyid;
    }

    /**
     * Sets the value of the prisvcpkeyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRISVCPKEYID }
     *     
     */
    public void setPRISVCPKEYID(PRISVCPKEYID value) {
        this.prisvcpkeyid = value;
    }

    /**
     * Gets the value of the prisvcpkey property.
     * 
     * @return
     *     possible object is
     *     {@link PRISVCPKEY }
     *     
     */
    public PRISVCPKEY getPRISVCPKEY() {
        return prisvcpkey;
    }

    /**
     * Sets the value of the prisvcpkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRISVCPKEY }
     *     
     */
    public void setPRISVCPKEY(PRISVCPKEY value) {
        this.prisvcpkey = value;
    }

    /**
     * Gets the value of the prisvcpkeyind property.
     * 
     * @return
     *     possible object is
     *     {@link PRISVCPKEYIND }
     *     
     */
    public PRISVCPKEYIND getPRISVCPKEYIND() {
        return prisvcpkeyind;
    }

    /**
     * Sets the value of the prisvcpkeyind property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRISVCPKEYIND }
     *     
     */
    public void setPRISVCPKEYIND(PRISVCPKEYIND value) {
        this.prisvcpkeyind = value;
    }

    /**
     * Gets the value of the prisvcpkeyalias property.
     * 
     * @return
     *     possible object is
     *     {@link PRISVCPKEYALIAS }
     *     
     */
    public PRISVCPKEYALIAS getPRISVCPKEYALIAS() {
        return prisvcpkeyalias;
    }

    /**
     * Sets the value of the prisvcpkeyalias property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRISVCPKEYALIAS }
     *     
     */
    public void setPRISVCPKEYALIAS(PRISVCPKEYALIAS value) {
        this.prisvcpkeyalias = value;
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
