package com.itsupportme.services.tracker.launch;

import com.itsupportme.services.tracker.internal.Tracker;
import net.pingtool.modules.db.ConnectionParameters;
import net.pingtool.modules.db.ConnectionProvider;
import net.pingtool.modules.service.ServiceInstance;
import net.pingtool.modules.service.ServiceLauncher;

import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author Andrei Piakhota
 */
public class Main extends ServiceInstance {

    private static final Logger logger = getLogger();
    public static final String ALIAS_SITE = "site";
    private static boolean runOverride = false;

    @Override
    public Properties getDefaultProperties() {
    	
        Properties props = super.getDefaultProperties();
        props.putAll(ConnectionParameters.getSampleProperties());
        props.setProperty("database.name.site", "INTERNALSITE");
        return props;
        
    }

    @Override
    public void start() {
        submit(new Tracker(runOverride));
    }

    @Override
    public void init() {
    	
        ConnectionProvider.registerParameters(
                ALIAS_SITE,
                new ConnectionParameters(getProperty("database.name.site"), getProperties())
        );
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
        for (String arg : args) {
            if (arg.equals("-runOverride")) {
                runOverride = true;
            }
        }
        
        ServiceLauncher.launch(Main.class);
        
    }

}
