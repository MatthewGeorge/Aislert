package com.aislert.aislert;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class DefaultList extends ListActivity{

	String itemNames[] = {"@string/itemNames"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemNames));
	}

	private void setListAdapter(ArrayAdapter<String> arrayAdapter) {
		// TODO Auto-generated method stub
		
	}
	
	
}
