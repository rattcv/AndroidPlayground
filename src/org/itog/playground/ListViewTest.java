package org.itog.playground;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class ListViewTest extends Activity {
	static final String TAG = "ITOG";
	
	String[] arry = { "Apple", "Banana", "Melon", "Orange"};
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		try {
		setContentView(R.layout.list);
		} catch (Exception e) {
			Log.e(TAG, e.getMessage());
		}

		ListView listView = (ListView) findViewById(R.id.list);
		listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arry) {
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				View view = super.getView(position, convertView, parent);
				if (position % 2 == 0) {
					view.setBackgroundColor(Color.DKGRAY);
				} else {
					view.setBackgroundColor(Color.GRAY);
				}
				return view;
			}
		});
	}
}
