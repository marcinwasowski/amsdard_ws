package pl.amsdard.workshopbrewery;

import java.util.List;

import pl.amsdard.workshopbrewery.comm.responses.Brewery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class BreweriesAdapter extends BaseAdapter {

	private List<Brewery> breweries;
	private Context context;
	
	public BreweriesAdapter(Context context, List<Brewery> breweries){
		this.breweries = breweries;
		this.context = context;
	}
	
	@Override
	public int getCount() {
		return this.breweries.size();
	}

	@Override
	public Brewery getItem(int position) {
		// TODO Auto-generated method stub
		return this.breweries.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView==null){
			convertView = BreweryListViewtem_.build(this.context);
		}
		((BreweryListViewtem)convertView).configure(getItem(position).getName());
		return convertView;
	}

}
