package com.raj.encryptionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class enc extends AppCompatActivity {
private Button encbtn;
private Button dycbtn;
private EditText msg;
private TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enc);
        dycbtn = findViewById(R.id.dycbtn);
        encbtn = findViewById(R.id.encbtn);
        msg = findViewById(R.id.msg);
        res = findViewById(R.id.res);


    }
    public void  startdyc(View view){

        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z',' ',
                '1','2','3','4','5','6','7','8','9','0' };



        char[] code
                = {'~','#','@','$','%','^','&','*','+',
                '=','/','{','-','(',')',':',';','>',
                '<','?','_','!','.',']','[','}',' ','A','F','I','O','T','M','Q','D','G','W'};

        String word = msg.getText().toString();
        decoder(word,letter,code);

    }
    public void startenc(View view){

//        String word;
//        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
//                'g', 'h', 'i', 'j', 'k', 'l',
//                'm', 'n', 'o', 'p', 'q', 'r',
//                's', 't', 'u', 'v', 'w', 'x',
//                'y', 'z',' ',
//                '1','2','3','4','5','6','7','8','9','0' };
//
//
//
//        char[] code
//                = {'~','#','@','$','%','^','&','*','+',
//                '=','/','{','-','(',')',':',';','>',
//                '<','?','_','!','.',']','[','}',' ','A','F','I','O','T','M','Q','D','G','W'};


//            String word = msg.getText().toString();
//
//            coder(word,letter,code);
//            decoder(word,letter,code);
        areas();

    }

    public void areas(){

        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z',' ',
                '1','2','3','4','5','6','7','8','9','0' };



        char[] code
                = {'~','#','@','$','%','^','&','*','+',
                '=','/','{','-','(',')',':',';','>',
                '<','?','_','!','.',']','[','}',' ','A','F','I','O','T','M','Q','D','G','W'};

        String word = msg.getText().toString();

        coder(word,letter,code);
//        decoder(word,letter,code);

    }



    public void decoder(String word, char[] letter, char[] code) {

        String temp = " ";

        for(int i=0;i<word.length();i++){
            for(int j=0;j< code.length;j++){
                if(word.charAt(i)==code[j]){

//                    System.out.print(letter[i]);
                    temp=temp+letter[j];


                }


            }
        }

        res.setText("decoded message is "+temp);

    }

    public void coder(String word, char[] letter, char[] code) {

        int n=word.length();
        String temp="";

        for(int i=0;i<n;i++){

            for (int j = 0; j < letter.length; j++){
                if (word.charAt(i) == letter[j]) {


                    temp=temp+code[j];
//                    res.setText("result "+code[j]);
                }


            }


        }
        res.setText("coded message is "+temp);
//        res.setText(word);
    }







}