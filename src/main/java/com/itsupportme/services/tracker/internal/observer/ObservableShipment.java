package com.itsupportme.services.tracker.internal.observer;

import com.itsupportme.services.tracker.external.delegate.ServiceDelegate;
import com.itsupportme.services.tracker.internal.shipment.Shipment;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author Andrei Piakhota
 */
public class ObservableShipment extends Observable {

    private ServiceDelegate serviceDelegate;
    private Stream<Shipment> shipments;

    public ObservableShipment(ServiceDelegate serviceDelegate) {
        this.serviceDelegate = serviceDelegate;
    }

    public ServiceDelegate getServiceDelegate() {
        return serviceDelegate;
    }

    public Stream<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(Stream<Shipment> shipments) {
        this.shipments = shipments;
        setChanged();
        notifyObservers();
    }

}
