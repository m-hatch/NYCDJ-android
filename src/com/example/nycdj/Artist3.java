package com.example.nycdj;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class Artist3 extends TabActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.artist3);
		TabHost tabHost = getTabHost();
		//first tab
		TabSpec aboutspec = tabHost.newTabSpec("About");
		aboutspec.setIndicator("", getResources().getDrawable(R.drawable.about_icon));
		Intent photosIntent = new Intent(this, A3_tab1.class);
		aboutspec.setContent(photosIntent);
		//second tab
		TabSpec webspec = tabHost.newTabSpec("Website");
		webspec.setIndicator("", getResources().getDrawable(R.drawable.web_icon));
		Intent tourIntent = new Intent(this, A3_tab2.class);
		webspec.setContent(tourIntent);
		//add TabSpec to TabHost
		tabHost.addTab(aboutspec);
		tabHost.addTab(webspec);
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}*/
}
