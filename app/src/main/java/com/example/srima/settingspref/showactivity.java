package com.example.srima.settingspref;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

/**
 * Created by srima on 20-07-2016.
 */
public class showactivity extends Activity {
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.show);
        TextView edittext=(TextView)findViewById(R.id.tv_edittext);
        TextView list=(TextView)findViewById(R.id.tv_list);
        TextView checkbox=(TextView)findViewById(R.id.tv_checkbox);
        //getting default sstored valus in preference
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        String edit1=sp.getString("etp_edittext_preference1","No text data");
        String list1=sp.getString("lp_list_preference","None selected");
        boolean cb=sp.getBoolean("cbt_checkbox_Preference",false);


        edittext.setText("password: " + edit1);
        list.setText("update prefereence " + list1);
        checkbox.setText("enabled lock " + Boolean.toString(cb));
    }
}
