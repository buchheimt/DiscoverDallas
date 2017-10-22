package com.tyler_buchheim.discoverdallas;

/**
 * {@link Location} represents a location to display, with information stored as resource IDs
 * for a name, address, description, and image.
 */
public class Location {

    /** Image resource ID for the location*/
    private int mImageResourceId;

    /** String resource ID for the name of the location*/
    private int mNameId;

    /** String resource ID for the address of the location*/
    private int mAddressId;

    /** String resource ID for the details of the location*/
    private int mDetailsId;

    /**
     * Create a new Location object.
     *
     * @param imageResourceId is the image resource ID for the location
     * @param nameId is the string resource ID for the name of the location
     * @param addressId is the string resource ID for the address of the location
     * @param detailsId is the string resource ID for the details of the location
     */
    public Location(int imageResourceId, int nameId, int addressId, int detailsId) {
        mImageResourceId = imageResourceId;
        mNameId = nameId;
        mAddressId = addressId;
        mDetailsId = detailsId;
    }

    /*
     * Get the image resource ID of the location
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /*
     * Get the string resource ID for the name of the location
     */
    public int getName() {
        return mNameId;
    }

    /*
     * Get the string resource ID for the address of the location
     */
    public int getAddress() {
        return mAddressId;
    }

    /*
     * Get the string resource ID for the details of the location
     */
    public int getDetails() {
        return mDetailsId;
    }

}
