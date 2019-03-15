package com.sarvgya98.grp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ResponderForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responder_form);
    }

    public void goToBack(View view) {
        this.finish();
    }

    public void saveForm(View view) {
        Toast.makeText(ResponderForm.this, "Response saved",
                Toast.LENGTH_LONG).show();
        this.finish();
    }

}
