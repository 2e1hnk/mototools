//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.30 at 11:46:48 AM GMT 
//


package cafe.deadbeef._2e1hnk.mototools.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}RADIO_SECURITY_INFO_CMP_TYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "radiosecurityinfocmptype"
})
@XmlRootElement(name = "RADIO_SECURITY_INFO_CMP_TYPE_GRP")
public class RADIOSECURITYINFOCMPTYPEGRP {

    @XmlElement(name = "RADIO_SECURITY_INFO_CMP_TYPE", required = true)
    protected RADIOSECURITYINFOCMPTYPE radiosecurityinfocmptype;

    /**
     * Gets the value of the radiosecurityinfocmptype property.
     * 
     * @return
     *     possible object is
     *     {@link RADIOSECURITYINFOCMPTYPE }
     *     
     */
    public RADIOSECURITYINFOCMPTYPE getRADIOSECURITYINFOCMPTYPE() {
        return radiosecurityinfocmptype;
    }

    /**
     * Sets the value of the radiosecurityinfocmptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link RADIOSECURITYINFOCMPTYPE }
     *     
     */
    public void setRADIOSECURITYINFOCMPTYPE(RADIOSECURITYINFOCMPTYPE value) {
        this.radiosecurityinfocmptype = value;
    }

}
