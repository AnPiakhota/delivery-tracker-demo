package com.itsupportme.services.tracker.database;

/**
 * @author Andrei Piakhota
 */
public final class ShipmentDatabaseContract {


    public static abstract class ShipmentMasterTable {

        public static final String PREFIX = "SHP_";
        public static final String SHP_STATUS = PREFIX + "STATUS";

    }

    public static abstract class ShipmentTrackingTable {

        public static final String PREFIX = "SHT_";
        public static final String SHP_STATUS = PREFIX + "STATUS";

    }

}
