package com.example.cc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.squareup.picasso.Picasso;

import static com.example.cc.CharacterIndex.*;

public class CrewSmash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crew_smash);

        final ImageView crewOne = findViewById(R.id.crewOneView1);
        final ImageView crewTwo = findViewById(R.id.crewOneView2);
        final ImageView crewThree = findViewById(R.id.crewOneView3);
        final ImageView crew1 = findViewById(R.id.crewTwoView1);
        final ImageView crew2 = findViewById(R.id.crewTwoView2);
        final ImageView crew3 = findViewById(R.id.crewTwoView3);

        ImageButton crewSmashButton = findViewById(R.id.crewSmashButton);
        ImageButton mainMenu = findViewById(R.id.mainMenuButton3);
        ImageButton backButton = findViewById(R.id.backButton2);

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        crewSmashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Randomize Fighters for Player One with zero repeats
                int index = randomizeFighterIndex();
                int temp = index;

                Picasso.get().load(fighterPath[index]).fit().centerInside()
                        .noFade().into(crew1);

                index = randomizeFighterIndex();
                if(index==temp) { index = randomizeFighterIndex(); }
                temp = index;

                Picasso.get().load(fighterPath[index]).fit().centerInside()
                        .noFade().into(crew2);

                index = randomizeFighterIndex();
                if(index==temp) { index = randomizeFighterIndex(); }
                temp = index;

                Picasso.get().load(fighterPath[index]).fit().centerInside()
                        .noFade().into(crew3);


                //Randomize Fighters for Player Two with zero repeats
                index = randomizeFighterIndex();
                temp = index;

                Picasso.get().load(fighterPath[index]).fit().centerInside()
                        .noFade().into(crewOne);

                index = randomizeFighterIndex();
                if(index==temp) { index = randomizeFighterIndex(); }
                temp = index;

                Picasso.get().load(fighterPath[index]).fit().centerInside()
                        .noFade().into(crewTwo);

                index = randomizeFighterIndex();
                if(index==temp) { index = randomizeFighterIndex(); }

                Picasso.get().load(fighterPath[index]).fit().centerInside()
                        .noFade().into(crewThree);
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
