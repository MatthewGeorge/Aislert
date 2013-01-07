package com.aislert.aislert;

import com.actionbarsherlock.app.SherlockActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends SherlockActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Load custom fonts for text views
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/gotham-book.ttf");
        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/gotham-medium.ttf");
        TextView tv1 = (TextView) findViewById(R.id.gotham_book);
        TextView tv2 = (TextView) findViewById(R.id.gotham_medium);
        tv1.setTypeface(tf1);
        tv2.setTypeface(tf2);
        
        //List Button
        Button List = (Button) findViewById(R.id.list);
		List.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.aislert.aislert.LIST"));
			}
		});
	}

}
