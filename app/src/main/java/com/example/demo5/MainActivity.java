package com.example.demo5;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.ListView);
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Mercury", R.drawable.mercury));
        planets.add(new Planet("Venus", R.drawable.venus));
        planets.add(new Planet("Earth", R.drawable.earth));
        planets.add(new Planet("Mars", R.drawable.mars));
        planets.add(new Planet("Jupiter", R.drawable.jupiter));
        planets.add(new Planet("Saturn", R.drawable.planet));
        planets.add(new Planet("Uranus", R.drawable.uranus));
        planets.add(new Planet("Neptune", R.drawable.neptune));

        CustomAdapter adapter = new CustomAdapter(this, planets);
        listView.setAdapter(adapter);
    }
}