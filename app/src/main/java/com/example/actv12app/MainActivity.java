package com.example.actv12app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);

    }


    public void onClick(View view) {

        Intent intent = new Intent(this,FormularioRegistro.class);
        startActivity(intent);
    }
    public void onClickDos(View view){

        Intent intent = new Intent(this,Bienvenida.class);
        startActivity(intent);

    }


}