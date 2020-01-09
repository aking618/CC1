package com.example.cc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.squareup.picasso.Picasso;

import static com.example.cc.CharacterIndex.heavyFighters;
import static com.example.cc.CharacterIndex.randomizeFranchiseFighter;
import static com.example.cc.CharacterIndex.randomizeHeavyFighterIndex;
import static com.example.cc.CharacterIndex.showFranchiseFighter;


public class GameModeSelector extends AppCompatActivity {

    MediaPlayer mediaPlayer = new MediaPlayer();
    int index;
    String selectedFranchise;

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

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


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
                    case 1:
                        index = randomizeHeavyFighterIndex();
                        Picasso.get().load(heavyFighters[index]).fit().centerInside()
                                    .noFade().into(fighterOneView);

                        mediaPlayer = MediaPlayer.create(getApplicationContext(), WavIndex.heavyFightersSound[index]);
                        mediaPlayer.start();

                        index = randomizeHeavyFighterIndex();
                        Picasso.get().load(heavyFighters[index]).fit().centerInside()
                                    .noFade().into(fighterTwoView);

                        mediaPlayer = MediaPlayer.create(getApplicationContext(), WavIndex.heavyFightersSound[index]);
                        mediaPlayer.start();
                            break;


                    case 2:
                        selectedFranchise = String.valueOf(franchiseSpinnerOne.getSelectedItem());
                        index = randomizeFranchiseFighter(selectedFranchise);
                        Picasso.get().load(showFranchiseFighter(selectedFranchise, index)).fit().centerInside()
                                    .noFade().into(fighterOneView);

                        mediaPlayer = MediaPlayer.create(getApplicationContext(), WavIndex.franchiseFighterSounds(selectedFranchise, index));
                        mediaPlayer.start();

                        selectedFranchise = String.valueOf(franchiseSpinnerTwo.getSelectedItem());
                        index = randomizeFranchiseFighter(selectedFranchise);
                        Picasso.get().load(showFranchiseFighter(selectedFranchise, index)).fit().centerInside()
                                    .noFade().into(fighterTwoView);

                        mediaPlayer = MediaPlayer.create(getApplicationContext(), WavIndex.franchiseFighterSounds(selectedFranchise, index));
                        mediaPlayer.start();
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
