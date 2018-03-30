package com.itsupportme.services.tracker.external.delegate.service;

import com.itsupportme.services.communicator.BasicConfiguration;
import com.itsupportme.services.communicator.ShippingCarrier;
import com.itsupportme.services.provider.fedex.FedExDataProvider;
import com.itsupportme.services.provider.usps.USPSDataProvider;
import com.itsupportme.services.tracker.external.delegate.IService;
import com.itsupportme.services.tracker.internal.shipment.Shipment;

import java.util.stream.Stream;

/**
 * @author Andrei Piakhota
 */
public class ProofDeliveryService implements IService {

    private ShippingCarrier<BasicConfiguration> shippingCarrier;

    public ProofDeliveryService(ShippingCarrier shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
    }


    @Override
    public void process(Stream<Shipment> queue) {

        if ("".equalsIgnoreCase("FedEx")) {
        	
            FedExDataProvider fedExDataProvider = new FedExDataProvider();
            // TODO database update

        }

        if ("".equalsIgnoreCase("USPS")) {
        	
            USPSDataProvider carrierDataProvider = new USPSDataProvider();
            // TODO database update

        }

    }

}
