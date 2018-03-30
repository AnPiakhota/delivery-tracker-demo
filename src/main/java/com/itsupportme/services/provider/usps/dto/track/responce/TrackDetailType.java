
package com.itsupportme.services.provider.usps.dto.track.responce;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventTime">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="12:57 am"/>
 *               &lt;enumeration value="9:16 pm"/>
 *               &lt;enumeration value="8:01 pm"/>
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="1:06 pm"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EventDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="May 6, 2016"/>
 *               &lt;enumeration value="May 4, 2016"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Event">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Arrived at USPS Destination Facility"/>
 *               &lt;enumeration value="Arrived at USPS Origin Facility"/>
 *               &lt;enumeration value="Accepted at USPS Origin Facility"/>
 *               &lt;enumeration value="Pre-Shipment Info Sent to USPS"/>
 *               &lt;enumeration value="Shipping Label Created"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EventCity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="KANSAS CITY"/>
 *               &lt;enumeration value="TAMPA"/>
 *               &lt;enumeration value="SAINT PETERSBURG"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EventState">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="KS"/>
 *               &lt;enumeration value="FL"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EventZIPCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="66106"/>
 *               &lt;enumeration value="33605"/>
 *               &lt;enumeration value="33716"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EventCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirmName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AuthorizedAgent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeliveryAttributeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackDetailType", propOrder = {
    "eventTime",
    "eventDate",
    "event",
    "eventCity",
    "eventState",
    "eventZIPCode",
    "eventCountry",
    "firmName",
    "name",
    "authorizedAgent",
    "deliveryAttributeCode"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class TrackDetailType {

    @XmlElement(name = "EventTime", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String eventTime;
    @XmlElement(name = "EventDate", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String eventDate;
    @XmlElement(name = "Event", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String event;
    @XmlElement(name = "EventCity", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String eventCity;
    @XmlElement(name = "EventState", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String eventState;
    @XmlElement(name = "EventZIPCode", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String eventZIPCode;
    @XmlElement(name = "EventCountry", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String eventCountry;
    @XmlElement(name = "FirmName", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String firmName;
    @XmlElement(name = "Name", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlElement(name = "AuthorizedAgent", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String authorizedAgent;
    @XmlElement(name = "DeliveryAttributeCode")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String deliveryAttributeCode;

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEventTime(String value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEventDate(String value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEvent(String value) {
        this.event = value;
    }

    /**
     * Gets the value of the eventCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEventCity() {
        return eventCity;
    }

    /**
     * Sets the value of the eventCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEventCity(String value) {
        this.eventCity = value;
    }

    /**
     * Gets the value of the eventState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEventState() {
        return eventState;
    }

    /**
     * Sets the value of the eventState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEventState(String value) {
        this.eventState = value;
    }

    /**
     * Gets the value of the eventZIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEventZIPCode() {
        return eventZIPCode;
    }

    /**
     * Sets the value of the eventZIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEventZIPCode(String value) {
        this.eventZIPCode = value;
    }

    /**
     * Gets the value of the eventCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEventCountry() {
        return eventCountry;
    }

    /**
     * Sets the value of the eventCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEventCountry(String value) {
        this.eventCountry = value;
    }

    /**
     * Gets the value of the firmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getFirmName() {
        return firmName;
    }

    /**
     * Sets the value of the firmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFirmName(String value) {
        this.firmName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the authorizedAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getAuthorizedAgent() {
        return authorizedAgent;
    }

    /**
     * Sets the value of the authorizedAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAuthorizedAgent(String value) {
        this.authorizedAgent = value;
    }

    /**
     * Gets the value of the deliveryAttributeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDeliveryAttributeCode() {
        return deliveryAttributeCode;
    }

    /**
     * Sets the value of the deliveryAttributeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-05-06T04:50:19+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDeliveryAttributeCode(String value) {
        this.deliveryAttributeCode = value;
    }

}
