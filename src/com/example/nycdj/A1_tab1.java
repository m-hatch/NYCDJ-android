package com.example.nycdj;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class A1_tab1 extends Activity {
	Button btListen;
	MediaPlayer mpListen;
	int playing;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a1_tab1);
		btListen=(Button)findViewById(R.id.btnListen);
		btListen.setOnClickListener(bListen);
		mpListen=new MediaPlayer();
		mpListen=MediaPlayer.create(this,R.raw.amontobin);
		playing=0;
		
		Button browse = (Button)findViewById(R.id.btnBrowse1);
		browse.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getApplicationContext(), Browse.class));
			}
			
		});
		
		Button book = (Button)findViewById(R.id.btnBook1);
		book.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getApplicationContext(), Booking.class));
			}
			
		});
}

	Button.OnClickListener bListen = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(playing){
			case 0:
				mpListen.start();
				playing=1;
				btListen.setText("Pause");
				break;
			case 1:
				mpListen.pause();
				playing=0;
				btListen.setText("Listen");
				break;
			}
		}
		
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}