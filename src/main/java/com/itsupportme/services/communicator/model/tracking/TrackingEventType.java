package com.itsupportme.services.communicator.model.tracking;

public enum TrackingEventType {

    UNKNOWN("Unknown"), //fedex UN
    NOT_FOUND("No information available for this tracking number"), //fedex ND
    INFO("Shipment info sent to Carrier"), //fedex OC
    PICKUP("Picked up"), //fedex PU
    DROP_OFF("Tendered at local Carrier facility"), //fedex AF
    IN_POSSESSION("In Carrier possession"), //fedex IP
    ARRIVED("Arrived at Carrier Location"), //fedex AR
    DEPARTED("Departed Carrier location"), //fedex DP
    DESTINATION("At Carrier destination facility"), //fedex FD
    OTHER_CARRIER_INFO("Shipment info sent to other Carrier"), //fedex OX
    OTHER_CARRIER_ARRIVED("At other Carrier Facility"), //fedex AX
    EXCEPTION("Delivery Exception"), //fedex DE
    TRANSIT("In transit"), //fedex IT
    DELIVERING_NOW("Out for delivery"), //fedex OD
    DELIVERED("Delivered"), //fedex DL,
    RETURN_TO_SENDER("Returning package to sender"), //fedex RS
    HOLD_FOR_PICKUP("Held at Carrier facility for recipient pickup"), //fedx HP
    HOLD_ACCEPTED("Hold at Carrier facility request accepted"), //fedex HA
    HOLD_REQUEST("Hold at Carrier facility request received"), //fedex RR
    ERROR("Error"); //fedex ER, SE

    private String description;

    private TrackingEventType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
}
