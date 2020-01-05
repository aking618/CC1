package com.example.cc;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton fighterButton = findViewById(R.id.fighterButton);
        ImageButton stageButton = findViewById(R.id.stageButton);
        ImageButton specialSmashButton = findViewById(R.id.specialSmashButton);
        ImageButton gameModeButton = findViewById(R.id.gameModeButton);
        ImageButton settingButton = findViewById(R.id.settingButton);
        final ImageButton aboutButton = findViewById(R.id.aboutButton);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //Switches to Generic Selector Activity
        fighterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),GenericSelector.class);
                myIntent.putExtra("state",1);
                startActivity(myIntent);
            }
        });

        //Switches to Generic Selector Activity
        stageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(), GenericSelector.class);
                myIntent.putExtra("state",2);
                startActivity(myIntent);
            }
        });

        //Switches to Generic Selector Activity
        specialSmashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(), GenericSelector.class);
                myIntent.putExtra("state",3);
                startActivity(myIntent);
            }
        });

        //Switches to Game Mode Activity
        gameModeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),GameModeMenu.class);
                startActivity(myIntent);
            }
        });

        //Switches to Settings Activity
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),SettingsPage.class);
                startActivity(myIntent);
            }
        });

        //About Pop-Up
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog();
            }
        });

    }

    //Creates Popup Message for About Button
    private void alertDialog(){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage("Sample text for the About popup window.\n" +
                          "Hopefully, this will look nice in the alert.\n" +
                          "This turned out well.\n" +
                          "Privacy Policy Link Here.");
        dialog.setTitle("About");
        dialog.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Close",Toast.LENGTH_LONG);
            }
        });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

}
