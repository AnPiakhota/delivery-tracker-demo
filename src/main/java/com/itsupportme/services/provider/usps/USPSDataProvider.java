package com.itsupportme.services.provider.usps;

import com.itsupportme.services.communicator.ShippingCarrier;
import com.itsupportme.services.communicator.model.ResponseStatus;
import com.itsupportme.services.communicator.model.tracking.TrackingRequest;
import com.itsupportme.services.communicator.model.tracking.TrackingResponse;
import com.itsupportme.services.communicator.model.tracking.TrackingShipment;
import com.itsupportme.services.provider.usps.dto.track.request.ObjectFactory;
import com.itsupportme.services.provider.usps.dto.track.request.TrackFieldRequestType;
import com.itsupportme.services.provider.usps.dto.track.request.TrackIDType;
import com.itsupportme.services.provider.usps.dto.track.responce.TrackResponseType;

import javax.xml.bind.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;

/**
 * The class requests and provides data being sent from USPS. 
 * @author Andrei Piakhota
 */
public class USPSDataProvider implements ShippingCarrier<USPSConfigurer> {

    private USPSConfigurer config;

    @Override
    public void configure(USPSConfigurer config) {
        this.config = config;
    }

    @Override
    public TrackingResponse track(TrackingRequest request) {

        try {
        	
            JAXBContext jaxbContext = JAXBContext.newInstance("nz.co.equinox.training.domain.booking");

            /* Marshalling request */

            TrackFieldRequestType req = new TrackFieldRequestType();
            req.setUSERID(config.getUserId());
            req.setTrackID(new TrackIDType());

            Marshaller marshaller = jaxbContext.createMarshaller();
            JAXBElement<TrackFieldRequestType> reqElement
            	= (new ObjectFactory()).createTrackFieldRequest(req);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            marshaller.marshal(reqElement, System.out);

            /* Sending request */
            
            sendGET();

            /* Unmarshalling responce */

            Unmarshaller unmarshaller =
                    jaxbContext.createUnmarshaller();

            JAXBElement<TrackResponseType> resElement 
            	= (JAXBElement<TrackResponseType>) unmarshaller.unmarshal(
                    new File("src/test/resources/xml/reqponce.xml"));

            ResponseStatus rs = new ResponseStatus(true, "Huray");

            LinkedList<TrackingShipment> shipments = new LinkedList<>();

            TrackingResponse trackingResponse = new TrackingResponse(rs, shipments);

            return trackingResponse;

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
        
    }

    private static final String GET_URL = "http://localhost:9090/SpringMVCExample";
    private static final String POST_URL = "http://localhost:9090/SpringMVCExample/home";
    private static void sendGET() throws IOException {
    	
    	URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { 
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }

    }

    private static final String POST_PARAMS = "userName=Pankaj";
    private static void sendPOST() throws IOException {
    	
        URL obj = new URL(POST_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");

        con.setDoOutput(true);
        OutputStream os = con.getOutputStream();
        os.write(POST_PARAMS.getBytes());
        os.flush();
        os.close();

        int responseCode = con.getResponseCode();
        System.out.println("POST Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { 
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println(response.toString());
        } else {
            System.out.println("POST request is failed");
        }
        
    }

}



