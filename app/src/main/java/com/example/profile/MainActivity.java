package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText eusername;
    private EditText eheight;
    private EditText eweight;
    private EditText ebmi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        eusername = findViewById(R.id.eusername);
        eheight = findViewById(R.id.eheight);
        eweight = findViewById(R.id.eweight);
        ebmi = findViewById(R.id.ebmi);
        


    }
}