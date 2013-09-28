package com.example.lifeapp;

import android.os.Bundle;
//import android.view.Menu;
import org.apache.cordova.DroidGap;

public class LIFEmain extends DroidGap  {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///assets/www/index.html");
		
	}
//
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.lifemain, menu);
//		return true;
//	}

}
