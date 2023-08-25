package com.example.recycler_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.homeRecycler);
        adapter = new Adapter(getContactsList());
        recyclerView.setAdapter(adapter);
    }
    List<Model> getContactsList(){
        List<Model> allContacts = new ArrayList<>();
        for (int i=0 ; i<=100 ; i++){
            allContacts.add(new Model("Khaled Ahmed "+ i ,"01118734114 " + i));
        }
        return allContacts;
    }
}