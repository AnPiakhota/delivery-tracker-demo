
package com.itsupportme.services.provider.usps.dto.track.responce;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackSummary" type="{}TrackSummaryType"/>
 *         &lt;element name="TrackDetail" type="{}TrackDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackInfoType", propOrder = {
    "trackSummary",
    "trackDetail"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class TrackInfoType {

    @XmlElement(name = "TrackSummary", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TrackSummaryType trackSummary;
    @XmlElement(name = "TrackDetail")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<TrackDetailType> trackDetail;
    @XmlAttribute(name = "ID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String id;

    /**
     * Gets the value of the trackSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TrackSummaryType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TrackSummaryType getTrackSummary() {
        return trackSummary;
    }

    /**
     * Sets the value of the trackSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackSummaryType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTrackSummary(TrackSummaryType value) {
        this.trackSummary = value;
    }

    /**
     * Gets the value of the trackDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackDetailType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<TrackDetailType> getTrackDetail() {
        if (trackDetail == null) {
            trackDetail = new ArrayList<TrackDetailType>();
        }
        return this.trackDetail;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setID(String value) {
        this.id = value;
    }

}
