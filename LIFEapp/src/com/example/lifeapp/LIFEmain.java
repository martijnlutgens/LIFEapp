package com.example.lifeapp;

import android.os.Bundle;
//import android.view.Menu;
import org.apache.cordova.DroidGap;

public class LIFEmain extends DroidGap  {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//super.loadUrl("file:///assets/www/index.html");
		super.loadUrl("http://dev.lifesites.nl/index.php/life-app");
		
	}
}
