package com.example.layouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creando botones
        Button malos =  findViewById(R.id.botonNoTanBuenos);
        Button buenos =  findViewById(R.id.botonBuenos);

        //Acciones al presionar el botón malos
        malos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Le indicamos que al hacer clic hay que dirigirse a otro layout
                startActivity(new Intent(MainActivity.this, NoTanBuenos.class));
            }
        });

        //Acciones al presionar el botón buenos
        buenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Le indicamos que al hacer clic hay que dirigirse a otro layout
                startActivity(new Intent(MainActivity.this, Buenos.class));
            }
        });

    }
}