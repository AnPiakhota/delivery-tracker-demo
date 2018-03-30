/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itsupportme.services.communicator;

import com.itsupportme.services.communicator.model.tracking.TrackingRequest;
import com.itsupportme.services.communicator.model.tracking.TrackingResponse;

/**
 *
 * The implementing class must specify the generic <code>T</code>.
 * 
 * @author Andrei Piakhota
 * @param <T> the type expected in configure function
 */
public interface ShippingCarrier<T extends BasicConfiguration> {

    /**
     * Configures the carrier implementation.
     * 
     * @param config the configuration container
     */
    void configure(T config);

    /**
     * Requests tracking data from the carrier and returns the results.
     *
     * @param request request data required to perform the query
     * @return TrackingResponse
     */
    TrackingResponse track(TrackingRequest request);

}
