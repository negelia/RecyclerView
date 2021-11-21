package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;

public class MainActivity extends AppCompatActivity {
    ArrayList<Model> movies = new ArrayList<Model>();

    LinearLayoutManager HorizontalLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerAdapter adapter = new RecyclerAdapter(this, movies);
        recyclerView.setAdapter(adapter);

        HorizontalLayout
                = new LinearLayoutManager(
                MainActivity.this,
                LinearLayoutManager.HORIZONTAL,
                false);
        recyclerView.setLayoutManager(HorizontalLayout);
    }
    private void setData(){

        movies.add(new Model (R.drawable.pic11, "The Budapest Hotel"));
        movies.add(new Model (R.drawable.pic22, "Moonrise Kingdom"));
        movies.add(new Model (R.drawable.pic333, "Royal Tenenbaums"));
    }
}