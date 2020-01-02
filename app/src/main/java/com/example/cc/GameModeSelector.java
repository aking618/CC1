package com.example.cc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.Arrays;
import java.util.Random;


public class GameModeSelector extends AppCompatActivity {

    public static int[] fPath = new int[CharacterIndex.fighterPath.length];
    public static int[] fTemp = new int[fPath.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode_selector);

        final ImageView fighterOneView = findViewById(R.id.firstView);
        final ImageView fighterTwoView = findViewById(R.id.secondView);
        ImageButton gameModeGen = findViewById(R.id.gameModeSelectButton);
        ImageButton mainMenu = findViewById(R.id.mainMenuButton2);
        ImageButton backButton = findViewById(R.id.backButton);

        final Spinner franchiseSpinnerOne = findViewById(R.id.franchiseSpinnerOne);
        final Spinner franchiseSpinnerTwo = findViewById(R.id.franchiseSpinnerTwo);

        Arrays.fill(fPath,0);
        Arrays.fill(fTemp,1);

        int state = getIntent().getIntExtra("state",0);
        if(state==1){
            franchiseSpinnerOne.setVisibility(View.INVISIBLE);
            franchiseSpinnerTwo.setVisibility(View.INVISIBLE);
        }

        gameModeGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int state = getIntent().getIntExtra("state",0);
                switch (state){
                    case 1: Picasso.get().load(CharacterIndex.heavyFighters[CharacterIndex.randomizeHeavyFighterIndex()]).into(fighterOneView);
                            Picasso.get().load(CharacterIndex.heavyFighters[CharacterIndex.randomizeHeavyFighterIndex()]).into(fighterTwoView);
                            break;
                    case 2: Picasso.get().load(CharacterIndex.randomizeFranchiseFighter(String.valueOf(franchiseSpinnerOne.getSelectedItem()))).into(fighterOneView);
                        Picasso.get().load(CharacterIndex.randomizeFranchiseFighter(String.valueOf(franchiseSpinnerTwo.getSelectedItem()))).into(fighterTwoView);
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
