package com.sarvgya98.grp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CaseTimeline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case_timeline);
    }

    public void goToBack(View view) {
        this.finish();
    }

    public void underDev(View v) {
        Intent i = new Intent(this,UnderDevelopment.class);
        startActivity(i);
    }
}
