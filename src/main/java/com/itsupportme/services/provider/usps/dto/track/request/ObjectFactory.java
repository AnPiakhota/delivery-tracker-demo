
package com.itsupportme.services.provider.usps.dto.track.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.itsupportme.services.provider.usps.dto.track.request package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TrackFieldRequest_QNAME = new QName("", "TrackFieldRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema 
     * derived classes for package: com.itsupportme.services.provider.usps.dto.track.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrackFieldRequestType }
     * 
     */
    public TrackFieldRequestType createTrackFieldRequestType() {
        return new TrackFieldRequestType();
    }

    /**
     * Create an instance of {@link TrackIDType }
     * 
     */
    public TrackIDType createTrackIDType() {
        return new TrackIDType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackFieldRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TrackFieldRequest")
    public JAXBElement<TrackFieldRequestType> createTrackFieldRequest(TrackFieldRequestType value) {
        return new JAXBElement<TrackFieldRequestType>(_TrackFieldRequest_QNAME, TrackFieldRequestType.class, null, value);
    }

}
