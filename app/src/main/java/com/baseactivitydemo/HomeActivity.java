package com.baseactivitydemo;

import android.os.Bundle;
import android.view.View;

public class HomeActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = getLayoutInflater().inflate(R.layout.activity_home, frameLayout);
        txt_menuTitle.setText("Home Activity");

    }


}
