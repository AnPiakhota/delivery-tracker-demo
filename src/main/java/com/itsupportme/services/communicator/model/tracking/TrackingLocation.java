package com.itsupportme.services.communicator.model.tracking;

public class TrackingLocation {

    private TrackingLocationType locationType;
    private String city;
    private String state;
    private String zip;
    private String country;

    public TrackingLocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(TrackingLocationType locationType) {
        this.locationType = locationType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return 2 letter state abbreviation
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state 2 letter state abbreviation
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return 5 digit zip code
     */
    public String getZip() {
        return zip;
    }

    /**
     *
     * @param zip 5 digit zip code
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
