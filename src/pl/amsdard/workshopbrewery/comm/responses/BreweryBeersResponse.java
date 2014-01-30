package pl.amsdard.workshopbrewery.comm.responses;

import org.json.*;
import java.util.ArrayList;

public class BreweryBeersResponse {
	
    private String message;
    private ArrayList<Beer> data;
    private String status;
    
    
	public BreweryBeersResponse () {
		
	}	
        
    public BreweryBeersResponse (JSONObject json) {
    
        this.message = json.optString("message");

        this.data = new ArrayList<Beer>();
        JSONArray arrayData = json.optJSONArray("data");
        if (null != arrayData) {
            int dataLength = arrayData.length();
            for (int i = 0; i < dataLength; i++) {
                JSONObject item = arrayData.optJSONObject(i);
                if (null != item) {
                    this.data.add(new Beer(item));
                }
            }
        }
        else {
            JSONObject item = json.optJSONObject("data");
            if (null != item) {
                this.data.add(new Beer(item));
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

    public ArrayList<Beer> getData() {
        return this.data;
    }

    public void setData(ArrayList<Beer> data) {
        this.data = data;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    
}
