package com.itsupportme.services.tracker.external.delegate;

import net.pingtool.modules.db.ConnectionProvider;
import net.pingtool.modules.db.DbConnectionException;
import net.pingtool.modules.db.Result;
import net.pingtool.modules.db.SQLControl;

import java.sql.SQLException;

import static com.itsupportme.services.tracker.launch.Main.ALIAS_SITE;

/**
 * @author Andrei Piakhota
 */
public interface ServiceAuthentication {

   class FedExAuthentication { 
	   
	   // TODO rewrite authentication part for FedEx 
	   
   }

   class USPSAuthentication {

       private String userId;

       public USPSAuthentication() {

            try (SQLControl sql = ConnectionProvider.getConnection(ALIAS_SITE);
                Result r = sql.select("App_Config", "Acf_Value, Acf_Prop_Name", "Acf_App_Id = 'FEDEX'")) {

               String[] credentials = new String[4];
               while (r.next()) {
                   if (r.getString("Acf_Prop_Name").equalsIgnoreCase("API_USERNAME")) {
                       credentials[0] = r.getString("Acf_Value");
                   }
                   if (r.getString("Acf_Prop_Name").equalsIgnoreCase("API_PASSWORD")) {
                       credentials[1] = r.getString("Acf_Value");
                   }
                   if (r.getString("Acf_Prop_Name").equalsIgnoreCase("ACCOUNT_NUMBER")) {
                       credentials[2] = r.getString("Acf_Value");
                   }
                   if (r.getString("Acf_Prop_Name").equalsIgnoreCase("METER_NUMBER")) {
                       credentials[3] = r.getString("Acf_Value");
                   }
               }

           } catch (DbConnectionException | SQLException ex) {
        	   // TODO exception handling
           }

       }

       public String getUserId() {
           return userId;
       }
       
   }

}
