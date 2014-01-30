package pl.amsdard.workshopbrewery.comm.responses;

import org.json.*;


public class Beer {
	
    private String id;
    private Style style;
    private String abv;
    private String description;
    private String name;
    private Srm srm;
    private String createDate;
    private Image labels;
    private int styleId;
    private int srmId;
    private String updateDate;
    private String ibu;
    private String isOrganic;
    private String status;
    private String statusDisplay;
    
    
	public Beer () {
		
	}	
        
    public Beer (JSONObject json) {
    
        this.id = json.optString("id");
        this.style = new Style(json.optJSONObject("style"));
        this.abv = json.optString("abv");
        this.description = json.optString("description");
        this.name = json.optString("name");
        this.srm = new Srm(json.optJSONObject("srm"));
        this.createDate = json.optString("createDate");
        this.labels = new Image(json.optJSONObject("labels"));
        this.styleId = json.optInt("styleId");
        this.srmId = json.optInt("srmId");
        this.updateDate = json.optString("updateDate");
        this.ibu = json.optString("ibu");
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

    public Style getStyle() {
        return this.style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String getAbv() {
        return this.abv;
    }

    public void setAbv(String abv) {
        this.abv = abv;
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

    public Srm getSrm() {
        return this.srm;
    }

    public void setSrm(Srm srm) {
        this.srm = srm;
    }

    public String getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Image getLabels() {
        return this.labels;
    }

    public void setLabels(Image labels) {
        this.labels = labels;
    }

    public double getStyleId() {
        return this.styleId;
    }

    public void setStyleId(int styleId) {
        this.styleId = styleId;
    }

    public double getSrmId() {
        return this.srmId;
    }

    public void setSrmId(int srmId) {
        this.srmId = srmId;
    }

    public String getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getIbu() {
        return this.ibu;
    }

    public void setIbu(String ibu) {
        this.ibu = ibu;
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
