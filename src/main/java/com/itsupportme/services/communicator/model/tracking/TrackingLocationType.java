package com.itsupportme.services.communicator.model.tracking;

public enum TrackingLocationType {

    FACILITY("Carrier Facility"), //fedex FEDEX_LOCATION
    CHECKPOINT("Guard or Security Station"), //fedex GUARD_OR_SECURITY_STATION
    BOND_CAGE("In bond or cage"), //fedex IN_BOND_OR_CAGE
    MAILROOM("Mailroom"), //fedex MAILROOM
    PHARMACY("Pharmacy"), //fedex PHARMACY
    RECEPTIONIST("Receptionist or front desk"), //fedex RECEPTIONIST_OR_FRONT_DESK
    RESIDENCE("Residence"), //fedex RESIDENCE
    RECEIVING("Shipping/Receiving"), //fedex SHIPPING_RECEIVING
    OTHER("Other"); //fedex OTHER

    private String description;

    private TrackingLocationType(String description) {
        this.description = description;
    }
    
	public String getDescription() {
		return description;
	}

}
