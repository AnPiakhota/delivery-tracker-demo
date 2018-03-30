package com.itsupportme.services.provider.usps;

import com.itsupportme.services.communicator.BasicConfiguration;

/**
 * @author Andrei Piakhota
 */
public class USPSConfigurer extends BasicConfiguration {

    private String userId;

    public USPSConfigurer(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

}
