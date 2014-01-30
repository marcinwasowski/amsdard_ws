package pl.amsdard.workshopbrewery.comm.responses;

import org.json.*;


public class Image {
	
    private String large;
    private String icon;
    private String medium;
    
    
	public Image () {
		
	}	
        
    public Image (JSONObject json) {
    
        this.large = json.optString("large");
        this.icon = json.optString("icon");
        this.medium = json.optString("medium");

    }
    
    public String getLarge() {
        return this.large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getMedium() {
        return this.medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }


    
}
