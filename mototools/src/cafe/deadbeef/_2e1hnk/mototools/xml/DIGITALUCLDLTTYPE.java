//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.30 at 11:46:48 AM GMT 
//


package cafe.deadbeef._2e1hnk.mototools.xml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}DIGITAL_UCL_DLH_TYPE"/>
 *         &lt;element ref="{}DIGITAL_UCL_DLL_TYPE" maxOccurs="unbounded"/>
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
    "digitalucldlhtype",
    "digitalucldlltype"
})
@XmlRootElement(name = "DIGITAL_UCL_DLT_TYPE")
public class DIGITALUCLDLTTYPE {

    @XmlElement(name = "DIGITAL_UCL_DLH_TYPE", required = true)
    protected DIGITALUCLDLHTYPE digitalucldlhtype;
    @XmlElement(name = "DIGITAL_UCL_DLL_TYPE", required = true)
    protected List<DIGITALUCLDLLTYPE> digitalucldlltype;
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
     * Gets the value of the digitalucldlhtype property.
     * 
     * @return
     *     possible object is
     *     {@link DIGITALUCLDLHTYPE }
     *     
     */
    public DIGITALUCLDLHTYPE getDIGITALUCLDLHTYPE() {
        return digitalucldlhtype;
    }

    /**
     * Sets the value of the digitalucldlhtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIGITALUCLDLHTYPE }
     *     
     */
    public void setDIGITALUCLDLHTYPE(DIGITALUCLDLHTYPE value) {
        this.digitalucldlhtype = value;
    }

    /**
     * Gets the value of the digitalucldlltype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digitalucldlltype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDIGITALUCLDLLTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DIGITALUCLDLLTYPE }
     * 
     * 
     */
    public List<DIGITALUCLDLLTYPE> getDIGITALUCLDLLTYPE() {
        if (digitalucldlltype == null) {
            digitalucldlltype = new ArrayList<DIGITALUCLDLLTYPE>();
        }
        return this.digitalucldlltype;
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
