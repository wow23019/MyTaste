package com.example.mytaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

//    private final ProgressBar progressBar = findViewById(R.id.pb_main);//暫時用不到的不要放

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        Intent loginIntent=new Intent(this,LoginActivity_0.class);
        startActivity(loginIntent);
    }
}