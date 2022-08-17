package com.example.layouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Timer para permanecer en el splas durante los segundos indicados al final de la función
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Creamos la tarea para cambiar de layout
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                //La iniciamos
                startActivity(intent);
                //La finalizamos para que no se vuelva a repetir
                finish();
            }
        },2000);
        }
}