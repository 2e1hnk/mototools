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
 *         &lt;element ref="{}QCK_TXT_MSG_DLH_TYPE"/&gt;
 *         &lt;element ref="{}QCK_TXT_MSG_DLL_TYPE"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Applicable" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="ListID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="SortType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "qcktxtmsgdlhtype",
    "qcktxtmsgdlltype"
})
@XmlRootElement(name = "QCK_TXT_MSG_DLT_TYPE")
public class QCKTXTMSGDLTTYPE {

    @XmlElement(name = "QCK_TXT_MSG_DLH_TYPE", required = true)
    protected QCKTXTMSGDLHTYPE qcktxtmsgdlhtype;
    @XmlElement(name = "QCK_TXT_MSG_DLL_TYPE", required = true)
    protected QCKTXTMSGDLLTYPE qcktxtmsgdlltype;
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
     * Gets the value of the qcktxtmsgdlhtype property.
     * 
     * @return
     *     possible object is
     *     {@link QCKTXTMSGDLHTYPE }
     *     
     */
    public QCKTXTMSGDLHTYPE getQCKTXTMSGDLHTYPE() {
        return qcktxtmsgdlhtype;
    }

    /**
     * Sets the value of the qcktxtmsgdlhtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link QCKTXTMSGDLHTYPE }
     *     
     */
    public void setQCKTXTMSGDLHTYPE(QCKTXTMSGDLHTYPE value) {
        this.qcktxtmsgdlhtype = value;
    }

    /**
     * Gets the value of the qcktxtmsgdlltype property.
     * 
     * @return
     *     possible object is
     *     {@link QCKTXTMSGDLLTYPE }
     *     
     */
    public QCKTXTMSGDLLTYPE getQCKTXTMSGDLLTYPE() {
        return qcktxtmsgdlltype;
    }

    /**
     * Sets the value of the qcktxtmsgdlltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link QCKTXTMSGDLLTYPE }
     *     
     */
    public void setQCKTXTMSGDLLTYPE(QCKTXTMSGDLLTYPE value) {
        this.qcktxtmsgdlltype = value;
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
