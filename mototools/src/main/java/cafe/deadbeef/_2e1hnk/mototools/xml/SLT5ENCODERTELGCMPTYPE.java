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
 *         &lt;element ref="{}S5ENCTELEGRAM_ENCSEQ1ITEM"/&gt;
 *         &lt;element ref="{}S5ENCTELEGRAM_ENCSEQ1ITEMTYPE"/&gt;
 *         &lt;element ref="{}S5ENCTELEGRAM_ENCSEQ1ITEMID"/&gt;
 *         &lt;element ref="{}S5ENCTELEGRAM_ENCSEQ2ITEM"/&gt;
 *         &lt;element ref="{}S5ENCTELEGRAM_ENCSEQ2ITEMTYPE"/&gt;
 *         &lt;element ref="{}S5ENCTELEGRAM_ENCSEQ2ITEMID"/&gt;
 *         &lt;element ref="{}S5ENCTELEGRAM_ENCSEQ3ITEM"/&gt;
 *         &lt;element ref="{}S5ENCTELEGRAM_ENCSEQ3ITEMTYPE"/&gt;
 *         &lt;element ref="{}S5ENCTELEGRAM_ENCSEQ3ITEMID"/&gt;
 *         &lt;element ref="{}S5ENCTELEGRAM_ACK"/&gt;
 *         &lt;element ref="{}S5ENCTELEGRAM_TELEGRAMREPEAT"/&gt;
 *         &lt;element ref="{}S5ENCTELEGRAM_SYSALIAS"/&gt;
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
    "s5ENCTELEGRAMENCSEQ1ITEM",
    "s5ENCTELEGRAMENCSEQ1ITEMTYPE",
    "s5ENCTELEGRAMENCSEQ1ITEMID",
    "s5ENCTELEGRAMENCSEQ2ITEM",
    "s5ENCTELEGRAMENCSEQ2ITEMTYPE",
    "s5ENCTELEGRAMENCSEQ2ITEMID",
    "s5ENCTELEGRAMENCSEQ3ITEM",
    "s5ENCTELEGRAMENCSEQ3ITEMTYPE",
    "s5ENCTELEGRAMENCSEQ3ITEMID",
    "s5ENCTELEGRAMACK",
    "s5ENCTELEGRAMTELEGRAMREPEAT",
    "s5ENCTELEGRAMSYSALIAS"
})
@XmlRootElement(name = "SLT_5_ENCODER_TELG_CMP_TYPE")
public class SLT5ENCODERTELGCMPTYPE {

    @XmlElement(name = "S5ENCTELEGRAM_ENCSEQ1ITEM", required = true)
    protected S5ENCTELEGRAMENCSEQ1ITEM s5ENCTELEGRAMENCSEQ1ITEM;
    @XmlElement(name = "S5ENCTELEGRAM_ENCSEQ1ITEMTYPE", required = true)
    protected S5ENCTELEGRAMENCSEQ1ITEMTYPE s5ENCTELEGRAMENCSEQ1ITEMTYPE;
    @XmlElement(name = "S5ENCTELEGRAM_ENCSEQ1ITEMID", required = true)
    protected S5ENCTELEGRAMENCSEQ1ITEMID s5ENCTELEGRAMENCSEQ1ITEMID;
    @XmlElement(name = "S5ENCTELEGRAM_ENCSEQ2ITEM", required = true)
    protected S5ENCTELEGRAMENCSEQ2ITEM s5ENCTELEGRAMENCSEQ2ITEM;
    @XmlElement(name = "S5ENCTELEGRAM_ENCSEQ2ITEMTYPE", required = true)
    protected S5ENCTELEGRAMENCSEQ2ITEMTYPE s5ENCTELEGRAMENCSEQ2ITEMTYPE;
    @XmlElement(name = "S5ENCTELEGRAM_ENCSEQ2ITEMID", required = true)
    protected S5ENCTELEGRAMENCSEQ2ITEMID s5ENCTELEGRAMENCSEQ2ITEMID;
    @XmlElement(name = "S5ENCTELEGRAM_ENCSEQ3ITEM", required = true)
    protected S5ENCTELEGRAMENCSEQ3ITEM s5ENCTELEGRAMENCSEQ3ITEM;
    @XmlElement(name = "S5ENCTELEGRAM_ENCSEQ3ITEMTYPE", required = true)
    protected S5ENCTELEGRAMENCSEQ3ITEMTYPE s5ENCTELEGRAMENCSEQ3ITEMTYPE;
    @XmlElement(name = "S5ENCTELEGRAM_ENCSEQ3ITEMID", required = true)
    protected S5ENCTELEGRAMENCSEQ3ITEMID s5ENCTELEGRAMENCSEQ3ITEMID;
    @XmlElement(name = "S5ENCTELEGRAM_ACK", required = true)
    protected S5ENCTELEGRAMACK s5ENCTELEGRAMACK;
    @XmlElement(name = "S5ENCTELEGRAM_TELEGRAMREPEAT", required = true)
    protected S5ENCTELEGRAMTELEGRAMREPEAT s5ENCTELEGRAMTELEGRAMREPEAT;
    @XmlElement(name = "S5ENCTELEGRAM_SYSALIAS", required = true)
    protected S5ENCTELEGRAMSYSALIAS s5ENCTELEGRAMSYSALIAS;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the s5ENCTELEGRAMENCSEQ1ITEM property.
     * 
     * @return
     *     possible object is
     *     {@link S5ENCTELEGRAMENCSEQ1ITEM }
     *     
     */
    public S5ENCTELEGRAMENCSEQ1ITEM getS5ENCTELEGRAMENCSEQ1ITEM() {
        return s5ENCTELEGRAMENCSEQ1ITEM;
    }

