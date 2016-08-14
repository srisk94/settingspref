package com.example.srima.settingspref;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by srima on 20-07-2016.
 */
public class Settings extends PreferenceActivity {
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        addPreferencesFromResource(R.xml.preferences);
    }
}
