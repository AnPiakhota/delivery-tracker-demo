package com.itsupportme.services.communicator.model.tracking;

import java.util.Calendar;

public class TrackingRequest {

    private final Calendar shipDate;
    private final String trackingNumber;
    private final String trackingUID;

    /**
     * Creates the request with out optional trackingUID.
     *
     * @param shipDate
     * @param trackingNumber
     *
     * @see TrackingRequest(Calendar, String, String)
     */
    public TrackingRequest(Calendar shipDate, String trackingNumber) {
        this(shipDate, trackingNumber, null);
    }

    /**
     * Creates the request with optional trackingUID.
     *
     * shipDate is required to validate that tracking data returned for a particular trackingNumber is pertinent to the
     * shipment as carriers as carriers sometimes reuse the tracking numbers after certain amount of time.
     *
     * Some carriers provide a secondary unique identifier for the tracking number, it should be passed along via
     * trackingUID, if such identifier is not required you can pass null.
     *
     * @param shipDate the date shipment was sent
     * @param trackingNumber shipment's tracking number
     * @param trackingUID additional unique identifier of the tracking number or shipment
     */
    public TrackingRequest(Calendar shipDate, String trackingNumber, String trackingUID) {
        this.shipDate = shipDate;
        this.trackingNumber = trackingNumber;
        this.trackingUID = trackingUID;
    }

    public Calendar getShipDate() {
        return shipDate;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getTrackingUID() {
        return trackingUID;
    }

}
