package com.ShortCourses;

import org.apache.cordova.DroidGap;
import android.os.Bundle;

public class MyPhoneGapActivity extends DroidGap {
	@Override
	
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//#### Had a splash Screen to start up ##// 
		super.setIntegerProperty("splashscreen", R.drawable.splash);
		//##### Load the index.html in 5 sec ####//
		super.loadUrl("file:///android_asset/www/index.html",10000);
	}
}
