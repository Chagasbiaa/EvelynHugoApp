package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;


public class SplashActivity2 extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        progressBar = findViewById(R.id.progressBar2);
        progressBar.setMax(100);
        progressBar.setScaleY(3f)
        ;

        progressAnimation2();
    }
    public void progressAnimation2(){
        Object context;
        ProgressBarAnimation2 anim = new ProgressBarAnimation2(this, progressBar, textView, 0f, 100f);;
        anim.setDuration(2000);
        progressBar.setAnimation(anim);
    }
}
