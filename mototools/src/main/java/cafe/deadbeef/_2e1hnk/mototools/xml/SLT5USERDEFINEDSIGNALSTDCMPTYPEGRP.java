//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.05 at 02:22:03 PM GMT 
//


package cafe.deadbeef._2e1hnk.mototools.xml;

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
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}SLT_5_USER_DEFINED_SIGNAL_STD_CMP_TYPE" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
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
    "slt5USERDEFINEDSIGNALSTDCMPTYPE"
})
@XmlRootElement(name = "SLT_5_USER_DEFINED_SIGNAL_STD_CMP_TYPE_GRP")
public class SLT5USERDEFINEDSIGNALSTDCMPTYPEGRP {

    @XmlElement(name = "SLT_5_USER_DEFINED_SIGNAL_STD_CMP_TYPE", required = true)
    protected List<SLT5USERDEFINEDSIGNALSTDCMPTYPE> slt5USERDEFINEDSIGNALSTDCMPTYPE;
    @XmlAttribute(name = "SortType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sortType;

    /**
     * Gets the value of the slt5USERDEFINEDSIGNALSTDCMPTYPE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slt5USERDEFINEDSIGNALSTDCMPTYPE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSLT5USERDEFINEDSIGNALSTDCMPTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SLT5USERDEFINEDSIGNALSTDCMPTYPE }
     * 
     * 
     */
    public List<SLT5USERDEFINEDSIGNALSTDCMPTYPE> getSLT5USERDEFINEDSIGNALSTDCMPTYPE() {
        if (slt5USERDEFINEDSIGNALSTDCMPTYPE == null) {
            slt5USERDEFINEDSIGNALSTDCMPTYPE = new ArrayList<SLT5USERDEFINEDSIGNALSTDCMPTYPE>();
        }
        return this.slt5USERDEFINEDSIGNALSTDCMPTYPE;
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
