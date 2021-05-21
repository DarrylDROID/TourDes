package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import model.ArrayDestination;
import model.Destination;

public class NatureDestination extends AppCompatActivity {
    Button btn_rajaampat, btn_pulaukomodo, btn_gunungrinjani, btn_kepulauanbelitung, btn_gunungbromo, btn_danautoba, back;
    String code ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature_destination);
        btn_rajaampat = findViewById(R.id.btn_rajaampat);
        btn_pulaukomodo = findViewById(R.id.btn_pulaukomodo);
        btn_gunungrinjani = findViewById(R.id.btn_gunungrinjani);
        btn_kepulauanbelitung = findViewById(R.id.btn_kepulauanbelitung);
        btn_gunungbromo = findViewById(R.id.btn_gunungbromo);
        btn_danautoba = findViewById(R.id.btn_danautoba);
        back = findViewById(R.id.back);

        getSupportActionBar().hide();

        btn_rajaampat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                code = "Raja Ampat Islands";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))){
                        Intent intent = new Intent(getBaseContext(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_pulaukomodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Komodo Island";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))){
                        Intent intent = new Intent(getBaseContext(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_gunungrinjani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Mount Rinjani";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))){
                        Intent intent = new Intent(getBaseContext(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_kepulauanbelitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Belitung Islands";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))){
                        Intent intent = new Intent(getBaseContext(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_gunungbromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Mount Bromo";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))){
                        Intent intent = new Intent(getBaseContext(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_danautoba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Lake Toba";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))){
                        Intent intent = new Intent(getBaseContext(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NatureDestination.this, MainMenu.class);
                finish();
                startActivity(intent);
            }
        });
    }
}