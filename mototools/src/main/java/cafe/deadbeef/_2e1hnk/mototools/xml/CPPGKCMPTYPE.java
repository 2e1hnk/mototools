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
 *         &lt;element ref="{}PGK_KYMDTY"/&gt;
 *         &lt;element ref="{}PGK_UCLITEM"/&gt;
 *         &lt;element ref="{}PGK_UCLITEMTYPE"/&gt;
 *         &lt;element ref="{}PGK_UCLITEMID"/&gt;
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
    "pgkkymdty",
    "pgkuclitem",
    "pgkuclitemtype",
    "pgkuclitemid"
})
@XmlRootElement(name = "CP_PGK_CMP_TYPE")
public class CPPGKCMPTYPE {

    @XmlElement(name = "PGK_KYMDTY", required = true)
    protected PGKKYMDTY pgkkymdty;
    @XmlElement(name = "PGK_UCLITEM", required = true)
    protected PGKUCLITEM pgkuclitem;
    @XmlElement(name = "PGK_UCLITEMTYPE", required = true)
    protected PGKUCLITEMTYPE pgkuclitemtype;
    @XmlElement(name = "PGK_UCLITEMID", required = true)
    protected PGKUCLITEMID pgkuclitemid;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the pgkkymdty property.
     * 
     * @return
     *     possible object is
     *     {@link PGKKYMDTY }
     *     
     */
    public PGKKYMDTY getPGKKYMDTY() {
        return pgkkymdty;
    }

    /**
     * Sets the value of the pgkkymdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PGKKYMDTY }
     *     
     */
    public void setPGKKYMDTY(PGKKYMDTY value) {
        this.pgkkymdty = value;
    }

    /**
     * Gets the value of the pgkuclitem property.
     * 
     * @return
     *     possible object is
     *     {@link PGKUCLITEM }
     *     
     */
    public PGKUCLITEM getPGKUCLITEM() {
        return pgkuclitem;
    }

    /**
     * Sets the value of the pgkuclitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PGKUCLITEM }
     *     
     */
    public void setPGKUCLITEM(PGKUCLITEM value) {
        this.pgkuclitem = value;
    }

    /**
     * Gets the value of the pgkuclitemtype property.
     * 
     * @return
     *     possible object is
     *     {@link PGKUCLITEMTYPE }
     *     
     */
    public PGKUCLITEMTYPE getPGKUCLITEMTYPE() {
        return pgkuclitemtype;
    }

    /**
     * Sets the value of the pgkuclitemtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link PGKUCLITEMTYPE }
     *     
     */
    public void setPGKUCLITEMTYPE(PGKUCLITEMTYPE value) {
        this.pgkuclitemtype = value;
    }

    /**
     * Gets the value of the pgkuclitemid property.
     * 
     * @return
     *     possible object is
     *     {@link PGKUCLITEMID }
     *     
     */
    public PGKUCLITEMID getPGKUCLITEMID() {
        return pgkuclitemid;
    }

    /**
     * Sets the value of the pgkuclitemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PGKUCLITEMID }
     *     
     */
    public void setPGKUCLITEMID(PGKUCLITEMID value) {
        this.pgkuclitemid = value;
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
