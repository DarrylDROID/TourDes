package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import model.Destination;

public class Display extends AppCompatActivity {
    private ImageView image;
    private Button btn_back;
    private TextView maintext, location, description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        image = findViewById(R.id.image);
        maintext = findViewById(R.id.maintext);
        location = findViewById(R.id.location);
        description = findViewById(R.id.description);
        btn_back = findViewById(R.id.btn_back);

        Intent intent = getIntent();
        Destination destination = intent.getParcelableExtra("Display");
        image.setImageResource(destination.getImage());
        maintext.setText(destination.getMaintext());
        location.setText(destination.getLocation());
        description.setText(destination.getDescription());

        getSupportActionBar().hide();

        btn_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

