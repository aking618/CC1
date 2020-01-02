package com.example.cc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GameModeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode_menu);

        ImageButton heavyButton = findViewById(R.id.heavyButton);
        ImageButton charChallengeButton = findViewById(R.id.cCButton);
        ImageButton franchiseButton = findViewById(R.id.franchiseButton);
        ImageButton comingSoonButton = findViewById(R.id.comingSoonButton);

        ImageButton mainMenuButton = findViewById(R.id.mainMenuButton);

        heavyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),GameModeSelector.class);
                myIntent.putExtra("state",1);;
                startActivity(myIntent);
            }
        });

        charChallengeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),GameModeSelector.class);
                myIntent.putExtra("state",3);;
                startActivity(myIntent);
            }
        });

        franchiseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),GameModeSelector.class);
                myIntent.putExtra("state",2);;
                startActivity(myIntent);
            }
        });

        /*
        comingSoonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),GameModeSelector.class);
                myIntent.putExtra("state",4);;
                startActivity(myIntent);
            }
        });
        */

        mainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
