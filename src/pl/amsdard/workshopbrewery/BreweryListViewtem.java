package pl.amsdard.workshopbrewery;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

@EViewGroup(R.layout.lvi_brewery_list_item)
public class BreweryListViewtem extends LinearLayout {

	@ViewById(R.id.txvBreweryName)
	protected TextView txvBreweryName;
	
	public BreweryListViewtem(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public BreweryListViewtem(Context context) {
		super(context);
	}
	
	public void configure(String name){
		this.txvBreweryName.setText(name);
	}
	
}
