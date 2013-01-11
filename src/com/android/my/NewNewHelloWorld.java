package com.android.my;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewNewHelloWorld extends Activity {

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