    /**
     * Sets the value of the s5ENCTELEGRAMENCSEQ1ITEM property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5ENCTELEGRAMENCSEQ1ITEM }
     *     
     */
    public void setS5ENCTELEGRAMENCSEQ1ITEM(S5ENCTELEGRAMENCSEQ1ITEM value) {
        this.s5ENCTELEGRAMENCSEQ1ITEM = value;
    }

    /**
     * Gets the value of the s5ENCTELEGRAMENCSEQ1ITEMTYPE property.
     * 
     * @return
     *     possible object is
     *     {@link S5ENCTELEGRAMENCSEQ1ITEMTYPE }
     *     
     */
    public S5ENCTELEGRAMENCSEQ1ITEMTYPE getS5ENCTELEGRAMENCSEQ1ITEMTYPE() {
        return s5ENCTELEGRAMENCSEQ1ITEMTYPE;
    }

    /**
     * Sets the value of the s5ENCTELEGRAMENCSEQ1ITEMTYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5ENCTELEGRAMENCSEQ1ITEMTYPE }
     *     
     */
    public void setS5ENCTELEGRAMENCSEQ1ITEMTYPE(S5ENCTELEGRAMENCSEQ1ITEMTYPE value) {
        this.s5ENCTELEGRAMENCSEQ1ITEMTYPE = value;
    }

    /**
     * Gets the value of the s5ENCTELEGRAMENCSEQ1ITEMID property.
     * 
     * @return
     *     possible object is
     *     {@link S5ENCTELEGRAMENCSEQ1ITEMID }
     *     
     */
    public S5ENCTELEGRAMENCSEQ1ITEMID getS5ENCTELEGRAMENCSEQ1ITEMID() {
        return s5ENCTELEGRAMENCSEQ1ITEMID;
    }

    /**
     * Sets the value of the s5ENCTELEGRAMENCSEQ1ITEMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5ENCTELEGRAMENCSEQ1ITEMID }
     *     
     */
    public void setS5ENCTELEGRAMENCSEQ1ITEMID(S5ENCTELEGRAMENCSEQ1ITEMID value) {
        this.s5ENCTELEGRAMENCSEQ1ITEMID = value;
    }

    /**
     * Gets the value of the s5ENCTELEGRAMENCSEQ2ITEM property.
     * 
     * @return
     *     possible object is
     *     {@link S5ENCTELEGRAMENCSEQ2ITEM }
     *     
     */
    public S5ENCTELEGRAMENCSEQ2ITEM getS5ENCTELEGRAMENCSEQ2ITEM() {
        return s5ENCTELEGRAMENCSEQ2ITEM;
    }

    /**
     * Sets the value of the s5ENCTELEGRAMENCSEQ2ITEM property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5ENCTELEGRAMENCSEQ2ITEM }
     *     
     */
    public void setS5ENCTELEGRAMENCSEQ2ITEM(S5ENCTELEGRAMENCSEQ2ITEM value) {
        this.s5ENCTELEGRAMENCSEQ2ITEM = value;
    }

    /**
     * Gets the value of the s5ENCTELEGRAMENCSEQ2ITEMTYPE property.
     * 
     * @return
     *     possible object is
     *     {@link S5ENCTELEGRAMENCSEQ2ITEMTYPE }
     *     
     */
    public S5ENCTELEGRAMENCSEQ2ITEMTYPE getS5ENCTELEGRAMENCSEQ2ITEMTYPE() {
        return s5ENCTELEGRAMENCSEQ2ITEMTYPE;
    }

    /**
     * Sets the value of the s5ENCTELEGRAMENCSEQ2ITEMTYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5ENCTELEGRAMENCSEQ2ITEMTYPE }
     *     
     */
    public void setS5ENCTELEGRAMENCSEQ2ITEMTYPE(S5ENCTELEGRAMENCSEQ2ITEMTYPE value) {
        this.s5ENCTELEGRAMENCSEQ2ITEMTYPE = value;
    }

    /**
     * Gets the value of the s5ENCTELEGRAMENCSEQ2ITEMID property.
     * 
     * @return
     *     possible object is
     *     {@link S5ENCTELEGRAMENCSEQ2ITEMID }
     *     
     */
    public S5ENCTELEGRAMENCSEQ2ITEMID getS5ENCTELEGRAMENCSEQ2ITEMID() {
        return s5ENCTELEGRAMENCSEQ2ITEMID;
    }

