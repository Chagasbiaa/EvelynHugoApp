package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Filmes extends AppCompatActivity {
    ImageButton menu;
    ImageButton img1;
    ImageButton img2;
    ImageButton img3;
    ImageButton img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filmes);
        menu = findViewById(R.id.btnmenu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Filmes.this, Menu.class);
                startActivity(intent);
            }
        });
        menu = findViewById(R.id.btnimg1);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Filmes.this, Filmes.class);
                startActivity(intent);
            }
        });
        menu = findViewById(R.id.btnimg2);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Filmes.this, Filmes3.class);
                startActivity(intent);
            }
        });
        menu = findViewById(R.id.btnimg3);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Filmes.this, Filmes2.class);
                startActivity(intent);
            }
        });
        menu = findViewById(R.id.btnimg4);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Filmes.this, Filmes4.class);
                startActivity(intent);
            }
        });
    }
}