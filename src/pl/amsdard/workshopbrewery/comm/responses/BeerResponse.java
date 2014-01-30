package pl.amsdard.workshopbrewery.comm.responses;

import org.json.*;


public class BeerResponse {
	
    private String message;
    private Beer data;
    private String status;
    
    
	public BeerResponse () {
		
	}	
        
    public BeerResponse (JSONObject json) {
    
        this.message = json.optString("message");
        this.data = new Beer(json.optJSONObject("data"));
        this.status = json.optString("status");

    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Beer getData() {
        return this.data;
    }

    public void setData(Beer data) {
        this.data = data;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    
}
