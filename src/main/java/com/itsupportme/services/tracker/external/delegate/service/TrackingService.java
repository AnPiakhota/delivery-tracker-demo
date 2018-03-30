package com.itsupportme.services.tracker.external.delegate.service;

import com.itsupportme.services.communicator.ShippingCarrier;
import com.itsupportme.services.provider.fedex.FedExDataProvider;
import com.itsupportme.services.provider.usps.USPSDataProvider;
import com.itsupportme.services.tracker.external.delegate.IService;
import com.itsupportme.services.tracker.internal.shipment.Shipment;

import java.util.stream.Stream;

/**
 * @author Andrei Piakhota
 */
public class TrackingService implements IService {

    private ShippingCarrier shippingCarrier;

    public TrackingService(ShippingCarrier shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
    }

    @Override
    public void process(Stream<Shipment> shipments) {

        shipments.forEach((shipment) -> {

            if (shippingCarrier instanceof FedExDataProvider) {

                FedExDataProvider fedExDataProvider = (FedExDataProvider) shippingCarrier;

                shipment.update(fedExDataProvider.track(shipment.build()));

                // TODO database update

            }

            if (shippingCarrier instanceof USPSDataProvider) {

                USPSDataProvider uspsDataProvider = (USPSDataProvider) shippingCarrier;

                shipment.update(uspsDataProvider.track(shipment.build()));

                // TODO database update

            }

        });

    }

}
