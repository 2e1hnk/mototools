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
 *         &lt;element ref="{}RXTG_LSTCTG"/&gt;
 *         &lt;element ref="{}RXTG_LEDSZ"/&gt;
 *         &lt;element ref="{}RXTG_LEQMAX"/&gt;
 *         &lt;element ref="{}RXTG_LLEQMAX"/&gt;
 *         &lt;element ref="{}RX_TG_LIST_DLH_TYPE_FTLLISHTYPE"/&gt;
 *         &lt;element ref="{}RX_TG_LIST_DLH_TYPE_FTLLISHID"/&gt;
 *         &lt;element ref="{}RXTG_RXTGLISTALIAS"/&gt;
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
    "rxtglstctg",
    "rxtgledsz",
    "rxtgleqmax",
    "rxtglleqmax",
    "rxtglistdlhtypeftllishtype",
    "rxtglistdlhtypeftllishid",
    "rxtgrxtglistalias"
})
@XmlRootElement(name = "RX_TG_LIST_DLH_TYPE")
public class RXTGLISTDLHTYPE {

    @XmlElement(name = "RXTG_LSTCTG", required = true)
    protected RXTGLSTCTG rxtglstctg;
    @XmlElement(name = "RXTG_LEDSZ", required = true)
    protected RXTGLEDSZ rxtgledsz;
    @XmlElement(name = "RXTG_LEQMAX", required = true)
    protected RXTGLEQMAX rxtgleqmax;
    @XmlElement(name = "RXTG_LLEQMAX", required = true)
    protected RXTGLLEQMAX rxtglleqmax;
    @XmlElement(name = "RX_TG_LIST_DLH_TYPE_FTLLISHTYPE", required = true)
    protected RXTGLISTDLHTYPEFTLLISHTYPE rxtglistdlhtypeftllishtype;
    @XmlElement(name = "RX_TG_LIST_DLH_TYPE_FTLLISHID", required = true)
    protected RXTGLISTDLHTYPEFTLLISHID rxtglistdlhtypeftllishid;
    @XmlElement(name = "RXTG_RXTGLISTALIAS", required = true)
    protected RXTGRXTGLISTALIAS rxtgrxtglistalias;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the rxtglstctg property.
     * 
     * @return
     *     possible object is
     *     {@link RXTGLSTCTG }
     *     
     */
    public RXTGLSTCTG getRXTGLSTCTG() {
        return rxtglstctg;
    }

    /**
     * Sets the value of the rxtglstctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXTGLSTCTG }
     *     
     */
    public void setRXTGLSTCTG(RXTGLSTCTG value) {
        this.rxtglstctg = value;
    }

    /**
     * Gets the value of the rxtgledsz property.
     * 
     * @return
     *     possible object is
     *     {@link RXTGLEDSZ }
     *     
     */
    public RXTGLEDSZ getRXTGLEDSZ() {
        return rxtgledsz;
    }

    /**
     * Sets the value of the rxtgledsz property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXTGLEDSZ }
     *     
     */
    public void setRXTGLEDSZ(RXTGLEDSZ value) {
        this.rxtgledsz = value;
    }

    /**
     * Gets the value of the rxtgleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link RXTGLEQMAX }
     *     
     */
    public RXTGLEQMAX getRXTGLEQMAX() {
        return rxtgleqmax;
    }

    /**
     * Sets the value of the rxtgleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXTGLEQMAX }
     *     
     */
    public void setRXTGLEQMAX(RXTGLEQMAX value) {
        this.rxtgleqmax = value;
    }

    /**
     * Gets the value of the rxtglleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link RXTGLLEQMAX }
     *     
     */
    public RXTGLLEQMAX getRXTGLLEQMAX() {
        return rxtglleqmax;
    }

    /**
     * Sets the value of the rxtglleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXTGLLEQMAX }
     *     
     */
    public void setRXTGLLEQMAX(RXTGLLEQMAX value) {
        this.rxtglleqmax = value;
    }

    /**
     * Gets the value of the rxtglistdlhtypeftllishtype property.
     * 
     * @return
     *     possible object is
     *     {@link RXTGLISTDLHTYPEFTLLISHTYPE }
     *     
     */
    public RXTGLISTDLHTYPEFTLLISHTYPE getRXTGLISTDLHTYPEFTLLISHTYPE() {
        return rxtglistdlhtypeftllishtype;
    }

    /**
     * Sets the value of the rxtglistdlhtypeftllishtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXTGLISTDLHTYPEFTLLISHTYPE }
     *     
     */
    public void setRXTGLISTDLHTYPEFTLLISHTYPE(RXTGLISTDLHTYPEFTLLISHTYPE value) {
        this.rxtglistdlhtypeftllishtype = value;
    }

    /**
     * Gets the value of the rxtglistdlhtypeftllishid property.
     * 
     * @return
     *     possible object is
     *     {@link RXTGLISTDLHTYPEFTLLISHID }
     *     
     */
    public RXTGLISTDLHTYPEFTLLISHID getRXTGLISTDLHTYPEFTLLISHID() {
        return rxtglistdlhtypeftllishid;
    }

    /**
     * Sets the value of the rxtglistdlhtypeftllishid property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXTGLISTDLHTYPEFTLLISHID }
     *     
     */
    public void setRXTGLISTDLHTYPEFTLLISHID(RXTGLISTDLHTYPEFTLLISHID value) {
        this.rxtglistdlhtypeftllishid = value;
    }

    /**
     * Gets the value of the rxtgrxtglistalias property.
     * 
     * @return
     *     possible object is
     *     {@link RXTGRXTGLISTALIAS }
     *     
     */
    public RXTGRXTGLISTALIAS getRXTGRXTGLISTALIAS() {
        return rxtgrxtglistalias;
    }

    /**
     * Sets the value of the rxtgrxtglistalias property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXTGRXTGLISTALIAS }
     *     
     */
    public void setRXTGRXTGLISTALIAS(RXTGRXTGLISTALIAS value) {
        this.rxtgrxtglistalias = value;
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
