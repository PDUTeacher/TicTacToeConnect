package com.example.tic_tac_connect;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class SettingsActivity extends AppCompatActivity {

    private TextInputEditText setPlayerName;
    private MaterialButtonToggleGroup toggleStyle;
    private Slider sliderDifficulty;
    private Slider sliderVolume;
    private SwitchMaterial switchVibration;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

    }
}
