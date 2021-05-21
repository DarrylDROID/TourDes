package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import model.ArrayDestination;
import model.Destination;

public class CulinaryDestination extends AppCompatActivity {
    Button btn_durianmedan, btn_satepadang, btn_gudeg, btn_rendang, btn_ayambetutu, btn_bebekgoreng, back;
    String code="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinary_destination);
        btn_durianmedan = findViewById(R.id.btn_durianmedan);
        btn_satepadang = findViewById(R.id.btn_satepadang);
        btn_gudeg = findViewById(R.id.btn_gudeg);
        btn_rendang = findViewById(R.id.btn_rendang);
        btn_ayambetutu = findViewById(R.id.btn_ayambetutu);
        btn_bebekgoreng = findViewById(R.id.btn_bebekgoreng);
        back = findViewById(R.id.back);

        getSupportActionBar().hide();

        btn_durianmedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Durian Medan";
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

        btn_satepadang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Satay Padang";
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

        btn_gudeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Gudeg";
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

        btn_rendang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Rendang";
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

        btn_ayambetutu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Chicken Betutu";
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

        btn_bebekgoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "Fried Duck";
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
                Intent intent = new Intent(CulinaryDestination.this, MainMenu.class);
                finish();
                startActivity(intent);
            }
        });
    }
}