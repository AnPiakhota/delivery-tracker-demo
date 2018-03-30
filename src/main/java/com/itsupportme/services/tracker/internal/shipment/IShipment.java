package com.itsupportme.services.tracker.internal.shipment;

import com.itsupportme.services.communicator.model.tracking.TrackingRequest;
import com.itsupportme.services.communicator.model.tracking.TrackingResponse;

/**
 * @author Andrei Piakhota
 */
public interface IShipment {

    void update(TrackingResponse trackingResponse);
    TrackingRequest build();

}
