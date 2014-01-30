package pl.amsdard.workshopbrewery.comm;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.EBean.Scope;

import pl.amsdard.workshopbrewery.comm.responses.BeerResponse;
import pl.amsdard.workshopbrewery.comm.responses.BreweriesResponse;
import pl.amsdard.workshopbrewery.comm.responses.BreweryBeersResponse;
import pl.amsdard.workshopbrewery.comm.responses.BreweryLocationsResponse;
import pl.amsdard.workshopbrewery.comm.responses.BreweryResponse;
import pl.amsdard.workshopbrewery.common.Consts;

import retrofit.Callback;
import retrofit.RestAdapter;

@EBean(scope=Scope.Singleton)
public class CommunicationService {

	
	private BreweryDB breweryDB;
	
	protected CommunicationService(){
		RestAdapter restAdapter =  new RestAdapter.Builder().setServer(Consts.API_URL)
				.build();
		this.breweryDB = restAdapter.create(BreweryDB.class);
	}
	
	public void getBreweries(int page, Callback<BreweriesResponse> callback){
		this.breweryDB.getBreweries("*", Consts.API_KEY, page, callback);
	}
	
	public void getBrewery(String idBrewery,  Callback<BreweryResponse> callback){
		this.breweryDB.getBrewery(idBrewery, Consts.API_KEY, callback);
	}
	
	public void getBreweryBeers(String idBrewery, Callback<BreweryBeersResponse> callback){
		this.breweryDB.getBreweryBeers(idBrewery, Consts.API_KEY, callback);
	}
	
	
	public void getBeer(String idBeer, Callback<BeerResponse> callback){
		this.breweryDB.getBeer(idBeer, Consts.API_KEY, callback);
	}
	
	public void getBreweryLocations(String idBrewery, Callback<BreweryLocationsResponse> callback){
		this.breweryDB.getBreweryLocations(idBrewery, Consts.API_KEY, callback);
	}
	
}
