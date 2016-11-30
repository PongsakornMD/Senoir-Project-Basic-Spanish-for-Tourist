package com.example.maydaybonito.basicspanishfortourist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void click2MainMenuPage (View view){
        Intent i = new Intent(this, MainMenuActivity.class);
        startActivity(i);
    }

    public void click2RegisterPage (View view){
        Intent i = new Intent(this, RegisterActivity.class);
        startActivity(i);
    }
}
