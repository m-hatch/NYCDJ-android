package com.example.nycdj;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Browse extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browse);
		String [] artists = {"Amon Tobin (Drum & Bass)", "Annie Mac (House)", 
				"Ferry Corsten (Trance)", "Skrillex (Dubstep)"};
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, artists));
	}
	protected void onListItemClick(ListView l, View v, int position, long id){
		switch(position){
		case 0:
			startActivity(new Intent(getApplicationContext(), Artist1.class));
			break;
		case 1:
			startActivity(new Intent(getApplicationContext(), Artist2.class));
			break;		
		case 2:
			startActivity(new Intent(getApplicationContext(), Artist3.class));
			break;			
		case 3:
			startActivity(new Intent(getApplicationContext(), Artist4.class));
			break;			
		}
	}
}
