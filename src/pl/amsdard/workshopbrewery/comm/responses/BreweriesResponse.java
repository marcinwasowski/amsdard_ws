package pl.amsdard.workshopbrewery.comm.responses;

import org.json.*;
import java.util.ArrayList;

public class BreweriesResponse {
	
    private int numberOfPages;
    private ArrayList<Brewery> data;
    private int totalResults;
    private int currentPage;
    private String status;
    
    
	public BreweriesResponse () {
		
	}	
        
    public BreweriesResponse (JSONObject json) {
    
        this.numberOfPages = json.optInt("numberOfPages");

        this.data = new ArrayList<Brewery>();
        JSONArray arrayData = json.optJSONArray("data");
        if (null != arrayData) {
            int dataLength = arrayData.length();
            for (int i = 0; i < dataLength; i++) {
                JSONObject item = arrayData.optJSONObject(i);
                if (null != item) {
                    this.data.add(new Brewery(item));
                }
            }
        }
        else {
            JSONObject item = json.optJSONObject("data");
            if (null != item) {
                this.data.add(new Brewery(item));
            }
        }

        this.totalResults = json.optInt("totalResults");
        this.currentPage = json.optInt("currentPage");
        this.status = json.optString("status");

    }
    
    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public ArrayList<Brewery> getData() {
        return this.data;
    }

    public void setData(ArrayList<Brewery> data) {
        this.data = data;
    }

    public double getTotalResults() {
        return this.totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public double getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    
}
