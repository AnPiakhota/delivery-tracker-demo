package com.itsupportme.services.communicator.model.tracking;

import java.util.Date;

public class TrackingEvent {

    private Date timestamp;
    private TrackingEventType type;
    private String description;
    private String exceptionCode;
    private String exceptionDescription;
    private TrackingLocation location;

    /**
     * @return the date and time when the event occurred
     */
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return type of the event
     */
    public TrackingEventType getType() {
        return type;
    }

    public void setType(TrackingEventType type) {
        this.type = type;
    }

    /**
     * Optional.
     *
     * @return additional description of the <code>type</code>
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * If event is an exception it may contain an optional code.
     *
     * @return carrier specific code of the exception
     */
    public String getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    /**
     * Optional description of <code>exceptionCode</code>
     *
     * @return description of <code>exceptionCode</code>
     */
    public String getExceptionDescription() {
        return exceptionDescription;
    }

    public void setExceptionDescription(String exceptionDescription) {
        this.exceptionDescription = exceptionDescription;
    }

    /**
     * Optional event location.
     *
     * If the event is associated with a specific location, this will contain the details of that location
     *
     * @return location details associated with the event
     */
    public TrackingLocation getLocation() {
        return location;
    }

    public void setLocation(TrackingLocation location) {
        this.location = location;
    }

}
