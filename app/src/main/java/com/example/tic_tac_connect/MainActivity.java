package com.example.tic_tac_connect;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        MaterialButton btnPlayHotsport = findViewById(R.id.btnPlayHotspot);
        MaterialButton btnPlaySingle = findViewById(R.id.btnPlaySingle);
        MaterialButton btnSettings = findViewById(R.id.btnSettings);

        btnPlayHotsport.setOnClickListener(v -> {
            startActivity(new Intent(this, ConectionLobbyActivity.class));
        });
        btnPlaySingle.setOnClickListener(v -> {
            startActivity(new Intent(this, SinglePlayerActivity.class));
        });
        btnSettings.setOnClickListener(v -> {
            startActivity(new Intent(this, SettingsActivity.class));
        });

    }
}
