package com.example.tic_tac_connect;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    // Ключі для БД

    // TODO: додати значення
    public static final String PREFS_NAME = "";
    public static final String KEY_PLAYER_NAME = "";
    public static final String KEY_GAME_STYLE = "";
    public static final String KEY_DIFFICULT = "";
    public static final String KEY_VOLUME = "";
    public static final String KEY_VIBRATION = "";


    private TextInputEditText setPlayerName;
    private MaterialButtonToggleGroup toggleStyle;
    private Slider sliderDifficulty;
    private Slider sliderVolume;
    private SwitchMaterial switchVibration;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        setPlayerName = findViewById(R.id.setPlayerName);


    }
}
