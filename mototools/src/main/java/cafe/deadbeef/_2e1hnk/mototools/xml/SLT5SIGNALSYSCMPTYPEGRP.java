//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.05 at 02:22:03 PM GMT 
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
 *         &lt;element ref="{}SLT_5_SIGNAL_SYS_CMP_TYPE"/&gt;
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
    "slt5SIGNALSYSCMPTYPE"
})
@XmlRootElement(name = "SLT_5_SIGNAL_SYS_CMP_TYPE_GRP")
public class SLT5SIGNALSYSCMPTYPEGRP {

    @XmlElement(name = "SLT_5_SIGNAL_SYS_CMP_TYPE", required = true)
    protected SLT5SIGNALSYSCMPTYPE slt5SIGNALSYSCMPTYPE;
    @XmlAttribute(name = "SortType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sortType;

    /**
     * Gets the value of the slt5SIGNALSYSCMPTYPE property.
     * 
     * @return
     *     possible object is
     *     {@link SLT5SIGNALSYSCMPTYPE }
     *     
     */
    public SLT5SIGNALSYSCMPTYPE getSLT5SIGNALSYSCMPTYPE() {
        return slt5SIGNALSYSCMPTYPE;
    }

    /**
     * Sets the value of the slt5SIGNALSYSCMPTYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLT5SIGNALSYSCMPTYPE }
     *     
     */
    public void setSLT5SIGNALSYSCMPTYPE(SLT5SIGNALSYSCMPTYPE value) {
        this.slt5SIGNALSYSCMPTYPE = value;
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
