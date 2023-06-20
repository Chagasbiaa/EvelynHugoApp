package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class celia extends AppCompatActivity {
    ImageButton menu;
    Button hist;
    Button film;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celia);
        menu = findViewById(R.id.btnmenu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(celia.this, Menu.class);
                startActivity(intent);
            }
        });

        hist = findViewById(R.id.btnhistoria);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(celia.this, carta.class);
                startActivity(intent);
            }
        });
        film = findViewById(R.id.btnFIlme);
        film.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(celia.this, Filmes.class);
                startActivity(intent);
            }
        });
    }
}