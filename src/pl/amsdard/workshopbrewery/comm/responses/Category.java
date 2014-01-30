package pl.amsdard.workshopbrewery.comm.responses;

import org.json.*;


public class Category {
	
    private int id;
    private String name;
    private String createDate;
    
    
	public Category () {
		
	}	
        
    public Category (JSONObject json) {
    
        this.id = json.optInt("id");
        this.name = json.optString("name");
        this.createDate = json.optString("createDate");

    }
    
    public double getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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


    
}
