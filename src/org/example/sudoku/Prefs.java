package org.example.sudoku;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Prefs extends PreferenceActivity {
	 protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      addPreferencesFromResource(R.xml.settings);
	   }
}
