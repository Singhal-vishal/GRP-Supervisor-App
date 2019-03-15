package com.sarvgya98.grp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void underDev(View v) {

        Intent i = new Intent(this,UnderDevelopment.class);
        startActivity(i);
    }


    public void responderForm(View view) {
        Intent i = new Intent(this,ResponderForm.class);
        startActivity(i);

    }

    public void caseTimeline(View view) {
        Intent i = new Intent(this,CaseTimeline.class);
        startActivity(i);
    }

    public void staffList(View view) {
        Intent i = new Intent(this,Staff.class);
        startActivity(i);
    }

}
