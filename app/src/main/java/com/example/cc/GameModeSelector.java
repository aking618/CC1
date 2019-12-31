package com.example.cc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class GameModeSelector extends AppCompatActivity {

    int f1,f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode_selector);

        final ImageView fighterOneView = findViewById(R.id.firstView);
        final ImageView fighterTwoView = findViewById(R.id.secondView);
        ImageButton gameModeGen = findViewById(R.id.gameModeSelectButton);
        ImageButton mainMenu = findViewById(R.id.mainMenuButton2);
        ImageButton backButton = findViewById(R.id.backButton);

        ExpandableListView franchiseExListView = findViewById(R.id.franchiseListView);

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
                    case 3: Picasso.get().load(CharacterIndex.fighterPath[CharacterIndex.randomizeHeavyFighterIndex()]).into(fighterOneView);
                            Picasso.get().load(CharacterIndex.fighterPath[CharacterIndex.randomizeFighterIndex()]).into(fighterTwoView);
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
