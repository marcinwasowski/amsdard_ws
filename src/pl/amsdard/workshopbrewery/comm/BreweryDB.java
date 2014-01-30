package pl.amsdard.workshopbrewery.comm;

import pl.amsdard.workshopbrewery.comm.responses.BeerResponse;
import pl.amsdard.workshopbrewery.comm.responses.BreweriesResponse;
import pl.amsdard.workshopbrewery.comm.responses.BreweryBeersResponse;
import pl.amsdard.workshopbrewery.comm.responses.BreweryLocationsResponse;
import pl.amsdard.workshopbrewery.comm.responses.BreweryResponse;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

interface BreweryDB {
	@GET("/breweries")
	void getBreweries(@Query("name") String name, @Query("key") String apiKey, @Query("page") int page, Callback<BreweriesResponse> callback);
	
	@GET("/brewery/{id}")
	void getBrewery(@Path("id") String id, @Query("key") String apiKey, Callback<BreweryResponse> callback);
	
	@GET("/brewery/{id}/beers")
	void getBreweryBeers(@Path("id") String id, @Query("key") String apiKey, Callback<BreweryBeersResponse> callback);
	
	@GET("/beer/{id}")
	void getBeer(@Path("id") String id, @Query("key") String apiKey, Callback<BeerResponse> callback);
	
	@GET("/brewery/{id}/locations")
	void getBreweryLocations(@Path("id") String id, @Query("key") String apiKey, Callback<BreweryLocationsResponse> callback);
	
}
