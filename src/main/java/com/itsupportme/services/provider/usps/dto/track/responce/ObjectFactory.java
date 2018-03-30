
package com.itsupportme.services.provider.usps.dto.track.responce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.itsupportme.services.provider.usps.dto package.
 * <p>An ObjectFactory allows you to construct new instances 
 * of the Java representation for XML content programmatically. 
 * The Java representation of XML content can consist of schema 
 * derived interfaces and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TrackResponse_QNAME = new QName("", "TrackResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.itsupportme.services.provider.usps.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrackResponseType }
     * 
     */
    public TrackResponseType createTrackResponseType() {
        return new TrackResponseType();
    }

    /**
     * Create an instance of {@link TrackSummaryType }
     * 
     */
    public TrackSummaryType createTrackSummaryType() {
        return new TrackSummaryType();
    }

    /**
     * Create an instance of {@link TrackDetailType }
     * 
     */
    public TrackDetailType createTrackDetailType() {
        return new TrackDetailType();
    }

    /**
     * Create an instance of {@link TrackInfoType }
     * 
     */
    public TrackInfoType createTrackInfoType() {
        return new TrackInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TrackResponse")
    public JAXBElement<TrackResponseType> createTrackResponse(TrackResponseType value) {
        return new JAXBElement<TrackResponseType>(_TrackResponse_QNAME, TrackResponseType.class, null, value);
    }

}
