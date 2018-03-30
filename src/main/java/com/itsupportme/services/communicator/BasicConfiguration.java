package com.itsupportme.services.communicator;

/**
 * Basic configuration class.
 * Such configuration is required by most APIs. 
 * If an implementation requires additional configuration parameters, 
 * it should be done by extending this class. 
 * This class must remain as the generic type in implementation of {@link ShippingCarrier}
 *
 * @author Andrei Piakhota
 */
public class BasicConfiguration {

    /**
     * Username is used to authenticate with the API
     */
    private String username;
    /**
     * Password is used to authenticate with the API
     */
    private String password;

    public BasicConfiguration() { }

    public BasicConfiguration(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
