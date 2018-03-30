package com.itsupportme.services.communicator.model.tracking;


import com.itsupportme.services.communicator.model.ResponseStatus;

import java.util.LinkedList;

public class TrackingResponse {

    private final ResponseStatus status;
    private final LinkedList<TrackingShipment> shipments;

    public TrackingResponse(ResponseStatus status, LinkedList<TrackingShipment> shipments) {
        this.status = status;
        this.shipments = shipments;
    }

    /**
     * Overall status of the request.
     *
     * @return
     */
    public ResponseStatus getStatus() {
        return status;
    }

    /**
     * Returns tracking data for all shipments that matched the tracking number.
     *
     * If tracking information exists this list will contain a single record. However, sometimes when package is
     * rejected by recipient, it appears in the carriers system as 2 shipments with same tracking number (one for
     * delivery and second for return). In such cases the returned list will contain more than 1 shipment.
     *
     * @return tracking data for all shipments found for corresponding tracking number
     */
    public LinkedList<TrackingShipment> getShipments() {
        return shipments;
    }

}
