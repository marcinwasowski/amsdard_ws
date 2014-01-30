package pl.amsdard.workshopbrewery.comm.responses;

import org.json.*;


public class Brewery {
	
    private String id;
    private String description;
    private String name;
    private String createDate;
    private String mailingListUrl;
    private String updateDate;
    private String established;
    private Image images;
    private String website;
    private String isOrganic;
    private String status;
    private String statusDisplay;
    
    
	public Brewery () {
		
	}	
        
    public Brewery (JSONObject json) {
    
        this.id = json.optString("id");
        this.description = json.optString("description");
        this.name = json.optString("name");
        this.createDate = json.optString("createDate");
        this.mailingListUrl = json.optString("mailingListUrl");
        this.updateDate = json.optString("updateDate");
        this.established = json.optString("established");
        this.images = new Image(json.optJSONObject("images"));
        this.website = json.optString("website");
        this.isOrganic = json.optString("isOrganic");
        this.status = json.optString("status");
        this.statusDisplay = json.optString("statusDisplay");

    }
    
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getMailingListUrl() {
        return this.mailingListUrl;
    }

    public void setMailingListUrl(String mailingListUrl) {
        this.mailingListUrl = mailingListUrl;
    }

    public String getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getEstablished() {
        return this.established;
    }

    public void setEstablished(String established) {
        this.established = established;
    }

    public Image getImages() {
        return this.images;
    }

    public void setImages(Image images) {
        this.images = images;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIsOrganic() {
        return this.isOrganic;
    }

    public void setIsOrganic(String isOrganic) {
        this.isOrganic = isOrganic;
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


    
}
