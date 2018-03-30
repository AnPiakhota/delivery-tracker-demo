package com.itsupportme.services.provider.fedex;

import com.itsupportme.services.communicator.ShippingCarrier;
import com.itsupportme.services.communicator.model.tracking.TrackingRequest;
import com.itsupportme.services.communicator.model.tracking.TrackingResponse;

/**
 * The class requests and provides data being sent from FedEx. 
 * @author Andrei Piakhota
 */
public class FedExDataProvider implements ShippingCarrier<FedExConfigurer> {

    @Override
    public void configure(FedExConfigurer config) {

    }

    @Override
    public TrackingResponse track(TrackingRequest request) {
        return null;
    }

}

