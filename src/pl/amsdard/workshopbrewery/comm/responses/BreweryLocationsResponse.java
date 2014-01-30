package pl.amsdard.workshopbrewery.comm.responses;

import org.json.*;
import java.util.ArrayList;

public class BreweryLocationsResponse {
	
    private String message;
    private ArrayList<BreweryLocation> data;
    private String status;
    
    
	public BreweryLocationsResponse () {
		
	}	
        
    public BreweryLocationsResponse (JSONObject json) {
    
        this.message = json.optString("message");

        this.data = new ArrayList<BreweryLocation>();
        JSONArray arrayData = json.optJSONArray("data");
        if (null != arrayData) {
            int dataLength = arrayData.length();
            for (int i = 0; i < dataLength; i++) {
                JSONObject item = arrayData.optJSONObject(i);
                if (null != item) {
                    this.data.add(new BreweryLocation(item));
                }
            }
        }
        else {
            JSONObject item = json.optJSONObject("data");
            if (null != item) {
                this.data.add(new BreweryLocation(item));
            }
        }

        this.status = json.optString("status");

    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<BreweryLocation> getData() {
        return this.data;
    }

    public void setData(ArrayList<BreweryLocation> data) {
        this.data = data;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    
}
