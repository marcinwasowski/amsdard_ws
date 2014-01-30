package pl.amsdard.workshopbrewery.comm.responses;

import org.json.*;


public class BreweryResponse {
	
    private String message;
    private Brewery data;
    private String status;
    
    
	public BreweryResponse () {
		
	}	
        
    public BreweryResponse (JSONObject json) {
    
        this.message = json.optString("message");
        this.data = new Brewery(json.optJSONObject("data"));
        this.status = json.optString("status");

    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Brewery getData() {
        return this.data;
    }

    public void setData(Brewery data) {
        this.data = data;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    
}
