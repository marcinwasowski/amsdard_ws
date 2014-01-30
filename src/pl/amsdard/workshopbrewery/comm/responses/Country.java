package pl.amsdard.workshopbrewery.comm.responses;

import org.json.*;


public class Country {
	
    private String isoCode;
    private String createDate;
    private String displayName;
    private String name;
    private String isoThree;
    private int numberCode;
    
    
	public Country () {
		
	}	
        
    public Country (JSONObject json) {
    
        this.isoCode = json.optString("isoCode");
        this.createDate = json.optString("createDate");
        this.displayName = json.optString("displayName");
        this.name = json.optString("name");
        this.isoThree = json.optString("isoThree");
        this.numberCode = json.optInt("numberCode");

    }
    
    public String getIsoCode() {
        return this.isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsoThree() {
        return this.isoThree;
    }

    public void setIsoThree(String isoThree) {
        this.isoThree = isoThree;
    }

    public double getNumberCode() {
        return this.numberCode;
    }

    public void setNumberCode(int numberCode) {
        this.numberCode = numberCode;
    }


    
}
