package com.raj.encryptionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View v){
        Toast.makeText(this, "welcome to encryption page", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,enc.class);
        startActivity(intent);
    }

    public void morseCode(View view){
        Toast.makeText(this, "MORSE CODE", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,morsecode.class);
        startActivity(intent);
    }
}