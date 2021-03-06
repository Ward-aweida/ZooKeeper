package com.example.zookeeper;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editFly, editGorilla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFly = findViewById(R.id.Fly);
        editGorilla = findViewById(R.id.Gorilla);


        Bat bat = new Bat();
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        editFly.setText("Bird" + bat.toString());
        editFly.setText("Bird" + bat.eatHumans());
        editFly.setText("Bird" + bat);
        editFly.setText("Bird" + bat.fly());

        Gorilla gorilla = new Gorilla(95);
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.climb();

        editGorilla.setText("Gorilla" + gorilla);
        editGorilla.setText("Gorilla" + gorilla.throwSomething());
        editGorilla.setText("Gorilla" + gorilla.eatBananas());
        editGorilla.setText("" + gorilla.toString());


    }
}