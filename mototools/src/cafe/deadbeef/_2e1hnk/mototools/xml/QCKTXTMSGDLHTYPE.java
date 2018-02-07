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
 *         &lt;element ref="{}QTMSG_LSTCTG"/>
 *         &lt;element ref="{}QTMSG_LEDSZ"/>
 *         &lt;element ref="{}QTMSG_LEQMAX"/>
 *         &lt;element ref="{}QTMSG_LLEQMAX"/>
 *         &lt;element ref="{}QCK_TXT_MSG_DLH_TYPE_FTLLISHTYPE"/>
 *         &lt;element ref="{}QCK_TXT_MSG_DLH_TYPE_FTLLISHID"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Applicable" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ListID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "qtmsglstctg",
    "qtmsgledsz",
    "qtmsgleqmax",
    "qtmsglleqmax",
    "qcktxtmsgdlhtypeftllishtype",
    "qcktxtmsgdlhtypeftllishid"
})
@XmlRootElement(name = "QCK_TXT_MSG_DLH_TYPE")
public class QCKTXTMSGDLHTYPE {

    @XmlElement(name = "QTMSG_LSTCTG", required = true)
    protected QTMSGLSTCTG qtmsglstctg;
    @XmlElement(name = "QTMSG_LEDSZ", required = true)
    protected QTMSGLEDSZ qtmsgledsz;
    @XmlElement(name = "QTMSG_LEQMAX", required = true)
    protected QTMSGLEQMAX qtmsgleqmax;
    @XmlElement(name = "QTMSG_LLEQMAX", required = true)
    protected QTMSGLLEQMAX qtmsglleqmax;
    @XmlElement(name = "QCK_TXT_MSG_DLH_TYPE_FTLLISHTYPE", required = true)
    protected QCKTXTMSGDLHTYPEFTLLISHTYPE qcktxtmsgdlhtypeftllishtype;
    @XmlElement(name = "QCK_TXT_MSG_DLH_TYPE_FTLLISHID", required = true)
    protected QCKTXTMSGDLHTYPEFTLLISHID qcktxtmsgdlhtypeftllishid;
    @XmlAttribute(name = "Applicable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String applicable;
    @XmlAttribute(name = "ListID", required = true)
    protected BigInteger listID;

    /**
     * Gets the value of the qtmsglstctg property.
     * 
     * @return
     *     possible object is
     *     {@link QTMSGLSTCTG }
     *     
     */
    public QTMSGLSTCTG getQTMSGLSTCTG() {
        return qtmsglstctg;
    }

    /**
     * Sets the value of the qtmsglstctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTMSGLSTCTG }
     *     
     */
    public void setQTMSGLSTCTG(QTMSGLSTCTG value) {
        this.qtmsglstctg = value;
    }

    /**
     * Gets the value of the qtmsgledsz property.
     * 
     * @return
     *     possible object is
     *     {@link QTMSGLEDSZ }
     *     
     */
    public QTMSGLEDSZ getQTMSGLEDSZ() {
        return qtmsgledsz;
    }

    /**
     * Sets the value of the qtmsgledsz property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTMSGLEDSZ }
     *     
     */
    public void setQTMSGLEDSZ(QTMSGLEDSZ value) {
        this.qtmsgledsz = value;
    }

    /**
     * Gets the value of the qtmsgleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link QTMSGLEQMAX }
     *     
     */
    public QTMSGLEQMAX getQTMSGLEQMAX() {
        return qtmsgleqmax;
    }

    /**
     * Sets the value of the qtmsgleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTMSGLEQMAX }
     *     
     */
    public void setQTMSGLEQMAX(QTMSGLEQMAX value) {
        this.qtmsgleqmax = value;
    }

    /**
     * Gets the value of the qtmsglleqmax property.
     * 
     * @return
     *     possible object is
     *     {@link QTMSGLLEQMAX }
     *     
     */
    public QTMSGLLEQMAX getQTMSGLLEQMAX() {
        return qtmsglleqmax;
    }

    /**
     * Sets the value of the qtmsglleqmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTMSGLLEQMAX }
     *     
     */
    public void setQTMSGLLEQMAX(QTMSGLLEQMAX value) {
        this.qtmsglleqmax = value;
    }

    /**
     * Gets the value of the qcktxtmsgdlhtypeftllishtype property.
     * 
     * @return
     *     possible object is
     *     {@link QCKTXTMSGDLHTYPEFTLLISHTYPE }
     *     
     */
    public QCKTXTMSGDLHTYPEFTLLISHTYPE getQCKTXTMSGDLHTYPEFTLLISHTYPE() {
        return qcktxtmsgdlhtypeftllishtype;
    }

    /**
     * Sets the value of the qcktxtmsgdlhtypeftllishtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link QCKTXTMSGDLHTYPEFTLLISHTYPE }
     *     
     */
    public void setQCKTXTMSGDLHTYPEFTLLISHTYPE(QCKTXTMSGDLHTYPEFTLLISHTYPE value) {
        this.qcktxtmsgdlhtypeftllishtype = value;
    }

    /**
     * Gets the value of the qcktxtmsgdlhtypeftllishid property.
     * 
     * @return
     *     possible object is
     *     {@link QCKTXTMSGDLHTYPEFTLLISHID }
     *     
     */
    public QCKTXTMSGDLHTYPEFTLLISHID getQCKTXTMSGDLHTYPEFTLLISHID() {
        return qcktxtmsgdlhtypeftllishid;
    }

    /**
     * Sets the value of the qcktxtmsgdlhtypeftllishid property.
     * 
     * @param value
     *     allowed object is
     *     {@link QCKTXTMSGDLHTYPEFTLLISHID }
     *     
     */
    public void setQCKTXTMSGDLHTYPEFTLLISHID(QCKTXTMSGDLHTYPEFTLLISHID value) {
        this.qcktxtmsgdlhtypeftllishid = value;
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
