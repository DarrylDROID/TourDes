package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import model.ArrayDestination;
import model.Destination;

public class ReligionDestination extends AppCompatActivity {
    Button btn_masjid, btn_gereja, btn_vihara, btn_klenteng, btn_gua, btn_pura, back;
    String code="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religion_destination);
        btn_masjid = findViewById(R.id.btn_masjid);
        btn_gereja = findViewById(R.id.btn_gereja);
        btn_vihara = findViewById(R.id.btn_vihara);
        btn_klenteng = findViewById(R.id.btn_klenteng);
        btn_gua = findViewById(R.id.btn_gua);
        btn_pura = findViewById(R.id.btn_pura);
        back = findViewById(R.id.back);

        getSupportActionBar().hide();

        btn_masjid.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                code = "Istiqlal Mosque";
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

        btn_gereja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Blenduk Church";
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

        btn_vihara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Maha Vihara Mojopahit";
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

        btn_klenteng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Pagoda Kwan Sing Bio";
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

        btn_gua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Cave Maria Laudres";
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

        btn_pura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Temple Besakih";
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
                Intent intent = new Intent(ReligionDestination.this, MainMenu.class);
                finish();
                startActivity(intent);
            }
        });
    }
}