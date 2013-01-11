package com.android.my;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewNewHelloWorld extends Activity {

	private static final int MILLIS_PER_SECOND = 1000;
	private static final int SECONDS_TO_COUNTDOWN = 30;
	private TextView countdownDisplay;
	private CountDownTimer timer;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button startButton = (Button) findViewById(R.id.authButton);
		startButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				try {
				} catch (NumberFormatException e) {
					// method ignores invalid (non-integer) input and waits
					// for something it can use
				}
			}
		});
	}
}