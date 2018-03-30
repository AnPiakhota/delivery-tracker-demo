package com.itsupportme.services.tracker.external.delegate;

import com.itsupportme.services.tracker.internal.shipment.Shipment;

import java.util.stream.Stream;

/**
 * @author Andrei Piakhota
 */
public class ServiceDelegate {

    private ServiceLookUp lookupService = new ServiceLookUp();

    private IService service;

    public void processFedEx(Stream<Shipment> shipments){
        service = lookupService.getServiceFedEx(shipments);
        if (service != null) {
            service.process(shipments);
        }

    }

    public void processUSPS(Stream<Shipment> shipments){
        service = lookupService.getServiceUSPS(shipments);
        if (service != null) {
            service.process(shipments);
        }

    }

}
