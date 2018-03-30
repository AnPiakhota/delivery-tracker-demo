package com.itsupportme.services.tracker.internal.shipment;

import com.itsupportme.services.communicator.model.tracking.TrackingRequest;
import com.itsupportme.services.communicator.model.tracking.TrackingResponse;
import com.itsupportme.services.tracker.launch.Main;

import net.pingtool.modules.db.ConnectionProvider;
import net.pingtool.modules.db.DbConnectionException;
import net.pingtool.modules.db.SQLControl;
import java.sql.SQLException;

import static com.itsupportme.services.tracker.database.ShipmentDatabaseContract.*;

/**
 * @author Andrei Piakhota
 */
public class Shipment implements IShipment {

    String column = ShipmentMasterTable.SHP_STATUS;

    /**
     * Method updates fields and updates database.
     * @param trackingResponse
     */
    @Override
    public void update(TrackingResponse trackingResponse) {

        /* State update */ 

        try (SQLControl sql = ConnectionProvider.getConnection(Main.ALIAS_SITE)) {

            // TODO add updates to ship date in shipment_master

            sql.update("Shipment_Tracking",
                    new String[]{"Sht_Date_Delivered", "Sht_Status", "Sht_Status_Desc"},
                    new String[]{null, null, null},
                    "Sht_Trk_No = '" + null + "' AND Sht_Shp_Id = '" + null + "' AND Sht_Seq = '" + null + "'");

        } catch (SQLException | DbConnectionException e) {
            e.printStackTrace();
        }

    }

    @Override
    public TrackingRequest build() {
        return null;
    }

}
