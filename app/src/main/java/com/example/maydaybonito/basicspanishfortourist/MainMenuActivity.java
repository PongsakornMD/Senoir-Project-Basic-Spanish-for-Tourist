package com.example.maydaybonito.basicspanishfortourist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void click2VocabTypePage (View view){
        Intent i = new Intent(this, VocabTypeActivity.class);
        startActivity(i);
    }

    public void click2GrammarTypePage (View view){
        Intent i = new Intent(this, GrammarTypeActivity.class);
        startActivity(i);
    }

    public void click2ConverTypePage (View view){
        Intent i = new Intent(this, ConverTypeActivity.class);
        startActivity(i);
    }

    public void click2ExerciseTypePage (View view){
        Intent i = new Intent(this, ExerciseTypeActivity.class);
        startActivity(i);
    }

    public void click2ScorePage (View view){
        Intent i = new Intent(this, ScoreActivity.class);
        startActivity(i);
    }

    public void click2SettingTypePage (View view){
        Intent i = new Intent(this, SettingTypeActivity.class);
        startActivity(i);
    }
}
