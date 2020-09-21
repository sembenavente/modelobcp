package com.carrizane.bcpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //EditText creditCard_One = (EditText) findViewById(R.id.creditNumber_One);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        final EditText creditCard_Two = (EditText) findViewById(R.id.creditNumber_Two);
        final EditText creditCard_Three = (EditText) findViewById(R.id.creditNumber_Three);
        final EditText creditCard_Four = (EditText) findViewById(R.id.creditNumber_Four);

        final EditText pass_One = (EditText) findViewById(R.id.pass_One);
        final EditText pass_Two = (EditText) findViewById(R.id.pass_Two);
        final EditText pass_Three = (EditText) findViewById(R.id.pass_Three);
        final EditText pass_Four = (EditText) findViewById(R.id.pass_Four);
        final EditText pass_Five = (EditText) findViewById(R.id.pass_Five);
        final EditText pass_Six = (EditText) findViewById(R.id.pass_Six);

        creditCard_Three.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus && creditCard_Two.length() < 4){
                    creditCard_Two.requestFocus();
                }
            }
        });

        creditCard_Four.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus && creditCard_Two.length() < 4){
                    creditCard_Two.requestFocus();
                }else{
                    if(hasFocus && creditCard_Three.length() < 4){
                        creditCard_Three.requestFocus();
                    }
                }
            }
        });

        creditCard_Two.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void afterTextChanged(Editable s) {
                int characters = creditCard_Two.length();
                if(characters > 3){
                    creditCard_Three.requestFocus();
                }
            }
        });

        creditCard_Three.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void afterTextChanged(Editable s) {
                int characters = creditCard_Three.length();
                if(characters > 3){
                    creditCard_Four.requestFocus();
                }
            }
        });

    }

}