package com.android.mslp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button startButton = (Button) findViewById(R.id.authButton);
		startButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				final Intent i = new Intent(MainActivity.this, ChooseDescipline.class);
//				i.setClassName("com.andoroid.my", "com.android.my.ChooseDiscipline");
				startActivity(i);
//				finish();
			}
		});
	}
}