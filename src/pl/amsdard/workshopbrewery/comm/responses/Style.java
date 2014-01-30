package pl.amsdard.workshopbrewery.comm.responses;

import org.json.*;


public class Style {
	
    private int id;
    private Category category;
    private int categoryId;
    private String srmMin;
    private String ibuMax;
    private String description;
    private String createDate;
    private String ibuMin;
    private String fgMin;
    private String fgMax;
    private String abvMax;
    private String ogMin;
    private String abvMin;
    private String name;
    private String srmMax;
    
    
	public Style () {
		
	}	
        
    public Style (JSONObject json) {
    
        this.id = json.optInt("id");
        this.category = new Category(json.optJSONObject("category"));
        this.categoryId = json.optInt("categoryId");
        this.srmMin = json.optString("srmMin");
        this.ibuMax = json.optString("ibuMax");
        this.description = json.optString("description");
        this.createDate = json.optString("createDate");
        this.ibuMin = json.optString("ibuMin");
        this.fgMin = json.optString("fgMin");
        this.fgMax = json.optString("fgMax");
        this.abvMax = json.optString("abvMax");
        this.ogMin = json.optString("ogMin");
        this.abvMin = json.optString("abvMin");
        this.name = json.optString("name");
        this.srmMax = json.optString("srmMax");

    }
    
    public double getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getSrmMin() {
        return this.srmMin;
    }

    public void setSrmMin(String srmMin) {
        this.srmMin = srmMin;
    }

    public String getIbuMax() {
        return this.ibuMax;
    }

    public void setIbuMax(String ibuMax) {
        this.ibuMax = ibuMax;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getIbuMin() {
        return this.ibuMin;
    }

    public void setIbuMin(String ibuMin) {
        this.ibuMin = ibuMin;
    }

    public String getFgMin() {
        return this.fgMin;
    }

    public void setFgMin(String fgMin) {
        this.fgMin = fgMin;
    }

    public String getFgMax() {
        return this.fgMax;
    }

    public void setFgMax(String fgMax) {
        this.fgMax = fgMax;
    }

    public String getAbvMax() {
        return this.abvMax;
    }

    public void setAbvMax(String abvMax) {
        this.abvMax = abvMax;
    }

    public String getOgMin() {
        return this.ogMin;
    }

    public void setOgMin(String ogMin) {
        this.ogMin = ogMin;
    }

    public String getAbvMin() {
        return this.abvMin;
    }

    public void setAbvMin(String abvMin) {
        this.abvMin = abvMin;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrmMax() {
        return this.srmMax;
    }

    public void setSrmMax(String srmMax) {
        this.srmMax = srmMax;
    }


    
}
