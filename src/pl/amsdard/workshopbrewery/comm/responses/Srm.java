package pl.amsdard.workshopbrewery.comm.responses;

import org.json.*;


public class Srm {
	
    private int id;
    private String name;
    private String hex;
    
    
	public Srm () {
		
	}	
        
    public Srm (JSONObject json) {
    
        this.id = json.optInt("id");
        this.name = json.optString("name");
        this.hex = json.optString("hex");

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

    public String getHex() {
        return this.hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }


    
}
