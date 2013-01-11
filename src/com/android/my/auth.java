package com.android.my;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import education.User;

public class auth extends Activity {

	private ChooseDiscipline choose;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button startButton = (Button) findViewById(R.id.authButton);
		startButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				try {
					choose = new ChooseDiscipline(new User("1", "1.2.3"));
				} catch (NumberFormatException e) {
					// method ignores invalid (non-integer) input and waits
					// for something it can use
				}
			}
		});
	}
}