package com.itsupportme.services.tracker.internal.observer;

import com.itsupportme.services.tracker.external.delegate.ServiceDelegate;
import com.itsupportme.services.tracker.internal.shipment.Shipment;

import java.util.Observable;
import java.util.Observer;
import java.util.stream.Stream;

/**
 * @author Andrei Piakhota
 */
public class FedExObserver implements Observer {

    ServiceDelegate serviceDelegate;

    @Override
    public void update(Observable observable, Object arg) {

        if (observable instanceof ObservableShipment) {

            ObservableShipment observableDelivery = (ObservableShipment) observable;
            serviceDelegate = observableDelivery.getServiceDelegate();

            Stream<Shipment> shipments = observableDelivery.getShipments();

            // TODO convert to Stream<Shipment> shipments for specific service "FEDEX";

            serviceDelegate.processFedEx(shipments);

        }

    }

}
