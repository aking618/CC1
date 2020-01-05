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

public class GenericSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generic_selector);

        final ImageView resultView = findViewById(R.id.genericView);

        ImageButton mainMenuButton = findViewById(R.id.switchButton);

        final ImageButton randButton = findViewById(R.id.genericButton);

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        int state = getIntent().getIntExtra("state",0);
        switch (state){
            case 1: randButton.setImageResource(R.drawable.randomize_fighter_button4);
                break;
            case 2: randButton.setImageResource(R.drawable.randomize_stage_button4);
                break;
            case 3: randButton.setImageResource(R.drawable.randomize_special_smash_button4);
        }

        mainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(myIntent);
            }
        });

        randButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int state = getIntent().getIntExtra("state",0);
                switch (state){
                    case 1: resultView.setImageResource(CharacterIndex.fighterPath[CharacterIndex.randomizeFighterIndex()]);
                        break;
                    case 2: Picasso.get().load(StageIndex.stagePath[StageIndex.randomizeStageIndex()]).into(resultView);
                        break;
                    case 3: resultView.setImageResource(R.drawable.app_title5);
                        break;
                    default:
                }
            }
        });

    }
}
