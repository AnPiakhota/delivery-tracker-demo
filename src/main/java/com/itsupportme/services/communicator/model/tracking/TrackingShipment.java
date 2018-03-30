package com.itsupportme.services.communicator.model.tracking;

import java.util.Calendar;
import java.util.LinkedList;

public class TrackingShipment {

    private TrackingEventType status;
    private Calendar shipDate;
    private Calendar deliveryDate;
    private String trackingNumber;
    private String trackingUID;
    private Signature signatureData;
    private LinkedList<TrackingEvent> events;

    /**
     * The value is set to true once the delivery date has been established
     */
    private boolean delivered = false;
    
    /**
     * The field is set to true once the signature has become available 
     */
    private boolean signature = false;

    /**
     * Overall status of the shipment.
     *
     * Usually this will be the same as the status of the latest {@link TrackingEvent#type}
     *
     * @return
     */
    public TrackingEventType getStatus() {
        return status;
    }

    public void setStatus(TrackingEventType status) {
        this.status = status;
    }

    /**
     * @return date this shipment was shipped
     */
    public Calendar getShipDate() {
        return shipDate;
    }

    public void setShipDate(Calendar shipDate) {
        this.shipDate = shipDate;
    }

    /**
     * @return date this shipment was delivered, or null if not delivered yet
     */
    public Calendar getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Calendar deliveryDate) {
        delivered = deliveryDate != null;
        this.deliveryDate = deliveryDate;
    }

    /**
     * @return tracking number of shipment, same as {@link TrackingRequest#trackingNumber}
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     * Optional unique identifier of the shipment.
     *
     * When multiple shipments match the same tracking number (as often happens in cases when package was rejected by
     * the receiver), an additional unique identifier may be assigned to each shipment's tracking data to distinguish
     * them.
     *
     * @return additional unique identifier of the shipment
     */
    public String getTrackingUID() {
        return trackingUID;
    }

    public void setTrackingUID(String trackingUID) {
        this.trackingUID = trackingUID;
    }

    /**
     * @return list of all tracking events that have occurred with this Shipment
     */
    public LinkedList<TrackingEvent> getEvents() {
        return events;
    }

    public void setEvents(LinkedList<TrackingEvent> events) {
        this.events = events;
    }

    /**
     * Returns signature data of this shipment.
     *
     * Some carriers accept electronic signature from the receiver which is then available thru their API. If such
     * signature image is available it should be returned here.
     *
     * @return shipment signature data, or null if no data available
     */
    public Signature getSignatureData() {
        return signatureData;
    }

    public void setSignatureData(Signature signatureData) {
        signature = signatureData != null;
        this.signatureData = signatureData;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public boolean isSignature() {
        return signature;
    }

}
