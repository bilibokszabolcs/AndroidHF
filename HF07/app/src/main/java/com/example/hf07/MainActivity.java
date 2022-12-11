package com.example.hf07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Animal[] animals = new Animal[]{
            new Animal("Cat", "Description", R.drawable.cat),
            new Animal("Pig", "Description", R.drawable.disznyo),
            new Animal("Dog", "Description", R.drawable.dog),
            new Animal("Giraffe", "Description", R.drawable.giraffe),
            new Animal("Horse", "Description", R.drawable.horse),
            new Animal("Lion", "Description", R.drawable.lion),
            new Animal("Octopus", "Description", R.drawable.octopus),
            new Animal("Rabbit", "Description", R.drawable.rabbit),
            new Animal("Sheep", "Description", R.drawable.sheep),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CustomAdapter adapter = new CustomAdapter(animals, MainActivity.this);
        recyclerView.setAdapter(adapter);
    }
}