package com.itsupportme.services.tracker.launch;

/**
 * @author Andrei Piakhota
 */
public class AuthenticationException extends Exception {

	private static final long serialVersionUID = -3572119451065458104L;

	public AuthenticationException() { }

    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthenticationException(Throwable cause) {
        super(cause);
    }

    public AuthenticationException(String message, Throwable cause, 
    		boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
