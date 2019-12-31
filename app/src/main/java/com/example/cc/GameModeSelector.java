package com.example.cc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;


public class GameModeSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode_selector);

        final ImageView fighterOneView = findViewById(R.id.firstView);
        final ImageView fighterTwoView = findViewById(R.id.secondView);
        ImageButton gameModeGen = findViewById(R.id.gameModeSelectButton);
        ImageButton mainMenu = findViewById(R.id.mainMenuButton2);
        ImageButton backButton = findViewById(R.id.backButton);

        final Spinner franchiseSpinner = findViewById(R.id.franchiseSpinner);

        gameModeGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int state = getIntent().getIntExtra("state",0);
                switch (state){
                    case 1: Picasso.get().load(CharacterIndex.heavyFighters[CharacterIndex.randomizeHeavyFighterIndex()]).into(fighterOneView);
                            Picasso.get().load(CharacterIndex.heavyFighters[CharacterIndex.randomizeHeavyFighterIndex()]).into(fighterTwoView);
                            break;
                    case 2: Picasso.get().load(CharacterIndex.fighterPath[CharacterIndex.randomizeFighterIndex()]).into(fighterOneView);
                            Picasso.get().load(CharacterIndex.fighterPath[CharacterIndex.randomizeFighterIndex()]).into(fighterTwoView);
                            break;
                    case 3: if(String.valueOf(franchiseSpinner.getSelectedItem()).equals("Super Mario"))
                            Picasso.get().load(CharacterIndex.fighterPath[CharacterIndex.randomizeHeavyFighterIndex()]).into(fighterOneView);
                            else{Picasso.get().load(CharacterIndex.fighterPath[CharacterIndex.randomizeFighterIndex()]).into(fighterTwoView);}
                            break;
                    default://Cool
                }
            }
        });

        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(myIntent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),GameModeMenu.class);
                startActivity(myIntent);
            }
        });
    }
}
