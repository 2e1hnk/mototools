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
 *         &lt;element ref="{}SLT_5_CALL_DLH_TYPE"/>
 *         &lt;element ref="{}SLT_5_CALL_DLL_TYPE"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Applicable" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ListID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="SortType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "slt5CALLDLHTYPE",
    "slt5CALLDLLTYPE"
})
@XmlRootElement(name = "SLT_5_CALL_DLT_TYPE")
public class SLT5CALLDLTTYPE {

    @XmlElement(name = "SLT_5_CALL_DLH_TYPE", required = true)
    protected SLT5CALLDLHTYPE slt5CALLDLHTYPE;
    @XmlElement(name = "SLT_5_CALL_DLL_TYPE", required = true)
    protected SLT5CALLDLLTYPE slt5CALLDLLTYPE;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;
    @XmlAttribute(name = "SortType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sortType;

    /**
     * Gets the value of the slt5CALLDLHTYPE property.
     * 
     * @return
     *     possible object is
     *     {@link SLT5CALLDLHTYPE }
     *     
     */
    public SLT5CALLDLHTYPE getSLT5CALLDLHTYPE() {
        return slt5CALLDLHTYPE;
    }

    /**
     * Sets the value of the slt5CALLDLHTYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLT5CALLDLHTYPE }
     *     
     */
    public void setSLT5CALLDLHTYPE(SLT5CALLDLHTYPE value) {
        this.slt5CALLDLHTYPE = value;
    }

    /**
     * Gets the value of the slt5CALLDLLTYPE property.
     * 
     * @return
     *     possible object is
     *     {@link SLT5CALLDLLTYPE }
     *     
     */
    public SLT5CALLDLLTYPE getSLT5CALLDLLTYPE() {
        return slt5CALLDLLTYPE;
    }

    /**
     * Sets the value of the slt5CALLDLLTYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLT5CALLDLLTYPE }
     *     
     */
    public void setSLT5CALLDLLTYPE(SLT5CALLDLLTYPE value) {
        this.slt5CALLDLLTYPE = value;
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
     * Gets the value of the sortType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortType() {
        return sortType;
    }

    /**
     * Sets the value of the sortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortType(String value) {
        this.sortType = value;
    }

}
