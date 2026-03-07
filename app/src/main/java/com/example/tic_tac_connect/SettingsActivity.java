package com.example.tic_tac_connect;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.slider.Slider;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;


public class SettingsActivity extends AppCompatActivity {
    // ключі для сховищя бази даних
    // TODO: ДОДАТИ ЗНАЧЕННЯ
    public static final String PREFS_NAME = "";
    public static final String KEY_PLAYER_NAME = "";
    public static final String KER_GAME_STYLE = "";
    public static final String KEY_DIFFICULT = "";
    public static final String KEY_VOLUME = "";
    public static final String KEY_VIBRATION = "";

    private TextInputEditText setPlayerName;
    private MaterialButtonToggleGroup toggleGroup;
    private Slider sliderDifficute;

    private Slider sliderVolume;

    private SwitchMaterial switchVibration;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_settings);

        setPlayerName = findViewById(R.id.setPlayerName);

    }
}
