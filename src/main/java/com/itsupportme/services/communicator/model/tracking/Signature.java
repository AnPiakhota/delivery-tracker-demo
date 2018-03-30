package com.itsupportme.services.communicator.model.tracking;

public class Signature {

    private final String format;
    private final String signatureData;

    public Signature(String format, String signatureData) {
        this.format = format;
        this.signatureData = signatureData;
    }

    /**
     * @return The format of image data, PNG, JPEG, etc.
     */
    public String getFormat() {
        return format;
    }

    /**
     * @return Base64 encoded image binary data.
     */
    public String getSignatureData() {
        return signatureData;
    }

}
