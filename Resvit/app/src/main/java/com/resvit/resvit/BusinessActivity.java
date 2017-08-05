package com.resvit.resvit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BusinessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
    }

    public void approveData(View view){
        EditText name = (EditText) findViewById(R.id.name);
        EditText location = (EditText) findViewById(R.id.location);
        EditText mobile = (EditText) findViewById(R.id.number);
        EditText website = (EditText) findViewById(R.id.website);
        //Business currentItem = new Business(name.getText().toString());
    }
}
