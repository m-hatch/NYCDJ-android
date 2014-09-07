package com.example.nycdj;

import java.text.DecimalFormat;
import java.util.Calendar;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Booking extends Activity {
	double costPerHr=175.00;
	int numOfHrs;
	double totalCost;
	String artistChoice;
	String venueChoice;
	private int currentYear, currentMonth, currentDay;
	static final int DATE_DIALOG_ID=0;
	private Button btnDate;
	String reservation_date;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.booking);
		final EditText venue = (EditText)findViewById(R.id.txtVenue);
		final EditText hours = (EditText)findViewById(R.id.txtHours);
		final Spinner djs = (Spinner)findViewById(R.id.spinDj);
		final TextView result = ((TextView)findViewById(R.id.txtReservation));
		btnDate=(Button)findViewById(R.id.btnDate);
		btnDate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(DATE_DIALOG_ID);
			}
		});
		final Calendar c=Calendar.getInstance();
		currentYear=c.get(Calendar.YEAR);
		currentMonth=c.get(Calendar.MONTH);
		currentDay=c.get(Calendar.DAY_OF_MONTH);
		Button reserve = (Button)findViewById(R.id.btnReserve);
		reserve.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				numOfHrs = Integer.parseInt(hours.getText().toString());
				venueChoice = venue.getText().toString();
				totalCost = costPerHr*numOfHrs;
				DecimalFormat currency=new DecimalFormat("$###,###.##");
				artistChoice = djs.getSelectedItem().toString();
				result.setText("You have booked "+artistChoice+" at "+venueChoice+
						" on "+reservation_date+". Total cost is "+currency.format(totalCost)+".");
			}
		});
	}
	protected Dialog onCreateDialog(int id){
		switch(id){
		case DATE_DIALOG_ID:
			return new DatePickerDialog(this, reservationDate, currentYear, currentMonth, currentDay);
		}
		return null;
	}
	private DatePickerDialog.OnDateSetListener reservationDate =
			new DatePickerDialog.OnDateSetListener() {
		
		@Override
		public void onDateSet(DatePicker view, int year, int month,
				int day) {
			// TODO Auto-generated method stub
			reservation_date=(month+1)+("/")+day+("/")+year;
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
