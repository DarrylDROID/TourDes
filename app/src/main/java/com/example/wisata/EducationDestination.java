package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import model.ArrayDestination;
import model.Destination;

public class EducationDestination extends AppCompatActivity {
    Button btn_museumangkut, btn_kotatua, btn_tamanpintar, btn_kidzania, btn_tamanmini, btn_jatimpark, back;
    String code="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_destination);
        btn_museumangkut = findViewById(R.id.btn_museumangkut);
        btn_kotatua = findViewById(R.id.btn_kotatua);
        btn_tamanpintar = findViewById(R.id.btn_tamanpintar);
        btn_kidzania = findViewById(R.id.btn_kidzania);
        btn_tamanmini = findViewById(R.id.btn_tamanmini);
        btn_jatimpark = findViewById(R.id.btn_jatimpark);
        back = findViewById(R.id.back);

        getSupportActionBar().hide();

        btn_museumangkut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                code = "Museum Angkut";
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

        btn_kotatua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Kota Tua";
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

        btn_tamanpintar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Taman Pintar";
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

        btn_kidzania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Kidzania";
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

        btn_tamanmini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Taman Mini Indonesia";
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

        btn_jatimpark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Jatim Park 2";
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
                Intent intent = new Intent(EducationDestination.this, MainMenu.class);
                finish();
                startActivity(intent);
            }
        });
    }
}