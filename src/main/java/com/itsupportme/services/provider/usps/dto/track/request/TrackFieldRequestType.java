
package com.itsupportme.services.provider.usps.dto.track.request;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackFieldRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackFieldRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackID" type="{}TrackIDType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="USERID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackFieldRequestType", propOrder = {
    "trackID"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-12T04:17:16+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class TrackFieldRequestType {

    @XmlElement(name = "TrackID", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-12T04:17:16+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TrackIDType trackID;
    @XmlAttribute(name = "USERID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-12T04:17:16+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String userid;

    /**
     * Gets the value of the trackID property.
     * 
     * @return
     *     possible object is
     *     {@link TrackIDType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-12T04:17:16+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TrackIDType getTrackID() {
        return trackID;
    }

    /**
     * Sets the value of the trackID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackIDType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-12T04:17:16+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTrackID(TrackIDType value) {
        this.trackID = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-12T04:17:16+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-12T04:17:16+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setUSERID(String value) {
        this.userid = value;
    }

}
