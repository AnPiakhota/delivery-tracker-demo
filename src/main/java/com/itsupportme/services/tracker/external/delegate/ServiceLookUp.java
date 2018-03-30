package com.itsupportme.services.tracker.external.delegate;

import com.itsupportme.services.communicator.CarrierRepository;
import com.itsupportme.services.communicator.ShippingCarrier;
import com.itsupportme.services.provider.fedex.FedExConfigurer;
import com.itsupportme.services.provider.fedex.FedExDataProvider;
import com.itsupportme.services.provider.usps.USPSConfigurer;
import com.itsupportme.services.provider.usps.USPSDataProvider;
import com.itsupportme.services.tracker.external.delegate.service.TrackingService;
import com.itsupportme.services.tracker.external.delegate.service.ProofDeliveryService;
import com.itsupportme.services.tracker.internal.shipment.Shipment;

import java.util.stream.Stream;

/**
 * @author Andrei Piakhota
 */
public class ServiceLookUp {

    CarrierRepository carrierRepository = CarrierRepository.getInstance();

    public static final String FEDEX_DATA_PROVIDER = "FedExDataProvider";
    public static final String USPS_DATA_PROVIDER = "USPSDataProvider";

    public IService getServiceFedEx(Stream<Shipment> shipments) {

        if (!carrierRepository.containsKey(FEDEX_DATA_PROVIDER)) {

            ShippingCarrier<FedExConfigurer> shippingCarrier = new FedExDataProvider();

            /* Configuration - Go */
            ServiceAuthentication.FedExAuthentication fedExAuth = new ServiceAuthentication.FedExAuthentication();
            FedExConfigurer configurer = new FedExConfigurer();

            // TODO

            shippingCarrier.configure(configurer);
            /* Configuration - End */

            carrierRepository.put(FEDEX_DATA_PROVIDER, shippingCarrier);

        }

        // TODO check shipments for type of service

        if ("tracking service" != null) {

            return new TrackingService(carrierRepository.get(FEDEX_DATA_PROVIDER));

        }

        if ("proof of delivery service" != null) {

            return new ProofDeliveryService(carrierRepository.get(FEDEX_DATA_PROVIDER));

        }

        return null;

    }

    public IService getServiceUSPS(Stream<Shipment> shipments) {

        if (!carrierRepository.containsKey(USPS_DATA_PROVIDER)) {

            ShippingCarrier<USPSConfigurer> shippingCarrier = new USPSDataProvider();

            /* Configuration - Go */
            ServiceAuthentication.USPSAuthentication uspsAuth = new ServiceAuthentication.USPSAuthentication();
            USPSConfigurer configurer = new USPSConfigurer(uspsAuth.getUserId());

            // TODO

            shippingCarrier.configure(configurer);
            /* Configuration - End */

            carrierRepository.put(USPS_DATA_PROVIDER, shippingCarrier);

        }

        // TODO check shipments for type of service

        if ("tracking service" != null) {

            return new TrackingService(carrierRepository.get(USPS_DATA_PROVIDER));

        }
        
        if ("proof of delivery service" != null) {

            return new ProofDeliveryService(carrierRepository.get(USPS_DATA_PROVIDER));

        }

        return null;
    }

}

