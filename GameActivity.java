package com.example.my_game_balls;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class GameActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
    }
}
