package com.example.actv12app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class FormularioRegistro extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_registro);

    }

    public void onClickBienv(View view){
        Intent intent = new Intent(this,Bienvenida.class);
        startActivity(intent);
    }

    public void onClickVolver(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }




}