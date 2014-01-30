package pl.amsdard.workshopbrewery.comm.responses;

import org.json.*;


public class BreweryLocation {
	
    private String locationTypeDisplay;
    private String status;
    private String statusDisplay;
    private Country country;
    private String updateDate;
    private String region;
    private double latitude;
    private String inPlanning;
    private String name;
    private String id;
    private String openToPublic;
    private String isClosed;
    private String locationType;
    private double longitude;
    private String phone;
    private Brewery brewery;
    private String postalCode;
    private String website;
    private String isPrimary;
    private String countryIsoCode;
    private String createDate;
    private String breweryId;
    private String locality;
    private String streetAddress;
    
    
	public BreweryLocation () {
		
	}	
        
    public BreweryLocation (JSONObject json) {
    
        this.locationTypeDisplay = json.optString("locationTypeDisplay");
        this.status = json.optString("status");
        this.statusDisplay = json.optString("statusDisplay");
        this.country = new Country(json.optJSONObject("country"));
        this.updateDate = json.optString("updateDate");
        this.region = json.optString("region");
        this.latitude = json.optDouble("latitude");
        this.inPlanning = json.optString("inPlanning");
        this.name = json.optString("name");
        this.id = json.optString("id");
        this.openToPublic = json.optString("openToPublic");
        this.isClosed = json.optString("isClosed");
        this.locationType = json.optString("locationType");
        this.longitude = json.optDouble("longitude");
        this.phone = json.optString("phone");
        this.brewery = new Brewery(json.optJSONObject("brewery"));
        this.postalCode = json.optString("postalCode");
        this.website = json.optString("website");
        this.isPrimary = json.optString("isPrimary");
        this.countryIsoCode = json.optString("countryIsoCode");
        this.createDate = json.optString("createDate");
        this.breweryId = json.optString("breweryId");
        this.locality = json.optString("locality");
        this.streetAddress = json.optString("streetAddress");

    }
    
    public String getLocationTypeDisplay() {
        return this.locationTypeDisplay;
    }

    public void setLocationTypeDisplay(String locationTypeDisplay) {
        this.locationTypeDisplay = locationTypeDisplay;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDisplay() {
        return this.statusDisplay;
    }

    public void setStatusDisplay(String statusDisplay) {
        this.statusDisplay = statusDisplay;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getInPlanning() {
        return this.inPlanning;
    }

    public void setInPlanning(String inPlanning) {
        this.inPlanning = inPlanning;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpenToPublic() {
        return this.openToPublic;
    }

    public void setOpenToPublic(String openToPublic) {
        this.openToPublic = openToPublic;
    }

    public String getIsClosed() {
        return this.isClosed;
    }

    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
    }

    public String getLocationType() {
        return this.locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Brewery getBrewery() {
        return this.brewery;
    }

    public void setBrewery(Brewery brewery) {
        this.brewery = brewery;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIsPrimary() {
        return this.isPrimary;
    }

    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getCountryIsoCode() {
        return this.countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }

    public String getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getBreweryId() {
        return this.breweryId;
    }

    public void setBreweryId(String breweryId) {
        this.breweryId = breweryId;
    }

    public String getLocality() {
        return this.locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }


    
}
