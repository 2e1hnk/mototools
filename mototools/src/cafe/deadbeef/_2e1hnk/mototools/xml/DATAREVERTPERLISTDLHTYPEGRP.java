//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.30 at 11:46:48 AM GMT 
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
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}DATA_REVERT_PER_LIST_DLT_TYPE"/>
 *       &lt;/sequence>
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
    "datarevertperlistdlttype"
})
@XmlRootElement(name = "DATA_REVERT_PER_LIST_DLH_TYPE_GRP")
public class DATAREVERTPERLISTDLHTYPEGRP {

    @XmlElement(name = "DATA_REVERT_PER_LIST_DLT_TYPE", required = true)
    protected DATAREVERTPERLISTDLTTYPE datarevertperlistdlttype;
    @XmlAttribute(name = "SortType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sortType;

    /**
     * Gets the value of the datarevertperlistdlttype property.
     * 
     * @return
     *     possible object is
     *     {@link DATAREVERTPERLISTDLTTYPE }
     *     
     */
    public DATAREVERTPERLISTDLTTYPE getDATAREVERTPERLISTDLTTYPE() {
        return datarevertperlistdlttype;
    }

    /**
     * Sets the value of the datarevertperlistdlttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATAREVERTPERLISTDLTTYPE }
     *     
     */
    public void setDATAREVERTPERLISTDLTTYPE(DATAREVERTPERLISTDLTTYPE value) {
        this.datarevertperlistdlttype = value;
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
