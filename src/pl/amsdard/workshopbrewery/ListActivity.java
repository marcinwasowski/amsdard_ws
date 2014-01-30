package pl.amsdard.workshopbrewery;

import java.util.List;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import pl.amsdard.workshopbrewery.comm.CommunicationService;
import pl.amsdard.workshopbrewery.comm.responses.BeerResponse;
import pl.amsdard.workshopbrewery.comm.responses.BreweriesResponse;
import pl.amsdard.workshopbrewery.comm.responses.Brewery;
import pl.amsdard.workshopbrewery.comm.responses.BreweryBeersResponse;
import pl.amsdard.workshopbrewery.comm.responses.BreweryLocationsResponse;
import pl.amsdard.workshopbrewery.comm.responses.BreweryResponse;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import android.app.Activity;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

@EActivity(R.layout.activity_list)
public class ListActivity extends Activity {

	@Bean
	protected CommunicationService commService;
	
	@ViewById(R.id.lsvBreweries)
	protected ListView lsvBreweries;
	
	protected List<Brewery> breweries;
	protected int currentPage;
	protected int allPages;
	@AfterInject
	protected void afterViewsListActivity(){
		this.currentPage = 1;
		this.commService.getBreweries(this.currentPage, new Callback<BreweriesResponse>() {
			
			@Override
			public void success(BreweriesResponse data, Response response) {
				breweries = data.getData();
				allPages = data.getNumberOfPages();
				lsvBreweries.setAdapter(new BreweriesAdapter(getApplicationContext(), breweries));
			}
			
			@Override
			public void failure(RetrofitError error) {
				Toast.makeText(ListActivity.this, R.string.problem, Toast.LENGTH_LONG).show();
			}
		});
		/*
		this.commService.getBeer("MQiOlG", new Callback<BeerResponse>() {
			@Override
			public void failure(RetrofitError arg0) { Log.e("getBeer", "ERROR"); }
			@Override
			public void success(BeerResponse arg0, Response arg1) { Log.e("getBeer", "SUCCESS"); }
		
		});
		
		this.commService.getBrewery("YXDiJk", new Callback<BreweryResponse>() {

			@Override
			public void failure(RetrofitError arg0) { Log.e("getBrewery", "ERROR"); }
			@Override
			public void success(BreweryResponse arg0, Response arg1) { Log.e("getBrewery", "SUCCESS"); }
		});

		this.commService.getBreweryBeers("YXDiJk", new Callback<BreweryBeersResponse>() {

			@Override
			public void failure(RetrofitError arg0) { Log.e("getBreweryBeers", "ERROR"); }
			@Override
			public void success(BreweryBeersResponse arg0, Response arg1) { Log.e("getBreweryBeers", "SUCCESS"); }
		});

		this.commService.getBreweryLocations("YXDiJk", new Callback<BreweryLocationsResponse>() {

			@Override
			public void failure(RetrofitError arg0) { Log.e("getBreweryLocations", "ERROR"); }
			@Override
			public void success(BreweryLocationsResponse arg0, Response arg1) { Log.e("getBreweryLocations", "SUCCESS"); }
		});
		*/
	}
	
	@AfterViews
	protected void afterInjectListActvity(){
		
	}
}
