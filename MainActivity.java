package com.example.my_game_balls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Begin_play(View view){
        Intent my_intent = new Intent(MainActivity.this, GameActivity.class);
        startActivity(my_intent);
    }
}
