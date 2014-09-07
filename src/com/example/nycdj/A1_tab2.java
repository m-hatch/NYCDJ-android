package com.example.nycdj;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class A1_tab2 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a1_tab2);
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amontobin.com")));
	}

}
