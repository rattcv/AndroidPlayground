package org.itog.playground;

import org.itog.playground.ListViewTest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Playground extends Activity {
	static final String TAG = "PlayGround";

	Button listTestButton;
	Context context;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        context = this;

		setContentView(R.layout.main);

		listTestButton = (Button) findViewById(R.id.list);
		listTestButton.setOnClickListener(mListViewListener);
	}

	private OnClickListener mListViewListener = new OnClickListener() {
		public void onClick(View v) {
			try {
				Intent intent = new Intent(context, ListViewTest.class);
				startActivity(intent);
			} catch (Exception e) {
				Log.w(TAG, e.getMessage());
			}
		}
	};
}
