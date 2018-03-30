
package com.itsupportme.services.provider.usps.dto.track.responce;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackInfo" type="{}TrackInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackResponseType", propOrder = {
    "trackInfo"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class TrackResponseType {

    @XmlElement(name = "TrackInfo", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TrackInfoType trackInfo;

    /**
     * Gets the value of the trackInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrackInfoType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TrackInfoType getTrackInfo() {
        return trackInfo;
    }

    /**
     * Sets the value of the trackInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackInfoType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTrackInfo(TrackInfoType value) {
        this.trackInfo = value;
    }

}
