package com.itsupportme.services.communicator;

import java.util.HashMap;

/**
 * A singleton repository where utilized carriers can be registered for quick access.
 * @author Andrei Piakhota
 */
public class CarrierRepository extends HashMap<String, ShippingCarrier<?>> {

	private static final long serialVersionUID = -862958525778618161L;
	private static CarrierRepository instance = null;

    private CarrierRepository() { }

    /**
     * @return instance of the repository
     */
    public static CarrierRepository getInstance() {

        if (instance == null) {
            instance = new CarrierRepository();
        }

        return instance;
        
    }
    
}
