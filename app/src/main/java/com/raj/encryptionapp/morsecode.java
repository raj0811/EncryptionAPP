package com.raj.encryptionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class morsecode extends AppCompatActivity {
    Button conbtn;
    EditText morseText;
    TextView mres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morsecode);

        conbtn = findViewById(R.id.conbtn);
        morseText = findViewById(R.id.morseText);
        mres = findViewById(R.id.mres);

    }
    public void mcode(View view){


        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', ' ',
                '1','2','3','4','5','6','7','8','9','0'};



        String[] code
                = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--.."," ",
                ".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"};

        String word = morseText.getText().toString();
        convertToMorse(code,word,letter);

    }

    private void convertToMorse(String[] code, String word, char[] letter) {
        int n=word.length();
        String temp="";

        for(int i=0;i<n;i++){

            for (int j = 0; j < letter.length; j++){
                if (word.charAt(i) == letter[j]) {


//                    System.out.print(code[j]);
                    temp=temp+code[j];



//                    break;
                }

            }


        }
        mres.setText("your codded message "+temp);


    }
    public void mchart(View view){
        Toast.makeText(this, "morse code chart", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,morseChart.class);
        startActivity(intent);
    }
}