package com.masum.appscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Deberes extends AppCompatActivity {
MyRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deberes);
        ArrayList<String> test = new ArrayList<>();
        test.add("test");
        test.add("test");
        test.add("test");
        test.add("test");

        adapter = new MyRecyclerViewAdapter(this, test);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, test);
        recyclerView.setAdapter(adapter);
    }

}
