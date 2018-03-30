package com.itsupportme.services.tracker.launch;

import net.pingtool.modules.db.SQLControl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Andrei Piakhota
 */
public abstract class CarrierAuthenticator {

    private Class<?> connection;

    public CarrierAuthenticator(Class<?> connection) {
        this.connection = connection;
    }

    /**
     * The method creates authenticator for corresponded provider.
     */
    protected abstract void authenticate() throws AuthenticationException;

    protected final SQLControl getSqlConnection() {
    	
        if (connection != null) {

        	try {
                Class[] argTypes = new Class[] { String.class };
                Method method = connection.getDeclaredMethod("getConnection", argTypes);
                return (SQLControl) method.invoke(null, new Object[] {"site"});
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }

        }

        return null;

    }

}
