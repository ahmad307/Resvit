package com.resvit.resvit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.id.edit;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Login(View view){
        EditText userName = (EditText) findViewById(R.id.editText5);
        String userText = userName.getText().toString();
        userText = userText.toLowerCase();
        if(userText.equals("user")) {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
        else if(userText.equals("business")){
            Intent intent = new Intent(this, BusinessActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Entered else", Toast.LENGTH_SHORT).show();

        }
    }
}
