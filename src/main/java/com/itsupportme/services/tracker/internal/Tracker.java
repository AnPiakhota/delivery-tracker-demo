package com.itsupportme.services.tracker.internal;

import com.itsupportme.services.tracker.external.delegate.ServiceDelegate;
import com.itsupportme.services.tracker.internal.observer.FedExObserver;
import com.itsupportme.services.tracker.internal.observer.ObservableShipment;
import com.itsupportme.services.tracker.internal.observer.USPSObserver;
import com.itsupportme.services.tracker.internal.shipment.Shipment;
import com.itsupportme.services.tracker.launch.Main;

import net.pingtool.modules.db.*;
import net.pingtool.modules.service.ServiceTask;
import net.pingtool.modules.service.function.ServiceStoppedPredicate;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Tracker extends ServiceTask {

    private static final Logger logger = Main.getLogger("TRACKER");
    private final boolean runOverride;

    public Tracker(boolean runOverride) {
        super("tracker", 30, TimeUnit.MINUTES);
        this.runOverride = runOverride;
    }

    @Override
    public void run() {

        try {

            Stream<Result> carriers = getShipmentsCarriers();
            if (carriers == null) return;

            ServiceDelegate serviceDelegate = new ServiceDelegate(); // Init service

            // Init observer with services found in stream
            ObservableShipment observableShipment = new ObservableShipment(serviceDelegate);

            if ("FEDEX" != null) {
                observableShipment.addObserver(new FedExObserver());
            }

            if ("USPS" != null) {
                observableShipment.addObserver(new USPSObserver());
            }

            /* Tracking */
            Stream<Result> shipmentsToTrackStream = getShipmentsToTrack();
            Stream <Shipment> shipmentsToTrack = null;  // TODO convert Stream <Result> result into Stream <Shipment> 
            observableShipment.setShipments(shipmentsToTrack);

            /* Proof of delivery */
            Stream<Result> shipmentsToProofDeliveryStream = getShipmentsToProofDelivery();

            Stream <Shipment> shipmentsToProofDelivery = null; // TODO convert Stream <Result> result into Stream <Shipment>
            observableShipment.setShipments(shipmentsToProofDelivery);

        } catch (DbConnectionException | SQLException e) {
            e.printStackTrace();
        }

    }

    private Stream<Result> getShipmentsCarriers() throws DbConnectionException, SQLException {
        SQLControl con = ConnectionProvider.getConnection(Main.ALIAS_SITE);

        Result res = con.query("TODO", true, 50);
        ResultSpliterator rs = new ResultSpliterator(res);

        Stream<Result> stream = StreamSupport.stream(rs, false)
                .onClose(() -> {
                    res.close();
                    con.close();
                });

        return ServiceStoppedPredicate.add(stream);
    }

    private Stream<Result> getShipmentsToTrack() throws DbConnectionException, SQLException {
        SQLControl con = ConnectionProvider.getConnection(Main.ALIAS_SITE);

        Result res = con.query("SELECT Sht_Shp_Id, Sht_Seq, Sht_Trk_No, Sht_Trk_Uid, "
        		+ "Sht_Status, Shp_Date_Shipped, Shp_Trx_Date"
                + " FROM Shipment_Tracking"
                + " INNER JOIN Shipment_Master ON Shp_Id = Sht_Shp_Id"
                + " WHERE Sht_Status NOT IN ('DL', 'ND', 'ER')"
                + " ORDER BY Shp_Date_Shipped", true, 50);
        ResultSpliterator rs = new ResultSpliterator(res);

        Stream<Result> stream = StreamSupport.stream(rs, false)
                .onClose(() -> {
                    res.close();
                    con.close();
                });

        return ServiceStoppedPredicate.add(stream);
    }

    private Stream<Result> getShipmentsToProofDelivery() throws DbConnectionException, SQLException {
        SQLControl con = ConnectionProvider.getConnection(Main.ALIAS_SITE);

        Result res = con.query("TODO", true, 50);
        ResultSpliterator rs = new ResultSpliterator(res);

        Stream<Result> stream = StreamSupport.stream(rs, false)
                .onClose(() -> {
                    res.close();
                    con.close();
                });

        return ServiceStoppedPredicate.add(stream);
    }

}