    /**
     * Sets the value of the s5ENCTELEGRAMENCSEQ2ITEMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5ENCTELEGRAMENCSEQ2ITEMID }
     *     
     */
    public void setS5ENCTELEGRAMENCSEQ2ITEMID(S5ENCTELEGRAMENCSEQ2ITEMID value) {
        this.s5ENCTELEGRAMENCSEQ2ITEMID = value;
    }

    /**
     * Gets the value of the s5ENCTELEGRAMENCSEQ3ITEM property.
     * 
     * @return
     *     possible object is
     *     {@link S5ENCTELEGRAMENCSEQ3ITEM }
     *     
     */
    public S5ENCTELEGRAMENCSEQ3ITEM getS5ENCTELEGRAMENCSEQ3ITEM() {
        return s5ENCTELEGRAMENCSEQ3ITEM;
    }

    /**
     * Sets the value of the s5ENCTELEGRAMENCSEQ3ITEM property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5ENCTELEGRAMENCSEQ3ITEM }
     *     
     */
    public void setS5ENCTELEGRAMENCSEQ3ITEM(S5ENCTELEGRAMENCSEQ3ITEM value) {
        this.s5ENCTELEGRAMENCSEQ3ITEM = value;
    }

    /**
     * Gets the value of the s5ENCTELEGRAMENCSEQ3ITEMTYPE property.
     * 
     * @return
     *     possible object is
     *     {@link S5ENCTELEGRAMENCSEQ3ITEMTYPE }
     *     
     */
    public S5ENCTELEGRAMENCSEQ3ITEMTYPE getS5ENCTELEGRAMENCSEQ3ITEMTYPE() {
        return s5ENCTELEGRAMENCSEQ3ITEMTYPE;
    }

    /**
     * Sets the value of the s5ENCTELEGRAMENCSEQ3ITEMTYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5ENCTELEGRAMENCSEQ3ITEMTYPE }
     *     
     */
    public void setS5ENCTELEGRAMENCSEQ3ITEMTYPE(S5ENCTELEGRAMENCSEQ3ITEMTYPE value) {
        this.s5ENCTELEGRAMENCSEQ3ITEMTYPE = value;
    }

    /**
     * Gets the value of the s5ENCTELEGRAMENCSEQ3ITEMID property.
     * 
     * @return
     *     possible object is
     *     {@link S5ENCTELEGRAMENCSEQ3ITEMID }
     *     
     */
    public S5ENCTELEGRAMENCSEQ3ITEMID getS5ENCTELEGRAMENCSEQ3ITEMID() {
        return s5ENCTELEGRAMENCSEQ3ITEMID;
    }

    /**
     * Sets the value of the s5ENCTELEGRAMENCSEQ3ITEMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5ENCTELEGRAMENCSEQ3ITEMID }
     *     
     */
    public void setS5ENCTELEGRAMENCSEQ3ITEMID(S5ENCTELEGRAMENCSEQ3ITEMID value) {
        this.s5ENCTELEGRAMENCSEQ3ITEMID = value;
    }

    /**
     * Gets the value of the s5ENCTELEGRAMACK property.
     * 
     * @return
     *     possible object is
     *     {@link S5ENCTELEGRAMACK }
     *     
     */
    public S5ENCTELEGRAMACK getS5ENCTELEGRAMACK() {
        return s5ENCTELEGRAMACK;
    }

    /**
     * Sets the value of the s5ENCTELEGRAMACK property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5ENCTELEGRAMACK }
     *     
     */
    public void setS5ENCTELEGRAMACK(S5ENCTELEGRAMACK value) {
        this.s5ENCTELEGRAMACK = value;
    }

    /**
     * Gets the value of the s5ENCTELEGRAMTELEGRAMREPEAT property.
     * 
     * @return
     *     possible object is
     *     {@link S5ENCTELEGRAMTELEGRAMREPEAT }
     *     
     */
    public S5ENCTELEGRAMTELEGRAMREPEAT getS5ENCTELEGRAMTELEGRAMREPEAT() {
        return s5ENCTELEGRAMTELEGRAMREPEAT;
    }

    /**
     * Sets the value of the s5ENCTELEGRAMTELEGRAMREPEAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5ENCTELEGRAMTELEGRAMREPEAT }
     *     
     */
    public void setS5ENCTELEGRAMTELEGRAMREPEAT(S5ENCTELEGRAMTELEGRAMREPEAT value) {
        this.s5ENCTELEGRAMTELEGRAMREPEAT = value;
    }

    /**
     * Gets the value of the s5ENCTELEGRAMSYSALIAS property.
     * 
     * @return
     *     possible object is
     *     {@link S5ENCTELEGRAMSYSALIAS }
     *     
     */
    public S5ENCTELEGRAMSYSALIAS getS5ENCTELEGRAMSYSALIAS() {
        return s5ENCTELEGRAMSYSALIAS;
    }

    /**
     * Sets the value of the s5ENCTELEGRAMSYSALIAS property.
     * 
     * @param value
     *     allowed object is
     *     {@link S5ENCTELEGRAMSYSALIAS }
     *     
     */
    public void setS5ENCTELEGRAMSYSALIAS(S5ENCTELEGRAMSYSALIAS value) {
        this.s5ENCTELEGRAMSYSALIAS = value;
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
