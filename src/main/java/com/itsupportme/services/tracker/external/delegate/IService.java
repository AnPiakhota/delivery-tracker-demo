package com.itsupportme.services.tracker.external.delegate;

import com.itsupportme.services.tracker.internal.shipment.Shipment;

import java.util.stream.Stream;

/**
 * @author Andrei Piakhota
 */
public interface IService {

    void process(Stream<Shipment> shipments);

}






