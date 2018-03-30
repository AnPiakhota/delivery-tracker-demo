package com.itsupportme.services.communicator.model;

/**
 * Indicates the overall status of the request/response.
 *
 * If request was accepted and processed by the carrier and results were obtained the <code>success</code> should be
 * true.
 * <br>
 * <br>
 * Some example when this should indicate failure are:
 * <ul>
 * <li>Network error occurred</li>
 * <li>Authentication error occurred</li>
 * </ul>
 *
 * If carrier could not find tracking number it should not be considered a request failure. In such case the request
 * should still indicate success, and {@link TrackingEventType#NOT_FOUND} status should be used in the {@link
 * TrackingShipment#status}
 *
 * @author Andrei Piakhota
 */
public class ResponseStatus {

    private final boolean success;
    private final String message;

    /**
     * @param success true if request was successfully processed
     * @param message message describing the status, mostly to provide indication for failure
     */
    public ResponseStatus(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

}
