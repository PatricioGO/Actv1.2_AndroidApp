package com.example.actv12app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Contactos extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);

        init();
    }
    public void init(){

        elements = new ArrayList<>();
        elements.add(new ListElement("#775447","Patricio Gutierrez","+56966318143","Activo"));
        elements.add(new ListElement("#775447","Mariela Gutierrez","+56984241314","Activo"));
        elements.add(new ListElement("#775447","Romina Gutierrez","+56993532810","Activo"));
        elements.add(new ListElement("#775447","Nicole Arenas","+56976439234","Activo"));
        elements.add(new ListElement("#775447","Alejandra Osorio","+5698675435","Activo"));

        ListAdapter listAdapter = new ListAdapter(elements,this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);


    }
}