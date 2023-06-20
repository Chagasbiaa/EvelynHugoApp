package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class maridos extends AppCompatActivity {
    ImageButton Ernie;
    ImageButton Don;
    ImageButton Mick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maridos);
        Ernie = findViewById(R.id.imageView6);
        Ernie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(maridos.this, erniediaz.class);
                startActivity(intent);
            }
        });
        Don = findViewById(R.id.imageView8);
        Don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(maridos.this, donadler.class);
                startActivity(intent);
            }
        });
        Mick = findViewById(R.id.imageView9);
        Mick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(maridos.this, Mick.class);
                startActivity(intent);
            }
        });

    }
}