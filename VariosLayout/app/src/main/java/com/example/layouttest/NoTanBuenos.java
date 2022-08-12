package com.example.layouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoTanBuenos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_tan_buenos);

        //Creación botón
        Button menu = findViewById(R.id.botonMenu2);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Le indicamos que al hacer clic hay que dirigirse a otro layout
                startActivity(new Intent(NoTanBuenos.this, MainActivity.class));
            }
        });
    }
}